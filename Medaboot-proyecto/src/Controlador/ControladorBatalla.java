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
import Vista.VistaBatalla;
import Vista.VistaMenuB;
import Vista.VistaPreparacionBPj;
import Vista.VistaMenu;
import Vista.VistaRegistro1;
import Vista.VistaRegistro2;
import com.sun.corba.se.impl.protocol.giopmsgheaders.ReplyMessage;
import java.awt.BorderLayout;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladorBatalla implements ActionListener {
    private VistaMenuB vmb;
    private VistaBatalla vb;
    private VistaPreparacionBPj vtp;
    private VistaMenu vm;
    private Usuario user2;
    private String nombreUsuario;
    private String contraseña;
    private VistaRegistro1 vt11;
    public ControladorBatalla(VistaMenuB vmb,VistaBatalla vb,VistaPreparacionBPj vtp,VistaMenu vm,String nombreUsuario,String contraseña){
        System.out.println("Empieza CONTROLADORBATALLA");
        this.vm=vm;
        this.vb=vb;
        this.vmb=vmb;
        this.vtp=vtp;
        this.nombreUsuario=nombreUsuario;
        this.contraseña=contraseña;
        this.user2=new Usuario();
        this.vmb.getBtJugador().addActionListener(this);
        this.vtp.getBtComenzar().addActionListener(this);
        this.vtp.getBtAtras().addActionListener(this);
        this.vmb.getBtAtras().addActionListener(this);
        this.vtp.getBtRegistro2().addActionListener(this);
                
        
       
              
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
        
        else if(ae.getSource().equals(this.vtp.getBtComenzar())){
            try {
                Usuario user1=new Usuario(this.nombreUsuario,this.contraseña);
                System.out.println(this.user2.getNombreUsuario()+"FUNCIONOOOOOOOOOOOOOO");
                Medaboot pj1= user1.getPersonajes()[0];
                System.out.println("aqui"+pj1.getSalud());
                Medaboot pj2= this.user2.getPersonajes()[0];
                Batalla batalla= new Batalla(pj1,pj2);
                ControladorBatalla2 ctb2= new ControladorBatalla2(batalla,this.vb);
                
                this.vb.setSize(844, 584);
                this.vm.getContentPane().removeAll();
                this.vm.getContentPane().add(this.vb,BorderLayout.CENTER);
                this.vm.getContentPane().revalidate();
                this.vm.getContentPane().repaint();
            } catch (SQLException ex) {
                Logger.getLogger(ControladorBatalla.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        else if(ae.getSource().equals(this.vmb.getBtAtras())){
          this.vm.getContentPane().removeAll();
          this.vm.getContentPane().add(this.vm.getjPanel1(),BorderLayout.CENTER);
          this.vm.getContentPane().revalidate();
          this.vm.getContentPane().repaint();
           
        }
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
        
        else if(ae.getSource().equals(this.vt11.getBtEntrar())){
                    try {
                        String nombreUsuario2=this.vt11.getTxtUsuario().getText();
                        System.out.println(nombreUsuario2+"AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
                        String contraseña2=this.vt11.getTxtContraseña().getText();
                        System.out.println(contraseña2);
                        System.out.println("ESTOR AQUI");
                        
                        if (this.user2.validarUsuario(nombreUsuario2, contraseña2)==true){
                            this.vtp.getBtComenzar().setEnabled(true);
                            this.user2=new Usuario(nombreUsuario2,contraseña2);
                            System.out.println(this.user2.getNombreUsuario());
                            System.out.println("FUCIONO");
                            
                        }   
                        
                        
                        
                        
                        } catch (SQLException ex) {
                        Logger.getLogger(ControladorBatalla.class.getName()).log(Level.SEVERE, null, ex);
                    }
                
                
                
                
                } 
                
            
            } 
            
       
    }
    

    
