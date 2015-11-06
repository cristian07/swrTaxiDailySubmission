/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entidades.Ajustes;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import servicio.DbConnection;

/**
 *
 * @author sebastian.suarez
 */
public class AjustesDAO {
    
     public int obtenerIdUltimosAjustes(){
        int idAjustes=0;
        DbConnection conex= new DbConnection();
        try { 
            PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT idAjustes FROM Ajustes WHERE estado='A'");
            ResultSet res = consulta.executeQuery();
            
            while(res.next()){
                idAjustes = res.getInt("idAjustes");
            }
            res.close();
            consulta.close();
            conex.desconectar();

        } catch (Exception e) {
                System.out.println(e);
        }
        return idAjustes;
    }
     
    public Ajustes obtenerUltimosAjustes(){
        
        DbConnection conex= new DbConnection();
        Ajustes ajustes = new Ajustes();
        try { 
            PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM Ajustes WHERE estado='A'");
            ResultSet res = consulta.executeQuery();
            
            if(res.next()){
                ajustes.setIdAjustes(Integer.parseInt(res.getString("idAjustes")));
                ajustes.setComisionChofer(Double.parseDouble(res.getString("comisionChofer")));
                ajustes.setAjusteGas(Double.parseDouble(res.getString("ajusteGas")));
                ajustes.setPrecioGasCtaCte(Double.parseDouble(res.getString("precioGasCtaCte")));
                ajustes.setPrecioGasFuera(Double.parseDouble(res.getString("precioGasFuera")));
                ajustes.setEstado("A");
            }
            
            res.close();
            consulta.close();
            conex.desconectar();

        } catch (Exception e) {
                System.out.println(e);
        }
        return ajustes;
    }
    public Ajustes obtenerAjustesId(int idAjustes){
        
        DbConnection conex= new DbConnection();
        Ajustes ajustes = new Ajustes();
        try { 
            PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM Ajustes WHERE idAjustes=?");
            consulta.setInt(1, idAjustes);
            ResultSet res = consulta.executeQuery();
            
            if(res.next()){
                ajustes.setIdAjustes(Integer.parseInt(res.getString("idAjustes")));
                ajustes.setComisionChofer(Double.parseDouble(res.getString("comisionChofer")));
                ajustes.setAjusteGas(Double.parseDouble(res.getString("ajusteGas")));
                ajustes.setPrecioGasCtaCte(Double.parseDouble(res.getString("precioGasCtaCte")));
                ajustes.setPrecioGasFuera(Double.parseDouble(res.getString("precioGasFuera")));
                ajustes.setEstado(res.getString("estado"));
            }
            
            res.close();
            consulta.close();
            conex.desconectar();

        } catch (Exception e) {
                System.out.println(e);
        }
        return ajustes;
    }
    public void actualizarAjustes(Ajustes ajustes)
    {
        DbConnection conex= new DbConnection();
        int idAjustes = this.obtenerIdUltimosAjustes();
        
        try {
            
            Statement estatuto = conex.getConnection().createStatement();
            estatuto.executeUpdate("INSERT INTO Ajustes VALUES (NULL,'"
               +ajustes.getComisionChofer()+"', '"
                +ajustes.getAjusteGas()+"', '"
                +ajustes.getPrecioGasCtaCte()+"', '"
                +ajustes.getPrecioGasFuera()+"','A')");
            estatuto.close();
            conex.desconectar();
            this.darBajaAjustes(idAjustes);
        } catch (SQLException e) {
            System.out.println("insertar en turno"+e.getMessage());
        }
    }
    void darBajaAjustes(int idAjustes){
        DbConnection conex= new DbConnection();
        try {
             Statement estatuto = conex.getConnection().createStatement();
            estatuto.executeUpdate("UPDATE Ajustes SET estado='B' WHERE idAjustes='"
                    +idAjustes+ "'");
            estatuto.close();
            conex.desconectar();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
