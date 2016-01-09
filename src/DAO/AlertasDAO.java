/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entidades.Alertas;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import org.joda.time.DateTime;
import org.joda.time.Days;
import servicio.DbConnection;

/**
 *
 * @author sebastian.suarez
 */
public class AlertasDAO {
    public Alertas obtenerAlertas(){
        DbConnection conex= new DbConnection();
        Alertas alertas = new Alertas();
        try { 
            PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM Alertas");
            ResultSet res = consulta.executeQuery();
            
            if(res.next()){
                alertas.setAceite(res.getInt("aceite"));
                alertas.setCorrea(res.getInt("correa"));
                alertas.setFiltro(res.getInt("filtro"));
                alertas.setGrasa(res.getInt("grasa"));
                alertas.setVencimientoLicenciaConductor(res.getInt("vencimientoLicenciaConductor"));
                alertas.setVencimientoLicenciaTaxi(res.getInt("vencimientoLicenciaTaxi"));
                alertas.setAceiteKM(res.getInt("aceiteKM"));
                alertas.setCorreaKM(res.getInt("correaKM"));
                alertas.setFiltroKM(res.getInt("filtroKM"));
                alertas.setGrasaKM(res.getInt("grasaKM"));
            }
            
            res.close();
            consulta.close();
            conex.desconectar();

        } catch (Exception e) {
                System.out.println(e);
        }
        return alertas;
    }
    
    public void actualizarAlertas(Alertas alertas){
        
    DbConnection conex= new DbConnection();
        try {
             Statement estatuto = conex.getConnection().createStatement();
            estatuto.executeUpdate("UPDATE Alertas SET "+
                    "aceite="+alertas.getAceite()+
                    ",correa="+alertas.getCorrea()+
                    ",filtro="+alertas.getFiltro()+
                    ",grasa="+alertas.getGrasa()+
                    ",aceiteKM="+alertas.getAceiteKM()+
                    ",correaKM="+alertas.getCorreaKM()+
                    ",filtroKM="+alertas.getFiltroKM()+
                    ",grasaKM="+alertas.getGrasaKM()+
                    ",vencimientoLicenciaConductor="+alertas.getVencimientoLicenciaConductor()+
                    ",vencimientoLicenciaTaxi="+alertas.getVencimientoLicenciaTaxi());
            
            estatuto.close();
            conex.desconectar();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    private ArrayList<String> vencimientoLicenciaMovil(int dias){
        DbConnection conex= new DbConnection();
        ArrayList<String> vencimientoLicenciaTaxi = new ArrayList<String>();
        
        try {
             PreparedStatement consulta = conex.getConnection()
                     .prepareStatement("SELECT idMovil,fechaLicencia from Movil M where M.estado='A'");
             ResultSet res = consulta.executeQuery();
             // todo: calcular los dias con los jar
             
            while(res.next()){
               int calcularDias = calcularDias(res.getString("fechaLicencia"));
               if (calcularDias > 0 && calcularDias<=30) {
                   vencimientoLicenciaTaxi.add("Licencia del movil "+res.getInt("idMovil")+" se en "+calcularDias+" dias.");
               } else if (calcularDias<0) {
                   vencimientoLicenciaTaxi.add("Licencia del movil "+res.getInt("idMovil")+" esta vencida.");
               } else if (calcularDias == 0) {
                   vencimientoLicenciaTaxi.add("Licencia del movil "+res.getInt("idMovil")+" se vence HOY!!");
               }
            }
            res.close();
            consulta.close();
            conex.desconectar();

        } catch (Exception e) {
            System.out.println(e);
        }  
        return vencimientoLicenciaTaxi;
    }
    
    private ArrayList<String> vencimientoLicenciaChofer(int dias){
        DbConnection conex= new DbConnection();
        ArrayList<String> vencimientoLicenciaTaxi = new ArrayList<String>();
        try {
             PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT DNI,nombre,apellido,fechaCarnetVencimiento from Chofer C where C.estado='A'");
             ResultSet res = consulta.executeQuery();
            
            while(res.next()){
               int calcularDias = calcularDias(res.getString("fechaCarnetVencimiento"));
               if (calcularDias > 0 && calcularDias<=30) {
                   vencimientoLicenciaTaxi.add("Licencia del chofer "+res.getInt("DNI")+" "+res.getString("apellido")+", "+res.getString("nombre")+" se vence en "+calcularDias+" dias.");
               } else if (calcularDias<0) {
                   vencimientoLicenciaTaxi.add("Licencia del chofer "+res.getInt("DNI")+" "+res.getString("apellido")+", "+res.getString("nombre")+" esta vencida.");
               } else if (calcularDias == 0) {
                   vencimientoLicenciaTaxi.add("Licencia del chofer "+res.getInt("DNI")+" "+res.getString("apellido")+", "+res.getString("nombre")+" se vence HOY!!");
               }               

            }
    
            res.close();
            consulta.close();
            conex.desconectar();

        } catch (Exception e) {
            System.out.println(e);
        }  
        return vencimientoLicenciaTaxi;
    }
    
    private ArrayList<String> vencimientosKilometros(int kmKm,int kmAlarma,String vencimiento,String articulo) {
        DbConnection conex= new DbConnection();
        ArrayList<String> vencimientoLicenciaTaxi = new ArrayList<String>();
        try {
             PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * from Movil M where estado= 'A'");
             ResultSet res = consulta.executeQuery();
            
            while(res.next()){
                int km = res.getInt("kilometraje"); 
                int kmFiltro = res.getInt(vencimiento);
                int kmCambio = kmFiltro + kmAlarma;
                int KMALARMA = kmCambio - kmKm;

                if (km >= kmCambio) {
                    vencimientoLicenciaTaxi.add(articulo+vencimiento+" del movil "+res.getInt("idMovil")+" necesita cambio URGENTE!");
                } else if (km >= KMALARMA && km <= kmCambio) {
                    vencimientoLicenciaTaxi.add(articulo+vencimiento+" del movil "+res.getInt("idMovil")+" necesita cambio en "+(kmCambio-km)+" Kilometros");
                } 
                    
                
                
            }
            res.close();
            consulta.close();
            conex.desconectar();

        } catch (Exception e) {
            System.out.println(e);
        }  
        return vencimientoLicenciaTaxi;
    }
    
    public ArrayList<String> listaVencimientos() {
        Alertas alertas = obtenerAlertas();
        ArrayList<String> listaAlertas = new ArrayList<String>();
        
        listaAlertas.addAll(vencimientosKilometros(alertas.getCorreaKM(),alertas.getCorrea(),"correa","La "));
        listaAlertas.addAll(vencimientosKilometros(alertas.getFiltroKM(),alertas.getFiltro(),"filtro","El "));
        listaAlertas.addAll(vencimientosKilometros(alertas.getAceiteKM(),alertas.getAceite(),"aceite","El "));
        listaAlertas.addAll(vencimientosKilometros(alertas.getGrasaKM(),alertas.getGrasa(),"grasa","La "));
        listaAlertas.addAll(vencimientoLicenciaMovil(alertas.getVencimientoLicenciaTaxi()));
        listaAlertas.addAll(vencimientoLicenciaChofer(alertas.getVencimientoLicenciaConductor()));
        
        return listaAlertas;
    }
    
    private int calcularDias(String fecha){
        return Days.daysBetween(new DateTime().now(), new DateTime(fecha)).getDays();
    }
}
