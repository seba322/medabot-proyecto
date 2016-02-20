
package Vista;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextArea;


public class VistaPreparacionCpuTorneo extends javax.swing.JPanel {

   
    public VistaPreparacionCpuTorneo() {
        initComponents();
    }

    public JButton getBtAtras() {
        return btAtras;
    }

    public JButton getBtSeleccionar() {
        return btSeleccionar;
    }

    public JLabel getLbSeleccionar() {
        return lbSeleccionar;
    }

    public JLabel getLbEstadisticas() {
        return lbEstadisticas;
    }

    public JComboBox<String> getiTCpu() {
        return iTCpu;
    }

    public JTextArea getTxtEstadisticas() {
        return txtEstadisticas;
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btSeleccionar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        iTCpu = new javax.swing.JComboBox<>();
        lbSeleccionar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtEstadisticas = new javax.swing.JTextArea();
        lbEstadisticas = new javax.swing.JLabel();
        btAtras = new javax.swing.JButton();

        btSeleccionar.setText("Seleccionar");
        btSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSeleccionarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Preparacion Batalla Pj Vs Cpu");

        iTCpu.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        iTCpu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CPU1", "CPU2", "CPU3" }));

        lbSeleccionar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbSeleccionar.setText("Seleccionar  una Cpu rival:");

        txtEstadisticas.setColumns(20);
        txtEstadisticas.setForeground(new java.awt.Color(0, 0, 255));
        txtEstadisticas.setRows(5);
        txtEstadisticas.setCaretColor(new java.awt.Color(51, 0, 255));
        txtEstadisticas.setDisabledTextColor(new java.awt.Color(0, 0, 204));
        txtEstadisticas.setEnabled(false);
        txtEstadisticas.setSelectedTextColor(new java.awt.Color(0, 0, 255));
        jScrollPane1.setViewportView(txtEstadisticas);

        lbEstadisticas.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbEstadisticas.setText("Estadisticas Cpus");

        btAtras.setText("Atras");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(352, 352, 352)
                .addComponent(btAtras)
                .addContainerGap(521, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(148, 148, 148)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lbSeleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbEstadisticas)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(iTCpu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btSeleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(176, 176, 176)
                                .addComponent(jLabel1))))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(550, Short.MAX_VALUE)
                .addComponent(btAtras)
                .addGap(105, 105, 105))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1)
                    .addGap(118, 118, 118)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(iTCpu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbSeleccionar)
                        .addComponent(btSeleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(25, 25, 25)
                    .addComponent(lbEstadisticas)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSeleccionarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btSeleccionarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAtras;
    private javax.swing.JButton btSeleccionar;
    private javax.swing.JComboBox<String> iTCpu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbEstadisticas;
    private javax.swing.JLabel lbSeleccionar;
    private javax.swing.JTextArea txtEstadisticas;
    // End of variables declaration//GEN-END:variables
}
