/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import servicio.DbConnection;

/**
 *
 * @author sebastian.suarez
 */
public class LoginPrincipalDAO {
    public String logueoPrincipal(String nombre, String clave){
        DbConnection conex= new DbConnection();
        String permisos = "DENEGADO";
         try {
            PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT permisos FROM usuario WHERE nombre=? and clave=?");
            consulta.setString(1, nombre);
            consulta.setString(2, clave);
            ResultSet res = consulta.executeQuery();
    
            if(res.next()){
               permisos=res.getString("permisos"); 
            }
            
            res.close();
            consulta.close();
            conex.desconectar();
        } catch (Exception e) {
                System.out.println(e);
        }
        return permisos;
    }
}
