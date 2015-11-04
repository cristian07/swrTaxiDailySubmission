/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entidades.Chofer;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import servicio.DbConnection;

/**
 *
 * @author sebastian.suarez
 */
public class ChoferDAO {
    public ArrayList<Chofer> consultarChofer(int documento) {
        ArrayList<Chofer> choferes = new ArrayList<Chofer>();
        DbConnection conex= new DbConnection();
        try {
            PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM chofer where DNI = ? ");
            consulta.setInt(1, documento);
            ResultSet res = consulta.executeQuery();
    
            if(res.next()){
                Chofer chofer= new Chofer();
                chofer.setDNI(documento);
                chofer.setNombre(res.getString("nombre"));
                chofer.setApellido(res.getString("apellido"));
                chofer.setDomicilio(res.getString("domicilio"));
                chofer.setLocalidad(res.getString("localidad"));
                chofer.setProvincia(res.getString("provincia"));
                chofer.setTelefono(res.getString("telefono"));
                chofer.setCelular(res.getString("celular"));
                chofer.setFechaCarnetOtorgamiento(res.getString("fechaCarnetOtorgamiento"));
                chofer.setFechaCarnetVencimiento(res.getString("fechaCarnetVencimiento"));
                choferes.add(chofer);
            }
            
            res.close();
            consulta.close();
            conex.desconectar();
            } catch (Exception e) {
                System.out.println(e);
            }
        return choferes;
    }
    
    public ArrayList<Chofer> getChoferes() {
        ArrayList<Chofer> choferes = new ArrayList<Chofer>();
        DbConnection conex= new DbConnection();
        try {
            PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM chofer");
            ResultSet res = consulta.executeQuery();
    
            while(res.next()){
                Chofer chofer= new Chofer();
                chofer.setDNI(res.getInt("DNI"));
                chofer.setNombre(res.getString("nombre"));
                chofer.setApellido(res.getString("apellido"));
                chofer.setDomicilio(res.getString("domicilio"));
                chofer.setLocalidad(res.getString("localidad"));
                chofer.setProvincia(res.getString("provincia"));
                chofer.setTelefono(res.getString("telefono"));
                chofer.setCelular(res.getString("celular"));
                chofer.setFechaCarnetOtorgamiento(res.getString("fechaCarnetOtorgamiento"));
                chofer.setFechaCarnetVencimiento(res.getString("fechaCarnetVencimiento"));
                choferes.add(chofer);
            }
            res.close();
            consulta.close();
            conex.desconectar();
            } catch (Exception e) {
                System.out.println(e);
            }
        return choferes;
    }
    public void altaChofer(Chofer chofer){
        DbConnection conex= new DbConnection();
        DbConnection conex2= new DbConnection();
      
        try {
            Statement estatuto = conex.getConnection().createStatement();
            estatuto.executeUpdate("INSERT INTO Chofer VALUES ('"
                +chofer.getDNI()+"', '"
                +chofer.getNombre()+"', '"
                +chofer.getApellido()+"', '"
                +chofer.getDomicilio()+"', '"
                +chofer.getLocalidad()+"', '"
                +chofer.getProvincia()+"', '"
                +chofer.getTelefono()+"', '"
                +chofer.getCelular()+"', '"
                +chofer.getFechaCarnetOtorgamiento()+"', '"
                +chofer.getFechaCarnetVencimiento()+"', '"
                +chofer.getCategoria()+"')");
            estatuto.close();
            conex.desconectar();
        } catch (SQLException e) {
            System.out.println("insertar en turno"+e.getMessage());
        }
    }
}
