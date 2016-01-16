
package Controlador;

import Modelo.Batalla;
import Modelo.*;
import Vista.VistaBatalla;
import java.awt.ComponentOrientation;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import javax.swing.JToggleButton;
import java.lang.System;
import java.lang.reflect.Array.*;
import java.util.Arrays;
import java.util.List;
// falta instanciar acciones 1 y acciones 2 
// ordenar funcionamiento de lista ataques y ataque
// la idea es en ataque guardar el ataque de una medaparte a otr , y luego y juntando estos en lista ataques


public class ControladorBatalla2 implements ActionListener {
    
    private VistaBatalla vb;
    private Batalla batalla;
    private ArrayList <ArrayList>  ataques=new <ArrayList> ArrayList();// lista que guardara todos los ataques de un turno
    private ArrayList<ArrayList> ataques2=new <ArrayList> ArrayList();;
    private ArrayList<JToggleButton> acciones1= new ArrayList<JToggleButton>();// guardara los botones del jugador 1
    private ArrayList<JToggleButton> acciones2=new ArrayList<JToggleButton>();// guardara botones del jugador 2 
    private Medaboot turno ;
    private JToggleButton seleccionador1=null;
    private JToggleButton seleecionador2=null;
    public ControladorBatalla2(Batalla b ,VistaBatalla vb){
        
       
        
        this.batalla=b;
        
        this.turno =this.batalla.getJugador1();
        this.vb=vb;
        this.vb.getJtBrazoIZ1().addActionListener(this);
        this.vb.getJtBrazoDE1().addActionListener(this);
        this.vb.getJtPiernaIZ1().addActionListener(this);
        this.vb.getJtPiernaDE1().addActionListener(this);
        this.vb.getJtCabeza1().addActionListener(this);
        this.vb.getJtBrazoIZ2().addActionListener(this);
        this.vb.getJtBrazoDE2().addActionListener(this);
        this.vb.getJtPiernaIZ2().addActionListener(this);
        this.vb.getJtPiernaDE2().addActionListener(this);
        this.vb.getJtCabeza2().addActionListener(this);
        
        this.acciones1.add(this.vb.getJtBrazoIZ1());
        this.acciones1.add(this.vb.getJtBrazoDE1());
        this.acciones1.add(this.vb.getJtPiernaIZ1());
        this.acciones1.add(this.vb.getJtPiernaDE1());
        this.acciones1.add(this.vb.getJtCabeza1());
        this.acciones2.add(this.vb.getJtBrazoIZ2());
        this.acciones2.add(this.vb.getJtBrazoDE2());
        this.acciones2.add(this.vb.getJtPiernaIZ2());
        this.acciones2.add(this.vb.getJtPiernaDE2());
        this.acciones2.add(this.vb.getJtCabeza2());
        this.vb.getBtConfirmarA().addActionListener(this);
        this.vb.getBtListo().isSelected();
        
        this.vb.getJpBrazoDE1().setMaximum(this.batalla.getJugador1().getBrazoDer().getSalud());
        this.vb.getJpBrazoIZ1().setMaximum(this.batalla.getJugador1().getBrazoIzq().getSalud());
        this.vb.getJpPiernaIZ1().setMaximum(this.batalla.getJugador1().getPiernaIzq().getSalud());
        this.vb.getJpPiernaDE1().setMaximum(this.batalla.getJugador1().getPiernaDer().getSalud());
        this.vb.getJpCabeza1().setMaximum(this.batalla.getJugador1().getCabeza().getSalud());
        this.vb.getJpBrazoDE2().setMaximum(this.batalla.getJugador2().getBrazoDer().getSalud());
        this.vb.getJpBrazoIZ2().setMaximum(this.batalla.getJugador2().getBrazoIzq().getSalud());
        this.vb.getJpPiernaIZ2().setMaximum(this.batalla.getJugador2().getPiernaIzq().getSalud());
        this.vb.getJpPiernaDE2().setMaximum(this.batalla.getJugador2().getPiernaDer().getSalud());
        this.vb.getJpCabeza2().setMaximum(this.batalla.getJugador2().getCabeza().getSalud());
        this.vb.getJpVida1().setMaximum(this.batalla.getJugador1().getSalud());
        
        this.vb.getJpBrazoIZ1().setMaximum(this.batalla.getJugador1().getBrazoIzq().getSalud());
        this.vb.getJpVida2().setMaximum(this.batalla.getJugador2().getSalud());
         this.vb.getJpBrazoDE1().setValue(this.batalla.getJugador1().getBrazoDer().getSalud()); 
        this.vb.getJpVida1().setValue(this.batalla.getJugador1().getSalud());
        this.vb.getJpVida2().setValue(this.batalla.getJugador2().getSalud());
        this.vb.getJpBrazoIZ1().setValue(this.batalla.getJugador1().getBrazoIzq().getSalud());
        this.vb.getJpPiernaIZ1().setValue(this.batalla.getJugador1().getPiernaIzq().getSalud());
        this.vb.getJpPiernaDE1().setValue(this.batalla.getJugador1().getPiernaDer().getSalud());
        this.vb.getJpCabeza1().setValue(this.batalla.getJugador1().getCabeza().getSalud());
        this.vb.getJpBrazoDE2().setValue(this.batalla.getJugador2().getBrazoDer().getSalud());
        this.vb.getJpBrazoIZ2().setValue(this.batalla.getJugador2().getBrazoIzq().getSalud());
        this.vb.getJpPiernaIZ2().setValue(this.batalla.getJugador2().getPiernaIzq().getSalud());
        this.vb.getJpPiernaDE2().setValue(this.batalla.getJugador2().getPiernaDer().getSalud());
        this.vb.getJpCabeza2().setValue(this.batalla.getJugador2().getCabeza().getSalud());
      
        
        
        
        this.vb.getTxtPhabilidad1().setText("10");
        this.vb.getTxtPhabilidad2().setText("10");
        this.vb.getTxtDatos1().setText("         MEDABOT:\n");
        this.vb.getTxtDatos1().append("Defensa:"+this.batalla.getJugador2().getDefensa()+"\n");
        this.vb.getTxtDatos1().append("%Esquive"+this.batalla.getJugador2().getEsquive()+"\n");
        this.vb.getTxtDatos1().append("SaludMax"+this.batalla.getJugador2().getSalud()+"\n");
        this.vb.getTxtDatos1().append("          MEDAPARTES:\n");
        this.vb.getTxtDatos1().append("BrazoIz:\n");
        this.vb.getTxtDatos1().append("BrazoDer:\n");
        this.vb.getTxtDatos1().append("PiernaIz:\n");
        this.vb.getTxtDatos1().append("PiernaDe:\n");
        this.vb.getTxtDatos1().append("Cabeza:\n");
        this.vb.getTxtDatos2().setText("         MEDABOT:\n");
        this.vb.getTxtDatos2().append("Defensa:"+this.batalla.getJugador2().getDefensa()+"\n");
        this.vb.getTxtDatos2().append("%Esquive"+this.batalla.getJugador2().getEsquive()+"\n");
        this.vb.getTxtDatos2().append("SaludMax"+this.batalla.getJugador2().getSalud()+"\n");
        this.vb.getTxtDatos2().append("          MEDAPARTES:\n");
        this.vb.getTxtDatos2().append("BrazoIz:\n");
        this.vb.getTxtDatos2().append("BrazoDer:\n");
        this.vb.getTxtDatos2().append("PiernaIz:\n");
        this.vb.getTxtDatos2().append("PiernaDe:\n");
        this.vb.getTxtDatos2().append("Cabeza:\n");
        this.vb.getTxAcciones().append("Jugaor1 reliazo la siguiente accion\n");
        this.vb.getTxAcciones().append("Jugaor1 reliazo la siguiente accion\n");
        this.vb.getTxAcciones().append("Jugaor1 reliazo la siguiente accion\n");
        botonDisabled(this.acciones2,null);
//        realizarBatalla();
          
    }
    public void agregarTexto(String mensaje){
        this.vb.getTxAcciones().append(mensaje);
    }
    public void setPH1(int coste){
       int phActual=Integer.parseInt(this.vb.getTxtPhabilidad1().getText());
       int phNuevo=phActual-coste;
       this.vb.getTxtPhabilidad1().setText(Integer.toString(phNuevo));
        
    }
    public void setPH2(int coste){
       int phActual=Integer.parseInt(this.vb.getTxtPhabilidad2().getText());
       int phNuevo=phActual-coste;
       this.vb.getTxtPhabilidad2().setText(Integer.toString(phNuevo));
        
    }
    
    
//    public void realizarBatalla(){
//       // while(this.batalla.getJugador1().getSalud()>0 && this.batalla.getJugador2().getSalud()>0){
//            for(Medaboot jugador:this.batalla.getPersonajes()){
//               if(jugador.equals(this.batalla.getJugador1())){
//                   botonDisabled(acciones2, null);
//                }
//               else{
//                   botonDisabled(acciones2, null);
//               }
//            }
//        //}
//        
//        System.out.println("coenzar ");
//    }
    
    

    @Override
    public void actionPerformed(ActionEvent ae) {
      if (ae.getSource().equals(this.vb.getBtConfirmarA())){
            int parte = this.acciones1.indexOf(this.seleccionador1);
            int parte2= this.acciones2.indexOf(this.seleecionador2);
        switch(parte){ // teniendo el numero alamacenado en parte , se tomaran la medaparte a la que corresponde tal numero 
                     // y se guardara en una lista , definida en atributo 
            case 0: this.ataques.add(new ArrayList(Arrays.asList(this.batalla.getJugador1().getBrazoIzq(),null)));
            
                  break;
            case 1: this.ataques.add(new ArrayList(Arrays.asList(this.batalla.getJugador1().getBrazoDer(),null)) );
                  break;
            case 2: this.ataques.add(new ArrayList(Arrays.asList(this.batalla.getJugador1().getPiernaIzq(),null)) );
                  break;
            case 3: this.ataques.add(new ArrayList(Arrays.asList(this.batalla.getJugador1().getPiernaDer(),null)) );
                  break;   
            case 4:this.ataques.add(new ArrayList(Arrays.asList(this.batalla.getJugador1().getCabeza(),null)) );
                  break;   
            default: System.out.println("error");
                 }

            
            
            
        switch(parte2){ // teniendo el numero alamacenado en parte , se tomaran la medaparte a la que corresponde tal numero 
                     // y se guardara en una lista , definida en atributo 
            case 0: this.ataques.get(this.ataques.size()-1).set(1, this.batalla.getJugador2().getBrazoIzq());
            
                  break;
            case 1:this.ataques.get(this.ataques.size()-1).set(1, this.batalla.getJugador2().getBrazoDer());
                  break;
            case 2: this.ataques.get(this.ataques.size()-1).set(1, this.batalla.getJugador2().getPiernaIzq());
                  break;
            case 3: this.ataques.get(this.ataques.size()-1).set(1, this.batalla.getJugador2().getPiernaDer());
                  break;   
            case 4:this.ataques.get(this.ataques.size()-1).set(1, this.batalla.getJugador2().getCabeza());
                  break;   
            default: System.out.println("error");
            
            
            
            
            
              }
            System.out.println(this.ataques);
            this.seleccionador1.setSelected(false);
            this.seleecionador2.setSelected(false);
            botonEnabled(this.acciones1);
            botonDisabled(this.acciones2,null);
        
        }
        
     if (!ae.getSource().equals(this.vb.getBtConfirmarA())){
        
        if (this.turno.equals(this.batalla.getJugador1())){
         
           
        for (JToggleButton boton :this.acciones1){
            if (boton.isSelected()){
                this.seleccionador1=boton;
                botonDisabled(this.acciones1,boton);
                botonEnabled(this.acciones2);
                
                 for(JToggleButton boton2 :this.acciones2){
                      if (boton2.isSelected()){
                         this.seleecionador2=boton2;
                         botonDisabled(this.acciones2,boton2);
                            break;
               
                             }
              
              }
            break;
            }
            
            else if (!boton.isSelected()) { 
            botonDisabled(this.acciones2,null);
            botonEnabled(this.acciones1);}
            
            
        }
        
        }
        
     }
   
       
    }
    
    //metodos que deshablita botones pertenicientes a un array compuesto por botones ( se usara el array de botones definidos en atributos)
    //deshabilita todos los bototnes del array , menos el seleccionado
    public void botonEnabled( ArrayList<JToggleButton> botones){
        for (JToggleButton boton : botones){
                    boton.setEnabled(true);
                }
     }
    
    // metodo que re habilita los botones del array
    public void botonDisabled (ArrayList<JToggleButton> botones,JToggleButton seleccionado){
        for (JToggleButton boton : botones){
            if (!boton.equals(seleccionado)){
                 boton.setEnabled(false);
                }
    
            }
    
    }

     
   
}
        
