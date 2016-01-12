
package Vista;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class VistaRegistro2 extends javax.swing.JPanel {

    
    public VistaRegistro2() {
        initComponents();
       lbError.setVisible(false);
       lbError2.setVisible(false);
        
        
    }

    public JButton getBtCrear() {
        return btCrear;
    }

    public JLabel getLbContra() {
        return lbContra;
    }

    public JLabel getLbContra2() {
        return lbContra2;
    }

    public JLabel getLbNombre() {
        return lbNombre;
    }

    public JLabel getLbUsuario() {
        return lbUsuario;
    }

    public JLabel getTitulo() {
        return titulo;
    }

    public JPasswordField getTxtContra2() {
        return txtContra2;
    }

    public JPasswordField getTxtContra3() {
        return txtContra3;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public JTextField getTxtUsuario2() {
        return txtUsuario2;
    }

    public JButton getBtAtras() {
        return btAtras;
    }

    public JLabel getLbError() {
        return lbError;
    }

    public JLabel getLbError2() {
        return lbError2;
    }
    
    
    
        

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        lbUsuario = new javax.swing.JLabel();
        lbContra = new javax.swing.JLabel();
        lbContra2 = new javax.swing.JLabel();
        lbNombre = new javax.swing.JLabel();
        txtUsuario2 = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        btCrear = new javax.swing.JButton();
        txtContra2 = new javax.swing.JPasswordField();
        txtContra3 = new javax.swing.JPasswordField();
        btAtras = new javax.swing.JButton();
        lbError = new javax.swing.JLabel();
        lbError2 = new javax.swing.JLabel();

        titulo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        titulo.setText("Completa los siguientes campos:");

        lbUsuario.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbUsuario.setText("Usuario");

        lbContra.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbContra.setText("Contraseña:");

        lbContra2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbContra2.setText("Verificacion Contraseña");

        lbNombre.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbNombre.setText("Nombre Medabost");

        txtUsuario2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        txtNombre.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        btCrear.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btCrear.setText("Crear Cuenta");
        btCrear.setToolTipText("");
        btCrear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        txtContra2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        txtContra3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        btAtras.setText("Atras");
        btAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lbError.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbError.setText("Las contraseñas no son iguales");

        lbError2.setText("El nombre de usuario ya existe");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbContra2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbContra, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                            .addComponent(txtUsuario2, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                            .addComponent(txtContra2)
                            .addComponent(lbError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbError2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtContra3))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(btCrear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btAtras)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsuario2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtContra2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbContra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtContra3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbContra2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(btAtras)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lbError)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbError2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btCrear)
                        .addGap(27, 27, 27))))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAtras;
    private javax.swing.JButton btCrear;
    private javax.swing.JLabel lbContra;
    private javax.swing.JLabel lbContra2;
    private javax.swing.JLabel lbError;
    private javax.swing.JLabel lbError2;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbUsuario;
    private javax.swing.JLabel titulo;
    private javax.swing.JPasswordField txtContra2;
    private javax.swing.JPasswordField txtContra3;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtUsuario2;
    // End of variables declaration//GEN-END:variables
}
