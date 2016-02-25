
package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Vista.VistaMenu;
import Vista.*;
import Modelo.Usuario;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import Vista.VistaMenuB;
import Vista.VistaPreparacionBPj;
import Vista.VistaBatalla;
import Vista.VistaMenuTorneo;
import Vista.VistaPreparacionTorneo;
import Vista.VistaRegistro1;
import java.awt.BorderLayout;
import Modelo.*;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.Statement;

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
        try {
            Usuario userP=new Usuario(this.nombreUsuario,this.contraseña);
            if(userP.cargarAcciones()){
                for(String linea:userP.getRegistroAcciones()){
                    this.vm.getTxtRegistroAcciones().append("\n"+linea);
                }
            }
            if(userP.comprobarPjOculto()){
                this.vm.getBtOculto().setEnabled(true);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ControladorMenu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ControladorMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    

}
   



    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(this.vm.getBtBatalla())){
            VistaMenuB vmb= new VistaMenuB();
            VistaBatalla vb= new VistaBatalla();
            VistaPreparacionBPj vtp= new VistaPreparacionBPj();
            VistaPreparacionBPjvsCpu vtpc= new VistaPreparacionBPjvsCpu();
            VistaPreparacionCpuvsCpu1 vtCpCp= new VistaPreparacionCpuvsCpu1();
           
            vmb.setSize(844, 584);
            this.vm.getContentPane().removeAll();
            this.vm.getContentPane().add(vmb,BorderLayout.CENTER);
            this.vm.getContentPane().revalidate();
            this.vm.getContentPane().repaint();
            ControladorBatalla ctb= new ControladorBatalla(vmb,vb,vtp,this.vm,this.nombreUsuario,this.contraseña,vtpc,vtCpCp);
        }
        else if (e.getSource().equals(this.vm.getBtTorneo())){
            try {
                Usuario user=null;
                try {
                    user = new Usuario(this.nombreUsuario,this.contraseña);
                } catch (SQLException ex) {
                    Logger.getLogger(ControladorMenu.class.getName()).log(Level.SEVERE, null, ex);
                }
                VistaMenuTorneo vmt=new VistaMenuTorneo();
                VistaPreparacionTorneo vpt=new VistaPreparacionTorneo();
                VistaTranscursoTorneo vtt= new VistaTranscursoTorneo();
                Torneo torneo= new Torneo(user);
                vmt.setSize(844, 584);
                this.vm.getContentPane().removeAll();
                this.vm.getContentPane().add(vmt,BorderLayout.CENTER);
                this.vm.getContentPane().revalidate();
                this.vm.getContentPane().repaint();
                ControladorTorneo ctt=new ControladorTorneo(vmt,vpt,vtt,this.vm,torneo);
                
            } catch (SQLException ex) {
                Logger.getLogger(ControladorMenu.class.getName()).log(Level.SEVERE, null, ex);
            }
            
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
            VistaHistorial vth=new VistaHistorial();
            vth.setSize(784, 529);
            this.vm.getContentPane().removeAll();
            this.vm.getContentPane().add(vth,BorderLayout.CENTER);
            this.vm.getContentPane().revalidate();
            this.vm.getContentPane().repaint();
            try {
                ControladorHistorial cth= new ControladorHistorial(this.nombreUsuario,vth,this.vm);
                //llamar a historial
            } catch (SQLException ex) {
                Logger.getLogger(ControladorMenu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if (e.getSource().equals(this.vm.getBtDesconectar())){
            this.vm.dispose();
        }
            
       
    }
    
}
