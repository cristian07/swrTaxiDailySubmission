/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entidades;

/**
 *
 * @author laptop
 */
public class Mecanico {
    private int idMecanico;
    private int Movil_idMovil;
    private String fecha;
    private String reparacion;
    private double importe;

    /**
     * @return the idMecanico
     */
    public int getIdMecanico() {
        return idMecanico;
    }

    /**
     * @param idMecanico the idMecanico to set
     */
    public void setIdMecanico(int idMecanico) {
        this.idMecanico = idMecanico;
    }

    /**
     * @return the Movil_idMovil
     */
    public int getMovil_idMovil() {
        return Movil_idMovil;
    }

    /**
     * @param Movil_idMovil the Movil_idMovil to set
     */
    public void setMovil_idMovil(int Movil_idMovil) {
        this.Movil_idMovil = Movil_idMovil;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the reparacion
     */
    public String getReparacion() {
        return reparacion;
    }

    /**
     * @param reparacion the reparacion to set
     */
    public void setReparacion(String reparacion) {
        this.reparacion = reparacion;
    }

    /**
     * @return the importe
     */
    public double getImporte() {
        return importe;
    }

    /**
     * @param importe the importe to set
     */
    public void setImporte(double importe) {
        this.importe = importe;
    }
    
}
