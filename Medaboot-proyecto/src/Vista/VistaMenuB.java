
package Vista;

import javax.swing.JButton;


public class VistaMenuB extends javax.swing.JPanel {

    /**
     * Creates new form VistaMenuB
     */
    public VistaMenuB() {
        initComponents();
    }

    public JButton getBtMaquina() {
        return btMaquina;
    }

    public JButton getBtJugador() {
        return btJugador;
    }

    public JButton getBtCPU() {
        return btCPU;
    }

    public JButton getBtAtras() {
        return btAtras;
    }
    
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btMaquina = new javax.swing.JButton();
        btJugador = new javax.swing.JButton();
        btCPU = new javax.swing.JButton();
        lbTBatalla = new javax.swing.JLabel();
        btAtras = new javax.swing.JButton();

        btMaquina.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btMaquina.setText("PJ VS PNJ");
        btMaquina.setAutoscrolls(true);
        btMaquina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btJugador.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btJugador.setText("PJ VS PJ");
        btJugador.setAutoscrolls(true);
        btJugador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btCPU.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btCPU.setText("PJ VS PNJ");
        btCPU.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

        lbTBatalla.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbTBatalla.setText("Selecciona el tipo de batalla");

        btAtras.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btAtras.setText("Atras");
        btAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(261, 261, 261)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btJugador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btCPU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbTBatalla, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                    .addComponent(btMaquina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(287, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTBatalla)
                .addGap(71, 71, 71)
                .addComponent(btMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115)
                .addComponent(btJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108)
                .addComponent(btCPU, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
                .addComponent(btAtras)
                .addGap(34, 34, 34))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAtras;
    private javax.swing.JButton btCPU;
    private javax.swing.JButton btJugador;
    private javax.swing.JButton btMaquina;
    private javax.swing.JLabel lbTBatalla;
    // End of variables declaration//GEN-END:variables
}
