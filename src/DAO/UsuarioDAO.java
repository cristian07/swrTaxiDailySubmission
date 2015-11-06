/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import entidades.Usuario;
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
public class UsuarioDAO {
    public ArrayList<Usuario> obtenerUsuarios(){
       ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
        DbConnection conex= new DbConnection();
        try {
            PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM Usuario");
            ResultSet res = consulta.executeQuery();
    
            while(res.next()){
                Usuario usuario= new Usuario();
                usuario.setNombre(res.getString("nombre"));
                usuario.setClave(res.getString("clave"));
                usuario.setPermisos(res.getString("permisos"));
                usuarios.add(usuario);
            }
            
            res.close();
            consulta.close();
            conex.desconectar();
            } catch (Exception e) {
                System.out.println(e);
            }
        return usuarios; 
    }
    public void altaUsuario(Usuario usuario){
        DbConnection conex= new DbConnection();
        try {
            Statement estatuto = conex.getConnection().createStatement();
            estatuto.executeUpdate("INSERT INTO Usuario VALUES ('"
                +usuario.getNombre()+"', '"
                +usuario.getClave()+"', '"
                +usuario.getPermisos()+"')");
            estatuto.close();
            conex.desconectar();
        } catch (SQLException e) {
            System.out.println("insertar en turno"+e.getMessage());
        }
    }
    public Usuario obtenerUsuario(String nombre){
        Usuario usuario= new Usuario();;
        DbConnection conex= new DbConnection();
        try {
            PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM Usuario WHERE nombre='"
                    + nombre+"'");
            ResultSet res = consulta.executeQuery();
    
            if(res.next()){
                
                usuario.setNombre(res.getString("nombre"));
                usuario.setClave(res.getString("clave"));
                usuario.setPermisos(res.getString("permisos"));
            }
            
            res.close();
            consulta.close();
            conex.desconectar();
            } catch (Exception e) {
                System.out.println(e);
            }
        return usuario; 
    }
    public void bajaUsuario(String nombre){
        DbConnection conex= new DbConnection();
        try {
            Statement estatuto = conex.getConnection().createStatement();
            estatuto.executeUpdate("DELETE FROM Usuario WHERE nombre='"
                    +nombre+ "'");
            estatuto.close();
            conex.desconectar();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
 }
