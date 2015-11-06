/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entidades.Repuesto;
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
public class RepuestoDAO {
    public ArrayList<Repuesto> obtenerRepuestos(){
       ArrayList<Repuesto> repuestos = new ArrayList<Repuesto>();
        DbConnection conex= new DbConnection();
        try {
            PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM Repuesto");
            ResultSet res = consulta.executeQuery();
    
            while(res.next()){
                Repuesto repuesto= new Repuesto();
                repuesto.setNombre(res.getString("nombre"));
                repuestos.add(repuesto);
            }
            
            res.close();
            consulta.close();
            conex.desconectar();
            } catch (Exception e) {
                System.out.println(e);
            }
        return repuestos; 
    }
    public void altaRepuesto(String nombre){
        DbConnection conex= new DbConnection();
        try {
            Statement estatuto = conex.getConnection().createStatement();
            estatuto.executeUpdate("INSERT INTO Repuesto VALUES ('"
                +nombre+"')");
            estatuto.close();
            conex.desconectar();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
