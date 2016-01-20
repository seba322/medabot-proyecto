/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.JButton;

/**
 *
 * @author kimbo
 */
public class VistaMenuTorneo extends javax.swing.JPanel {

    /**
     * Creates new form VistaMenuTorneo
     */
    public VistaMenuTorneo() {
        initComponents();
    }

    public JButton getBtAtras1() {
        return btAtras1;
    }

    public JButton getBtTavanzado() {
        return btTavanzado;
    }

    public JButton getBtTnormal() {
        return btTnormal;
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btTnormal = new javax.swing.JButton();
        btTavanzado = new javax.swing.JButton();
        btAtras1 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Seleccionar tipo de torneo");

        btTnormal.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btTnormal.setText("Torneo Normal");

        btTavanzado.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btTavanzado.setText("Torneo Avanzado");

        btAtras1.setText("Atras");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(441, 751, Short.MAX_VALUE)
                .addComponent(btAtras1)
                .addGap(34, 34, 34))
            .addGroup(layout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btTavanzado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btTnormal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(296, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGap(96, 96, 96)
                .addComponent(btTnormal)
                .addGap(129, 129, 129)
                .addComponent(btTavanzado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                .addComponent(btAtras1)
                .addGap(49, 49, 49))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAtras1;
    private javax.swing.JButton btTavanzado;
    private javax.swing.JButton btTnormal;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
