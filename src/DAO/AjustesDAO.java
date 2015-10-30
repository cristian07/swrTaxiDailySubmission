/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entidades.Ajustes;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import servicio.DbConnection;

/**
 *
 * @author sebastian.suarez
 */
public class AjustesDAO {
    
     public String obtenerIdUltimosAjustes(){
        String idAjustes="";
        DbConnection conex= new DbConnection();
        try { 
            PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT idAjustes FROM Ajustes WHERE estado='ACTIVO'");
            ResultSet res = consulta.executeQuery();
            
            while(res.next()){
                idAjustes = res.getString("idAjustes");
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
            PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT idAjustes,comisionChofer,ajusteGas,precioGasCtaCte,precioGasFuera FROM Ajustes WHERE estado='ACTIVO'");
            ResultSet res = consulta.executeQuery();
            
            if(res.next()){
                ajustes.setIdAjustes(Integer.parseInt(res.getString("idAjustes")));
                ajustes.setComisionChofer(Double.parseDouble(res.getString("comisionChofer")));
                ajustes.setAjusteGas(Double.parseDouble(res.getString("ajusteGas")));
                ajustes.setPrecioGasCtaCte(Double.parseDouble(res.getString("precioGasCtaCte")));
                ajustes.setPrecioGasFuera(Double.parseDouble(res.getString("precioGasFuera")));
                ajustes.setEstado("ACTIVO");
            }
            
            res.close();
            consulta.close();
            conex.desconectar();

        } catch (Exception e) {
                System.out.println(e);
        }
        return ajustes;
    }
    
}
