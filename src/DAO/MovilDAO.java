/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import entidades.Movil;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import servicio.DbConnection;

/**
 *
 * @author laptop
 */
public class MovilDAO {
    public double obtenerAjusteReloj(int idMovil) {
        DbConnection conex= new DbConnection();
        double ajusteReloj = 0;
        try {
            PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT ajusteReloj FROM movil where idMovil = ? ");
            consulta.setInt(1, idMovil);
            ResultSet res = consulta.executeQuery();
    
            if(res.next()){
              ajusteReloj = res.getDouble("ajusteReloj");
            }
            
            res.close();
            consulta.close();
            conex.desconectar();
            } catch (Exception e) {
                System.out.println(e);
            }
        return ajusteReloj;
    }
    public void altaMovil(Movil movil){
        DbConnection conex= new DbConnection();
        try {
            Statement estatuto = conex.getConnection().createStatement();
            estatuto.executeUpdate("INSERT INTO movil VALUES ('"
                +movil.getIdMovil()+"', '"
                +movil.getModelo()+"', '"
                +movil.getPatente()+"', '"
                +movil.getLicencia()+"', '"
                +movil.getNumeroLicencia()+"', '"
                +movil.getFechaLicencia()+"', '"
                +movil.getKilometraje()+"', '"
                +movil.getAjusteReloj()+"', '"
                +movil.getAditivoCaja()+"', '"
                +movil.getAditivoMotor()+"', '"
                +movil.getAceite()+"','"
                + movil.getFiltro()+"','"
                +movil.getCorrea()+"','"
                +movil.getGrasa()+")");
            estatuto.close();
            conex.desconectar();
        } catch (SQLException e) {
            System.out.println("insertar en Movil"+e.getMessage());
        }
    }
    
    public Movil obtenerDetalleLicencia(int idMovil) {
        DbConnection conex= new DbConnection();
        Movil movil = new Movil();
        try {
            PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT numeroLicencia,licencia FROM movil where idMovil = ? ");
            consulta.setInt(1, idMovil);
            ResultSet res = consulta.executeQuery();
    
            if(res.next()){
                movil.setNumeroLicencia(res.getInt("numeroLicencia"));
                movil.setLicencia(res.getString("licencia"));
              
            }
            
            res.close();
            consulta.close();
            conex.desconectar();
            } catch (Exception e) {
                System.out.println(e);
            }
        return movil;
    }
    public ArrayList<Movil> obtenerIdMoviles()
    {
        DbConnection conex= new DbConnection();
        ArrayList<Movil> moviles = new ArrayList<Movil>();
        
        try {
            PreparedStatement consulta = conex.getConnection()
                    .prepareStatement("select * from movil");
            ResultSet res = consulta.executeQuery();

            while(res.next()){
                Movil movil = new Movil();
                movil.setIdMovil(res.getInt("idMovil"));    
                movil.setPatente(res.getString("patente"));
                movil.setModelo(res.getString("modelo"));
                movil.setLicencia(res.getString("licencia"));
                movil.setNumeroLicencia(res.getInt("numeroLicencia"));
                
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
    
    public Movil obtenerMoviles(int idMovil)
    {
        DbConnection conex= new DbConnection();
        Movil movil = new Movil();
        
        try {
            PreparedStatement consulta = conex.getConnection()
                    .prepareStatement("select * from movil WHERE idMovil="
                            + idMovil);
            ResultSet res = consulta.executeQuery();

            if(res.next()){
                movil.setIdMovil(res.getInt("idMovil"));    
                movil.setPatente(res.getString("patente"));
                movil.setModelo(res.getString("modelo"));
                movil.setLicencia(res.getString("licencia"));
                movil.setNumeroLicencia(res.getInt("numeroLicencia"));
            }
            res.close();
            consulta.close();
            conex.desconectar();

            } catch (Exception e) {
                System.out.println(e);
            }
       return movil;
    }
}
