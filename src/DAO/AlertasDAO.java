/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entidades.Alertas;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import servicio.DbConnection;

/**
 *
 * @author sebastian.suarez
 */
public class AlertasDAO {
    public Alertas obtenerAlertas(){
        DbConnection conex= new DbConnection();
        Alertas alertas = new Alertas();
        try { 
            PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM Ajustes");
            ResultSet res = consulta.executeQuery();
            
            while(res.next()){
                alertas.setAceite(res.getInt("aceite"));
                alertas.setCorrea(res.getInt("correa"));
                alertas.setFiltro(res.getInt("filtro"));
                alertas.setVencimientoLicenciaConductor(res.getInt("vencimientoLicenciaCOonductor"));
                alertas.setVencimientoLicenciaTaxi(res.getInt("vencimientoLicenciaTaxi"));
            }
            
            res.close();
            consulta.close();
            conex.desconectar();

        } catch (Exception e) {
                System.out.println(e);
        }
        return alertas;
    }
}
