package DAO;

import entidades.Mecanico;
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
public class MecanicoDAO {
    public void altaMecanico(Mecanico mecanico,ArrayList<String> repuestos){
       DbConnection conex= new DbConnection();
       int idMecanico;
        try {
            Statement estatuto = conex.getConnection().createStatement();
            estatuto.executeUpdate("INSERT INTO Mecanico VALUES (NULL,"
                +mecanico.getMovil_idMovil()+", '"
                +mecanico.getFecha()+"', '"
                +mecanico.getReparacion()+"',"
                +mecanico.getImporte()+")");
            estatuto.close();
            conex.desconectar();
            idMecanico = ultimoIngreso();
            for (String repuesto : repuestos){
                altaRespuestos_has_Mecanico(repuesto,idMecanico,mecanico.getMovil_idMovil());
            }
        } catch (SQLException e) {
            System.out.println("insertar en turno"+e.getMessage());
        } 
       
    }
    public void altaRespuestos_has_Mecanico(String nombre,int idMecanico,int idMovil){
        DbConnection conex= new DbConnection();
        try {
            Statement estatuto = conex.getConnection().createStatement();
            estatuto.executeUpdate("INSERT INTO Repuesto_has_Mecanico VALUES ('"+nombre+"',"+idMecanico+","+idMovil+")");
            estatuto.close();
            conex.desconectar();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public int ultimoIngreso(){
        int idMecanico=0;
        DbConnection conex= new DbConnection();
        try { 
            PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT max(idMecanico) AS 'idMecanico' FROM Mecanico");
            ResultSet res = consulta.executeQuery();
            
            while(res.next()){
                idMecanico = res.getInt("idMecanico");
            }
            System.out.println(idMecanico);
            res.close();
            consulta.close();
            conex.desconectar();

        } catch (Exception e) {
                System.out.println(e);
        }
        return idMecanico;
    }
}
