/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import entidades.Fila;
import entidades.Movil;
import entidades.Turno;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import servicio.DbConnection;

/**
 *
 * @author laptop
 */
public class TurnoDAO {
    
    public void altaTurno(Turno turno, String DNI, String idMovil) {
        DbConnection conex= new DbConnection();
        DbConnection conex2= new DbConnection();
      
        Calendar calendario = Calendar.getInstance();
        String fechaHoraSQL = new StringBuilder()
                .append(Integer.toString(calendario.get(Calendar.YEAR))).append("-")
                .append(Integer.toString(calendario.get(Calendar.MONTH)+1)).append("-")
                .append(Integer.toString(calendario.get(Calendar.DATE))).toString();
        String idTurno = "0";
        AjustesDAO ajustesDAO = new AjustesDAO();
        try {
            Statement estatuto = conex.getConnection().createStatement();
            estatuto.executeUpdate("INSERT INTO Turno VALUES (NULL,'"
                +idMovil+"', '"
                +ajustesDAO.obtenerIdUltimosAjustes()+"', '"
                +DNI+"', '"
                +fechaHoraSQL+"', '"
                +turno.getKmInicial()+"', '"
                +turno.getKmFinal()+"', '"
                +turno.getGastosVarios()+"', '"
                +turno.getRecaudacion()+"', '"
                +turno.getGncBrutoCtaCte()+"', '"
                +turno.getGncFueraCtaCte()+"', '"
                +turno.getKmOcupados()+"', '"
                +turno.getKmLibres()+"', '"
                +turno.getTicketRelevo1()+"', '"
                +turno.getTicketRelevo2()+"', '"
                +turno.getTipo()+"', '"
                +turno.getGastosChequera()+"', '"
                +turno.getNovedades()+"')");
            estatuto.close();
            conex.desconectar();
        } catch (SQLException e) {
            System.out.println("insertar en turno"+e.getMessage());
        }
    }
    public ArrayList<String> obtenerFechasTurnos()
    {
        DbConnection conex= new DbConnection();
        ArrayList<String> turnos = new ArrayList<String>();
        
        try {
            PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT fecha FROM turno GROUP BY fecha");
            ResultSet res = consulta.executeQuery();

            while(res.next()){
                String turno = res.getString("fecha");
                turnos.add(turno);
            }
            res.close();
            consulta.close();
            conex.desconectar();

            } catch (Exception e) {
                System.out.println(e);
            }
       return turnos;
    }
    
    /**
     *
     * @return
     */
    public ArrayList<String> obtenerMoviles()
    {
        DbConnection conex= new DbConnection();
        ArrayList<String> moviles = new ArrayList<String>();
        
        try {
            PreparedStatement consulta = conex.getConnection()
                    .prepareStatement("select M.idMovil from movil M inner join turno T on M.idMovil=T.Movil_idMovil GROUP BY T.Movil_idMovil");
            ResultSet res = consulta.executeQuery();

            while(res.next()){
                String movil = res.getString("idMovil");
                moviles.add(movil);
            }
            res.close();
            consulta.close();
            conex.desconectar();

            } catch (Exception e) {
                System.out.println(e);
            }
       return moviles;
    }
    public  ArrayList<Fila> obtenerTurnos(String fecha,String idMovil)
    {
        DbConnection conex= new DbConnection();
        ArrayList<Fila> filas = new ArrayList<Fila>();
        
        try {
            PreparedStatement consulta = conex.getConnection()
                    .prepareStatement("SELECT * FROM Turno T INNER JOIN Chofer C ON C.DNI = CHT.Chofer_DNI WHERE T.fecha=? DNI ");
           consulta.setString(1, fecha);
           ResultSet res = consulta.executeQuery();

            while(res.next()){
                Fila fila = new Fila();
                fila.setGastosVarios(res.getString("gastosVarios"));
                fila.setRecaudacion(res.getString("recaudacion"));
                fila.setKmInicial(res.getString("kmInicial"));
                fila.setKmFinal(res.getString("kmFinal"));
                fila.setChofer(res.getString("apellido")+", "+res.getString("nombre"));
                
                filas.add(fila);
            }
            res.close();
            consulta.close();
            conex.desconectar();

            } catch (Exception e) {
                System.out.println(e);
            }
       return filas;       
    }
    public ArrayList<Movil> obtenerMovilesSinRendicion(String fecha) {
        DbConnection conex= new DbConnection();
        ArrayList<Movil> moviles = new ArrayList<Movil>();
        PreparedStatement consulta;
        try {
            consulta = conex.getConnection()
                    .prepareStatement("SELECT idMovil FROM Movil WHERE 1");
            //consulta: seleccionar todos los moviles que aun no entraron en la rendicion
            //consulta.setString(1, fecha);
           ResultSet res = consulta.executeQuery();
           while(res.next()){
               Movil movil = new Movil();
               movil.setIdMovil(Integer.parseInt(res.getString("idMovil")));
               moviles.add(movil);
           }
           res.close();
            consulta.close();
            conex.desconectar();

        } catch (SQLException ex) {
            Logger.getLogger(TurnoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return moviles;
    }       
    public String obtenerUltimoTurnoIngresado(){
        String idTurno="";
        DbConnection conex= new DbConnection();
        try { 
            PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT max(idTurno) AS 'idTurno' FROM Turno");
            ResultSet res = consulta.executeQuery();
            
            while(res.next()){
                idTurno = res.getString("idTurno");
            }
            System.out.println(idTurno);
            res.close();
            consulta.close();
            conex.desconectar();

        } catch (Exception e) {
                System.out.println(e);
        }
        return idTurno;
    }    
   
}


