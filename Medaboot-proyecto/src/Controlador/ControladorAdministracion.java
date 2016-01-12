package Controlador;

import Modelo.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Vista.VistaAdmin;
import Modelo.Usuario;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class ControladorAdministracion implements ActionListener,ItemListener {
    VistaAdmin vta;
    Usuario user;
    
    
    public ControladorAdministracion(VistaAdmin vta,Usuario user){
        this.vta=vta;
        this.user=user;
        for(int i=0;i<this.user.getPersonajes().length;i++){
            this.vta.getJcPersonaje().addItem(this.user.getPersonajes()[i].getNombre());
          
        }
       // this.vta.getJcBrazoDE().addItem(this.user.getPersonajes().getNombre());
        
        
        this.vta.getJcBrazoDE().addItemListener(this);
        this.vta.getJcBrazoIZ().addItemListener(this);
        this.vta.getJcPiernaIZ().addItemListener(this);
        this.vta.getJcPiernaDE().addItemListener(this);
        this.vta.getJcCabeza().addItemListener(this);
        this.vta.getJcMedalla().addItemListener(this);
        this.vta.getJcPersonaje().addItemListener(this);
        this.vta.getBtSeleccionar().addActionListener(this);
        this.vta.getBtGuardar().addActionListener(this);
    }
    
    
    

    @Override
    public void actionPerformed(ActionEvent ae) {

         if (ae.getSource().equals(this.vta.getBtSeleccionar())) {
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
         }
         else if (comprobar.equals(this.user.getPersonajes()[1].getNombre())){
             this.vta.getJcPiernaDE().addItem(this.user.getPersonajes()[1].getPiernaDer().getNombre());
            this.vta.getJcPiernaIZ().addItem(this.user.getPersonajes()[1].getPiernaIzq().getNombre());
            this.vta.getJcBrazoIZ().addItem(this.user.getPersonajes()[1].getBrazoIzq().getNombre());  
            this.vta.getJcBrazoDE().addItem(this.user.getPersonajes()[1].getBrazoDer().getNombre());
            this.vta.getJcCabeza().addItem(this.user.getPersonajes()[1].getCabeza().getNombre());
            this.vta.getJcMedalla().addItem(this.user.getPersonajes()[1].getMedalla().getNombre());
        
           
        }    
        
         else if (comprobar.equals(this.user.getPersonajes()[2].getNombre())){
             this.vta.getJcPiernaDE().addItem(this.user.getPersonajes()[2].getPiernaDer().getNombre());
            this.vta.getJcPiernaIZ().addItem(this.user.getPersonajes()[2].getPiernaIzq().getNombre());
            this.vta.getJcBrazoIZ().addItem(this.user.getPersonajes()[2].getBrazoIzq().getNombre());  
            this.vta.getJcBrazoDE().addItem(this.user.getPersonajes()[2].getBrazoDer().getNombre());
            this.vta.getJcCabeza().addItem(this.user.getPersonajes()[2].getCabeza().getNombre());
            this.vta.getJcMedalla().addItem(this.user.getPersonajes()[2].getMedalla().getNombre());
        
           
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
                    this.user.setArrays(index,this.user.getPersonajes()[indexPersonaje].getBrazoDer().getNombre());
                } catch (SQLException ex) {
                    Logger.getLogger(ControladorAdministracion.class.getName()).log(Level.SEVERE, null, ex);
                }
                 Medaparte brazoDer = this.user.getPersonajes()[indexPersonaje].getBrazoDer();
                 try {
                     this.user.getPersonajes()[indexPersonaje].setMedaparte(brazoDer,cambio,"BRAZODER");
                 } catch (SQLException ex) {
                     Logger.getLogger(ControladorAdministracion.class.getName()).log(Level.SEVERE, null, ex);
                 }
                }
             if (this.vta.getJcBrazoIZ().getSelectedIndex() != 0){
                 System.out.println("Prueba2");
                 String cambio =(String) this.vta.getJcBrazoIZ().getSelectedItem();
                 int index = this.user.getMedapartes().indexOf(cambio);
                try {
                    this.user.setArrays(index,this.user.getPersonajes()[indexPersonaje].getBrazoIzq().getNombre() );
                } catch (SQLException ex) {
                    Logger.getLogger(ControladorAdministracion.class.getName()).log(Level.SEVERE, null, ex);
                }
                Medaparte brazoIzq = this.user.getPersonajes()[indexPersonaje].getBrazoIzq();
                 try {
                     this.user.getPersonajes()[indexPersonaje].setMedaparte(brazoIzq,cambio,"BRAZOIZQ");
                 } catch (SQLException ex) {
                     Logger.getLogger(ControladorAdministracion.class.getName()).log(Level.SEVERE, null, ex);
                 }
                 
                 
             }
             if (this.vta.getJcPiernaDE().getSelectedIndex() != 0){
                 System.out.println("Prueba3");
                 String cambio =(String) this.vta.getJcPiernaDE().getSelectedItem();
                 int index = this.user.getMedapartes().indexOf(cambio);
                try {
                    this.user.setArrays(index,this.user.getPersonajes()[indexPersonaje].getPiernaDer().getNombre() );
                } catch (SQLException ex) {
                    Logger.getLogger(ControladorAdministracion.class.getName()).log(Level.SEVERE, null, ex);
                }
                  Medaparte piernaDer = this.user.getPersonajes()[indexPersonaje].getPiernaDer();
                 try {
                     this.user.getPersonajes()[indexPersonaje].setMedaparte(piernaDer,cambio,"PIERNADER");
                 } catch (SQLException ex) {
                     Logger.getLogger(ControladorAdministracion.class.getName()).log(Level.SEVERE, null, ex);
             }
             }
             if (this.vta.getJcPiernaIZ().getSelectedIndex() != 0){
                 System.out.println("Prueba4");
                 String cambio =(String) this.vta.getJcPiernaIZ().getSelectedItem();
                 int index = this.user.getMedapartes().indexOf(cambio);
                try {
                    this.user.setArrays(index,this.user.getPersonajes()[indexPersonaje].getPiernaIzq().getNombre() );
                } catch (SQLException ex) {
                    Logger.getLogger(ControladorAdministracion.class.getName()).log(Level.SEVERE, null, ex);
                }
                  Medaparte piernaIzq = this.user.getPersonajes()[indexPersonaje].getPiernaIzq();
                 try {
                     this.user.getPersonajes()[indexPersonaje].setMedaparte(piernaIzq,cambio,"PIERNAIZQ");
                 } catch (SQLException ex) {
                     Logger.getLogger(ControladorAdministracion.class.getName()).log(Level.SEVERE, null, ex);
             }
             }    
             if (this.vta.getJcCabeza().getSelectedIndex() != 0){
                 System.out.println("Prueba5");
                 String cambio =(String) this.vta.getJcCabeza().getSelectedItem();
                 int index = this.user.getMedapartes().indexOf(cambio);
                try {
                    this.user.setArrays(index,this.user.getPersonajes()[indexPersonaje].getCabeza().getNombre() );
                } catch (SQLException ex) {
                    Logger.getLogger(ControladorAdministracion.class.getName()).log(Level.SEVERE, null, ex);
                }
                  Medaparte cabeza = this.user.getPersonajes()[indexPersonaje].getCabeza();
                 try {
                     this.user.getPersonajes()[indexPersonaje].setMedaparte(cabeza,cambio,"CABEZA");
                 } catch (SQLException ex) {
                     Logger.getLogger(ControladorAdministracion.class.getName()).log(Level.SEVERE, null, ex);
             }
             }     
             if (this.vta.getJcMedalla().getSelectedIndex() != 0){
                 try {
                     String cambio =(String) this.vta.getJcMedalla().getSelectedItem();
                     int index = this.user.getMedallas().indexOf(cambio);
                     this.user.setArrays(index,this.user.getPersonajes()[indexPersonaje].getMedalla().getNombre() );
                     Medalla parte = this.user.getPersonajes()[indexPersonaje].getMedalla();
                     this.user.getPersonajes()[indexPersonaje].setMedalla(parte,cambio);
                 } catch (SQLException ex) {
                     Logger.getLogger(ControladorAdministracion.class.getName()).log(Level.SEVERE, null, ex);
                 }
         }
         }
    }

    @Override
    public void itemStateChanged(ItemEvent ie) {
       /* if (ie.getSource().equals(this.vta.getJcPersonaje())) {
            String comprobar= (String) this.vta.getJcPersonaje().getSelectedItem();
            
         if (comprobar.equals(this.user.getPersonajes()[0].getNombre()))    {
             
               this.vta.getJcPiernaDE().addItem("kimbo1");
        }    
         
         else if (comprobar.equals(this.user.getPersonajes()[1].getNombre())){
        
            this.vta.getJcPiernaDE().addItem("kimbo2");
        }    
        
         else if (comprobar.equals(this.user.getPersonajes()[2].getNombre())){
        
             this.vta.getJcPiernaDE().addItem("kimbo3");
        }    
        
       }*/
        
        }

    


}
