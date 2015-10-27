/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import entidades.Turno;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import servicio.DbConnection;

/**
 *
 * @author laptop
 */
public class TurnoDAO {
    
    public void altaTurno(Turno turno) {
        DbConnection conex= new DbConnection();
        Calendar calendario = Calendar.getInstance();
        String fechaHoraSQL = new StringBuilder()
                .append(Integer.toString(calendario.get(Calendar.YEAR))).append("-")
                .append(Integer.toString(calendario.get(Calendar.MONTH)+1)).append("-")
                .append(Integer.toString(calendario.get(Calendar.DATE))).toString();
        try {
            Statement estatuto = conex.getConnection().createStatement();
            estatuto.executeUpdate("INSERT INTO Turno "
                    + "VALUES (NULL,'"
                +turno.getGastosVarios()+"', '"
                +turno.getRecaudacion()+"', '"
                +fechaHoraSQL+"', '"
                //+turno.getFecha()+"', '"
                +turno.getKmInicial()+"', '"
                +turno.getKmFinal()+"', '"
                +turno.getTicketRelevo()+"', '"
                +turno.getTipo()+"', '"
                +turno.getMovil_idMovil()+"', '"
                +turno.getNovedades()+"')");
            
            estatuto.close();
            conex.desconectar();
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
