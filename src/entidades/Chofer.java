package entidades;

import java.util.Date;

public class Chofer {

    private int nroLicencia;
    private String jurisdiccion;
    private Date fechaOtotgado;
    private Date fechaVencimiento;
    private String categoria;
    private Persona persona;

    public Chofer(int nroLicencia, String jurisdiccion, Date fechaOtotgado, Date fechaVencimiento, String categoria, Persona persona) {
        this.nroLicencia = nroLicencia;
        this.jurisdiccion = jurisdiccion;
        this.fechaOtotgado = fechaOtotgado;
        this.fechaVencimiento = fechaVencimiento;
        this.categoria = categoria;
        this.persona = persona;
    }

    public Chofer() {
    }

    public int getNroLicencia() {
        return nroLicencia;
    }

    public void setNroLicencia(int nroLicencia) {
        this.nroLicencia = nroLicencia;
    }

    public String getJurisdiccion() {
        return jurisdiccion;
    }

    public void setJurisdiccion(String jurisdiccion) {
        this.jurisdiccion = jurisdiccion;
    }

    public Date getFechaOtotgado() {
        return fechaOtotgado;
    }

    public void setFechaOtotgado(Date fechaOtotgado) {
        this.fechaOtotgado = fechaOtotgado;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

}
