
package Vista;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextArea;


public class VistaPreparacionPjOculto extends javax.swing.JPanel {

  
    public VistaPreparacionPjOculto() {
        initComponents();
    }

    public JButton getBtAtras() {
        return btAtras;
    }

    public JButton getBtComenzar() {
        return btComenzar;
    }

    public JButton getBtAdministrarPj() {
        return btAdministrarPj;
    }

    public JButton getBtSelec() {
        return btSelec;
    }

    public JComboBox<String> getLtCpu() {
        return ltCpu;
    }

    public JTextArea getTxtEstadisticas() {
        return txtEstadisticas;
    }
    

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ltCpu = new javax.swing.JComboBox<>();
        btAtras = new javax.swing.JButton();
        btAdministrarPj = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btComenzar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtEstadisticas = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        btSelec = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Preparacion Batalla Pj Vs Cpu");

        ltCpu.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        ltCpu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PJOCULTO" }));

        btAtras.setText("Atras");

        btAdministrarPj.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btAdministrarPj.setText("Administrar Personaje");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Seleccionar  una Cpu rival:");

        btComenzar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btComenzar.setText("Comenzar");

        txtEstadisticas.setColumns(20);
        txtEstadisticas.setForeground(new java.awt.Color(0, 0, 255));
        txtEstadisticas.setRows(5);
        txtEstadisticas.setCaretColor(new java.awt.Color(51, 0, 255));
        txtEstadisticas.setDisabledTextColor(new java.awt.Color(0, 0, 204));
        txtEstadisticas.setEnabled(false);
        txtEstadisticas.setSelectedTextColor(new java.awt.Color(0, 0, 255));
        jScrollPane1.setViewportView(txtEstadisticas);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Estadisticas Cpus");

        btSelec.setText("Seleccionar");
        btSelec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSelecActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btAtras)
                .addGap(94, 94, 94))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btComenzar, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btAdministrarPj, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(65, 65, 65)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(58, 58, 58)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(ltCpu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(35, 35, 35)
                                    .addComponent(btSelec, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(241, 241, 241)
                            .addComponent(jLabel1))))
                .addContainerGap(322, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(118, 118, 118)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ltCpu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btSelec, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(btAdministrarPj)
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAtras)
                    .addComponent(btComenzar))
                .addGap(75, 75, 75))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 932, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 678, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btSelecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSelecActionPerformed
        // 
    }//GEN-LAST:event_btSelecActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdministrarPj;
    private javax.swing.JButton btAtras;
    private javax.swing.JButton btComenzar;
    private javax.swing.JButton btSelec;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> ltCpu;
    private javax.swing.JTextArea txtEstadisticas;
    // End of variables declaration//GEN-END:variables
}
