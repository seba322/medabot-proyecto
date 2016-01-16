
package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Vista.VistaMenu;
import Vista.VistaAdmin;
import Modelo.Usuario;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import Vista.VistaMenuB;
import Vista.VistaPreparacionBPj;
import Vista.VistaBatalla;
import Vista.VistaRegistro1;
import java.awt.BorderLayout;

public class ControladorMenu implements ActionListener {
    
    private VistaMenu vm;
    private String nombreUsuario;
    private String contraseña;
    
    
    
   
    public ControladorMenu(VistaMenu vm,String nombreUsuario ,String contraseña) {
        this.vm= vm;
        this.nombreUsuario=nombreUsuario;
        this.contraseña=contraseña;
        this.vm.getBtBatalla().addActionListener(this);
        this.vm.getBtTorneo().addActionListener(this);
        this.vm.getBtAdministracion().addActionListener(this);
        this.vm.getBtOculto().addActionListener(this);
        this.vm.getBtHistorial().addActionListener(this);
        this.vm.getBtDesconectar().addActionListener(this);
    

}
   

    ControladorMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(this.vm.getBtBatalla())){
            VistaMenuB vmb= new VistaMenuB();
            VistaBatalla vb= new VistaBatalla();
            VistaPreparacionBPj vtp= new VistaPreparacionBPj();
           
            vmb.setSize(844, 584);
            this.vm.getContentPane().removeAll();
            this.vm.getContentPane().add(vmb,BorderLayout.CENTER);
            this.vm.getContentPane().revalidate();
            this.vm.getContentPane().repaint();
            ControladorBatalla ctb= new ControladorBatalla(vmb,vb,vtp,this.vm,this.nombreUsuario,this.contraseña);
        }
        else if (e.getSource().equals(this.vm.getBtTorneo())){
            //llamar al torneo
        }
        else if (e.getSource().equals(this.vm.getBtAdministracion())){
            
            //Usuario user = null;
            Usuario user = null;
            System.out.println("llegue aca");
            try {
                user = new Usuario(this.nombreUsuario,this.contraseña);
            } catch (SQLException ex) {
                Logger.getLogger(ControladorMenu.class.getName()).log(Level.SEVERE, null, ex);
            }
            VistaAdmin vta = new VistaAdmin();
             vta.setSize(844, 584);
            vta.setLocation(5,5);
            
            this.vm.getContentPane().removeAll();
            this.vm.getContentPane().add(vta,BorderLayout.CENTER);
            this.vm.getContentPane().revalidate();
            this.vm.getContentPane().repaint();
            ControladorAdministracion cta= new ControladorAdministracion(vta,user,this.vm);
            
            
            
        }
        else if (e.getSource().equals(this.vm.getBtOculto())){
            //llamar a oculto
        }
        else if (e.getSource().equals(this.vm.getBtHistorial())){
            //llamar a historial
        }
        else if (e.getSource().equals(this.vm.getBtDesconectar())){
            this.vm.dispose();
        }
            
       
    }
    
}
