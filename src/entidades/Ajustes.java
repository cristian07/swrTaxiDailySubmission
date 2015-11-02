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
public class Ajustes {
    private int idAjustes;
    private Double comisionChofer;
    private Double ajusteGas;
    private Double precioGasCtaCte;
    private Double precioGasFuera;
    private String estado;

    /**
     * @return the comisionChofer
     */
    public Double getComisionChofer() {
        return comisionChofer;
    }

    /**
     * @param comisionChofer the comisionChofer to set
     */
    public void setComisionChofer(Double comisionChofer) {
        this.comisionChofer = comisionChofer;
    }

    /**
     * @return the ajustesGas
     */
    public Double getAjusteGas() {
        return ajusteGas;
    }

    /**
     * @param ajustesGas the ajustesGas to set
     */
    public void setAjusteGas(Double ajustesGas) {
        this.ajusteGas = ajustesGas;
    }

    /**
     * @return the precioGasCtaCte
     */
    public Double getPrecioGasCtaCte() {
        return precioGasCtaCte;
    }

    /**
     * @param precioGasCtaCte the precioGasCtaCte to set
     */
    public void setPrecioGasCtaCte(Double precioGasCtaCte) {
        this.precioGasCtaCte = precioGasCtaCte;
    }

    /**
     * @return the precioGasFuera
     */
    public Double getPrecioGasFuera() {
        return precioGasFuera;
    }

    /**
     * @param precioGasFuera the precioGasFuera to set
     */
    public void setPrecioGasFuera(Double precioGasFuera) {
        this.precioGasFuera = precioGasFuera;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the idAjustes
     */
    public int getIdAjustes() {
        return idAjustes;
    }

    /**
     * @param idAjustes the idAjustes to set
     */
    public void setIdAjustes(int idAjustes) {
        this.idAjustes = idAjustes;
    }
}
