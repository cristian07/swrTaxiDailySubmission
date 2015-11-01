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
}
