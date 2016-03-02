/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author kimbo
 */
public class VistaPreparacionBPj extends javax.swing.JPanel {

    /**
     * Creates new form VistaPreparacionBPj
     */
    public VistaPreparacionBPj() {
        initComponents();
        this.lbError.setVisible(false);
        this.btComenzar.setEnabled(false);
    }

    public JButton getBtADM1() {
        return btADM1;
    }

    public JLabel getLbError() {
        return lbError;
    }
    

    public JButton getBtADM2() {
        return btADM2;
    }

    public JButton getBtComenzar() {
        return btComenzar;
    }

    public JButton getBtRegistro2() {
        return btRegistro2;
    }

    public JButton getBtAtras() {
        return btAtras;
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btRegistro2 = new javax.swing.JButton();
        btADM1 = new javax.swing.JButton();
        btADM2 = new javax.swing.JButton();
        btComenzar = new javax.swing.JButton();
        btAtras = new javax.swing.JButton();
        lbError = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Preparacion de la Batalla");

        btRegistro2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btRegistro2.setText("Registrar jugador 2");

        btADM1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btADM1.setText("Seleccionar y Modificar Jugador 1");
        btADM1.setEnabled(false);

        btADM2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btADM2.setText("Seleccionar y Modificar Jugador 2");
        btADM2.setEnabled(false);

        btComenzar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btComenzar.setText("Comenzar Batalla");

        btAtras.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btAtras.setText("Atras");

        lbError.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lbError.setText("Este usuario ya esta registrado, ingresa uno valido.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btRegistro2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btADM1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btADM2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btComenzar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(291, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(80, 80, 80)
                .addComponent(btRegistro2)
                .addGap(21, 21, 21)
                .addComponent(lbError)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btADM1)
                .addGap(68, 68, 68)
                .addComponent(btADM2)
                .addGap(71, 71, 71)
                .addComponent(btComenzar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(btAtras)
                .addGap(45, 45, 45))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btADM1;
    private javax.swing.JButton btADM2;
    private javax.swing.JButton btAtras;
    private javax.swing.JButton btComenzar;
    private javax.swing.JButton btRegistro2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbError;
    // End of variables declaration//GEN-END:variables
}
