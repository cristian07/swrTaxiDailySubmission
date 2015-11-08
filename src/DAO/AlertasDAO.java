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
                    ",vencimientoLicenciaConductor="+alertas.getVencimientoLicenciaConductor()+
                    ",vencimientoLicenciaTaxi="+alertas.getVencimientoLicenciaTaxi());
            
            estatuto.close();
            conex.desconectar();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
