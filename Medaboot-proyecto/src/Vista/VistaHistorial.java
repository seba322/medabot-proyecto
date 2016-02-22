
package Vista;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VistaHistorial extends javax.swing.JPanel {

   
    public VistaHistorial() {
        initComponents();
        lbError.setVisible(false);
        lbArchivo.setVisible(false);
    }

    public JLabel getLbCpu() {
        return lbCpu;
    }

    public JLabel getLbArchivo() {
        return lbArchivo;
    }
    

    public JLabel getLbTorneos() {
        return lbTorneos;
    }

    public JLabel getLbBganadas() {
        return lbBganadas;
    }

    public JLabel getLbUsuarios() {
        return lbUsuarios;
    }

    public JLabel getLbBperdidas() {
        return lbBperdidas;
    }

    public JComboBox<String> getItCpu() {
        return itCpu;
    }

    public JComboBox<String> getItUsuarios() {
        return itUsuarios;
    }

    public JButton getBtCpu() {
        return btCpu;
    }

    public JButton getBtTxt() {
        return btTxt;
    }

    public JButton getBtAtras() {
        return btAtras;
    }

    public JButton getBtUsuarios() {
        return btUsuarios;
    }

    public JTextField getTxtTorneos() {
        return txtTorneos;
    }

    public JTextField getTxtBganadas() {
        return txtBganadas;
    }

    public JTextField getTxtBperdidas() {
        return txtBperdidas;
    }

    public JTextField getTxtBuscar() {
        return txtBuscar;
    }

    public JTextField getTxtHusuario() {
        return txtHusuario;
    }

    public JButton getBtBuscar() {
        return btBuscar;
    }

    public JLabel getLbError() {
        return lbError;
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lbBganadas = new javax.swing.JLabel();
        lbBperdidas = new javax.swing.JLabel();
        lbTorneos = new javax.swing.JLabel();
        txtBganadas = new javax.swing.JTextField();
        txtBperdidas = new javax.swing.JTextField();
        txtTorneos = new javax.swing.JTextField();
        btAtras = new javax.swing.JButton();
        btTxt = new javax.swing.JButton();
        lbUsuarios = new javax.swing.JLabel();
        itUsuarios = new javax.swing.JComboBox<>();
        lbCpu = new javax.swing.JLabel();
        btUsuarios = new javax.swing.JButton();
        btCpu = new javax.swing.JButton();
        itCpu = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtHusuario = new javax.swing.JTextField();
        btBuscar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        lbError = new javax.swing.JLabel();
        lbArchivo = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Historial de Victorias y Derrotas");

        lbBganadas.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbBganadas.setText("Batallas gandas");

        lbBperdidas.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbBperdidas.setText("Batallas Perdidas");

        lbTorneos.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbTorneos.setText("Torneos ganados");

        txtBganadas.setDisabledTextColor(new java.awt.Color(0, 51, 51));
        txtBganadas.setEnabled(false);

        txtBperdidas.setDisabledTextColor(new java.awt.Color(0, 51, 51));
        txtBperdidas.setEnabled(false);

        txtTorneos.setDisabledTextColor(new java.awt.Color(0, 51, 51));
        txtTorneos.setEnabled(false);

        btAtras.setText("Atras");

        btTxt.setText("Guardar en Archivo de Texto");

        lbUsuarios.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbUsuarios.setText("Usuarios:");

        lbCpu.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbCpu.setText("Cpu:");

        btUsuarios.setText("Seleccionar");
        btUsuarios.setToolTipText("kimbo");

        btCpu.setText("Seleccionar");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Historial de:");

        txtHusuario.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtHusuario.setEnabled(false);

        btBuscar.setText("Buscar");

        lbError.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbError.setText("El usuario que buscas no existe.");

        lbArchivo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbArchivo.setText("Archivo de texto escrito correctamente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btTxt)
                        .addGap(18, 18, 18)
                        .addComponent(lbArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(itUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(btUsuarios))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(29, 29, 29)
                            .addComponent(txtHusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lbBperdidas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbTorneos)
                                .addComponent(lbBganadas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtBperdidas, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtBganadas, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTorneos, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btAtras)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addComponent(lbCpu))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(btBuscar)))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbError)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(itCpu, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                                .addComponent(btCpu)
                                .addGap(47, 47, 47))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbUsuarios)
                    .addComponent(itUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCpu)
                    .addComponent(btUsuarios)
                    .addComponent(btCpu)
                    .addComponent(itCpu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtHusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btBuscar)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(lbError)
                        .addGap(138, 138, 138)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btTxt)
                            .addComponent(lbArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbBganadas)
                            .addComponent(txtBganadas, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBperdidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbBperdidas))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTorneos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbTorneos))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(29, 29, 29)
                .addComponent(btAtras)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAtras;
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btCpu;
    private javax.swing.JButton btTxt;
    private javax.swing.JButton btUsuarios;
    private javax.swing.JComboBox<String> itCpu;
    private javax.swing.JComboBox<String> itUsuarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbArchivo;
    private javax.swing.JLabel lbBganadas;
    private javax.swing.JLabel lbBperdidas;
    private javax.swing.JLabel lbCpu;
    private javax.swing.JLabel lbError;
    private javax.swing.JLabel lbTorneos;
    private javax.swing.JLabel lbUsuarios;
    private javax.swing.JTextField txtBganadas;
    private javax.swing.JTextField txtBperdidas;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtHusuario;
    private javax.swing.JTextField txtTorneos;
    // End of variables declaration//GEN-END:variables
}
