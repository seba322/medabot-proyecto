
package Vista;

import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JTextArea;


public class VistaPreparacionTorneo extends javax.swing.JPanel {

    
    public VistaPreparacionTorneo() {
        initComponents();
        this.btEmparejar.setEnabled(false);
        this.btComenzar.setEnabled(false);
        this.btLimpiar.setEnabled(false);
    }

    public JButton getBtAtras2() {
        return btAtras2;
    }

    public JTextArea getTxtParticipantes() {
        return txtParticipantes;
    }

    public JButton getBtRegistro() {
        return btRegistro;
    }

    public JButton getBtComenzar() {
        return btComenzar;
    }

    public JButton getBtCPU() {
        return btCPU;
    }

    public JButton getBtAdm1() {
        return btAdm1;
    }

    public JButton getBtAdm2() {
        return btAdm2;
    }

    public JButton getBtAdm3() {
        return btAdm3;
    }

    public JButton getBtAdm4() {
        return btAdm4;
    }

    public JButton getBtAdm5() {
        return btAdm5;
    }

    public JButton getBtAdm6() {
        return btAdm6;
    }

    public JButton getBtAdm7() {
        return btAdm7;
    }

    public JButton getBtAdm8() {
        return btAdm8;
    }

    public JTextArea getTxtEncuentros() {
        return txtEncuentros;
    }

    public JButton getBtEmparejar() {
        return btEmparejar;
    }

    public JButton getBtLimpiar() {
        return btLimpiar;
    }
    
    

    
    
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btRegistro = new javax.swing.JButton();
        btCPU = new javax.swing.JButton();
        btAtras2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btAdm1 = new javax.swing.JButton();
        btAdm3 = new javax.swing.JButton();
        btAdm5 = new javax.swing.JButton();
        btAdm7 = new javax.swing.JButton();
        btAdm4 = new javax.swing.JButton();
        btAdm2 = new javax.swing.JButton();
        btAdm6 = new javax.swing.JButton();
        btAdm8 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtEncuentros = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btComenzar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtParticipantes = new javax.swing.JTextArea();
        btEmparejar = new javax.swing.JButton();
        btLimpiar = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Preparacion de Torneo");

        btRegistro.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btRegistro.setText("Registrar Jugador");

        btCPU.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btCPU.setText("Seleccionar CPU");

        btAtras2.setText("Atras");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Administar Personaje");

        btAdm1.setText("1");

        btAdm3.setText("3");

        btAdm5.setText("5");

        btAdm7.setText("7");

        btAdm4.setText("4");

        btAdm2.setText("2");

        btAdm6.setText("6");

        btAdm8.setText("8");

        txtEncuentros.setColumns(20);
        txtEncuentros.setFont(new java.awt.Font("Andalus", 1, 14)); // NOI18N
        txtEncuentros.setRows(5);
        txtEncuentros.setDisabledTextColor(new java.awt.Color(0, 0, 255));
        txtEncuentros.setEnabled(false);
        jScrollPane2.setViewportView(txtEncuentros);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("Participantes");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Encuentros");

        btComenzar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btComenzar.setText("Comenzar");

        txtParticipantes.setColumns(20);
        txtParticipantes.setFont(new java.awt.Font("Andalus", 1, 14)); // NOI18N
        txtParticipantes.setForeground(new java.awt.Color(255, 51, 0));
        txtParticipantes.setRows(5);
        txtParticipantes.setText("Usuario\t\tPersonaje\n");
        txtParticipantes.setDisabledTextColor(new java.awt.Color(51, 0, 204));
        txtParticipantes.setEnabled(false);
        jScrollPane3.setViewportView(txtParticipantes);

        btEmparejar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btEmparejar.setText("Emparejar");

        btLimpiar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btLimpiar.setText("Limpiar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btCPU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btLimpiar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(jLabel1)
                                .addGap(130, 130, 130))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btEmparejar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(btAdm7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btAdm8))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(btAdm5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btAdm6))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(btAdm3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btAdm4))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(btAdm1)
                                    .addGap(36, 36, 36)
                                    .addComponent(btAdm2)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btAtras2)
                                .addComponent(btComenzar)))
                        .addGap(51, 51, 51))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(32, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(378, 378, 378))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(379, 379, 379))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(57, 57, 57)
                .addComponent(jLabel3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btAdm1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btAdm2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btAdm4)
                            .addComponent(btAdm3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btAdm5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btAdm6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btAdm7)
                            .addComponent(btAdm8))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(btRegistro)
                                .addGap(29, 29, 29)
                                .addComponent(btLimpiar)
                                .addGap(36, 36, 36)
                                .addComponent(btCPU))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btComenzar)
                                        .addGap(98, 98, 98)
                                        .addComponent(btAtras2)
                                        .addGap(41, 41, 41))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(btEmparejar))))))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdm1;
    private javax.swing.JButton btAdm2;
    private javax.swing.JButton btAdm3;
    private javax.swing.JButton btAdm4;
    private javax.swing.JButton btAdm5;
    private javax.swing.JButton btAdm6;
    private javax.swing.JButton btAdm7;
    private javax.swing.JButton btAdm8;
    private javax.swing.JButton btAtras2;
    private javax.swing.JButton btCPU;
    private javax.swing.JButton btComenzar;
    private javax.swing.JButton btEmparejar;
    private javax.swing.JButton btLimpiar;
    private javax.swing.JButton btRegistro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea txtEncuentros;
    private javax.swing.JTextArea txtParticipantes;
    // End of variables declaration//GEN-END:variables
}
