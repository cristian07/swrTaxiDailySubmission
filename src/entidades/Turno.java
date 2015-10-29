package entidades;

import java.util.Calendar;

public class Turno {
    private int kmInicial;
    private int kmFinal;
    private double gastosVarios;
    private double recaudacion;
    private double gncBrutoCtaCte;
    private double gncFueraCtaCte;
    private int kmOcupados;
    private int kmLibres;
    private String ticketRelevo1;
    private String ticketRelevo2;
    private String fecha;
    private double gastosChequera;
    private String tipo;
    private String novedades;

    public Turno(){
        
    }

    /**
     * @return the kmInicial
     */
    public int getKmInicial() {
        return kmInicial;
    }

    /**
     * @param kmInicial the kmInicial to set
     */
    public void setKmInicial(int kmInicial) {
        this.kmInicial = kmInicial;
    }

    /**
     * @return the kmFinal
     */
    public int getKmFinal() {
        return kmFinal;
    }

    /**
     * @param kmFinal the kmFinal to set
     */
    public void setKmFinal(int kmFinal) {
        this.kmFinal = kmFinal;
    }

    /**
     * @return the gastosVarios
     */
    public double getGastosVarios() {
        return gastosVarios;
    }

    /**
     * @param gastosVarios the gastosVarios to set
     */
    public void setGastosVarios(double gastosVarios) {
        this.gastosVarios = gastosVarios;
    }

    /**
     * @return the recaudacion
     */
    public double getRecaudacion() {
        return recaudacion;
    }

    /**
     * @param recaudacion the recaudacion to set
     */
    public void setRecaudacion(double recaudacion) {
        this.recaudacion = recaudacion;
    }

    /**
     * @return the gncBrutoCtaCte
     */
    public double getGncBrutoCtaCte() {
        return gncBrutoCtaCte;
    }

    /**
     * @param gncBrutoCtaCte the gncBrutoCtaCte to set
     */
    public void setGncBrutoCtaCte(double gncBrutoCtaCte) {
        this.gncBrutoCtaCte = gncBrutoCtaCte;
    }

    /**
     * @return the gncFueraCtaCte
     */
    public double getGncFueraCtaCte() {
        return gncFueraCtaCte;
    }

    /**
     * @param gncFueraCtaCte the gncFueraCtaCte to set
     */
    public void setGncFueraCtaCte(double gncFueraCtaCte) {
        this.gncFueraCtaCte = gncFueraCtaCte;
    }

    /**
     * @return the kmOcupados
     */
    public int getKmOcupados() {
        return kmOcupados;
    }

    /**
     * @param kmOcupados the kmOcupados to set
     */
    public void setKmOcupados(int kmOcupados) {
        this.kmOcupados = kmOcupados;
    }

    /**
     * @return the kmLibres
     */
    public int getKmLibres() {
        return kmLibres;
    }

    /**
     * @param kmLibres the kmLibres to set
     */
    public void setKmLibres(int kmLibres) {
        this.kmLibres = kmLibres;
    }

    /**
     * @return the ticketRelevo1
     */
    public String getTicketRelevo1() {
        return ticketRelevo1;
    }

    /**
     * @param ticketRelevo1 the ticketRelevo1 to set
     */
    public void setTicketRelevo1(String ticketRelevo1) {
        this.ticketRelevo1 = ticketRelevo1;
    }

    /**
     * @return the ticketRelevo2
     */
    public String getTicketRelevo2() {
        return ticketRelevo2;
    }

    /**
     * @param ticketRelevo2 the ticketRelevo2 to set
     */
    public void setTicketRelevo2(String ticketRelevo2) {
        this.ticketRelevo2 = ticketRelevo2;
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
     * @return the gastosChequera
     */
    public double getGastosChequera() {
        return gastosChequera;
    }

    /**
     * @param gastosChequera the gastosChequera to set
     */
    public void setGastosChequera(double gastosChequera) {
        this.gastosChequera = gastosChequera;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the novedades
     */
    public String getNovedades() {
        return novedades;
    }

    /**
     * @param novedades the novedades to set
     */
    public void setNovedades(String novedades) {
        this.novedades = novedades;
    }
}
