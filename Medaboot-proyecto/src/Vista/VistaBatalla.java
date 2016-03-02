
package Vista;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JToggleButton;


public class VistaBatalla extends javax.swing.JPanel {
    private Image fondo;
    public VistaBatalla() {
        ;       
        
        
        initComponents();
         this.lbMedafuerza1.setVisible(false);
        this.lbMedafuerza2.setVisible(false);
        this.lbEmpate.setVisible(false);
        
                
    }
    
    
    public JLabel getLbMedafuerza1() {
        return lbMedafuerza1;
    }
      public JLabel getJLnombre1() {
        return this.jLNombree1;
    }
        public JLabel getJLnombre2() {
        return this.jLNombree2;
    }



    public JLabel getLbEmpate() {
        return lbEmpate;
    }
    

    public JLabel getLbMedafuerza2() {
        return lbMedafuerza2;
    }

    public JLabel getLbVs() {
        return lbVs;
    }

    public JToggleButton getJtBrazoDE1() {
        return jtBrazoDE1;
    }

    public JToggleButton getJtBrazoDE2() {
        return jtBrazoDE2;
    }

    public JToggleButton getJtBrazoIZ1() {
        return jtBrazoIZ1;
    }

    public JToggleButton getJtBrazoIZ2() {
        return jtBrazoIZ2;
    }

    public JToggleButton getJtCabeza1() {
        return jtCabeza1;
    }

    public JToggleButton getJtCabeza2() {
        return jtCabeza2;
    }
 public JButton getJtDefender1() {
        return JtDefender1;
    }


    public JButton getJtDefender2(){
        return JtDefender2; 
    }
    public JButton getJtEsquivar1() {
        return JtEsquivar1;
    }

    public JButton getJtEsquivar2() {
        return JtEsquivar2;
    }

  
    public JToggleButton getJtPiernaDE1() {
        return jtPiernaDE1;
    }

    public JToggleButton getJtPiernaDE2() {
        return jtPiernaDE2;
    }

    public JToggleButton getJtPiernaIZ1() {
        return jtPiernaIZ1;
    }

    public JToggleButton getJtPiernaIZ2() {
        return jtPiernaIZ2;
    }

    public JTextArea getTxAcciones() {
        return txAcciones;
    }
    

  
    public JTextArea getTxtDatos1() {
        return txtDatos1;
    }

    public JTextArea getTxtDatos2() {
        return txtDatos2;
    }
    public JTextArea getTxtEstadisticas1(){
        return this.jTextEstadisticas1;
    }
    public JTextArea getTxtEstadisticas2(){
        return this.jTextEstadisticas2;
    }
    public JTextPane getTxtPhabilidad1() {
        return txtPhabilidad1;
    }

    public JTextPane getTxtPhabilidad2() {
        return txtPhabilidad2;
    }

    public JProgressBar getJpBrazoDE1() {
        return jpBrazoDE1;
    }

    public JProgressBar getJpVida1() {
        return jpVida1;
    }

    public JProgressBar getJpVida2() {
        return jpVida2;
    }

    public JProgressBar getJpCabeza1() {
        return jpCabeza1;
    }

    public JProgressBar getJpCabeza2() {
        return jpCabeza2;
    }

   

    public JProgressBar getJpBrazoDE2() {
        return jpBrazoDE2;
    }

    public JProgressBar getJpBrazoIZ1() {
        return jpBrazoIZ1;
    }

    public JProgressBar getJpBrazoIZ2() {
        return jpBrazoIZ2;
    }

    public JProgressBar getJpPiernaDE1() {
        return jpPiernaDE1;
    }

    public JProgressBar getJpPiernaDE2() {
        return jpPiernaDE2;
    }

    public JProgressBar getJpPiernaIZ1() {
        return jpPiernaIZ1;
    }

    public JProgressBar getJpPiernaIZ2() {
        return jpPiernaIZ2;
    }

    public JButton getBtListo() {
        return btListo;
    }

    public JButton getBtConfirmarA() {
        return btConfirmarA;
    }
    public JButton getJBContinuar() {
        return this.JBContinuar;
      
    }

    public JLabel getJMensaje() {
       return this.JMensajeF;
        
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jtBrazoIZ1 = new javax.swing.JToggleButton();
        jtCabeza1 = new javax.swing.JToggleButton();
        jtBrazoDE1 = new javax.swing.JToggleButton();
        jtPiernaIZ1 = new javax.swing.JToggleButton();
        btListo = new javax.swing.JButton();
        jtPiernaDE1 = new javax.swing.JToggleButton();
        jpVida1 = new javax.swing.JProgressBar();
        jpVida2 = new javax.swing.JProgressBar();
        jpCabeza2 = new javax.swing.JProgressBar();
        jpBrazoIZ2 = new javax.swing.JProgressBar();
        jpBrazoDE2 = new javax.swing.JProgressBar();
        jpPiernaIZ2 = new javax.swing.JProgressBar();
        jpPiernaDE2 = new javax.swing.JProgressBar();
        jpCabeza1 = new javax.swing.JProgressBar();
        jpBrazoIZ1 = new javax.swing.JProgressBar();
        jpBrazoDE1 = new javax.swing.JProgressBar();
        jpPiernaIZ1 = new javax.swing.JProgressBar();
        jpPiernaDE1 = new javax.swing.JProgressBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPhabilidad1 = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtPhabilidad2 = new javax.swing.JTextPane();
        jtBrazoIZ2 = new javax.swing.JToggleButton();
        jtCabeza2 = new javax.swing.JToggleButton();
        jtBrazoDE2 = new javax.swing.JToggleButton();
        jtPiernaIZ2 = new javax.swing.JToggleButton();
        jtPiernaDE2 = new javax.swing.JToggleButton();
        lbVs = new javax.swing.JLabel();
        lbMedafuerza1 = new javax.swing.JLabel();
        lbMedafuerza2 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtDatos1 = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtDatos2 = new javax.swing.JTextArea();
        btConfirmarA = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txAcciones = new javax.swing.JTextArea();
        JtEsquivar1 = new javax.swing.JButton();
        JtDefender1 = new javax.swing.JButton();
        JtEsquivar2 = new javax.swing.JButton();
        JtDefender2 = new javax.swing.JButton();
        JBContinuar = new javax.swing.JButton();
        JMensajeF = new javax.swing.JLabel();
        lbEmpate = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextEstadisticas1 = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextEstadisticas2 = new javax.swing.JTextArea();
        jLNombree1 = new javax.swing.JLabel();
        jLNombree2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        jtBrazoIZ1.setText("BrazoIZ");

        jtCabeza1.setText("Cabeza");
        jtCabeza1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtCabeza1ActionPerformed(evt);
            }
        });

        jtBrazoDE1.setText("BrazoDE");

        jtPiernaIZ1.setText("PiernaIZ");

        btListo.setText("Listo");

        jtPiernaDE1.setText("PiernaDE");
        jtPiernaDE1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtPiernaDE1ActionPerformed(evt);
            }
        });

        jpVida1.setBackground(new java.awt.Color(255, 51, 51));
        jpVida1.setRequestFocusEnabled(false);
        jpVida1.setStringPainted(true);

        jpVida2.setBackground(new java.awt.Color(255, 51, 51));
        jpVida2.setStringPainted(true);

        jpCabeza2.setBackground(new java.awt.Color(204, 0, 0));
        jpCabeza2.setStringPainted(true);

        jpBrazoIZ2.setBackground(new java.awt.Color(204, 0, 0));
        jpBrazoIZ2.setStringPainted(true);

        jpBrazoDE2.setBackground(new java.awt.Color(204, 0, 0));
        jpBrazoDE2.setStringPainted(true);

        jpPiernaIZ2.setBackground(new java.awt.Color(204, 0, 0));
        jpPiernaIZ2.setStringPainted(true);

        jpPiernaDE2.setBackground(new java.awt.Color(204, 0, 0));
        jpPiernaDE2.setStringPainted(true);

        jpCabeza1.setBackground(new java.awt.Color(204, 0, 0));
        jpCabeza1.setStringPainted(true);

        jpBrazoIZ1.setBackground(new java.awt.Color(204, 0, 0));
        jpBrazoIZ1.setStringPainted(true);

        jpBrazoDE1.setBackground(new java.awt.Color(204, 0, 0));
        jpBrazoDE1.setStringPainted(true);

        jpPiernaIZ1.setBackground(new java.awt.Color(204, 0, 0));
        jpPiernaIZ1.setStringPainted(true);

        jpPiernaDE1.setBackground(new java.awt.Color(204, 0, 0));
        jpPiernaDE1.setStringPainted(true);

        txtPhabilidad1.setEditable(false);
        txtPhabilidad1.setBackground(new java.awt.Color(204, 204, 204));
        txtPhabilidad1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtPhabilidad1.setForeground(new java.awt.Color(0, 0, 255));
        jScrollPane1.setViewportView(txtPhabilidad1);

        txtPhabilidad2.setEditable(false);
        txtPhabilidad2.setBackground(new java.awt.Color(204, 204, 204));
        txtPhabilidad2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtPhabilidad2.setForeground(new java.awt.Color(0, 0, 255));
        jScrollPane2.setViewportView(txtPhabilidad2);

        jtBrazoIZ2.setText("BrazoIZ");

        jtCabeza2.setText("Cabeza");

        jtBrazoDE2.setText("BrazoDE");

        jtPiernaIZ2.setText("PiernaIZ");

        jtPiernaDE2.setText("PiernaDE");

        lbVs.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbVs.setText("VS");
        lbVs.setToolTipText("");

        lbMedafuerza1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbMedafuerza1.setForeground(new java.awt.Color(204, 51, 0));
        lbMedafuerza1.setText("Medafuerza Activada");
        lbMedafuerza1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));

        lbMedafuerza2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbMedafuerza2.setForeground(new java.awt.Color(204, 51, 0));
        lbMedafuerza2.setText("Medafuerza Activada");
        lbMedafuerza2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 51)));

        txtDatos1.setEditable(false);
        txtDatos1.setColumns(20);
        txtDatos1.setForeground(new java.awt.Color(51, 51, 51));
        txtDatos1.setRows(5);
        jScrollPane5.setViewportView(txtDatos1);

        txtDatos2.setEditable(false);
        txtDatos2.setColumns(20);
        txtDatos2.setRows(5);
        jScrollPane6.setViewportView(txtDatos2);

        btConfirmarA.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        btConfirmarA.setText("ConfirmarAccion");

        txAcciones.setColumns(20);
        txAcciones.setForeground(new java.awt.Color(51, 153, 0));
        txAcciones.setRows(5);
        jScrollPane3.setViewportView(txAcciones);

        JtEsquivar1.setText("Esquivar");
        JtEsquivar1.setActionCommand("Esquivar1");
        JtEsquivar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtEsquivar1ActionPerformed(evt);
            }
        });

        JtDefender1.setText("Defender");
        JtDefender1.setActionCommand("Defender1");
        JtDefender1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtDefender1ActionPerformed(evt);
            }
        });

        JtEsquivar2.setText("Esquivar");
        JtEsquivar2.setActionCommand("Esquivar2");
        JtEsquivar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtEsquivar2ActionPerformed(evt);
            }
        });

        JtDefender2.setText(" Defender");
        JtDefender2.setActionCommand(" Defender2");

        JBContinuar.setText("Continuar");

        JMensajeF.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        JMensajeF.setText("LA BATALLA A FINALIZADO , PRESIONE COTINUAR");

        lbEmpate.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        lbEmpate.setText("LOS JUGADORES EMPATAN");

        jTextEstadisticas1.setColumns(20);
        jTextEstadisticas1.setRows(5);
        jScrollPane4.setViewportView(jTextEstadisticas1);

        jTextEstadisticas2.setColumns(20);
        jTextEstadisticas2.setRows(5);
        jScrollPane7.setViewportView(jTextEstadisticas2);

        jLNombree1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLNombree1.setForeground(new java.awt.Color(0, 0, 102));
        jLNombree1.setText("jLabel1");
        jLNombree1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 51, 255)));

        jLNombree2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLNombree2.setForeground(new java.awt.Color(0, 0, 102));
        jLNombree2.setText("jLabel2");
        jLNombree2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 51, 255)));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Medaparte seleccionado");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Medaparte seleccionado");

        jLabel1.setText("PiernaDe");

        jLabel2.setText("PiernaIz");

        jLabel5.setText("BrazoDe");

        jLabel6.setText("BrazoIz");

        jLabel7.setText("Cabeza");

        jLabel8.setText("Salud");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenMedabot/Medabot3.jpg"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenMedabot/Medabot1.jpg"))); // NOI18N

        jLabel11.setText("Salud");

        jLabel12.setText("Cabeza");

        jLabel13.setText("BrazoIz");

        jLabel14.setText("BrazoDe");

        jLabel15.setText("PiernaIz");

        jLabel16.setText("PiernaDe");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(12, 12, 12)))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(96, 96, 96)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(lbMedafuerza1)
                                                .addGap(38, 38, 38)))
                                        .addGap(2, 2, 2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jpVida1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JBContinuar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(btListo, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                                            .addComponent(btConfirmarA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(9, 9, 9)))
                                .addGap(170, 170, 170)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lbMedafuerza2))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jpVida2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(5, 5, 5)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jtBrazoDE2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jtBrazoIZ2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                    .addComponent(jtPiernaIZ2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(10, 10, 10)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                    .addComponent(jtCabeza2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(JtEsquivar2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(JtDefender2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jtPiernaDE2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel16)
                                                    .addComponent(jLabel15)
                                                    .addComponent(jLabel14)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jpCabeza2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jpBrazoIZ2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jpBrazoDE2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jpPiernaIZ2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jpPiernaDE2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addComponent(jLabel13)
                                                    .addComponent(jLabel12)))))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(491, 491, 491))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jpCabeza1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jpBrazoIZ1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jpPiernaIZ1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jpBrazoDE1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jpPiernaDE1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel11))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jtPiernaDE1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtPiernaIZ1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtBrazoDE1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtBrazoIZ1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtCabeza1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(JtEsquivar1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(JtDefender1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(65, 65, 65)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(140, 140, 140)
                                        .addComponent(lbEmpate))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(91, 91, 91)
                                        .addComponent(JMensajeF))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(jLNombree1)
                                .addGap(342, 342, 342)
                                .addComponent(lbVs)
                                .addGap(313, 313, 313)
                                .addComponent(jLNombree2)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 13, Short.MAX_VALUE)
                        .addComponent(lbVs, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLNombree2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLNombree1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jpVida1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(8, 8, 8)
                                        .addComponent(jpCabeza1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jpBrazoIZ1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jpBrazoDE1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jpPiernaIZ1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jpPiernaDE1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(82, 82, 82))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                                        .addComponent(lbMedafuerza1))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jpVida2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel12)
                                                .addGap(4, 4, 4)
                                                .addComponent(jpCabeza2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel13)
                                                .addGap(7, 7, 7)
                                                .addComponent(jpBrazoIZ2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel14)
                                                .addGap(5, 5, 5)
                                                .addComponent(jpBrazoDE2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel15)
                                                .addGap(9, 9, 9)
                                                .addComponent(jpPiernaIZ2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel16)
                                                .addGap(4, 4, 4)
                                                .addComponent(jpPiernaDE2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lbMedafuerza2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtCabeza1)
                                    .addComponent(jtBrazoIZ1))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(JtEsquivar1)
                                    .addComponent(jtBrazoDE1)
                                    .addComponent(JMensajeF, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtPiernaIZ1)
                                    .addComponent(JtDefender1))
                                .addGap(15, 15, 15)
                                .addComponent(jtPiernaDE1)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtBrazoIZ2)
                                    .addComponent(jtCabeza2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtBrazoDE2)
                                    .addComponent(JtEsquivar2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtPiernaIZ2)
                                    .addComponent(JtDefender2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtPiernaDE2)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbEmpate, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(JBContinuar)
                                .addGap(18, 18, 18)
                                .addComponent(btListo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btConfirmarA)))))
                .addGap(56, 56, 56))
        );

        jpVida2.getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    private void JtDefender1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtDefender1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtDefender1ActionPerformed

    private void JtEsquivar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtEsquivar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtEsquivar2ActionPerformed

    private void JtEsquivar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtEsquivar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtEsquivar1ActionPerformed

    private void jtCabeza1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtCabeza1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtCabeza1ActionPerformed

    private void jtPiernaDE1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtPiernaDE1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtPiernaDE1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBContinuar;
    private javax.swing.JLabel JMensajeF;
    private javax.swing.JButton JtDefender1;
    private javax.swing.JButton JtDefender2;
    private javax.swing.JButton JtEsquivar1;
    private javax.swing.JButton JtEsquivar2;
    private javax.swing.JButton btConfirmarA;
    private javax.swing.JButton btListo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLNombree1;
    private javax.swing.JLabel jLNombree2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTextArea jTextEstadisticas1;
    private javax.swing.JTextArea jTextEstadisticas2;
    private javax.swing.JProgressBar jpBrazoDE1;
    private javax.swing.JProgressBar jpBrazoDE2;
    private javax.swing.JProgressBar jpBrazoIZ1;
    private javax.swing.JProgressBar jpBrazoIZ2;
    private javax.swing.JProgressBar jpCabeza1;
    private javax.swing.JProgressBar jpCabeza2;
    private javax.swing.JProgressBar jpPiernaDE1;
    private javax.swing.JProgressBar jpPiernaDE2;
    private javax.swing.JProgressBar jpPiernaIZ1;
    private javax.swing.JProgressBar jpPiernaIZ2;
    private javax.swing.JProgressBar jpVida1;
    private javax.swing.JProgressBar jpVida2;
    private javax.swing.JToggleButton jtBrazoDE1;
    private javax.swing.JToggleButton jtBrazoDE2;
    private javax.swing.JToggleButton jtBrazoIZ1;
    private javax.swing.JToggleButton jtBrazoIZ2;
    private javax.swing.JToggleButton jtCabeza1;
    private javax.swing.JToggleButton jtCabeza2;
    private javax.swing.JToggleButton jtPiernaDE1;
    private javax.swing.JToggleButton jtPiernaDE2;
    private javax.swing.JToggleButton jtPiernaIZ1;
    private javax.swing.JToggleButton jtPiernaIZ2;
    private javax.swing.JLabel lbEmpate;
    private javax.swing.JLabel lbMedafuerza1;
    private javax.swing.JLabel lbMedafuerza2;
    private javax.swing.JLabel lbVs;
    private javax.swing.JTextArea txAcciones;
    private javax.swing.JTextArea txtDatos1;
    private javax.swing.JTextArea txtDatos2;
    private javax.swing.JTextPane txtPhabilidad1;
    private javax.swing.JTextPane txtPhabilidad2;
    // End of variables declaration//GEN-END:variables

    

   
}
