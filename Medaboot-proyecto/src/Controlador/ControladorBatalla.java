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
//import com.sun.corba.se.impl.protocol.giopmsgheaders.ReplyMessage;
import java.awt.BorderLayout;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladorBatalla implements ActionListener {
    private VistaMenuB vmb;
    private VistaBatalla vb;
    private VistaPreparacionBPj vtp;

    private VistaMenu vm;
    private Medaboot Cpu;
    private Usuario user2;
    private String nombreUsuario;
    private String contraseña;
    private VistaRegistro1 vt11;
    private VistaPreparacionBPjvsCpu vtpc;
    public ControladorBatalla(VistaMenuB vmb,VistaBatalla vb,VistaPreparacionBPj vtp,VistaMenu vm,String nombreUsuario,String contraseña,VistaPreparacionBPjvsCpu vtpC){
       
        this.vm=vm;
        this.vb=vb;
        this.vmb=vmb;
        this.vtp=vtp;
        this.vtpc=vtpC;
        this.nombreUsuario=nombreUsuario;
        this.contraseña=contraseña;
        this.user2=new Usuario();
        this.vmb.getBtJugador().addActionListener(this);
        this.vmb.getBtCPU().addActionListener(this);
        this.vtp.getBtComenzar().addActionListener(this);
        this.vtp.getBtAtras().addActionListener(this);
        this.vmb.getBtAtras().addActionListener(this);
        this.vtp.getBtRegistro2().addActionListener(this);
        this.vtpc.getBtAdministrarPj().addActionListener(this);
        this.vtpc.getBtComenzar().addActionListener(this);
        this.vtpc.getBtAtras().addActionListener(this);
        this.vtpc.getBtSeleccionar().addActionListener(this);
                
        
       
              
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
        
        else if(ae.getSource().equals(this.vtp.getBtComenzar())){
            try {
                Usuario user1=new Usuario(this.nombreUsuario,this.contraseña);
                
                Medaboot pj1= user1.getPersonajes()[0];
                
                Medaboot pj2= this.user2.getPersonajes()[0];
                Batalla batalla= new Batalla(pj1,pj2);
                VistaFinalB vf= new VistaFinalB();
                
                ControladorBatalla2 ctb2= new ControladorBatalla2(batalla,this.vb,this.vm,new VistaTranscursoTorneo(),"BatallaPjvsPj","Batalla",vf,"");
                
                this.vb.setSize(844, 584);
                this.vm.getContentPane().removeAll();
                this.vm.getContentPane().add(this.vb,BorderLayout.CENTER);
                this.vm.getContentPane().revalidate();
                this.vm.getContentPane().repaint();
                //Se encarga de registrar en el menu las acciones del usuario
                String registroAcciones=user1.getNombreUsuario()+" a roboBatallado con "+this.user2.getNombreUsuario()+" el dia "+user1.mostrarHora()+"\n";
                this.vm.getTxtRegistroAcciones().append(registroAcciones);
            } catch (SQLException ex) {
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
        else if(ae.getSource().equals(this.vtp.getBtRegistro2())){
             this.vt11=new VistaRegistro1();
             ControladorRegistro controlador= new ControladorRegistro(this.vt11,new VistaRegistro2(),"kimbo");
             controlador.getVt1().getBtEntrar().addActionListener(this);
        }
        
     
       else if (ae.getSource().equals(this.vtpc.getBtSeleccionar())){
            try {
                String  nombreCpu = (String) this.vtpc.getLtCPU().getSelectedItem();
                Medaboot CpuSelecc = new Medaboot ("'"+nombreCpu+"'");
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
                
                this.vb.setSize(844, 584);
                this.vm.getContentPane().removeAll();
                this.vm.getContentPane().add(this.vb,BorderLayout.CENTER);
                this.vm.getContentPane().revalidate();
                this.vm.getContentPane().repaint();
                String registroAcciones=user1.getNombreUsuario()+" a Batallado con "+this.Cpu.getNombre()+" el dia "+user1.mostrarHora()+"\n";
                this.vm.getTxtRegistroAcciones().append(registroAcciones);
            } catch (SQLException ex) {
                Logger.getLogger(ControladorBatalla.class.getName()).log(Level.SEVERE, null, ex);
            }
       
       
       
       
       }
        
       else if(ae.getSource().equals(this.vt11.getBtEntrar())){
                    try {
                        String nombreUsuario2=this.vt11.getTxtUsuario().getText();
                        
                        String contraseña2=this.vt11.getTxtContraseña().getText();
                       ;
                        
                        
                        if (this.user2.validarUsuario(nombreUsuario2, contraseña2)==true){
                            this.vtp.getBtComenzar().setEnabled(true);
                            this.user2=new Usuario(nombreUsuario2,contraseña2);
                           
                            
                            
                        }   
                        
                        
                        
                        
                        } catch (SQLException ex) {
                        Logger.getLogger(ControladorBatalla.class.getName()).log(Level.SEVERE, null, ex);
                    }
                
                
                
                
                }
            
            } 
            
       
    }
    

    
