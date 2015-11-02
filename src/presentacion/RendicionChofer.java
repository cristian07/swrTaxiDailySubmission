/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import DAO.AjustesDAO;
import DAO.TurnoDAO;
import entidades.Ajustes;
import entidades.Movil;
import entidades.Turno;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author Cristian
 */
public class RendicionChofer extends javax.swing.JFrame {

    /**
     * Creates new form RendiciónChofer
     */
    public RendicionChofer() {
        initComponents();
        this.setLocationRelativeTo(null);
        Calendar calendario = Calendar.getInstance();
        String fechaHoraSQL = new StringBuilder()
                .append(Integer.toString(calendario.get(Calendar.DATE))).append("/")
                .append(Integer.toString(calendario.get(Calendar.MONTH)+1)).append("/")
                .append(Integer.toString(calendario.get(Calendar.YEAR))).toString();
        jl_Fecha.setText(fechaHoraSQL);
        TurnoDAO turnoDAO = new TurnoDAO();
        ArrayList<Movil> moviles = new ArrayList<Movil>();
        AjustesDAO ajustesDAO = new AjustesDAO();
        
        
        moviles = turnoDAO.obtenerMovilesSinRendicion("TODO");//TO DO
        
        jtf_Movil.addItem("");
        for(Movil auto : moviles){
            jtf_Movil.addItem(auto.getIdMovil());
        }
    }
    private void registrarTurno() {
        TurnoDAO turnoDAO = new TurnoDAO();
        Turno turno = new Turno();
        String DNI = jl_DNI.getText();
        String idMovil = jtf_Movil.getSelectedItem().toString();
        turno.setGastosVarios(Double.parseDouble(jtf_Gastos.getText()));
        turno.setKmInicial(Integer.parseInt(jtf_KmInicial.getText()));
        turno.setKmFinal(Integer.parseInt(jtf_KmFinal.getText()));
        turno.setRecaudacion(Double.parseDouble(jtf_Recaudacion.getText()));
        turno.setTicketRelevo1(Double.parseDouble(jtf_TicketRelevo1.getText()));
        turno.setTicketRelevo2(Double.parseDouble(jtf_TicketRelevo2.getText()));
        turno.setGastosVarios(Double.parseDouble(jtf_Gastos.getText()));
        turno.setGncBrutoCtaCte(Double.parseDouble(jtf_GNCBruto.getText()));
        turno.setGncFueraCtaCte(Double.parseDouble(jtf_GNCFuera.getText()));
        turno.setKmOcupados(Integer.parseInt(jtf_KmOcupados.getText()));
        turno.setKmLibres(Integer.parseInt(jtf_KmLibres.getText()));
        turno.setGastosChequera(Double.parseDouble(jtf_GastosChequera.getText()));
        turno.setNovedades(jta_Novedades.getText());
        
        if (jl_Tipo.getText().equals("Primer Turno")) {
             turno.setTipo("P"); 
        } else if (jl_Tipo.getText().equals("Segundo Turno")) {
            turno.setTipo("S");
        }
        turnoDAO.altaTurno(turno,DNI,idMovil);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtf_Gastos2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jtf_KmInicial = new javax.swing.JTextField();
        jtf_TicketRelevo1 = new javax.swing.JTextField();
        jtf_GNCFuera = new javax.swing.JTextField();
        jtf_KmOcupados = new javax.swing.JTextField();
        jtf_KmLibres = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jtf_GastosChequera = new javax.swing.JTextField();
        jtf_Recaudacion = new javax.swing.JTextField();
        jtf_Gastos = new javax.swing.JTextField();
        jtf_KmFinal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jtf_TicketRelevo2 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jtf_GNCBruto = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jta_Novedades = new javax.swing.JTextArea();
        jtf_Movil = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jtf_Comision = new javax.swing.JTextField();
        jtf_Neto = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jl_Fecha = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jl_Tipo = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jl_chofer = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jl_DNI = new javax.swing.JLabel();

        jtf_Gastos2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtf_Gastos2FocusLost(evt);
            }
        });
        jtf_Gastos2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_Gastos2ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Rendicion chofer");

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Limpiar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Cancelar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jtf_GNCFuera.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtf_GNCFueraFocusLost(evt);
            }
        });
        jtf_GNCFuera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_GNCFueraActionPerformed(evt);
            }
        });

        jtf_KmOcupados.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtf_KmOcupadosFocusLost(evt);
            }
        });
        jtf_KmOcupados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_KmOcupadosActionPerformed(evt);
            }
        });

        jtf_KmLibres.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtf_KmLibresFocusLost(evt);
            }
        });
        jtf_KmLibres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_KmLibresActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel20.setText("Gastos chequeras");

        jtf_GastosChequera.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtf_GastosChequeraFocusLost(evt);
            }
        });
        jtf_GastosChequera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_GastosChequeraActionPerformed(evt);
            }
        });

        jtf_Recaudacion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtf_RecaudacionFocusLost(evt);
            }
        });

        jtf_Gastos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtf_GastosFocusLost(evt);
            }
        });
        jtf_Gastos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_GastosActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel2.setText("Movil");

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel7.setText("Km Inicial");

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel8.setText("Tickets Relevo 1");

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel9.setText("Recaudación");

        jLabel15.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel15.setText("Tickets Relevo 2");

        jLabel16.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel16.setText("GNC bruto cuenta corriente");

        jtf_GNCBruto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtf_GNCBrutoFocusLost(evt);
            }
        });
        jtf_GNCBruto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_GNCBrutoActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel17.setText("GNC bruto fuera corriente");

        jLabel11.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel11.setText("Gastos");

        jLabel18.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel18.setText("Km ocupados");

        jLabel13.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel13.setText("Km Final");

        jLabel19.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel19.setText("Km libres");

        jLabel14.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel14.setText("NOVEDADES");

        jta_Novedades.setColumns(20);
        jta_Novedades.setRows(3);
        jta_Novedades.setTabSize(3);
        jScrollPane1.setViewportView(jta_Novedades);

        jtf_Movil.setEditable(true);
        jtf_Movil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_MovilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtf_KmOcupados)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtf_KmLibres, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
                            .addComponent(jtf_GastosChequera)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtf_Recaudacion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jtf_Movil, 0, 1, Short.MAX_VALUE))
                                    .addComponent(jLabel16))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtf_GNCBruto, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jtf_TicketRelevo1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtf_KmInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel17)
                                .addGap(15, 15, 15)
                                .addComponent(jtf_GNCFuera, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jtf_Gastos))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtf_TicketRelevo2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(228, 228, 228)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtf_KmFinal)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtf_Movil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtf_KmInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jtf_KmFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel15)
                    .addComponent(jtf_TicketRelevo1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_TicketRelevo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11)
                    .addComponent(jtf_Gastos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_Recaudacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jtf_GNCFuera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_GNCBruto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jtf_KmOcupados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(jtf_KmLibres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jtf_GastosChequera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel10.setText("Comision");

        jtf_Comision.setEditable(false);

        jtf_Neto.setEditable(false);

        jLabel12.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel12.setText("Neto");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtf_Comision, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtf_Neto, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_Comision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12)
                    .addComponent(jtf_Neto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel4.setText("Fecha:");

        jl_Fecha.setText("12/12/2015");

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel3.setText("Turno:");

        jl_Tipo.setText("Primer Turno");

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel6.setText("Chofer:");

        jl_chofer.setText("<Chofer>");

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel5.setText("DNI:");

        jl_DNI.setText("33050305");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jl_Fecha)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jl_Tipo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jl_chofer)
                .addGap(98, 98, 98)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jl_DNI)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jl_Fecha)
                    .addComponent(jLabel3)
                    .addComponent(jl_Tipo)
                    .addComponent(jLabel6)
                    .addComponent(jl_chofer)
                    .addComponent(jLabel5)
                    .addComponent(jl_DNI))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtf_GastosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_GastosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_GastosActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
            this.dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        registrarTurno();
        LoginChofer login= new LoginChofer();
        LoginChofer.jl_turno.setText(jl_Tipo.getText());
        login.setVisible(true);
        this.dispose();;
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jtf_RecaudacionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtf_RecaudacionFocusLost
        // TODO add your handling code here:
        AjustesDAO ajustesDAO = new AjustesDAO();
        if (jtf_Recaudacion.getText().length()>0){
            try{
                Double recaudacion = Double.parseDouble(jtf_Recaudacion.getText());
                jtf_Comision.setText(Double.toString(recaudacion*ajustesDAO.obtenerUltimosAjustes().getComisionChofer()));
            } catch(Exception e) {
                jtf_Recaudacion.setText("");
                jtf_Comision.setText("");
            }
        } 
    }//GEN-LAST:event_jtf_RecaudacionFocusLost

    private void jtf_GastosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtf_GastosFocusLost
      if (jtf_Recaudacion.getText().length()>0 && jtf_Comision.getText().length()>0 && jtf_Gastos.getText().length()>0 ){
            try{
                Double recaudacion = Double.parseDouble(jtf_Recaudacion.getText());
                Double comision = Double.parseDouble(jtf_Comision.getText());
                Double gastos = Double.parseDouble(jtf_Gastos.getText());
                jtf_Neto.setText(Double.toString(recaudacion-comision-gastos));
            } catch(Exception e) {
                jtf_Recaudacion.setText("");
                jtf_Comision.setText("");
                jtf_Gastos.setText("");
            }
        } 
    }//GEN-LAST:event_jtf_GastosFocusLost

    private void jtf_GNCBrutoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtf_GNCBrutoFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_GNCBrutoFocusLost

    private void jtf_GNCBrutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_GNCBrutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_GNCBrutoActionPerformed

    private void jtf_Gastos2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtf_Gastos2FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_Gastos2FocusLost

    private void jtf_Gastos2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_Gastos2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_Gastos2ActionPerformed

    private void jtf_GNCFueraFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtf_GNCFueraFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_GNCFueraFocusLost

    private void jtf_GNCFueraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_GNCFueraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_GNCFueraActionPerformed

    private void jtf_KmOcupadosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtf_KmOcupadosFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_KmOcupadosFocusLost

    private void jtf_KmOcupadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_KmOcupadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_KmOcupadosActionPerformed

    private void jtf_KmLibresFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtf_KmLibresFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_KmLibresFocusLost

    private void jtf_KmLibresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_KmLibresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_KmLibresActionPerformed

    private void jtf_GastosChequeraFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtf_GastosChequeraFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_GastosChequeraFocusLost

    private void jtf_GastosChequeraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_GastosChequeraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_GastosChequeraActionPerformed

    private void jtf_MovilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_MovilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_MovilActionPerformed

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
            java.util.logging.Logger.getLogger(RendicionChofer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RendicionChofer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RendicionChofer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RendicionChofer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RendicionChofer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JLabel jl_DNI;
    private javax.swing.JLabel jl_Fecha;
    public static javax.swing.JLabel jl_Tipo;
    public static javax.swing.JLabel jl_chofer;
    private javax.swing.JTextArea jta_Novedades;
    private javax.swing.JTextField jtf_Comision;
    private javax.swing.JTextField jtf_GNCBruto;
    private javax.swing.JTextField jtf_GNCFuera;
    private javax.swing.JTextField jtf_Gastos;
    private javax.swing.JTextField jtf_Gastos2;
    private javax.swing.JTextField jtf_GastosChequera;
    private javax.swing.JTextField jtf_KmFinal;
    private javax.swing.JTextField jtf_KmInicial;
    private javax.swing.JTextField jtf_KmLibres;
    private javax.swing.JTextField jtf_KmOcupados;
    private javax.swing.JComboBox jtf_Movil;
    private javax.swing.JTextField jtf_Neto;
    private javax.swing.JTextField jtf_Recaudacion;
    private javax.swing.JTextField jtf_TicketRelevo1;
    private javax.swing.JTextField jtf_TicketRelevo2;
    // End of variables declaration//GEN-END:variables
}
