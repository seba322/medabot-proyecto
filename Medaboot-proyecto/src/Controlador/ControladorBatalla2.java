
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
// falta instanciar acciones 1 y acciones 2 
// ordenar funcionamiento de lista ataques y ataque
// la idea es en ataque guardar el ataque de una medaparte a otr , y luego y juntando estos en lista ataques


public class ControladorBatalla2 implements ActionListener, FocusListener,ItemListener {
    private VistaBatalla vb;
    private Batalla batalla;
    private ArrayList ataques;// lista que guardara todos los ataques de un turno
    private ArrayList ataque;// lista que guardara ataque de una medaparte a otra
    private JToggleButton[] acciones1= new JToggleButton[5];// guardara los botones del jugador 1
    private JToggleButton[] acciones2= new JToggleButton[5];// guardara botones del jugador 2 
    
    public ControladorBatalla2(Batalla b ,VistaBatalla vb){
        
        this.batalla=b;
        this.vb=vb;
        this.acciones1[0]=this.vb.getJtBrazoIZ1();
        this.acciones1[1]=this.vb.getJtBrazoDE1();
        this.acciones1[2]=this.vb.getJtPiernaIZ1();
        this.acciones1[3]=this.vb.getJtPiernaDE1();
        this.acciones1[4]=this.vb.getJtCabeza1();
        this.acciones2[0]=this.vb.getJtBrazoIZ2();
        this.acciones2[1]=this.vb.getJtBrazoDE2();
        this.acciones2[2]=this.vb.getJtPiernaIZ2();
        this.acciones2[3]=this.vb.getJtPiernaDE2();
        this.acciones2[4]=this.vb.getJtCabeza2();
        this.vb.getBtConfirmarA().addActionListener(this);
        this.vb.getBtListo().isSelected();
        this.vb.getJtBrazoIZ1().addActionListener(this);
       /* this.vb.getJpVida1().setValue(this.batalla.getJugador1().getSalud());
        this.vb.getJpVida2().setValue(this.batalla.getJugador2().getSalud());
        this.vb.getJpVida1().setMaximum(this.batalla.getJugador1().getSalud());
        this.vb.getJpBrazoDE1().setValue(this.batalla.getJugador1().getBrazoDer().getSalud());
        
        this.vb.getJpBrazoIZ1().setValue(this.batalla.getJugador1().getBrazoIzq().getSalud());
        this.vb.getJpPiernaIZ1().setValue(this.batalla.getJugador1().getPiernaIzq().getSalud());
        this.vb.getJpPiernaDE1().setValue(this.batalla.getJugador1().getPiernaDer().getSalud());
        this.vb.getJpCabeza1().setValue(this.batalla.getJugador1().getCabeza().getSalud());
        this.vb.getJpBrazoDE2().setValue(this.batalla.getJugador2().getBrazoDer().getSalud());
        this.vb.getJpBrazoIZ2().setValue(this.batalla.getJugador2().getBrazoIzq().getSalud());
        this.vb.getJpPiernaIZ2().setValue(this.batalla.getJugador2().getPiernaIzq().getSalud());
        this.vb.getJpPiernaDE2().setValue(this.batalla.getJugador2().getPiernaDer().getSalud());
        this.vb.getJpCabeza2().setValue(this.batalla.getJugador2().getCabeza().getSalud());
        this.vb.getJpVida2().setMaximum(this.batalla.getJugador2().getSalud());
        this.vb.getJpBrazoDE1().setMaximum(this.batalla.getJugador1().getBrazoDer().getSalud());
        this.vb.getJpBrazoIZ1().setMaximum(this.batalla.getJugador1().getBrazoIzq().getSalud());
        this.vb.getJpPiernaIZ1().setMaximum(this.batalla.getJugador1().getPiernaIzq().getSalud());
        this.vb.getJpPiernaDE1().setMaximum(this.batalla.getJugador1().getPiernaDer().getSalud());
        this.vb.getJpCabeza1().setMaximum(this.batalla.getJugador1().getCabeza().getSalud());
        this.vb.getJpBrazoDE2().setMaximum(this.batalla.getJugador2().getBrazoDer().getSalud());
        this.vb.getJpBrazoIZ2().setMaximum(this.batalla.getJugador2().getBrazoIzq().getSalud());
        this.vb.getJpPiernaIZ2().setMaximum(this.batalla.getJugador2().getPiernaIzq().getSalud());
        this.vb.getJpPiernaDE2().setMaximum(this.batalla.getJugador2().getPiernaDer().getSalud());
        this.vb.getJpCabeza2().setMaximum(this.batalla.getJugador2().getCabeza().getSalud());*/
        
        
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
        
        realizarBatalla();
    
    }
    
    public void realizarBatalla(){
        while(this.batalla.getJugador1().getSalud()>0 && this.batalla.getJugador2().getSalud()>0){
            for(Medaboot jugador:this.batalla.getPersonajes()){
               if(jugador.equals(this.batalla.getJugador1())){
                   botonDisabled(acciones2, null);
                }
               else{
                   botonDisabled(acciones2, null);
               }
            }
        }
        
        System.out.println("coenzar ");
    }
    
    

    @Override
    public void actionPerformed(ActionEvent ae) {
        
       /* int parte =1;
       botonDisabled (this.acciones1, (JToggleButton) ae.getSource());// se selecciona un boton, se deshabilitan los demas
       for(JToggleButton elementos : this.acciones1){// se busca el numero del boton sleeionado en el array
           
       if (ae.getSource().equals(elementos)){
            break;
       }
       else{
           parte+=1;
       }
       }*/
       if(ae.getSource().equals(this.vb.getJtBrazoIZ1))){
           if((this.vb.getJtBrazoIZ1().isSelected())){ 
                System.out.println("kimbo");
           }
       }
       
           
           
      
        
      /*switch(parte){ // teniendo el numero alamacenado en parte , se tomaran la medaparte a la que corresponde tal numero 
                     // y se guardara en una lista , definida en atributo 
            case 1: this.ataque.add(this.batalla.getJugador1().getBrazoDer());
                  break;
            case 2: this.ataque.add(this.batalla.getJugador1().getBrazoDer());
                  break;
            case 3: this.ataque.add(this.batalla.getJugador1().getBrazoDer());
                  break;
            case 4: this.ataque.add(this.batalla.getJugador1().getBrazoDer());
                  break;   
            case 5: this.ataque.add(this.batalla.getJugador1().getBrazoDer());
                  break;   
            default: System.out.println("error");
         }*/
    
    
    }
    
    //metodos que deshablita botones pertenicientes a un array compuesto por botones ( se usara el array de botones definidos en atributos)
    //deshabilita todos los bototnes del array , menos el seleccionado
    public void botonEnabled( JToggleButton[] botones){
        for (JToggleButton boton : botones){
                    boton.setEnabled(true);
                }
     }
    
    // metodo que re habilita los botones del array
    public void botonDisabled (JToggleButton[] botones,JToggleButton seleccionado){
        for (JToggleButton boton : botones){
            if (!boton.equals(seleccionado)){
                 boton.setEnabled(false);
                }
    
            }
    
    }

    @Override
    public void focusGained(FocusEvent fe) {
       //if(fe.getSource().equals(this.vb.getJtBrazoIZ1())){
           //System.out.println("kimbo");
       
    }

    @Override
    public void focusLost(FocusEvent fe) {
        this.vb.addFocusListener(this);
    }

    @Override
    public void itemStateChanged(ItemEvent ie) {
        if((this.vb.getJtBrazoIZ1().isSelected())){ 
            System.out.println("kimbo");
        
           
    }
 }
}
        