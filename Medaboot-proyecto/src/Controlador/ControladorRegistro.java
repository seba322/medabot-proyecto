
package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Vista.VistaRegistro1;
import Vista.VistaRegistro2;
import Modelo.Usuario;
import java.awt.BorderLayout;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import Vista.VistaMenu;
import java.io.IOException;
import java.util.ArrayList;



public class ControladorRegistro implements ActionListener  {
    
    private VistaRegistro1 vt1;
    private VistaRegistro2 vt2;
    private Usuario user;
    private VistaMenu vm;
    private String modalidad;
    
    public ControladorRegistro( VistaRegistro1 vt1, VistaRegistro2 vt2, String modalidad){
        this.modalidad=modalidad;
        this.user= new Usuario();
        this.vt1=vt1;
        this.vt1.getBtEntrar().addActionListener(this);
        this.vt2=vt2;
        this.vt1.getBtRegistrarse().addActionListener(this);
        this.vt2.getBtAtras().addActionListener(this);
        this.vt2.getBtCrear().addActionListener(this);
      
    } 

    public VistaRegistro1 getVt1() {
        return vt1;
    }
    
    
   
    
    
    
    
    

    @Override
        public void actionPerformed(ActionEvent e){
      
      if(e.getSource().equals(this.vt1.getBtRegistrarse())){
          
          this.vt2.setSize(535, 563);
          this.vt1.getContentPane().removeAll();
          this.vt1.getContentPane().add(this.vt2);
          this.vt1.getContentPane().revalidate();
          this.vt2.getTxtContra2().setText("");
          this.vt2.getTxtContra3().setText("");
          this.vt2.getTxtNombre().setText("");
          this.vt2.getTxtUsuario2().setText("");
          this.vt1.getContentPane().repaint();
          
        }
      else if(e.getSource().equals(this.vt1.getBtEntrar())){
          String nombreUsuario,contraseña;
          nombreUsuario= this.vt1.getTxtUsuario().getText();
          contraseña=this.vt1.getTxtContraseña().getText();
          System.out.println("kimbo");
          try {
              if((this.user.validarUsuario(nombreUsuario, contraseña))){
                  this.vt1.dispose();
                  
                  if(this.modalidad.equals("Ingreso")){
                        this.vm= new VistaMenu();
                        ControladorMenu cm= new ControladorMenu(this.vm,nombreUsuario,contraseña);
                    }
                 
                  }
              
              else{
                  this.vt1.getIngError().setVisible(true);
                }    
                  
                  
                  
                       
                  
              
              
               
                
                } catch (SQLException ex) {
                  Logger.getLogger(ControladorRegistro.class.getName()).log(Level.SEVERE, null, ex);
              }
          
        }
      else if(e.getSource().equals(this.vt2.getBtAtras())){
          
          
          this.vt1.getContentPane().removeAll();
          this.vt1.getContentPane().add(this.vt1.getjPanel1(),BorderLayout.CENTER);
          this.vt1.getContentPane().revalidate();
          this.vt1.getTxtUsuario().setText("");
          this.vt1.getTxtContraseña().setText("");
          this.vt1.getContentPane().repaint();
      }
      else if(e.getSource().equals(this.vt2.getBtCrear())){
          
          
              String nombreUsuario,contraseña,contraseñaC,nombreMedabot;
              nombreUsuario=this.vt2.getTxtUsuario2().getText();
              nombreMedabot=this.vt2.getTxtNombre().getText();
              contraseña=this.vt2.getTxtContra2().getText();
              contraseñaC=this.vt2.getTxtContra3().getText();
              // HACER RESTRICCION
              if(!(contraseñaC.equals(contraseña))){
                  this.vt2.getLbError().setVisible(true);
                  
              } 
              if((this.user.validarUsuario(nombreUsuario, contraseña,nombreMedabot)==true)){
                 
                
                  try {
                      this.user.crearUsuario(nombreUsuario, contraseña,nombreMedabot);
                  } catch (SQLException ex) {
                      Logger.getLogger(ControladorRegistro.class.getName()).log(Level.SEVERE, null, ex);
                  }
                  
                  
                  this.vt1.getContentPane().removeAll();
                  this.vt1.getContentPane().add(this.vt1.getjPanel1(),BorderLayout.CENTER);
                  this.vt1.getContentPane().revalidate();
                  this.vt1.getTxtUsuario().setText("");
                  this.vt1.getTxtContraseña().setText("");
                  this.vt1.getContentPane().repaint();
                  
                  try {
                      Usuario userP=new Usuario(nombreUsuario);
                      String bienvenida="Bienvenido a Medaboot"+nombreUsuario;
                      String registro="Te has registrado el "+userP.mostrarHora();
                      userP.escribirAcciones(bienvenida);
                      userP.escribirAcciones(registro);
                      ArrayList<String> usuarios=this.user.getNombresUsers();
                      for(String nombre:usuarios){
                          if(nombre.equals(nombreUsuario)){
                              continue;
                          }
                          Usuario usuario=new Usuario(nombre);
                          String accion="Se a registrado un nuevo usuario llamado "+nombreUsuario+" el dia "+usuario.mostrarHora()+'\n';
                          usuario.escribirAcciones(accion);
                      }
                  } catch (SQLException ex) {
                      Logger.getLogger(ControladorRegistro.class.getName()).log(Level.SEVERE, null, ex);
                  } catch (IOException ex) {
                      Logger.getLogger(ControladorRegistro.class.getName()).log(Level.SEVERE, null, ex);
                  }
                  
              }
              else{
                  this.vt2.getLbError2().setVisible(true);
              }
          
        }
    }
        
        
}
   
   
    

