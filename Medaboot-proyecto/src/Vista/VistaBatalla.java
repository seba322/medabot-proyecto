
package Vista;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JToggleButton;


public class VistaBatalla extends javax.swing.JPanel {

  
    public VistaBatalla() {
        initComponents();
        this.lbEmpate.setVisible(false);
        
                
    }

    public JLabel getLbMedafuerza1() {
        return lbMedafuerza1;
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

    public JPanel getJpPlayer1() {
        return jpPlayer1;
    }

    public JPanel getJpPlayer2() {
        return jpPlayer2;
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

        jpPlayer1 = new javax.swing.JPanel();
        jpPlayer2 = new javax.swing.JPanel();
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

        jpPlayer1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jpPlayer1Layout = new javax.swing.GroupLayout(jpPlayer1);
        jpPlayer1.setLayout(jpPlayer1Layout);
        jpPlayer1Layout.setHorizontalGroup(
            jpPlayer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 155, Short.MAX_VALUE)
        );
        jpPlayer1Layout.setVerticalGroup(
            jpPlayer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 185, Short.MAX_VALUE)
        );

        jpPlayer2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jpPlayer2Layout = new javax.swing.GroupLayout(jpPlayer2);
        jpPlayer2.setLayout(jpPlayer2Layout);
        jpPlayer2Layout.setHorizontalGroup(
            jpPlayer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 155, Short.MAX_VALUE)
        );
        jpPlayer2Layout.setVerticalGroup(
            jpPlayer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 185, Short.MAX_VALUE)
        );

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

        lbMedafuerza1.setForeground(new java.awt.Color(204, 51, 0));
        lbMedafuerza1.setText("Medafuerza Activada");

        lbMedafuerza2.setForeground(new java.awt.Color(204, 51, 0));
        lbMedafuerza2.setText("Medafuerza Activada");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpBrazoIZ1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jpCabeza1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jpBrazoDE1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jpPiernaIZ1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jpPiernaDE1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbEmpate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btListo, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btConfirmarA))
                                    .addGap(100, 100, 100))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(JBContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(90, 90, 90)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(JMensajeF)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jtBrazoDE1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jtBrazoIZ1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(jtPiernaIZ1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(10, 10, 10)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jtCabeza1, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                                                .addComponent(JtEsquivar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(JtDefender1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtPiernaDE1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(297, 297, 297)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jpVida1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jpPlayer2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpVida2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jpPlayer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jpBrazoIZ2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jpCabeza2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jpBrazoDE2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jpPiernaIZ2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jpPiernaDE2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jtBrazoDE2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtBrazoIZ2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jtPiernaIZ2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(10, 10, 10)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jtCabeza2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JtEsquivar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JtDefender2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jtPiernaDE2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(lbMedafuerza1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbMedafuerza2)
                .addGap(114, 114, 114))
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105)
                .addComponent(lbVs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jpVida1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jpVida2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(lbVs, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jpCabeza2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jpBrazoIZ2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jpBrazoDE2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jpPiernaIZ2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jpPiernaDE2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jpCabeza1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jpBrazoIZ1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jpBrazoDE1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jpPiernaIZ1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jpPiernaDE1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jpPlayer2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jpPlayer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JMensajeF, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbMedafuerza1)
                            .addComponent(lbMedafuerza2)
                            .addComponent(lbEmpate, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtBrazoIZ1)
                                    .addComponent(jtCabeza1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtBrazoDE1)
                                    .addComponent(JtEsquivar1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtPiernaIZ1)
                                    .addComponent(JtDefender1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtPiernaDE1))
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
                                .addComponent(jtPiernaDE2))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(JBContinuar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btListo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(btConfirmarA)
                        .addGap(33, 44, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
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
    private javax.swing.JPanel jpPlayer1;
    private javax.swing.JPanel jpPlayer2;
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
