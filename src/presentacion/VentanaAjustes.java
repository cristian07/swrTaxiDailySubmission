/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import DAO.AjustesDAO;
import DAO.AlertasDAO;
import com.sun.glass.events.KeyEvent;
import entidades.Ajustes;
import entidades.Alertas;
import javax.swing.JOptionPane;
import servicio.ManejadorTecla;

/**
 *
 * @author Cristian
 */
public class VentanaAjustes extends javax.swing.JFrame {

    /**
     * Creates new form VentanaAjustes
     */
    public VentanaAjustes() {
        initComponents();
        this.setLocationRelativeTo(null);
         ManejadorTecla manejador = new ManejadorTecla();
        jtf_ComisionChofer.addKeyListener(manejador);
        jte_AjusteGas.addKeyListener(manejador);
        jte_PrecioGasCtaCte.addKeyListener(manejador);
        jte_PrecioGasFueraCta.addKeyListener(manejador);
        jtf_Taxi.addKeyListener(manejador);
        jtf_Chofer.addKeyListener(manejador);
        jtf_Correa.addKeyListener(manejador);
        jtf_Aceite.addKeyListener(manejador);
        jtf_Grasa.addKeyListener(manejador);
        jtf_Filtro.addKeyListener(manejador);
        
        
        AjustesDAO ajustesDAO = new AjustesDAO();
        Ajustes ajustes = new Ajustes();
        ajustes = ajustesDAO.obtenerUltimosAjustes();
        jtf_ComisionChofer.setText(Double.toString(ajustes.getComisionChofer()));
        jte_AjusteGas.setText(Double.toString(ajustes.getAjusteGas()));
        jte_PrecioGasCtaCte.setText(Double.toString(ajustes.getPrecioGasCtaCte()));
        jte_PrecioGasFueraCta.setText(Double.toString(ajustes.getPrecioGasFuera()));
        
        AlertasDAO alertasDAO = new AlertasDAO();
        Alertas alertas = alertasDAO.obtenerAlertas();
        
        jtf_Taxi.setText(String.valueOf(alertas.getVencimientoLicenciaTaxi()));
        jtf_Chofer.setText(String.valueOf(alertas.getVencimientoLicenciaConductor()));
        jtf_Correa.setText(String.valueOf(alertas.getCorrea()));
        jtf_Aceite.setText(String.valueOf(alertas.getAceite()));
        jtf_Grasa.setText(String.valueOf(alertas.getGrasa()));
        jtf_Filtro.setText(String.valueOf(alertas.getFiltro()));
        jtf_CorreaKM.setText(String.valueOf(alertas.getCorreaKM()));
        jtf_AceiteKM.setText(String.valueOf(alertas.getAceiteKM()));
        jtf_GrasaKM.setText(String.valueOf(alertas.getGrasaKM()));
        jtf_FiltroKM.setText(String.valueOf(alertas.getFiltroKM()));
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel12 = new javax.swing.JLabel();
        jtf_Correa1 = new javax.swing.JTextField();
        Ajustes = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jb_Salir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtf_ComisionChofer = new javax.swing.JTextField();
        jte_AjusteGas = new javax.swing.JTextField();
        jte_PrecioGasCtaCte = new javax.swing.JTextField();
        jte_PrecioGasFueraCta = new javax.swing.JTextField();
        jb_Actualizar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jtf_Taxi = new javax.swing.JTextField();
        jtf_Chofer = new javax.swing.JTextField();
        jtf_Correa = new javax.swing.JTextField();
        jtf_Aceite = new javax.swing.JTextField();
        jtf_Grasa = new javax.swing.JTextField();
        jtf_Filtro = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jtf_CorreaKM = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jtf_AceiteKM = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jtf_GrasaKM = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jtf_FiltroKM = new javax.swing.JTextField();
        jb_ActualizarAlarmas = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jLabel12.setText("dias");

        jtf_Correa1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtf_Correa1KeyTyped(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Configuración de ajustes");
        setResizable(false);

        jb_Salir.setText("Volver");
        jb_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_SalirActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setPreferredSize(new java.awt.Dimension(461, 256));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel1.setText("Comisión Chofer");

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel2.setText("Ajuste Gas");

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel3.setText("Precio Gas Cta Cte");

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel4.setText("Precio Gas fuera Cta Cte");

        jtf_ComisionChofer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtf_ComisionChoferKeyTyped(evt);
            }
        });

        jte_AjusteGas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jte_AjusteGasActionPerformed(evt);
            }
        });
        jte_AjusteGas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jte_AjusteGasKeyTyped(evt);
            }
        });

        jte_PrecioGasCtaCte.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jte_PrecioGasCtaCteKeyTyped(evt);
            }
        });

        jte_PrecioGasFueraCta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jte_PrecioGasFueraCtaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jte_PrecioGasCtaCte, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jte_PrecioGasFueraCta, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jte_AjusteGas, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtf_ComisionChofer, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtf_ComisionChofer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jte_AjusteGas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jte_PrecioGasCtaCte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jte_PrecioGasFueraCta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        jb_Actualizar.setText("Actualizar");
        jb_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_ActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jb_Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_Salir)
                    .addComponent(jb_Actualizar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Ajustes.addTab("Ajustes", jPanel1);

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setText("Licencia taxi");

        jLabel6.setText("Licencia chofer");

        jLabel7.setText("Correa");

        jLabel8.setText("Aceite");

        jLabel9.setText("Grasa");

        jLabel10.setText("Filtro");

        jtf_Taxi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtf_TaxiKeyTyped(evt);
            }
        });

        jtf_Chofer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtf_ChoferKeyTyped(evt);
            }
        });

        jtf_Correa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtf_CorreaKeyTyped(evt);
            }
        });

        jtf_Aceite.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtf_AceiteKeyTyped(evt);
            }
        });

        jtf_Grasa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtf_GrasaKeyTyped(evt);
            }
        });

        jLabel11.setText("dias");

        jLabel13.setText("dias");

        jLabel14.setText("Km");

        jLabel15.setText("Km");

        jLabel16.setText("Km");

        jLabel17.setText("Km");

        jtf_CorreaKM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtf_CorreaKMKeyTyped(evt);
            }
        });

        jLabel18.setText("Km");

        jLabel19.setText("Km");

        jtf_AceiteKM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtf_AceiteKMKeyTyped(evt);
            }
        });

        jLabel20.setText("Km");

        jtf_GrasaKM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtf_GrasaKMKeyTyped(evt);
            }
        });

        jLabel21.setText("Km");

        jtf_FiltroKM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtf_FiltroKMKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(jtf_Taxi, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jtf_Correa, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                            .addComponent(jtf_Aceite, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtf_Grasa, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtf_Filtro)
                            .addComponent(jtf_Chofer))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtf_CorreaKM, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18))
                    .addComponent(jLabel13)
                    .addComponent(jLabel11)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtf_AceiteKM, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel19))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtf_GrasaKM, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtf_FiltroKM, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel21)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtf_Taxi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtf_Chofer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(24, 24, 24)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtf_Correa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jtf_CorreaKM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jtf_Aceite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtf_AceiteKM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel19)))
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jtf_Grasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtf_GrasaKM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel20)))
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jtf_Filtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtf_FiltroKM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel21)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jb_ActualizarAlarmas.setText("Actualizar");
        jb_ActualizarAlarmas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_ActualizarAlarmasActionPerformed(evt);
            }
        });

        jButton2.setText("Volver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jb_ActualizarAlarmas, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_ActualizarAlarmas)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Ajustes.addTab("Alarmas", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Ajustes)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Ajustes, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jte_AjusteGasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jte_AjusteGasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jte_AjusteGasActionPerformed

    private void jb_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_ActualizarActionPerformed
        if(jtf_ComisionChofer.getText().isEmpty()||
           jte_AjusteGas.getText().isEmpty()||
           jte_PrecioGasCtaCte.getText().isEmpty()||
           jte_PrecioGasFueraCta.getText().isEmpty()){
            
            JOptionPane.showMessageDialog(rootPane, "Todos los campos deben estar completos");
        }else{
            actualizarAjustes();
        }
    }//GEN-LAST:event_jb_ActualizarActionPerformed

    private void jb_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_SalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jb_SalirActionPerformed

    private void jb_ActualizarAlarmasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_ActualizarAlarmasActionPerformed
        if(jtf_Taxi.getText().isEmpty()||
           jtf_Chofer.getText().isEmpty()||
           jtf_Correa.getText().isEmpty()||
           jtf_Aceite.getText().isEmpty()||
           jtf_Grasa.getText().isEmpty()
           ){
            JOptionPane.showMessageDialog(rootPane, "Todos los campos deben estar completos");
        }else{
        actualizarAlarmas();
        }
    }//GEN-LAST:event_jb_ActualizarAlarmasActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose(); 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jtf_ComisionChoferKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_ComisionChoferKeyTyped
        // TODO add your handling code here:
        char caracter = evt.getKeyChar();
        if (((caracter < '0') || (caracter > '9')) && (caracter != KeyEvent.VK_BACKSPACE)
                && (caracter != '.')) {
            /* lo que deseo colocar aqui es si ya se pulso el caracter (.) el mismo no se pueda repetir*/
            evt.consume();
}
    }//GEN-LAST:event_jtf_ComisionChoferKeyTyped

    private void jte_AjusteGasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jte_AjusteGasKeyTyped
        // TODO add your handling code here:
        char caracter = evt.getKeyChar();
        if (((caracter < '0') || (caracter > '9')) && (caracter != KeyEvent.VK_BACKSPACE)
                && (caracter != '.')) {
            /* lo que deseo colocar aqui es si ya se pulso el caracter (.) el mismo no se pueda repetir*/
            evt.consume();
}
    }//GEN-LAST:event_jte_AjusteGasKeyTyped

    private void jte_PrecioGasCtaCteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jte_PrecioGasCtaCteKeyTyped
        // TODO add your handling code here:
        char caracter = evt.getKeyChar();
        if (((caracter < '0') || (caracter > '9')) && (caracter != KeyEvent.VK_BACKSPACE)
                && (caracter != '.')) {
            /* lo que deseo colocar aqui es si ya se pulso el caracter (.) el mismo no se pueda repetir*/
            evt.consume();
}
    }//GEN-LAST:event_jte_PrecioGasCtaCteKeyTyped

    private void jte_PrecioGasFueraCtaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jte_PrecioGasFueraCtaKeyTyped
        // TODO add your handling code here:
        char caracter = evt.getKeyChar();
        if (((caracter < '0') || (caracter > '9')) && (caracter != KeyEvent.VK_BACKSPACE)
                && (caracter != '.')) {
            /* lo que deseo colocar aqui es si ya se pulso el caracter (.) el mismo no se pueda repetir*/
            evt.consume();
}
    }//GEN-LAST:event_jte_PrecioGasFueraCtaKeyTyped

    private void jtf_TaxiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_TaxiKeyTyped
        // TODO add your handling code here:
        char caracter = evt.getKeyChar();
        if (((caracter < '0') || (caracter > '9')) && (caracter != KeyEvent.VK_BACKSPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_jtf_TaxiKeyTyped

    private void jtf_ChoferKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_ChoferKeyTyped
        // TODO add your handling code here:
        char caracter = evt.getKeyChar();
        if (((caracter < '0') || (caracter > '9')) && (caracter != KeyEvent.VK_BACKSPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_jtf_ChoferKeyTyped

    private void jtf_CorreaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_CorreaKeyTyped
        // TODO add your handling code here:
        char caracter = evt.getKeyChar();
        if (((caracter < '0') || (caracter > '9')) && (caracter != KeyEvent.VK_BACKSPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_jtf_CorreaKeyTyped

    private void jtf_AceiteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_AceiteKeyTyped
        // TODO add your handling code here:
        char caracter = evt.getKeyChar();
        if (((caracter < '0') || (caracter > '9')) && (caracter != KeyEvent.VK_BACKSPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_jtf_AceiteKeyTyped

    private void jtf_GrasaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_GrasaKeyTyped
        // TODO add your handling code here:
        char caracter = evt.getKeyChar();
        if (((caracter < '0') || (caracter > '9')) && (caracter != KeyEvent.VK_BACKSPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_jtf_GrasaKeyTyped

    private void jtf_Correa1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_Correa1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_Correa1KeyTyped

    private void jtf_CorreaKMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_CorreaKMKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_CorreaKMKeyTyped

    private void jtf_AceiteKMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_AceiteKMKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_AceiteKMKeyTyped

    private void jtf_GrasaKMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_GrasaKMKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_GrasaKMKeyTyped

    private void jtf_FiltroKMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_FiltroKMKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_FiltroKMKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaAjustes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAjustes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAjustes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAjustes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAjustes().setVisible(true);
            }
        });
    }
    
    public void actualizarAjustes(){
        
        AjustesDAO ajustesDAO = new AjustesDAO();
        Ajustes ajustes = new Ajustes();
        ajustes.setComisionChofer(Double.parseDouble(jtf_ComisionChofer.getText()));
        ajustes.setAjusteGas(Double.parseDouble(jte_AjusteGas.getText()));
        ajustes.setPrecioGasCtaCte(Double.parseDouble(jte_PrecioGasCtaCte.getText()));
        ajustes.setPrecioGasFuera(Double.parseDouble(jte_PrecioGasFueraCta.getText()));
        ajustesDAO.actualizarAjustes(ajustes);
        JOptionPane.showMessageDialog(rootPane, "Los datos se actualizaron con éxito");
    }
    
    public void actualizarAlarmas(){
    AlertasDAO alertasDAO = new AlertasDAO();
        Alertas alertas = new Alertas();
        alertas.setAceite(Integer.parseInt(jtf_Aceite.getText()));
        alertas.setCorrea(Integer.parseInt(jtf_Correa.getText()));
        alertas.setFiltro(Integer.parseInt(jtf_Filtro.getText()));
        alertas.setGrasa(Integer.parseInt(jtf_Grasa.getText()));
        alertas.setAceiteKM(Integer.parseInt(jtf_AceiteKM.getText()));
        alertas.setCorreaKM(Integer.parseInt(jtf_CorreaKM.getText()));
        alertas.setFiltroKM(Integer.parseInt(jtf_FiltroKM.getText()));
        alertas.setGrasaKM(Integer.parseInt(jtf_GrasaKM.getText()));
        alertas.setVencimientoLicenciaConductor(Integer.parseInt(jtf_Chofer.getText()));
        alertas.setVencimientoLicenciaTaxi(Integer.parseInt(jtf_Taxi.getText()));
        alertasDAO.actualizarAlertas(alertas);
        JOptionPane.showMessageDialog(rootPane, "Los datos se actualizaron con éxito");
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane Ajustes;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton jb_Actualizar;
    private javax.swing.JButton jb_ActualizarAlarmas;
    private javax.swing.JButton jb_Salir;
    private javax.swing.JTextField jte_AjusteGas;
    private javax.swing.JTextField jte_PrecioGasCtaCte;
    private javax.swing.JTextField jte_PrecioGasFueraCta;
    private javax.swing.JTextField jtf_Aceite;
    private javax.swing.JTextField jtf_AceiteKM;
    private javax.swing.JTextField jtf_Chofer;
    private javax.swing.JTextField jtf_ComisionChofer;
    private javax.swing.JTextField jtf_Correa;
    private javax.swing.JTextField jtf_Correa1;
    private javax.swing.JTextField jtf_CorreaKM;
    private javax.swing.JTextField jtf_Filtro;
    private javax.swing.JTextField jtf_FiltroKM;
    private javax.swing.JTextField jtf_Grasa;
    private javax.swing.JTextField jtf_GrasaKM;
    private javax.swing.JTextField jtf_Taxi;
    // End of variables declaration//GEN-END:variables
}
