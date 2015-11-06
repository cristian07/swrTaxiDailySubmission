/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author sebastian.suarez
 */
public class Alertas {
    private int vencimientoLicenciaTaxi;
    private int vencimientoLicenciaConductor;
    private int correa;
    private int aceite;
    private int grasa;
    private int filtro;

    /**
     * @return the vencimientoLicenciaTaxi
     */
    public int getVencimientoLicenciaTaxi() {
        return vencimientoLicenciaTaxi;
    }

    /**
     * @param vencimientoLicenciaTaxi the vencimientoLicenciaTaxi to set
     */
    public void setVencimientoLicenciaTaxi(int vencimientoLicenciaTaxi) {
        this.vencimientoLicenciaTaxi = vencimientoLicenciaTaxi;
    }

    /**
     * @return the vencimientoLicenciaCOonductor
     */
    public int getVencimientoLicenciaConductor() {
        return vencimientoLicenciaConductor;
    }

    /**
     * @param vencimientoLicenciaCOonductor the vencimientoLicenciaCOonductor to set
     */
    public void setVencimientoLicenciaConductor(int vencimientoLicenciaConductor) {
        this.vencimientoLicenciaConductor = vencimientoLicenciaConductor;
    }

    /**
     * @return the correa
     */
    public int getCorrea() {
        return correa;
    }

    /**
     * @param correa the correa to set
     */
    public void setCorrea(int correa) {
        this.correa = correa;
    }

    /**
     * @return the aceite
     */
    public int getAceite() {
        return aceite;
    }

    /**
     * @param aceite the aceite to set
     */
    public void setAceite(int aceite) {
        this.aceite = aceite;
    }

    /**
     * @return the grasa
     */
    public int getGrasa() {
        return grasa;
    }

    /**
     * @param grasa the grasa to set
     */
    public void setGrasa(int grasa) {
        this.grasa = grasa;
    }

    /**
     * @return the filtro
     */
    public int getFiltro() {
        return filtro;
    }

    /**
     * @param filtro the filtro to set
     */
    public void setFiltro(int filtro) {
        this.filtro = filtro;
    }
}
