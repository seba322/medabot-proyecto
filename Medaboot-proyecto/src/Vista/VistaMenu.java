
package Vista;

import javax.swing.JButton;
import javax.swing.JPanel;


public class VistaMenu extends javax.swing.JFrame {

   
    public VistaMenu() {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setTitle("Menu Principal");
    }

    public JButton getBtBatalla() {
        return btBatalla;
    }

    public JButton getBtTorneo() {
        return btTorneo;
    }

    public JButton getBtAdministracion() {
        return btAdministracion;
    }

    public JButton getBtHistorial() {
        return btHistorial;
    }

    public JButton getBtOculto() {
        return btOculto;
    }

    public JButton getBtDesconectar() {
        return btDesconectar;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }
    
    
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btBatalla = new javax.swing.JButton();
        btTorneo = new javax.swing.JButton();
        btAdministracion = new javax.swing.JButton();
        btOculto = new javax.swing.JButton();
        btHistorial = new javax.swing.JButton();
        btDesconectar = new javax.swing.JButton();
        lbTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btBatalla.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btBatalla.setText("BATALLA");

        btTorneo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btTorneo.setText("TORNEO");

        btAdministracion.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btAdministracion.setText("ADMINISTRAR PERSONAJE");

        btOculto.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btOculto.setText("PERSONAJE OCULTO");
        btOculto.setEnabled(false);

        btHistorial.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btHistorial.setText("HISTORIAL");

        btDesconectar.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        btDesconectar.setText("Desconectar");

        lbTitulo.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        lbTitulo.setText("MEDABOT");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btDesconectar)
                .addGap(168, 168, 168))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(237, 237, 237)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btOculto, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btBatalla, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btAdministracion, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btTorneo, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(13, 13, 13)
                            .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(307, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btDesconectar)
                .addGap(30, 30, 30)
                .addComponent(lbTitulo)
                .addGap(112, 112, 112)
                .addComponent(btBatalla)
                .addGap(32, 32, 32)
                .addComponent(btAdministracion)
                .addGap(44, 44, 44)
                .addComponent(btTorneo)
                .addGap(36, 36, 36)
                .addComponent(btOculto)
                .addGap(26, 26, 26)
                .addComponent(btHistorial)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public static void main(String args[]) {
      
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdministracion;
    private javax.swing.JButton btBatalla;
    private javax.swing.JButton btDesconectar;
    private javax.swing.JButton btHistorial;
    private javax.swing.JButton btOculto;
    private javax.swing.JButton btTorneo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbTitulo;
    // End of variables declaration//GEN-END:variables
}
