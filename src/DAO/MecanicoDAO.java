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
    public String altaMecanico(Mecanico mecanico){
       DbConnection conex= new DbConnection();
        try {
            Statement estatuto = conex.getConnection().createStatement();
            estatuto.executeUpdate("INSERT INTO Mecanico VALUES (NULL,"
                +mecanico.getMovil_idMovil()+", '"
                +mecanico.getFecha()+"', '"
                +mecanico.getReparacion()+"',"
                +mecanico.getImporte()+",'"
                +mecanico.getRepuestos()+"')");
            estatuto.close();
            conex.desconectar();
            return "Exito!";
        } catch (SQLException e) {
            System.out.println("insertar en turno"+e.getMessage());
            return "Ocurrio un problema al intentar grabar";
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
    public ArrayList<Mecanico> obtenerMecanicoMovil(int idMovil,String fechaInicio,String fechaFin) {
        DbConnection conex= new DbConnection();
        ArrayList<Mecanico> mecanicos = new ArrayList<Mecanico>();
        
        try {
            PreparedStatement consulta = conex.getConnection()
                    .prepareStatement("SELECT * FROM Mecanico M WHERE M.fecha between ? and ? and M.Movil_idMovil=? ORDER BY M.fecha");
            
            consulta.setString(1, fechaInicio);
            consulta.setString(2, fechaFin);
            consulta.setInt(3, idMovil);
            
            ResultSet res = consulta.executeQuery();

            while(res.next()){
                Mecanico mecanico = new Mecanico();
                mecanico.setFecha(res.getString("fecha"));
                mecanico.setImporte(res.getDouble("importe"));
                mecanico.setReparacion(res.getString("reparacion"));
                mecanico.setRepuestos(res.getString("repuestos"));
                mecanicos.add(mecanico);
            }
            res.close();
            consulta.close();
            conex.desconectar();

            } catch (Exception e) {
                System.out.println(e);
            }
       return mecanicos; 
    }
}
