/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import entidades.Ajustes;
import entidades.Chofer;
import entidades.Fila;
import entidades.Turno;
import java.util.ArrayList;

/**
 *
 * @author laptop
 */
public class FilaDAO {

    public String[] obtenerFila(Turno turno) {

        ChoferDAO choferDAO = new ChoferDAO();
        MovilDAO movilDAO = new MovilDAO();
        AjustesDAO ajustesDAO = new AjustesDAO();
        Ajustes ajuste = ajustesDAO.obtenerAjustesId(turno.getAjustes_idAjustes());
        Chofer chofer = choferDAO.consultarChofer(turno.getChofer_DNI()).get(0);
        
        double ajusteComision = ajuste.getComisionChofer();
        double ajusteGas = ajuste.getAjusteGas();
        double ajustesPrecioGasCtaCte = ajuste.getPrecioGasCtaCte();
        double ajustePrecioFueraCtaCte = ajuste.getPrecioGasFuera();
        double comision = 0;
        double neto = 0;
        double totalKmReloj = 0;
        double totalKmTablero = 0;
        double precioKm = 0;
        double rendimientoGNC = 0;
        try{
            totalKmReloj = (turno.getKmOcupados()+turno.getKmLibres())*movilDAO.obtenerAjusteReloj(turno.getMovil_idMovil());
            totalKmTablero = turno.getKmFinal()-turno.getKmInicial();
            comision = turno.getRecaudacion()*ajuste.getComisionChofer();
            precioKm = turno.getRecaudacion()/totalKmTablero;
            rendimientoGNC = totalKmTablero/ ((turno.getGncBrutoCtaCte()/ajuste.getPrecioGasCtaCte()) + (turno.getGncFueraCtaCte()/ajuste.getPrecioGasFuera()));
        } catch (Exception e){

        }
        if (turno.getRecaudacion() > 0 && comision > 0 && turno.getGastosVarios() > 0) {
           neto = turno.getRecaudacion()-comision-turno.getGastosVarios();
        }
        String[] fila = {
            "dia",
            "turno",
            Integer.toString(turno.getKmInicial()),
            Integer.toString(turno.getKmFinal()),
            String.valueOf(turno.getGastosVarios()),
            chofer.getDNI()+" "+chofer.getApellido()+", "+chofer.getNombre(),
            String.valueOf(Math.round( turno.getRecaudacion() * 100.0 ) / 100.0),
            String.valueOf(Math.round(turno.getGncBrutoCtaCte()* 100.0 ) / 100.0),
            String.valueOf(Math.round(turno.getGncFueraCtaCte()* 100.0 ) / 100.0),
            String.valueOf(turno.getKmOcupados()),
            String.valueOf(turno.getKmLibres()),
            String.valueOf(Math.round(neto* 100.0 ) / 100.0),
            String.valueOf(Math.round(totalKmReloj)),
            String.valueOf(Math.round(totalKmTablero* 100.0 ) / 100.0),
            String.valueOf(Math.round(comision* 100.0 ) / 100.0),
            String.valueOf(Math.round(precioKm* 100.0 ) / 100.0),
            String.valueOf(Math.round(turno.getGncBrutoCtaCte()*ajuste.getAjusteGas()* 100.0 ) / 100.0),
            String.valueOf(Math.round(rendimientoGNC* 100.0 ) / 100.0)};
        return fila;
        }
}
