/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package servicio;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author alejandro.suarez
 */
public class ManejadorTecla implements KeyListener{

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_ENTER){
            Robot Tecla = null;
            try {
                Tecla = new Robot();
            } catch (AWTException e1) {
                e1.printStackTrace();
            }
                Tecla.keyPress(KeyEvent.VK_TAB);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

}
