
package Vista;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class VistaAdmin extends javax.swing.JPanel {
    



  
    public VistaAdmin() {
        

        initComponents();
        this.btGuardar.setEnabled(false);
        setLocation(5,5);
        
      
        
        
        
        
    }

    public JComboBox<String> getJcCabeza() {
        return jcCabeza;
    }

    public JComboBox<String> getJcBrazoDE() {
        return jcBrazoDE;
    }

    public JComboBox<String> getJcBrazoIZ() {
        return jcBrazoIZ;
    }

    public JComboBox<String> getJcMedalla() {
        return jcMedalla;
    }

    public JComboBox<String> getJcPiernaDE() {
        return jcPiernaDE;
    }

    public JComboBox<String> getJcPiernaIZ() {
        return jcPiernaIZ;
    }

    public JComboBox<String> getJcPersonaje() {
        return jcPersonaje;
    }
    public JTextArea getjTextAdmin1(){
        return jTextAdmin1;
    }
    public JTextArea getjTextAdmin2(){
        return jTexAdmin2;
    }

    public JButton getBtGuardar() {
        return btGuardar;
    }
    public JButton getjBEstadisticas1(){
        return jBEstadisticas1;
    }
    public JButton getjBEstadisticas2(){
        return jBEstadisticas2;
    }
    public JButton getjBEstadisticas3(){
        return jBEstadistica3;
    }
    public JButton getjBEstadisticas4(){
        return jBEstadisticas4;
    }
    public JButton getjBEstadisticas5(){
        return jBEstadisticas5;
    }
     public JButton getjBEstadisticas6(){
        return jBEstadisticas6;
    }

    public JButton getBtSeleccionar() {
        return btSeleccionar;
    }

   

   

    public JButton getBtAtras() {
        return btAtras;
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jcPersonaje = new javax.swing.JComboBox<>();
        btSeleccionar = new javax.swing.JButton();
        jcPiernaDE = new javax.swing.JComboBox<>();
        jcMedalla = new javax.swing.JComboBox<>();
        jcBrazoDE = new javax.swing.JComboBox<>();
        btGuardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAdmin1 = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jBEstadisticas1 = new javax.swing.JButton();
        jBEstadisticas2 = new javax.swing.JButton();
        jBEstadisticas6 = new javax.swing.JButton();
        jBEstadistica3 = new javax.swing.JButton();
        jcBrazoIZ = new javax.swing.JComboBox<>();
        btAtras = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTexAdmin2 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jcCabeza = new javax.swing.JComboBox<>();
        jBEstadisticas4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jcPiernaIZ = new javax.swing.JComboBox<>();
        jBEstadisticas5 = new javax.swing.JButton();

        setAutoscrolls(true);

        jcPersonaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcPersonajeActionPerformed(evt);
            }
        });

        btSeleccionar.setText("Seleecionar Personaje");

        btGuardar.setText("Guardar Cambios");

        jLabel1.setText("BrazoIZ");

        jLabel2.setText("brazoDE");

        jLabel4.setText("PiernaDE");

        jLabel6.setText("Medalla");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("Administracion del personaje");

        jTextAdmin1.setColumns(20);
        jTextAdmin1.setRows(5);
        jScrollPane2.setViewportView(jTextAdmin1);

        jLabel8.setText("Estadisticas Medaparte");

        jBEstadisticas1.setText("Estadisticas");
        jBEstadisticas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEstadisticas1ActionPerformed(evt);
            }
        });

        jBEstadisticas2.setText("Estadisticas");

        jBEstadisticas6.setText("Estadisticas");

        jBEstadistica3.setText("Estadisticas");

        btAtras.setText("Atras");

        jTexAdmin2.setColumns(20);
        jTexAdmin2.setRows(5);
        jScrollPane3.setViewportView(jTexAdmin2);

        jLabel3.setText("PiernaIZ");

        jBEstadisticas4.setText("Estadisticas");
        jBEstadisticas4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEstadisticas4ActionPerformed(evt);
            }
        });

        jLabel5.setText("Cabeza");

        jBEstadisticas5.setText("Estadisticas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(113, 113, 113))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jBEstadisticas2)
                                    .addComponent(jBEstadisticas1))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcBrazoIZ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel6)
                                    .addComponent(jcMedalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBEstadistica3)
                                .addGap(26, 26, 26)
                                .addComponent(jcBrazoDE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(116, 116, 116)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcPersonaje, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(167, 167, 167)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(btSeleccionar)
                            .addGap(179, 179, 179)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(57, 57, 57)
                                    .addComponent(jLabel8))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(btAtras))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jcPiernaDE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(27, 27, 27)
                                                .addComponent(jBEstadisticas6))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jcCabeza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(27, 27, 27)
                                                .addComponent(jBEstadisticas4))
                                            .addComponent(jLabel5)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jcPiernaIZ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(116, 116, 116))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addGap(107, 107, 107)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(58, 58, 58)
                                        .addComponent(jBEstadisticas5)))))))
                .addContainerGap(249, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcMedalla, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBEstadisticas1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcBrazoIZ, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBEstadisticas2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcBrazoDE, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBEstadistica3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jcPersonaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btSeleccionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jBEstadisticas4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jcCabeza, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jcPiernaIZ, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBEstadisticas5))
                                .addGap(1, 1, 1)
                                .addComponent(jLabel3)
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jcPiernaDE, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBEstadisticas6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)))
                        .addGap(142, 142, 142)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)))
                .addComponent(btGuardar)
                .addGap(37, 37, 37))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jcPersonajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcPersonajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcPersonajeActionPerformed

    private void jBEstadisticas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEstadisticas1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBEstadisticas1ActionPerformed

    private void jBEstadisticas4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEstadisticas4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBEstadisticas4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAtras;
    private javax.swing.JButton btGuardar;
    private javax.swing.JButton btSeleccionar;
    private javax.swing.JButton jBEstadistica3;
    private javax.swing.JButton jBEstadisticas1;
    private javax.swing.JButton jBEstadisticas2;
    private javax.swing.JButton jBEstadisticas4;
    private javax.swing.JButton jBEstadisticas5;
    private javax.swing.JButton jBEstadisticas6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTexAdmin2;
    private javax.swing.JTextArea jTextAdmin1;
    private javax.swing.JComboBox<String> jcBrazoDE;
    private javax.swing.JComboBox<String> jcBrazoIZ;
    private javax.swing.JComboBox<String> jcCabeza;
    private javax.swing.JComboBox<String> jcMedalla;
    private javax.swing.JComboBox<String> jcPersonaje;
    private javax.swing.JComboBox<String> jcPiernaDE;
    private javax.swing.JComboBox<String> jcPiernaIZ;
    // End of variables declaration//GEN-END:variables
}
