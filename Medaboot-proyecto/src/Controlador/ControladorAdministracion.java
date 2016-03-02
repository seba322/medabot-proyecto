package Controlador;

import Modelo.*;
import Vista.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Vista.VistaAdmin;
import Modelo.Usuario;
import java.awt.BorderLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
//hola



public class ControladorAdministracion implements ActionListener {
    private VistaAdmin vta;
    private Usuario user;
    private VistaMenu vm;
    private Medaboot numPersonaje;
    private String modalidad;
    
    
    public ControladorAdministracion(VistaAdmin vta,Usuario user,VistaMenu vm,String modalidad){
        this.vta=vta;
        this.vm=vm;
        this.user=user;
        this.modalidad=modalidad;
        for(int i=0;i<this.user.getPersonajes().length;i++){
            this.vta.getJcPersonaje().addItem(this.user.getPersonajes()[i].getNombre());
          
        }
       // this.vta.getJcBrazoDE().addItem(this.user.getPersonajes().getNombre());
        
        
        
        this.vta.getBtSeleccionar().addActionListener(this);
        this.vta.getBtGuardar().addActionListener(this);
        this.vta.getBtAtras().addActionListener(this);
        this.vta.getjBEstadisticas1().addActionListener(this);
        this.vta.getjBEstadisticas2().addActionListener(this);
        this.vta.getjBEstadisticas3().addActionListener(this);
        this.vta.getjBEstadisticas4().addActionListener(this);
        this.vta.getjBEstadisticas5().addActionListener(this);
        this.vta.getjBEstadisticas6().addActionListener(this);
    }
    
    
    

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        
//          if(ae.getSource().equals(this.vta.getjBEstadisticas1())){
//             this.vta.getjTextAdmin2().setText(this.numPersonaje.getEstadisticas());
          if(ae.getSource().equals(this.vta.getjBEstadisticas2())){
             this.vta.getjTextAdmin2().setText(this.numPersonaje.getBrazoDer().getEstadisticas());
          }
         if(ae.getSource().equals(this.vta.getjBEstadisticas3())){
             this.vta.getjTextAdmin2().setText(this.numPersonaje.getBrazoIzq().getEstadisticas());
         }
          if(ae.getSource().equals(this.vta.getjBEstadisticas4())){
             this.vta.getjTextAdmin2().setText(this.numPersonaje.getCabeza().getEstadisticas()); 
          }
              if(ae.getSource().equals(this.vta.getjBEstadisticas5())){
             this.vta.getjTextAdmin2().setText(this.numPersonaje.getPiernaIzq().getEstadisticas());  
              }
            if(ae.getSource().equals(this.vta.getjBEstadisticas6())){
             this.vta.getjTextAdmin2().setText(this.numPersonaje.getPiernaDer().getEstadisticas());  
              }   
             
//        if(ae.getSource().equals(this.vta.getjBEstadisticas1())){
//             this.vta.getjTextAdmin2().setText(this.numPersonaje.getEstadisticas());
          if(ae.getSource().equals(this.vta.getBtAtras())){
               System.out.println("Lista NOO Modificadaa "+this.user.getPersonajes()[0].getNombre());
               System.out.println("Lista NOO Modificadaa "+this.user.getPersonajes()[1].getNombre());
               System.out.println("Lista NOO Modificadaa "+this.user.getPersonajes()[2].getNombre());

            if(modalidad.equals("menu")){
                this.vm.setExtendedState(JFrame.NORMAL);   
                this.vm.getContentPane().removeAll();
                this.vm.getContentPane().add(this.vm.getjPanel1(),BorderLayout.CENTER);
                this.vm.getContentPane().revalidate();
                this.vm.getContentPane().repaint();
                
            }
            
         
          }
          

         if (ae.getSource().equals(this.vta.getBtSeleccionar())) {
             this.vta.getBtGuardar().setEnabled(true);
         this.vta.getJcPiernaDE().removeAllItems();
         this.vta.getJcPiernaIZ().removeAllItems();
         this.vta.getJcBrazoIZ().removeAllItems();
         this.vta.getJcBrazoDE().removeAllItems();
         this.vta.getJcCabeza().removeAllItems();
         this.vta.getJcMedalla().removeAllItems();
            String comprobar= (String) this.vta.getJcPersonaje().getSelectedItem();
            
         if (comprobar.equals(this.user.getPersonajes()[0].getNombre()))    {
            this.vta.getJcPiernaDE().addItem(this.user.getPersonajes()[0].getPiernaDer().getNombre());
            this.vta.getJcPiernaIZ().addItem(this.user.getPersonajes()[0].getPiernaIzq().getNombre());
            this.vta.getJcBrazoIZ().addItem(this.user.getPersonajes()[0].getBrazoIzq().getNombre());  
            this.vta.getJcBrazoDE().addItem(this.user.getPersonajes()[0].getBrazoDer().getNombre());
            this.vta.getJcCabeza().addItem(this.user.getPersonajes()[0].getCabeza().getNombre());
            this.vta.getJcMedalla().addItem(this.user.getPersonajes()[0].getMedalla().getNombre());
            this.numPersonaje  = this.user.getPersonajes()[0];
            this.vta.getjTextAdmin1().setText(this.numPersonaje.getEstadisticas());
         }
         else if (comprobar.equals(this.user.getPersonajes()[1].getNombre())){
             this.vta.getJcPiernaDE().addItem(this.user.getPersonajes()[1].getPiernaDer().getNombre());
            this.vta.getJcPiernaIZ().addItem(this.user.getPersonajes()[1].getPiernaIzq().getNombre());
            this.vta.getJcBrazoIZ().addItem(this.user.getPersonajes()[1].getBrazoIzq().getNombre());  
            this.vta.getJcBrazoDE().addItem(this.user.getPersonajes()[1].getBrazoDer().getNombre());
            this.vta.getJcCabeza().addItem(this.user.getPersonajes()[1].getCabeza().getNombre());
            this.vta.getJcMedalla().addItem(this.user.getPersonajes()[1].getMedalla().getNombre());
             this.numPersonaje  = this.user.getPersonajes()[1];
             this.vta.getjTextAdmin1().setText(this.numPersonaje.getEstadisticas());
           
        }    
        
         else if (comprobar.equals(this.user.getPersonajes()[2].getNombre())){
             this.vta.getJcPiernaDE().addItem(this.user.getPersonajes()[2].getPiernaDer().getNombre());
            this.vta.getJcPiernaIZ().addItem(this.user.getPersonajes()[2].getPiernaIzq().getNombre());
            this.vta.getJcBrazoIZ().addItem(this.user.getPersonajes()[2].getBrazoIzq().getNombre());  
            this.vta.getJcBrazoDE().addItem(this.user.getPersonajes()[2].getBrazoDer().getNombre());
            this.vta.getJcCabeza().addItem(this.user.getPersonajes()[2].getCabeza().getNombre());
            this.vta.getJcMedalla().addItem(this.user.getPersonajes()[2].getMedalla().getNombre());
            this.numPersonaje  = this.user.getPersonajes()[3];
            this.vta.getjTextAdmin1().setText(this.numPersonaje.getEstadisticas());
        
           
        }   
         for (int i=0;i<this.user.getMedapartes().size();i++){
             String parte  =(String) this.user.getMedapartes().get(i);
             if (parte.endsWith("(PD)")){
                this.vta.getJcPiernaDE().addItem((String) this.user.getMedapartes().get(i));
            }
         else if (parte.endsWith("(PI)")){
                this.vta.getJcPiernaIZ().addItem((String) this.user.getMedapartes().get(i));
             }
         else if (parte.endsWith("(BD)")){
                this.vta.getJcBrazoDE().addItem((String) this.user.getMedapartes().get(i));
             }
         else if (parte.endsWith("(BI)")){
                this.vta.getJcBrazoIZ().addItem((String) this.user.getMedapartes().get(i));
             }
         else if (parte.endsWith("(C)")){
                this.vta.getJcCabeza().addItem((String) this.user.getMedapartes().get(i));
             }
         
         }
         
          for (int i=0;i<this.user.getMedallas().size();i++){
              this.vta.getJcMedalla().addItem((String)this.user.getMedallas().get(i));
              
          }
       }
         if (ae.getSource().equals(this.vta.getBtGuardar())){
             
             System.out.println("Prueba");
            int indexPersonaje=this.vta.getJcPersonaje().getSelectedIndex();
             if (this.vta.getJcBrazoDE().getSelectedIndex() != 0){
                 System.out.println("Prueba1");
                 System.out.println("--"+this.vta.getJcBrazoDE().getSelectedItem());
                 String cambio = this.vta.getJcBrazoDE().getSelectedItem().toString();
                 int index = this.user.getMedapartes().indexOf(cambio);
                 System.out.println(cambio);
                try {
                    this.user.setArrays(index,this.user.getPersonajes()[indexPersonaje].getBrazoDer().getNombre(),"parte");
                } catch (SQLException ex) {
                    Logger.getLogger(ControladorAdministracion.class.getName()).log(Level.SEVERE, null, ex);
                }
                 
                 try {
                     this.user.getPersonajes()[indexPersonaje].setMedaparte(cambio,"BRAZODER");
                 } catch (SQLException ex) {
                     Logger.getLogger(ControladorAdministracion.class.getName()).log(Level.SEVERE, null, ex);
                 }
                }
             if (this.vta.getJcBrazoIZ().getSelectedIndex() != 0){
                 System.out.println("Prueba2");
                 String cambio =(String) this.vta.getJcBrazoIZ().getSelectedItem();
                 int index = this.user.getMedapartes().indexOf(cambio);
                try {
                    this.user.setArrays(index,this.user.getPersonajes()[indexPersonaje].getBrazoIzq().getNombre(),"parte" );
                } catch (SQLException ex) {
                    Logger.getLogger(ControladorAdministracion.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                 try {
                     this.user.getPersonajes()[indexPersonaje].setMedaparte(cambio,"BRAZOIZQ");
                 } catch (SQLException ex) {
                     Logger.getLogger(ControladorAdministracion.class.getName()).log(Level.SEVERE, null, ex);
                 }
                 
                 
             }
             if (this.vta.getJcPiernaDE().getSelectedIndex() != 0){
                 System.out.println("Prueba3");
                 String cambio =(String) this.vta.getJcPiernaDE().getSelectedItem();
                 int index = this.user.getMedapartes().indexOf(cambio);
                try {
                    this.user.setArrays(index,this.user.getPersonajes()[indexPersonaje].getPiernaDer().getNombre(),"parte");
                } catch (SQLException ex) {
                    Logger.getLogger(ControladorAdministracion.class.getName()).log(Level.SEVERE, null, ex);
                }
                  
                 try {
                     this.user.getPersonajes()[indexPersonaje].setMedaparte(cambio,"PIERNADER");
                 } catch (SQLException ex) {
                     Logger.getLogger(ControladorAdministracion.class.getName()).log(Level.SEVERE, null, ex);
             }
             }
             if (this.vta.getJcPiernaIZ().getSelectedIndex() != 0){
                 System.out.println("Prueba4");
                 String cambio =(String) this.vta.getJcPiernaIZ().getSelectedItem();
                 int index = this.user.getMedapartes().indexOf(cambio);
                try {
                    this.user.setArrays(index,this.user.getPersonajes()[indexPersonaje].getPiernaIzq().getNombre(),"parte" );
                } catch (SQLException ex) {
                    Logger.getLogger(ControladorAdministracion.class.getName()).log(Level.SEVERE, null, ex);
                }
                  
                 try {
                     this.user.getPersonajes()[indexPersonaje].setMedaparte(cambio,"PIERNAIZQ");
                 } catch (SQLException ex) {
                     Logger.getLogger(ControladorAdministracion.class.getName()).log(Level.SEVERE, null, ex);
             }
             }    
             if (this.vta.getJcCabeza().getSelectedIndex() != 0){
                 System.out.println("Prueba5");
                 String cambio =(String) this.vta.getJcCabeza().getSelectedItem();
                 int index = this.user.getMedapartes().indexOf(cambio);
                try {
                    this.user.setArrays(index,this.user.getPersonajes()[indexPersonaje].getCabeza().getNombre(),"parte" );
                } catch (SQLException ex) {
                    Logger.getLogger(ControladorAdministracion.class.getName()).log(Level.SEVERE, null, ex);
                }
                  
                 try {
                     this.user.getPersonajes()[indexPersonaje].setMedaparte(cambio,"CABEZA");
                 } catch (SQLException ex) {
                     Logger.getLogger(ControladorAdministracion.class.getName()).log(Level.SEVERE, null, ex);
             }
             }     
             if (this.vta.getJcMedalla().getSelectedIndex() != 0){
                 try {
                     String cambio =(String) this.vta.getJcMedalla().getSelectedItem();
                     int index = this.user.getMedallas().indexOf(cambio);
                     this.user.setArrays(index,this.user.getPersonajes()[indexPersonaje].getMedalla().getNombre(),"MEDALLA" );
                     
                     this.user.getPersonajes()[indexPersonaje].setMedalla(cambio);
                 } catch (SQLException ex) {
                     Logger.getLogger(ControladorAdministracion.class.getName()).log(Level.SEVERE, null, ex);
                 }
         }
             String comprobar= (String) this.vta.getJcPersonaje().getSelectedItem(); 
             for(int i=0;i<this.user.getPersonajes().length;i++){
            
               if (comprobar.equals(this.user.getPersonajes()[i].getNombre())) {
                   Medaboot[] clon =this.user.getPersonajes().clone();
                   this.user.getPersonajes()[0]=clon[i];
                   this.user.getPersonajes()[i]=clon[0];
                   System.out.println("Lista Modificadaa "+ this.user.getPersonajes()[0].getNombre());
                    System.out.println("Lista Modificadaa "+ this.user.getPersonajes()[1].getNombre());
                     System.out.println("Lista Modificadaa "+ this.user.getPersonajes()[2].getNombre());
                   break;
                   
                   
               }  
            }
             String registroAcciones=" "+this.user.getNombreUsuario()+" a modificado su personaje  el dia "+user.mostrarHora();
             this.vm.getTxtRegistroAcciones().append("\n"+registroAcciones);
              try {
                  this.user.escribirAcciones(registroAcciones);
              } catch (IOException ex) {
                  Logger.getLogger(ControladorAdministracion.class.getName()).log(Level.SEVERE, null, ex);
              }
         }
         
         
    }

    
   
        
        }

    



