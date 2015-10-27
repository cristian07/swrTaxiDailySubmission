/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import entidades.Turno;
import java.sql.SQLException;
import java.sql.Statement;
import servicio.DbConnection;

/**
 *
 * @author laptop
 */
public class TurnoDAO {
    
    public void altaTurno(Turno turno) {
        DbConnection conex= new DbConnection();
        try {
            Statement estatuto = conex.getConnection().createStatement();
            
            estatuto.executeUpdate("INSERT INTO Turno "
                    + "VALUES (NULL,'"
                +turno.getGastosVarios()+"', '"
                +turno.getRecaudacion()+"', '"
                +turno.getFecha()+"', '"
                +turno.getKmInicial()+"', '"
                +turno.getKmFinal()+"', '"
                +turno.getTicketRelevo()+"', '"
                +turno.getTipo()+"', '"
                +turno.getMovil_idMovil()+"')");
            
            estatuto.close();
            conex.desconectar();
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
