
package Vista;

import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JTextField;

public class VistaTranscursoTorneo extends javax.swing.JPanel {
    ArrayList<JTextField> casillas;
    
    public VistaTranscursoTorneo() {
        initComponents();
        ArrayList<JTextField> casillas= new ArrayList<JTextField>();
        casillas.add(txtPjr1);
        casillas.add(txtPjr2);
        casillas.add(txtPjr3);
        casillas.add(txtPjr4);
        casillas.add(txtPjr5);
        casillas.add(txtPjr6);
        casillas.add(txtPjr7);
        casillas.add(txtPjr8);
                
    }

    public ArrayList<JTextField> getCasillas() {
        return casillas;
    }
    
    public JTextField getTxtPjr1() {
        return txtPjr1;
    }

    public JTextField getTxtPjr2() {
        return txtPjr2;
    }

    public JTextField getTxtPjr3() {
        return txtPjr3;
    }

    public JTextField getTxtPjr4() {
        return txtPjr4;
    }

    public JTextField getTxtPjr5() {
        return txtPjr5;
    }

    public JTextField getTxtPjr6() {
        return txtPjr6;
    }

    public JTextField getTxtPjr7() {
        return txtPjr7;
    }

    public JTextField getTxtPjr8() {
        return txtPjr8;
    }

    public JTextField getTxtPjr12() {
        return txtPjr12;
    }

    public JTextField getTxtPjr13() {
        return txtPjr13;
    }

    public JTextField getTxtPjr22() {
        return txtPjr22;
    }

    public JTextField getTxtPjr32() {
        return txtPjr32;
    }

    public JTextField getTxtPjr42() {
        return txtPjr42;
    }

    public JTextField getTxtGanador() {
        return txtGanador;
    }

    public JButton getBtSig() {
        return btSig;
    }
    

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtGanador = new javax.swing.JTextField();
        txtPjr1 = new javax.swing.JTextField();
        txtPjr2 = new javax.swing.JTextField();
        txtPjr6 = new javax.swing.JTextField();
        txtPjr7 = new javax.swing.JTextField();
        txtPjr3 = new javax.swing.JTextField();
        txtPjr4 = new javax.swing.JTextField();
        txtPjr5 = new javax.swing.JTextField();
        txtPjr12 = new javax.swing.JTextField();
        txtPjr22 = new javax.swing.JTextField();
        txtPjr32 = new javax.swing.JTextField();
        txtPjr8 = new javax.swing.JTextField();
        txtPjr42 = new javax.swing.JTextField();
        txtPjr13 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btSig = new javax.swing.JButton();

        txtGanador.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        txtGanador.setDisabledTextColor(new java.awt.Color(0, 0, 255));
        txtGanador.setEnabled(false);

        txtPjr1.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        txtPjr1.setDisabledTextColor(new java.awt.Color(0, 0, 255));
        txtPjr1.setEnabled(false);

        txtPjr2.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        txtPjr2.setDisabledTextColor(new java.awt.Color(0, 0, 255));
        txtPjr2.setEnabled(false);

        txtPjr6.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        txtPjr6.setDisabledTextColor(new java.awt.Color(0, 0, 255));
        txtPjr6.setEnabled(false);

        txtPjr7.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        txtPjr7.setDisabledTextColor(new java.awt.Color(0, 0, 255));
        txtPjr7.setEnabled(false);

        txtPjr3.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        txtPjr3.setDisabledTextColor(new java.awt.Color(0, 0, 255));
        txtPjr3.setEnabled(false);

        txtPjr4.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        txtPjr4.setDisabledTextColor(new java.awt.Color(0, 0, 255));
        txtPjr4.setEnabled(false);

        txtPjr5.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        txtPjr5.setDisabledTextColor(new java.awt.Color(0, 0, 255));
        txtPjr5.setEnabled(false);

        txtPjr12.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        txtPjr12.setDisabledTextColor(new java.awt.Color(0, 0, 255));
        txtPjr12.setEnabled(false);

        txtPjr22.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        txtPjr22.setDisabledTextColor(new java.awt.Color(0, 0, 255));
        txtPjr22.setEnabled(false);

        txtPjr32.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        txtPjr32.setDisabledTextColor(new java.awt.Color(0, 0, 255));
        txtPjr32.setEnabled(false);

        txtPjr8.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        txtPjr8.setDisabledTextColor(new java.awt.Color(0, 0, 255));
        txtPjr8.setEnabled(false);

        txtPjr42.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        txtPjr42.setDisabledTextColor(new java.awt.Color(0, 0, 255));
        txtPjr42.setEnabled(false);

        txtPjr13.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        txtPjr13.setDisabledTextColor(new java.awt.Color(0, 0, 255));
        txtPjr13.setEnabled(false);

        jTextField15.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jTextField15.setDisabledTextColor(new java.awt.Color(0, 0, 255));
        jTextField15.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setText("Ronda 1");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText(" Ronda 2");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("Ronda 3");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("Ronda 4");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Torneo");

        btSig.setText("Siguiente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 747, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(btSig)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(txtPjr13, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(168, 168, 168))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(txtPjr12, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(112, 112, 112)
                                .addComponent(txtPjr22, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtPjr32, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(txtPjr1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtPjr2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(txtPjr3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(txtPjr4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(txtPjr5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtPjr6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(txtPjr7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtPjr8, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtPjr42, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(73, 73, 73))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtGanador, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtGanador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(99, 99, 99)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPjr13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPjr12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPjr22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPjr32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPjr42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPjr1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPjr2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPjr6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPjr7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPjr3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPjr4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPjr5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPjr8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(45, 45, 45)
                .addComponent(btSig)
                .addGap(59, 59, 59))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSig;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField txtGanador;
    private javax.swing.JTextField txtPjr1;
    private javax.swing.JTextField txtPjr12;
    private javax.swing.JTextField txtPjr13;
    private javax.swing.JTextField txtPjr2;
    private javax.swing.JTextField txtPjr22;
    private javax.swing.JTextField txtPjr3;
    private javax.swing.JTextField txtPjr32;
    private javax.swing.JTextField txtPjr4;
    private javax.swing.JTextField txtPjr42;
    private javax.swing.JTextField txtPjr5;
    private javax.swing.JTextField txtPjr6;
    private javax.swing.JTextField txtPjr7;
    private javax.swing.JTextField txtPjr8;
    // End of variables declaration//GEN-END:variables
}
