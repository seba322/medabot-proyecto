/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Batalla;
import Modelo.Medaboot;
import Modelo.Usuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Vista.*;
import static com.sun.javafx.tk.Toolkit.getToolkit;
//import com.sun.corba.se.impl.protocol.giopmsgheaders.ReplyMessage;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;


public class ControladorBatalla implements ActionListener {
    private VistaMenuB vmb;
    private VistaBatalla vb;
    private VistaPreparacionBPj vtp;
    private VistaAdmin vta;
    private VistaMenu vm;
    private Medaboot Cpu;
    private Usuario user2;
    private Usuario user1;
    private String nombreUsuario;
    private String contraseña;
    private VistaRegistro1 vt11;
    private VistaPreparacionBPjvsCpu vtpc;
    private VistaPreparacionCpuvsCpu1 vtCpCp;
    private Medaboot Cpu1;
    public ControladorBatalla(VistaMenuB vmb,VistaBatalla vb,VistaPreparacionBPj vtp,VistaMenu vm,String nombreUsuario,String contraseña,VistaPreparacionBPjvsCpu vtpC,VistaPreparacionCpuvsCpu1 vtCpCp) throws SQLException{
        this.vta=new VistaAdmin();
        this.vm=vm;
        this.vb=vb;
        this.vmb=vmb;
        this.vtp=vtp;
        this.vtpc=vtpC;
        this.vtCpCp=vtCpCp;
        this.nombreUsuario=nombreUsuario;
        this.contraseña=contraseña;
        this.user2=new Usuario();
        this.user1=new Usuario(this.nombreUsuario,this.contraseña);
        this.vmb.getBtJugador().addActionListener(this);
        this.vmb.getBtCPU().addActionListener(this);
        this.vmb.getBtMaquina().addActionListener(this);
        this.vtp.getBtADM1().addActionListener(this);
        this.vtp.getBtADM2().addActionListener(this);
        this.vtp.getBtComenzar().addActionListener(this);
        this.vtp.getBtAtras().addActionListener(this);
        this.vmb.getBtAtras().addActionListener(this);
        this.vtp.getBtRegistro2().addActionListener(this);
        this.vtpc.getBtAdministrarPj().addActionListener(this);
        this.vtpc.getBtComenzar().addActionListener(this);
        this.vtpc.getBtAtras().addActionListener(this);
        this.vtpc.getBtSeleccionar().addActionListener(this);
        this.vtCpCp.getBtComenzar().addActionListener(this);
        this.vtCpCp.getBtAtras().addActionListener(this);
        this.vtCpCp.getBtSeleccionar().addActionListener(this);       
        
       
              
    }
    
    
    
    
    

    
    @Override
    public void actionPerformed(ActionEvent ae) {
        
        
        if(ae.getSource().equals(this.vmb.getBtJugador())){
            
            this.vtp.setSize(844, 584);
            this.vm.getContentPane().removeAll();
            this.vm.getContentPane().add(this.vtp,BorderLayout.CENTER);
            this.vm.getContentPane().revalidate();
            this.vm.getContentPane().repaint();
            
          
        }
        else if(ae.getSource().equals(this.vmb.getBtCPU())){
            this.vtpc.setSize(844, 584);
            this.vm.getContentPane().removeAll();
            this.vm.getContentPane().add(this.vtpc,BorderLayout.CENTER);
            this.vm.getContentPane().revalidate();
            this.vm.getContentPane().repaint();
           
        }
        
        else if(ae.getSource().equals(this.vmb.getBtMaquina())){
            this.vtCpCp.setSize(844, 584);
            this.vm.getContentPane().removeAll();
            this.vm.getContentPane().add(this.vtCpCp,BorderLayout.CENTER);
            this.vm.getContentPane().revalidate();
            this.vm.getContentPane().repaint();
           
        }
        //Permite acceder al administrador de personajes de usuario 1 en 
        //batalla pj vs pj
        else if(ae.getSource().equals(this.vtp.getBtADM1())){
            this.vta=new VistaAdmin();
            this.vta.setSize(1162, 654);
            this.vm.getContentPane().removeAll();
            this.vm.getContentPane().add(this.vta,BorderLayout.CENTER);
            this.vm.getContentPane().revalidate();
            this.vm.getContentPane().repaint();
            ControladorAdministracion cta =new ControladorAdministracion(this.vta, this.user1, this.vm, "batalla");
            this.vta.getBtAtras().addActionListener(this);
        }
        //Permite acceder al administrador de personajes de usuario 2 en 
        //batalla pj vs pj
        else if(ae.getSource().equals(this.vtp.getBtADM2())){
            this.vta=new VistaAdmin();
            this.vta.setSize(1162, 654);
            this.vm.getContentPane().removeAll();
            this.vm.getContentPane().add(this.vta,BorderLayout.CENTER);
            this.vm.getContentPane().revalidate();
            this.vm.getContentPane().repaint();
            ControladorAdministracion cta =new ControladorAdministracion(this.vta, this.user2, this.vm, "batalla");
            this.vta.getBtAtras().addActionListener(this);
        }
        //Permite volver al menu de preparacion batalla pj vs pj
        // desde el panel de administracion
        else if(ae.getSource().equals(this.vta.getBtAtras())){
        
             
            this.vtp.setSize(844, 584);
            this.vm.getContentPane().removeAll();
            this.vm.getContentPane().add(this.vtp,BorderLayout.CENTER);
            this.vm.getContentPane().revalidate();
            this.vm.getContentPane().repaint();
        }
        
        else if(ae.getSource().equals(this.vtp.getBtComenzar())){
            try {
                
                
                Medaboot pj1= this.user1.getPersonajes()[0];
                
                Medaboot pj2= this.user2.getPersonajes()[0];
                Batalla batalla= new Batalla(pj1,pj2);
                VistaFinalB vf= new VistaFinalB();
                
                ControladorBatalla2 ctb2= new ControladorBatalla2(batalla,this.vb,this.vm,new VistaTranscursoTorneo(),"BatallaPjvsPj","Batalla",vf,"");
                this.vm.setExtendedState(JFrame.MAXIMIZED_BOTH);

                this.vb.setSize(1402, 684);
                this.vm.getContentPane().removeAll();
                this.vm.getContentPane().add(this.vb,BorderLayout.CENTER);
                this.vm.getContentPane().revalidate();
                this.vm.getContentPane().repaint();
                //Se encarga de registrar en el menu las acciones del usuario
                String registroAcciones=" "+user1.getNombreUsuario()+" a Batallado con "+this.user2.getNombreUsuario()+" el dia "+user1.mostrarHora();
                this.vm.getTxtRegistroAcciones().append("\n"+registroAcciones);
                user1.escribirAcciones(registroAcciones);
                this.user2.escribirAcciones(registroAcciones);
            }  catch (IOException ex) {
                Logger.getLogger(ControladorBatalla.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        // Volver al menu principal desde menu de batalla
        else if(ae.getSource().equals(this.vmb.getBtAtras())){
          this.vm.getContentPane().removeAll();
          this.vm.getContentPane().add(this.vm.getjPanel1(),BorderLayout.CENTER);
          this.vm.getContentPane().revalidate();
          this.vm.getContentPane().repaint();
           
        }
        //Volver a menu de batalla, desde preparacion de batalla
        else if(ae.getSource().equals(this.vtp.getBtAtras())){
          
            vmb.setSize(844, 584);
            this.vm.getContentPane().removeAll();
            this.vm.getContentPane().add(vmb,BorderLayout.CENTER);
            this.vm.getContentPane().revalidate();
            this.vm.getContentPane().repaint();
            
        }
        else if(ae.getSource().equals(this.vtCpCp.getBtAtras())){
          
            vmb.setSize(844, 584);
            this.vm.getContentPane().removeAll();
            this.vm.getContentPane().add(vmb,BorderLayout.CENTER);
            this.vm.getContentPane().revalidate();
            this.vm.getContentPane().repaint();
            
        }
        else if(ae.getSource().equals(this.vtp.getBtRegistro2())){
             this.vt11=new VistaRegistro1();
             ControladorRegistro controlador= new ControladorRegistro(this.vt11,new VistaRegistro2(),"kimbo");
             controlador.getVt1().getBtEntrar().addActionListener(this);
        }
        
     
       else if (ae.getSource().equals(this.vtpc.getBtSeleccionar())){
            try {
                String  nombreCpu = (String) this.vtpc.getLtCPU().getSelectedItem();
                Medaboot CpuSelecc = new Medaboot (nombreCpu);
                this.Cpu=CpuSelecc;
                this.vtpc.getTxtEstadisticas().setText("");
                String Estadisicas = "nombre :"+ CpuSelecc.getNombre()+"\n"
                        + "salud:"+CpuSelecc.getSalud()+"\n"+"esquive:"+CpuSelecc.getEsquive()+"\n"
                        +"defensa:"+CpuSelecc.getDefensa()+"\n"+"ataque:"+CpuSelecc.getAtaque()+"\n";
               
                this.vtpc.getTxtEstadisticas().append(Estadisicas);
                this.vtpc.getBtComenzar().setEnabled(true);
            } catch (SQLException ex) {
                Logger.getLogger(ControladorBatalla.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
          
       else if (ae.getSource().equals(this.vtpc.getBtComenzar())){
           try {
                Usuario user1=new Usuario(this.nombreUsuario,this.contraseña);
                
                Medaboot pj1= user1.getPersonajes()[0];
                
                Medaboot pj2= this.Cpu;
                Batalla batalla= new Batalla(pj1,pj2);
                VistaFinalB vf= new VistaFinalB();
                
                ControladorBatalla2 ctb2= new ControladorBatalla2(batalla,this.vb,this.vm,new VistaTranscursoTorneo(),"BatallaCpuPj","Batalla",vf,"");
                this.vm.setExtendedState(JFrame.MAXIMIZED_BOTH);
                this.vb.setSize(1402, 684);
                this.vm.getContentPane().removeAll();
                this.vm.getContentPane().add(this.vb,BorderLayout.CENTER);
                this.vm.getContentPane().revalidate();
                this.vm.getContentPane().repaint();
                String registroAcciones=" "+user1.getNombreUsuario()+" a Batallado con "+this.Cpu.getNombre()+" el dia "+user1.mostrarHora();
                this.vm.getTxtRegistroAcciones().append("\n"+registroAcciones);
                user1.escribirAcciones(registroAcciones);
                
                
            } catch (SQLException ex) {
                Logger.getLogger(ControladorBatalla.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(ControladorBatalla.class.getName()).log(Level.SEVERE, null, ex);
            } 
       
       
       
       
       }
       
       else if (ae.getSource().equals(this.vtCpCp.getBtSeleccionar())){
            try {
                String  nombreCpu = (String) this.vtCpCp.getLtCPU().getSelectedItem();
                 String  nombreCpu1 = (String) this.vtCpCp.getLtCPU1().getSelectedItem();
                Medaboot CpuSelecc = new Medaboot (nombreCpu);
                 Medaboot CpuSelecc1 = new Medaboot (nombreCpu1);
                this.Cpu=CpuSelecc;
                this.Cpu1=CpuSelecc1;
                this.vtCpCp.getTxtEstadisticas().setText("");
                String Estadisicas = "nombre :"+ CpuSelecc.getNombre()+"\n"
                        + "salud:"+CpuSelecc.getSalud()+"\n"+"esquive:"+CpuSelecc.getEsquive()+"\n"
                        +"defensa:"+CpuSelecc.getDefensa()+"\n"+"ataque:"+CpuSelecc.getAtaque()+"\n";
                this.vtCpCp.getTxtEstadisticas1().setText("");
                String Estadisicas1 = "nombre :"+ CpuSelecc1.getNombre()+"\n"
                        + "salud:"+CpuSelecc.getSalud()+"\n"+"esquive:"+CpuSelecc.getEsquive()+"\n"
                        +"defensa:"+CpuSelecc.getDefensa()+"\n"+"ataque:"+CpuSelecc.getAtaque()+"\n";
               
                this.vtCpCp.getTxtEstadisticas().append(Estadisicas);
                this.vtCpCp.getTxtEstadisticas1().append(Estadisicas1);
                this.vtCpCp.getBtComenzar().setEnabled(true);
                
            } catch (SQLException ex) {
                Logger.getLogger(ControladorBatalla.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
          
       else if (ae.getSource().equals(this.vtCpCp.getBtComenzar())){
           Medaboot pj1= this.Cpu;
           Medaboot pj2= this.Cpu1;
           Batalla batalla= new Batalla(pj1,pj2);
           VistaFinalB vf= new VistaFinalB();
           ControladorBatalla2 ctb2= new ControladorBatalla2(batalla,this.vb,this.vm,new VistaTranscursoTorneo(),"BatallaCpuVsCpu","Batalla",vf,"");
           this.vm.setExtendedState(JFrame.MAXIMIZED_BOTH);
           this.vb.setSize(1402, 684);
           this.vm.getContentPane().removeAll();
           this.vm.getContentPane().add(this.vb,BorderLayout.CENTER);
           this.vm.getContentPane().revalidate();
           this.vm.getContentPane().repaint();
       
       
       
       
       }
        //Permite verificar si y registrar los datos del usuario 2 para batalla de
       //pj vs pj
       else if(ae.getSource().equals(this.vt11.getBtEntrar())){
                    try {
                        String nombreUsuario2=this.vt11.getTxtUsuario().getText();
                        String contraseña2=this.vt11.getTxtContraseña().getText();
                      if (this.user2.validarUsuario(nombreUsuario2, contraseña2)==true && !nombreUsuario2.equals(this.nombreUsuario)){
                            this.vtp.getBtComenzar().setEnabled(true);
                            this.vtp.getBtADM1().setEnabled(true);
                            this.vtp.getBtADM2().setEnabled(true);
                            this.user2=new Usuario(nombreUsuario2,contraseña2);
                            this.vtp.getLbError().setVisible(false);
                        }
                      else{
                          this.vtp.getLbError().setVisible(true);
                      }
                      
                        
                    
                        
                        
                        
                        }
                        catch (SQLException ex) {
                        Logger.getLogger(ControladorBatalla.class.getName()).log(Level.SEVERE, null, ex);
                        }
        } 
            
    }


}

    
