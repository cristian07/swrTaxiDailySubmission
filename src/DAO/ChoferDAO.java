/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entidades.Chofer;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
            PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT nombre,apellido FROM chofer where DNI = ? ");
            consulta.setInt(1, documento);
            ResultSet res = consulta.executeQuery();
    
            if(res.next()){
              Chofer chofer= new Chofer();
              chofer.setDNI(documento);
              chofer.setNombre(res.getString("nombre"));
              chofer.setApellido(res.getString("apellido"));
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
            PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM chofer where 1=1 ");
            ResultSet res = consulta.executeQuery();
    
            if(res.next()){
                Chofer chofer= new Chofer();
                chofer.setDNI(res.getInt("DNI"));
                chofer.setNombre(res.getString("nombre"));
                chofer.setApellido(res.getString("apellido"));
                chofer.setDomicilio(res.getString("domicilio"));
                chofer.setLocalidad(res.getString("localidad"));
                chofer.setProvincia(res.getString("provincia"));
                chofer.setTelefono(res.getString("telefono"));
                chofer.setCelular(res.getString("celular"));
                chofer.setFechaCarnet(res.getString("fechaCarnet"));
                chofer.setLicenciaCarnet(res.getInt("licenciaCarnet"));
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
}
