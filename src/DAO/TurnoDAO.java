package DAO;

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
   public  ArrayList<Turno> obtenerTurnosFechasMovil(String fechaInicio,String fechaFin,int idMovil){
       DbConnection conex= new DbConnection();
        ArrayList<Turno> turnos = new ArrayList<Turno>();
        
        try {
            PreparedStatement consulta = conex.getConnection()
                    .prepareStatement("SELECT * FROM Turno T WHERE T.fecha between ? and ? and T.Movil_idMovil=? ORDER BY T.fecha");
            
            consulta.setString(1, fechaInicio);
            consulta.setString(2, fechaFin);
            consulta.setInt(3, idMovil);
            
            ResultSet res = consulta.executeQuery();

            while(res.next()){
                Turno turno = new Turno();
                turno.setIdTurno(res.getInt("idTurno"));
                turno.setMovil_idMovil(res.getInt("Movil_idMovil"));
                turno.setAjustes_idAjustes(res.getInt("Ajustes_idAjustes"));
                turno.setChofer_DNI(res.getInt("Chofer_DNI"));
                turno.setKmInicial(res.getInt("kmInicial"));
                turno.setKmFinal(res.getInt("kmFinal"));
                turno.setGastosVarios(res.getDouble("gastosVarios"));
                turno.setRecaudacion(res.getDouble("recaudacion"));
                turno.setGncBrutoCtaCte(res.getDouble("gncBrutoCtaCte"));
                turno.setGncFueraCtaCte(res.getDouble("gncFueraCtaCte"));
                turno.setKmOcupados(res.getInt("kmOcupados"));
                turno.setKmLibres(res.getInt("kmLibres"));
                turno.setTicketRelevo1(res.getDouble("ticketRelevo1"));
                turno.setTicketRelevo2(res.getDouble("ticketRelevo2"));
                turno.setFecha(res.getString("fecha"));
                turno.setGastosChequera(res.getDouble("gastosChequera"));
                turno.setTipo(res.getString("tipo"));
                turno.setNovedades(res.getString("novedades"));
                turno.setImporteCaja(res.getDouble("importeCaja"));
                turno.setDetalleCaja(res.getString("detalleCaja"));
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
   public  ArrayList<Turno> obtenerTurnosFechas(String fechaInicio,String fechaFin){
       DbConnection conex= new DbConnection();
        ArrayList<Turno> turnos = new ArrayList<Turno>();
        
        try {
            PreparedStatement consulta = conex.getConnection()
                    .prepareStatement("SELECT * FROM Turno T WHERE T.fecha between ? and ? ORDER BY T.fecha");
            
            consulta.setString(1, fechaInicio);
            consulta.setString(2, fechaFin);
            
            ResultSet res = consulta.executeQuery();

            while(res.next()){
                Turno turno = new Turno();
                turno.setIdTurno(res.getInt("idTurno"));
                turno.setMovil_idMovil(res.getInt("Movil_idMovil"));
                turno.setAjustes_idAjustes(res.getInt("Ajustes_idAjustes"));
                turno.setChofer_DNI(res.getInt("Chofer_DNI"));
                turno.setKmInicial(res.getInt("kmInicial"));
                turno.setKmFinal(res.getInt("kmFinal"));
                turno.setGastosVarios(res.getDouble("gastosVarios"));
                turno.setRecaudacion(res.getDouble("recaudacion"));
                turno.setGncBrutoCtaCte(res.getDouble("gncBrutoCtaCte"));
                turno.setGncFueraCtaCte(res.getDouble("gncFueraCtaCte"));
                turno.setKmOcupados(res.getInt("kmOcupados"));
                turno.setKmLibres(res.getInt("kmLibres"));
                turno.setTicketRelevo1(res.getDouble("ticketRelevo1"));
                turno.setTicketRelevo2(res.getDouble("ticketRelevo2"));
                turno.setFecha(res.getString("fecha"));
                turno.setGastosChequera(res.getDouble("gastosChequera"));
                turno.setTipo(res.getString("tipo"));
                turno.setNovedades(res.getString("novedades"));
                turno.setImporteCaja(res.getDouble("importeCaja"));
                turno.setDetalleCaja(res.getString("detalleCaja"));
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
   public ArrayList<Turno> obtenerTurnosFechasChofer(String fechaInicio, String fechaFin, int DNI) {
        DbConnection conex= new DbConnection();
        ArrayList<Turno> turnos = new ArrayList<Turno>();
        
        try {
            PreparedStatement consulta = conex.getConnection()
                    .prepareStatement("SELECT * FROM Turno T WHERE T.fecha between ? and ? and T.Chofer_DNI=? ORDER BY T.fecha");
            
            consulta.setString(1, fechaInicio);
            consulta.setString(2, fechaFin);
            consulta.setInt(3, DNI);
            
            ResultSet res = consulta.executeQuery();

            while(res.next()){
                Turno turno = new Turno();
                turno.setIdTurno(res.getInt("idTurno"));
                turno.setMovil_idMovil(res.getInt("Movil_idMovil"));
                turno.setAjustes_idAjustes(res.getInt("Ajustes_idAjustes"));
                turno.setChofer_DNI(res.getInt("Chofer_DNI"));
                turno.setKmInicial(res.getInt("kmInicial"));
                turno.setKmFinal(res.getInt("kmFinal"));
                turno.setGastosVarios(res.getDouble("gastosVarios"));
                turno.setRecaudacion(res.getDouble("recaudacion"));
                turno.setGncBrutoCtaCte(res.getDouble("gncBrutoCtaCte"));
                turno.setGncFueraCtaCte(res.getDouble("gncFueraCtaCte"));
                turno.setKmOcupados(res.getInt("kmOcupados"));
                turno.setKmLibres(res.getInt("kmLibres"));
                turno.setTicketRelevo1(res.getDouble("ticketRelevo1"));
                turno.setTicketRelevo2(res.getDouble("ticketRelevo2"));
                turno.setFecha(res.getString("fecha"));
                turno.setGastosChequera(res.getDouble("gastosChequera"));
                turno.setTipo(res.getString("tipo"));
                turno.setNovedades(res.getString("novedades"));
                turno.setImporteCaja(res.getDouble("importeCaja"));
                turno.setDetalleCaja(res.getString("detalleCaja"));
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
   public  ArrayList<Turno> obtenerTurnosFechasChofer(String fechaInicio,String fechaFin,int idMovil,int DNI){
       DbConnection conex= new DbConnection();
        ArrayList<Turno> turnos = new ArrayList<Turno>();
        
        try {
            PreparedStatement consulta = conex.getConnection()
                    .prepareStatement("SELECT * FROM Turno T WHERE T.fecha between ? and ? and T.Movil_idMovil=? and T.Chofer_DNI=? ORDER BY T.fecha");
            
            consulta.setString(1, fechaInicio);
            consulta.setString(2, fechaFin);
            consulta.setInt(3, idMovil);
            consulta.setInt(4, DNI);
            
            
            ResultSet res = consulta.executeQuery();

            while(res.next()){
                Turno turno = new Turno();
                turno.setIdTurno(res.getInt("idTurno"));
                turno.setMovil_idMovil(res.getInt("Movil_idMovil"));
                turno.setAjustes_idAjustes(res.getInt("Ajustes_idAjustes"));
                turno.setChofer_DNI(res.getInt("Chofer_DNI"));
                turno.setKmInicial(res.getInt("kmInicial"));
                turno.setKmFinal(res.getInt("kmFinal"));
                turno.setGastosVarios(res.getDouble("gastosVarios"));
                turno.setRecaudacion(res.getDouble("recaudacion"));
                turno.setGncBrutoCtaCte(res.getDouble("gncBrutoCtaCte"));
                turno.setGncFueraCtaCte(res.getDouble("gncFueraCtaCte"));
                turno.setKmOcupados(res.getInt("kmOcupados"));
                turno.setKmLibres(res.getInt("kmLibres"));
                turno.setTicketRelevo1(res.getDouble("ticketRelevo1"));
                turno.setTicketRelevo2(res.getDouble("ticketRelevo2"));
                turno.setFecha(res.getString("fecha"));
                turno.setGastosChequera(res.getDouble("gastosChequera"));
                turno.setTipo(res.getString("tipo"));
                turno.setNovedades(res.getString("novedades"));
                turno.setImporteCaja(res.getDouble("importeCaja"));
                turno.setDetalleCaja(res.getString("detalleCaja"));
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
 
    public void altaTurno(Turno turno, String DNI, String idMovil) {
        DbConnection conex= new DbConnection();
      
                AjustesDAO ajustesDAO = new AjustesDAO();
        try {
            Statement estatuto = conex.getConnection().createStatement();
            estatuto.executeUpdate("INSERT INTO Turno VALUES (NULL,"
                +idMovil+","
                +ajustesDAO.obtenerIdUltimosAjustes()+", "
                +DNI+", '"
                +turno.getFecha()+"', "
                +turno.getKmInicial()+", "
                +turno.getKmFinal()+", "
                +turno.getGastosVarios()+", "
                +turno.getRecaudacion()+", "
                +turno.getGncBrutoCtaCte()+", "
                +turno.getGncFueraCtaCte()+", "
                +turno.getKmOcupados()+", "
                +turno.getKmLibres()+", "
                +turno.getTicketRelevo1()+", "
                +turno.getTicketRelevo2()+", '"
                +turno.getTipo()+"', "
                +turno.getGastosChequera()+", '"
                +turno.getNovedades()+"',NULL,NULL)");
            MovilDAO movilDAO = new MovilDAO();
            movilDAO.actualizarKilometraje(Integer.parseInt(idMovil),turno.getKmFinal());
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
                    .prepareStatement("select idMovil from Movil");
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
    public  ArrayList<Turno> obtenerTurnos(String fecha,int idMovil, String tipo){
        DbConnection conex= new DbConnection();
        ArrayList<Turno> turnos = new ArrayList<Turno>();
        
        try {
            PreparedStatement consulta = conex.getConnection()
                    .prepareStatement("SELECT * FROM Turno T WHERE T.fecha=? AND T.Movil_idMovil=? AND T.tipo=?");
            
            consulta.setString(1, fecha);
            consulta.setInt(2, idMovil);
            consulta.setString(3, tipo);
            ResultSet res = consulta.executeQuery();

            while(res.next()){
                Turno turno = new Turno();
                turno.setMovil_idMovil(res.getInt("Movil_idMovil"));
                turno.setAjustes_idAjustes(res.getInt("Ajustes_idAjustes"));
                turno.setChofer_DNI(res.getInt("Chofer_DNI"));
                turno.setKmInicial(res.getInt("kmInicial"));
                turno.setKmFinal(res.getInt("kmFinal"));
                turno.setGastosVarios(res.getDouble("gastosVarios"));
                turno.setRecaudacion(res.getDouble("recaudacion"));
                turno.setGncBrutoCtaCte(res.getDouble("gncBrutoCtaCte"));
                turno.setGncFueraCtaCte(res.getDouble("gncFueraCtaCte"));
                turno.setKmOcupados(res.getInt("kmOcupados"));
                turno.setKmLibres(res.getInt("kmLibres"));
                turno.setTicketRelevo1(res.getDouble("ticketRelevo1"));
                turno.setTicketRelevo2(res.getDouble("ticketRelevo2"));
                turno.setFecha(res.getString("fecha"));
                turno.setGastosChequera(res.getDouble("gastosChequera"));
                turno.setTipo(res.getString("tipo"));
                turno.setNovedades(res.getString("novedades"));
                turno.setImporteCaja(res.getDouble("importeCaja"));
                turno.setDetalleCaja(res.getString("detalleCaja"));
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
    
    public ArrayList<Movil> obtenerMovilesSinRendicion(String fecha) {
        DbConnection conex= new DbConnection();
        ArrayList<Movil> moviles = new ArrayList<Movil>();
        PreparedStatement consulta;
        try {
            consulta = conex.getConnection()
                    .prepareStatement("select * from movil where idMovil NOT IN (SELECT Movil_idMovil from turno where fecha=?)");
            //consulta: seleccionar todos los moviles que aun no entraron en la rendicion
            consulta.setString(1, fecha);
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
    public ArrayList<Turno> obtenerNetos(String fecha,String tipo){
         DbConnection conex= new DbConnection();
         ArrayList<Turno> turnos = new ArrayList<Turno>();
        try { 
            PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM Turno WHERE fecha='"
                    +fecha+ "' AND tipo='"
                    +tipo+ "'");
            ResultSet res = consulta.executeQuery();
            
            while(res.next()){
                Turno turno = new Turno();
                turno.setIdTurno(res.getInt("idTurno"));
                turno.setMovil_idMovil(res.getInt("Movil_idMovil"));
                turno.setAjustes_idAjustes(res.getInt("Ajustes_idAjustes"));
                turno.setChofer_DNI(res.getInt("Chofer_DNI"));
                turno.setKmInicial(res.getInt("kmInicial"));
                turno.setKmFinal(res.getInt("kmFinal"));
                turno.setGastosVarios(res.getDouble("gastosVarios"));
                turno.setRecaudacion(res.getDouble("recaudacion"));
                turno.setGncBrutoCtaCte(res.getDouble("gncBrutoCtaCte"));
                turno.setGncFueraCtaCte(res.getDouble("gncFueraCtaCte"));
                turno.setKmOcupados(res.getInt("kmOcupados"));
                turno.setKmLibres(res.getInt("kmLibres"));
                turno.setTicketRelevo1(res.getDouble("ticketRelevo1"));
                turno.setTicketRelevo2(res.getDouble("ticketRelevo2"));
                turno.setFecha(res.getString("fecha"));
                turno.setGastosChequera(res.getDouble("gastosChequera"));
                turno.setTipo(res.getString("tipo"));
                turno.setNovedades(res.getString("novedades"));
                turno.setImporteCaja(res.getDouble("importeCaja"));
                turno.setDetalleCaja(res.getString("detalleCaja"));
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
    public void agregarCaja(Turno turno){
       DbConnection conex= new DbConnection();
        try {
             Statement estatuto = conex.getConnection().createStatement();
            estatuto.executeUpdate("UPDATE Turno SET detalleCaja='"
                    +turno.getDetalleCaja()+ "',importeCaja="
                    +turno.getImporteCaja()+ "  WHERE idTurno="
                    +turno.getIdTurno());
            estatuto.close();
            conex.desconectar();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public ArrayList<Turno> obtenerTurnosFechasChoferMovil(String fechaInicio, String fechaFin, int DNI, int idMovil) {
       DbConnection conex= new DbConnection();
        ArrayList<Turno> turnos = new ArrayList<Turno>();
        
        try {
            PreparedStatement consulta = conex.getConnection()
                    .prepareStatement("SELECT * FROM Turno T WHERE T.fecha between ? and ? and T.Chofer_DNI=? and T.Movil_idMovil=? ORDER BY T.fecha");
            
            consulta.setString(1, fechaInicio);
            consulta.setString(2, fechaFin);
            consulta.setInt(3, DNI);
            consulta.setInt(4, idMovil);
            
            ResultSet res = consulta.executeQuery();

            while(res.next()){
                Turno turno = new Turno();
                turno.setIdTurno(res.getInt("idTurno"));
                turno.setMovil_idMovil(res.getInt("Movil_idMovil"));
                turno.setAjustes_idAjustes(res.getInt("Ajustes_idAjustes"));
                turno.setChofer_DNI(res.getInt("Chofer_DNI"));
                turno.setKmInicial(res.getInt("kmInicial"));
                turno.setKmFinal(res.getInt("kmFinal"));
                turno.setGastosVarios(res.getDouble("gastosVarios"));
                turno.setRecaudacion(res.getDouble("recaudacion"));
                turno.setGncBrutoCtaCte(res.getDouble("gncBrutoCtaCte"));
                turno.setGncFueraCtaCte(res.getDouble("gncFueraCtaCte"));
                turno.setKmOcupados(res.getInt("kmOcupados"));
                turno.setKmLibres(res.getInt("kmLibres"));
                turno.setTicketRelevo1(res.getDouble("ticketRelevo1"));
                turno.setTicketRelevo2(res.getDouble("ticketRelevo2"));
                turno.setFecha(res.getString("fecha"));
                turno.setGastosChequera(res.getDouble("gastosChequera"));
                turno.setTipo(res.getString("tipo"));
                turno.setNovedades(res.getString("novedades"));
                turno.setImporteCaja(res.getDouble("importeCaja"));
                turno.setDetalleCaja(res.getString("detalleCaja"));
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
    
    public  int obtenerMovilesRendidos(String fecha,String tipo){
       DbConnection conex= new DbConnection();
       int cantidad = 0;
        
        try {
            PreparedStatement consulta = conex.getConnection()
                    .prepareStatement("SELECT count(Movil_idMovil) as cantidad from turno where fecha = ? and tipo = ?");
            
            consulta.setString(1, fecha);
            consulta.setString(2, tipo);
            
            ResultSet res = consulta.executeQuery();

            if(res.next()){
               cantidad = res.getInt("cantidad");
            }
            res.close();
            consulta.close();
            conex.desconectar();

            } catch (Exception e) {
                System.out.println(e);
            }
       return cantidad;        
    }
    
   }


