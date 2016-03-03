
package Vista;

import java.util.HashSet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class VistaPreparacionTorneo extends javax.swing.JPanel {

    
    public VistaPreparacionTorneo() {
        initComponents();
        this.lbPart2.setVisible(false);
        this.txtPart2.setVisible(false);
        this.lbPart3.setVisible(false);
        this.txtPart3.setVisible(false);
        this.lbPart4.setVisible(false);
        this.txtPart4.setVisible(false);
        this.lbPart5.setVisible(false);
        this.txtPart5.setVisible(false);
        this.lbPart6.setVisible(false);
        this.txtPart6.setVisible(false);
        this.lbPart7.setVisible(false);
        this.txtPart7.setVisible(false);
        this.lbPart8.setVisible(false);
        this.txtPart8.setVisible(false);
        
        
        this.btEmparejar.setEnabled(false);
        this.btComenzar.setEnabled(false);
        this.btLimpiar.setEnabled(false);
    }

    public JButton getBtAtras2() {
        return btAtras2;
    }

    public JLabel getLbPart1() {
        return lbPart1;
    }

    public JLabel getLbPart2() {
        return lbPart2;
    }

    public JLabel getLbPart3() {
        return lbPart3;
    }

    public JLabel getLbPart4() {
        return lbPart4;
    }

    public JLabel getLbPart5() {
        return lbPart5;
    }

    public JLabel getLbPart6() {
        return lbPart6;
    }

    public JLabel getLbPart7() {
        return lbPart7;
    }

    public JLabel getLbPart8() {
        return lbPart8;
    }

    public JTextField getTxtPart1() {
        return txtPart1;
    }

    public JTextField getTxtPart2() {
        return txtPart2;
    }

    public JTextField getTxtPart3() {
        return txtPart3;
    }

    public JTextField getTxtPart4() {
        return txtPart4;
    }

    public JTextField getTxtPart5() {
        return txtPart5;
    }

    public JTextField getTxtPart6() {
        return txtPart6;
    }

    public JTextField getTxtPart7() {
        return txtPart7;
    }

    public JTextField getTxtPart8() {
        return txtPart8;
    }

    

    public JButton getBtRegistro() {
        return btRegistro;
    }

    public JButton getBtComenzar() {
        return btComenzar;
    }

    public JButton getBtCPU() {
        return btCPU;
    }

    public JButton getBtAdm1() {
        return btAdm1;
    }

    public JButton getBtAdm2() {
        return btAdm2;
    }

    public JButton getBtAdm3() {
        return btAdm3;
    }

    public JButton getBtAdm4() {
        return btAdm4;
    }

    public JButton getBtAdm5() {
        return btAdm5;
    }

    public JButton getBtAdm6() {
        return btAdm6;
    }

    public JButton getBtAdm7() {
        return btAdm7;
    }

    public JButton getBtAdm8() {
        return btAdm8;
    }

    public JTextArea getTxtEncuentros() {
        return txtEncuentros;
    }

    public JButton getBtEmparejar() {
        return btEmparejar;
    }

    public JButton getBtLimpiar() {
        return btLimpiar;
    }
    
    

    
    
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btRegistro = new javax.swing.JButton();
        btCPU = new javax.swing.JButton();
        btAtras2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btAdm1 = new javax.swing.JButton();
        btAdm3 = new javax.swing.JButton();
        btAdm5 = new javax.swing.JButton();
        btAdm7 = new javax.swing.JButton();
        btAdm4 = new javax.swing.JButton();
        btAdm2 = new javax.swing.JButton();
        btAdm6 = new javax.swing.JButton();
        btAdm8 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtEncuentros = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btComenzar = new javax.swing.JButton();
        btEmparejar = new javax.swing.JButton();
        btLimpiar = new javax.swing.JButton();
        lbPart2 = new javax.swing.JLabel();
        lbPart3 = new javax.swing.JLabel();
        lbPart4 = new javax.swing.JLabel();
        lbPart6 = new javax.swing.JLabel();
        lbPart5 = new javax.swing.JLabel();
        lbPart8 = new javax.swing.JLabel();
        lbPart7 = new javax.swing.JLabel();
        lbPart1 = new javax.swing.JLabel();
        txtPart1 = new javax.swing.JTextField();
        txtPart2 = new javax.swing.JTextField();
        txtPart3 = new javax.swing.JTextField();
        txtPart4 = new javax.swing.JTextField();
        txtPart5 = new javax.swing.JTextField();
        txtPart6 = new javax.swing.JTextField();
        txtPart7 = new javax.swing.JTextField();
        txtPart8 = new javax.swing.JTextField();

        setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        setPreferredSize(new java.awt.Dimension(840, 740));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Preparacion de Torneo");

        btRegistro.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btRegistro.setText("Registrar Jugador");

        btCPU.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btCPU.setText("Seleccionar CPU");

        btAtras2.setText("Atras");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Administar Personaje");

        btAdm1.setText("1");

        btAdm3.setText("3");
        btAdm3.setEnabled(false);

        btAdm5.setText("5");
        btAdm5.setEnabled(false);

        btAdm7.setText("7");
        btAdm7.setEnabled(false);

        btAdm4.setText("4");
        btAdm4.setEnabled(false);

        btAdm2.setText("2");
        btAdm2.setEnabled(false);

        btAdm6.setText("6");
        btAdm6.setEnabled(false);

        btAdm8.setText("8");
        btAdm8.setEnabled(false);

        txtEncuentros.setColumns(20);
        txtEncuentros.setFont(new java.awt.Font("Andalus", 1, 14)); // NOI18N
        txtEncuentros.setRows(5);
        txtEncuentros.setDisabledTextColor(new java.awt.Color(0, 0, 255));
        txtEncuentros.setEnabled(false);
        jScrollPane2.setViewportView(txtEncuentros);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Participantes");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Encuentros");

        btComenzar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btComenzar.setText("Comenzar");

        btEmparejar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btEmparejar.setText("Emparejar");

        btLimpiar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btLimpiar.setText("Limpiar");

        lbPart2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lbPart2.setForeground(new java.awt.Color(0, 153, 0));
        lbPart2.setText("jLabel5");

        lbPart3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lbPart3.setForeground(new java.awt.Color(0, 153, 0));
        lbPart3.setText("jLabel6");

        lbPart4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lbPart4.setForeground(new java.awt.Color(0, 153, 0));
        lbPart4.setText("jLabel7");

        lbPart6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lbPart6.setForeground(new java.awt.Color(0, 153, 0));
        lbPart6.setText("jLabel8");

        lbPart5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lbPart5.setForeground(new java.awt.Color(0, 153, 0));
        lbPart5.setText("jLabel9");

        lbPart8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lbPart8.setForeground(new java.awt.Color(0, 153, 0));
        lbPart8.setText("jLabel10");

        lbPart7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lbPart7.setForeground(new java.awt.Color(0, 153, 0));
        lbPart7.setText("jLabel11");

        lbPart1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lbPart1.setForeground(new java.awt.Color(0, 153, 0));
        lbPart1.setText("jLabel12");

        txtPart1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        txtPart1.setText("jTextField1");
        txtPart1.setDisabledTextColor(new java.awt.Color(0, 102, 153));
        txtPart1.setEnabled(false);

        txtPart2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        txtPart2.setText("jTextField2");
        txtPart2.setDisabledTextColor(new java.awt.Color(0, 102, 153));
        txtPart2.setEnabled(false);

        txtPart3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        txtPart3.setText("jTextField3");
        txtPart3.setDisabledTextColor(new java.awt.Color(0, 102, 153));
        txtPart3.setEnabled(false);

        txtPart4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        txtPart4.setText("jTextField4");
        txtPart4.setDisabledTextColor(new java.awt.Color(0, 102, 153));
        txtPart4.setEnabled(false);

        txtPart5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        txtPart5.setText("jTextField5");
        txtPart5.setDisabledTextColor(new java.awt.Color(0, 102, 153));
        txtPart5.setEnabled(false);

        txtPart6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        txtPart6.setText("jTextField6");
        txtPart6.setDisabledTextColor(new java.awt.Color(0, 102, 153));
        txtPart6.setEnabled(false);

        txtPart7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        txtPart7.setText("jTextField7");
        txtPart7.setDisabledTextColor(new java.awt.Color(0, 102, 153));
        txtPart7.setEnabled(false);

        txtPart8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        txtPart8.setText("jTextField8");
        txtPart8.setDisabledTextColor(new java.awt.Color(0, 102, 153));
        txtPart8.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(369, 369, 369))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btCPU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btLimpiar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(100, 100, 100))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btEmparejar)
                                .addGap(30, 30, 30)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbPart6)
                                    .addComponent(lbPart5)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(lbPart1)
                                                .addComponent(lbPart2, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lbPart3, javax.swing.GroupLayout.Alignment.LEADING))
                                            .addComponent(lbPart4)
                                            .addComponent(lbPart7)
                                            .addComponent(lbPart8))
                                        .addGap(83, 83, 83)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtPart5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtPart6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtPart7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtPart8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtPart3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtPart1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtPart2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtPart4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(138, 138, 138)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel2)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addComponent(btAdm7)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                            .addComponent(btAdm8))
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addComponent(btAdm5)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                            .addComponent(btAdm6))
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addComponent(btAdm3)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                            .addComponent(btAdm4))
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addComponent(btAdm1)
                                                            .addGap(29, 29, 29)
                                                            .addComponent(btAdm2)))))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btComenzar))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(btAtras2))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(440, 440, 440)
                        .addComponent(jLabel3)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(21, 21, 21)
                .addComponent(jLabel3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtPart2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbPart2))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtPart3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbPart3))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtPart4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbPart4, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(15, 15, 15)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtPart5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbPart5)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(lbPart1)
                                            .addComponent(txtPart1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btAdm2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btAdm4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btAdm6)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtPart6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbPart6))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtPart7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbPart7, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtPart8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbPart8)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(btRegistro)
                                .addGap(34, 34, 34)
                                .addComponent(btLimpiar)
                                .addGap(49, 49, 49)
                                .addComponent(btCPU)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(btEmparejar))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addComponent(btComenzar)
                                .addGap(107, 107, 107)
                                .addComponent(btAtras2))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btAdm1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btAdm3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btAdm5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btAdm7)
                            .addComponent(btAdm8))))
                .addContainerGap(79, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdm1;
    private javax.swing.JButton btAdm2;
    private javax.swing.JButton btAdm3;
    private javax.swing.JButton btAdm4;
    private javax.swing.JButton btAdm5;
    private javax.swing.JButton btAdm6;
    private javax.swing.JButton btAdm7;
    private javax.swing.JButton btAdm8;
    private javax.swing.JButton btAtras2;
    private javax.swing.JButton btCPU;
    private javax.swing.JButton btComenzar;
    private javax.swing.JButton btEmparejar;
    private javax.swing.JButton btLimpiar;
    private javax.swing.JButton btRegistro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbPart1;
    private javax.swing.JLabel lbPart2;
    private javax.swing.JLabel lbPart3;
    private javax.swing.JLabel lbPart4;
    private javax.swing.JLabel lbPart5;
    private javax.swing.JLabel lbPart6;
    private javax.swing.JLabel lbPart7;
    private javax.swing.JLabel lbPart8;
    private javax.swing.JTextArea txtEncuentros;
    private javax.swing.JTextField txtPart1;
    private javax.swing.JTextField txtPart2;
    private javax.swing.JTextField txtPart3;
    private javax.swing.JTextField txtPart4;
    private javax.swing.JTextField txtPart5;
    private javax.swing.JTextField txtPart6;
    private javax.swing.JTextField txtPart7;
    private javax.swing.JTextField txtPart8;
    // End of variables declaration//GEN-END:variables
}
