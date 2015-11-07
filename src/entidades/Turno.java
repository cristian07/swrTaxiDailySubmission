package entidades;

import java.util.Calendar;

public class Turno {
    private int Movil_idMovil;
    private int Ajustes_idAjustes;
    private int Chofer_DNI;
    private int kmInicial;
    private int kmFinal;
    private double gastosVarios;
    private double recaudacion;
    private double gncBrutoCtaCte;
    private double gncFueraCtaCte;
    private int kmOcupados;
    private int kmLibres;
    private double ticketRelevo1;
    private double ticketRelevo2;
    private String fecha;
    private double gastosChequera;
    private String tipo;
    private String novedades;
    private String detalleCaja;
    private double importeCaja;
    
    public Turno(){
        
    }
    public double calcularNeto(double comision){
        return recaudacion*(1-comision)-gastosVarios;
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

    /**
     * @return the ticketRelevo1
     */
    public double getTicketRelevo1() {
        return ticketRelevo1;
    }

    /**
     * @param ticketRelevo1 the ticketRelevo1 to set
     */
    public void setTicketRelevo1(double ticketRelevo1) {
        this.ticketRelevo1 = ticketRelevo1;
    }

    /**
     * @return the ticketRelevo2
     */
    public double getTicketRelevo2() {
        return ticketRelevo2;
    }

    /**
     * @param ticketRelevo2 the ticketRelevo2 to set
     */
    public void setTicketRelevo2(double ticketRelevo2) {
        this.ticketRelevo2 = ticketRelevo2;
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
     * @return the Ajustes_idAjustes
     */
    public int getAjustes_idAjustes() {
        return Ajustes_idAjustes;
    }

    /**
     * @param Ajustes_idAjustes the Ajustes_idAjustes to set
     */
    public void setAjustes_idAjustes(int Ajustes_idAjustes) {
        this.Ajustes_idAjustes = Ajustes_idAjustes;
    }

    /**
     * @return the Chofer_DNI
     */
    public int getChofer_DNI() {
        return Chofer_DNI;
    }

    /**
     * @param Chofer_DNI the Chofer_DNI to set
     */
    public void setChofer_DNI(int Chofer_DNI) {
        this.Chofer_DNI = Chofer_DNI;
    }

    /**
     * @return the detalleCaja
     */
    public String getDetalleCaja() {
        return detalleCaja;
    }

    /**
     * @param detalleCaja the detalleCaja to set
     */
    public void setDetalleCaja(String detalleCaja) {
        this.detalleCaja = detalleCaja;
    }

    /**
     * @return the importeCaja
     */
    public double getImporteCaja() {
        return importeCaja;
    }

    /**
     * @param importeCaja the importeCaja to set
     */
    public void setImporteCaja(double importeCaja) {
        this.importeCaja = importeCaja;
    }
}
