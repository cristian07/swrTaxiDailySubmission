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
    
    public void altaTurno(Turno turno,String DNI) {
        DbConnection conex= new DbConnection();
        DbConnection conex2= new DbConnection();
        DbConnection conex3= new DbConnection();
        Calendar calendario = Calendar.getInstance();
        String fechaHoraSQL = new StringBuilder()
                .append(Integer.toString(calendario.get(Calendar.YEAR))).append("-")
                .append(Integer.toString(calendario.get(Calendar.MONTH)+1)).append("-")
                .append(Integer.toString(calendario.get(Calendar.DATE))).toString();
        String idTurno = "0";
        try {
            Statement estatuto = conex.getConnection().createStatement();
           /* estatuto.executeUpdate("INSERT INTO Turno VALUES (NULL,'"
                +turno.getGastosVarios()+"', '"
                +turno.getRecaudacion()+"', '"
                +fechaHoraSQL+"', '"
                //+turno.getFecha()+"', '"
                +turno.getKmInicial()+"', '"
                +turno.getKmFinal()+"', '"
                +turno.getTicketRelevo()+"', '"
                +turno.getTipo()+"', '"
                +turno.getNovedades()+"', '"
                +turno.getMovil_idMovil()+"')");*/
                
            estatuto.close();
            conex.desconectar();
        } catch (SQLException e) {
            System.out.println("insertar en turno"+e.getMessage());
        }
        try { 
            PreparedStatement consulta = conex3.getConnection().prepareStatement("SELECT max(idTurno) AS 'idTurno' FROM Turno");
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
         try {
            Statement estatuto2 = conex2.getConnection().createStatement();
            /*estatuto2.executeUpdate("INSERT INTO Chofer_has_Turno VALUES('"
                +DNI+"', '"
                +idTurno+"', '"
                +turno.getMovil_idMovil()+"')"); */
            estatuto2.close();
            conex2.desconectar();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
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
    public  ArrayList<Fila> obtenerTurnos(String fecha)
    {
        DbConnection conex= new DbConnection();
        ArrayList<Fila> filas = new ArrayList<Fila>();
        
        try {
            PreparedStatement consulta = conex.getConnection()
                    .prepareStatement("SELECT * FROM Turno T INNER JOIN Chofer_has_Turno CHT ON CHT.Turno_idTurno = T.idTurno INNER JOIN Chofer C ON C.DNI = CHT.Chofer_DNI WHERE T.fecha=?");
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
            
}


