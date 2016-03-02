
package Vista;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class VistaFinalizarTorneo extends javax.swing.JPanel {

  
    public VistaFinalizarTorneo() {
        initComponents();
    }

    public JButton getBtContinuar2() {
        return btContinuar2;
    }

    public JTextField getTxtGanador() {
        return txtGanador;
    }

    public JLabel getLbGanador() {
        return lbGanador;
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbGanador = new javax.swing.JLabel();
        txtGanador = new javax.swing.JTextField();
        btContinuar2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        lbGanador.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbGanador.setText("El ganador del Torneo es:");

        txtGanador.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txtGanador.setDisabledTextColor(new java.awt.Color(0, 0, 204));
        txtGanador.setEnabled(false);

        btContinuar2.setText("Continuar");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("El jugador oculto a sido activado en la seccion de menu ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btContinuar2)
                .addGap(232, 232, 232))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtGanador)
                            .addComponent(lbGanador, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel1)))
                .addContainerGap(306, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(lbGanador)
                .addGap(90, 90, 90)
                .addComponent(txtGanador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(jLabel1)
                .addGap(77, 77, 77)
                .addComponent(btContinuar2)
                .addContainerGap(135, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btContinuar2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbGanador;
    private javax.swing.JTextField txtGanador;
    // End of variables declaration//GEN-END:variables
}
