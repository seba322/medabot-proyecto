
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
    private ArrayList<ArrayList> ataques2=new <ArrayList> ArrayList();
    private ArrayList<JToggleButton> acciones1= new ArrayList<JToggleButton>();// guardara los botones del jugador 1
    private ArrayList<JToggleButton> acciones2=new ArrayList<JToggleButton>();// guardara botones del jugador 2 
    private Medaboot turno ;
    private JToggleButton seleccionador1=null;
    private JToggleButton seleecionador2=null;
    private int contador =0;
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
        this.vb.getBtListo().addActionListener(this);
        
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
    //Mpdofia las barras de vida y imprime el historial de acciones
    public void setEscenario(ArrayList<String> msj,ArrayList<Medaparte> parte){
        
        int i=0;
        for( String texto: msj){
            this.vb.getTxAcciones().append(texto+"\n");
            if(i<parte.size()){
                if(parte.get(i).getNombre().endsWith("(PD)")){
                    this.vb.getJpPiernaDE1().setValue(this.batalla.getJugador1().getPiernaDer().getSalud());
                }
                else if(parte.get(i).getNombre().endsWith("(PI)")){
                    this.vb.getJpPiernaIZ1().setValue(this.batalla.getJugador1().getPiernaIzq().getSalud());
                }
                else if(parte.get(i).getNombre().endsWith("(BD)")){
                    this.vb.getJpBrazoDE1().setValue(this.batalla.getJugador1().getBrazoDer().getSalud());
                }
                else if(parte.get(i).getNombre().endsWith("(BI)")){
                    this.vb.getJpBrazoIZ1().setValue(this.batalla.getJugador1().getBrazoIzq().getSalud());
                }
                else if(parte.get(i).getNombre().endsWith("(C)")){
                    this.vb.getJpCabeza1().setValue(this.batalla.getJugador1().getCabeza().getSalud());
                }
            }
        }
        this.vb.getJpVida1().setValue(this.batalla.getJugador1().getSalud());
        this.batalla.setMensajes();
        this.batalla.setPartes();
        
    }
    public void setEscenario2(ArrayList<String> msj,ArrayList<Medaparte> parte){
        
        int i=0;
        for( String texto: msj){
            this.vb.getTxAcciones().append(texto+"\n");
            if(i<parte.size()){
                if(parte.get(i).getNombre().endsWith("(PD)")){
                    this.vb.getJpPiernaDE2().setValue(this.batalla.getJugador2().getPiernaDer().getSalud());
                }
                else if(parte.get(i).getNombre().endsWith("(PI)")){
                    this.vb.getJpPiernaIZ2().setValue(this.batalla.getJugador2().getPiernaIzq().getSalud());
                }
                else if(parte.get(i).getNombre().endsWith("(BD)")){
                    this.vb.getJpBrazoDE2().setValue(this.batalla.getJugador2().getBrazoDer().getSalud());
                }
                else if(parte.get(i).getNombre().endsWith("(BI)")){
                    this.vb.getJpBrazoIZ2().setValue(this.batalla.getJugador2().getBrazoIzq().getSalud());
                }
                else if(parte.get(i).getNombre().endsWith("(C)")){
                    this.vb.getJpCabeza2().setValue(this.batalla.getJugador2().getCabeza().getSalud());
                }
            }
        }
        this.vb.getJpVida2().setValue(this.batalla.getJugador2().getSalud());
        this.batalla.setMensajes();
        this.batalla.setPartes();
        
    }
    //Modifica los puntos de habilidad del jugador 1 y 2
    public void setPH1(int coste,Medaboot jugador){
        
        if(jugador.equals(this.batalla.getJugador1())){
            int phActual=Integer.parseInt(this.vb.getTxtPhabilidad1().getText());
            int phNuevo=phActual-coste;
            this.vb.getTxtPhabilidad1().setText(Integer.toString(phNuevo));
        }
        else if (jugador.equals(this.batalla.getJugador2())) {
            int phActual=Integer.parseInt(this.vb.getTxtPhabilidad2().getText());
            int phNuevo=phActual-coste;
            this.vb.getTxtPhabilidad2().setText(Integer.toString(phNuevo));
        }
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
        
      if  (ae.getSource().equals(this.vb.getBtListo())){
          if (this.contador==0){
          System.out.println("EL CONTADOR ES"+this.contador);
          this.turno=this.batalla.getJugador2();
          this.contador+=1;
          System.out.println("EL CONTADOR ES"+this.contador);
           botonDisabled(this.acciones1,null);
              botonEnabled(acciones2);
          
         }
          else if (this.contador==1){
              System.out.println("EL CONTADOR ES"+this.contador);
          this.turno=this.batalla.getJugador1();
          System.out.println(this.batalla.getJugador1().getBrazoDer().getSalud());
          this.batalla.ejecutarAcciones(this.ataques,this.batalla.getJugador2(),"nada","nada");
          System.out.println(this.batalla.getJugador1().getBrazoDer().getSalud());
          setEscenario(this.batalla.getMensajes(), this.batalla.getPartes());
          System.out.println(this.batalla.getJugador1().getBrazoDer().getSalud());
          this.batalla.ejecutarAcciones(this.ataques2,this.batalla.getJugador2(),"nada","nada");
          System.out.println(this.batalla.getJugador1().getBrazoDer().getSalud());
          setEscenario2(this.batalla.getMensajes(),this.batalla.getPartes());
          this.ataques.clear();
          this.ataques2.clear();
              
         
          this.contador=0;
          
           System.out.println("EL CONTADOR ES"+this.contador);
           botonDisabled(this.acciones2,null);
           botonEnabled(acciones1);
          
          }    
          
    }
      if (ae.getSource().equals(this.vb.getBtConfirmarA())){
          
            int parte = this.acciones1.indexOf(this.seleccionador1);
            System.out.println(parte);
            int parte2= this.acciones2.indexOf(this.seleecionador2);
            if (this.turno.equals(this.batalla.getJugador1())){
            confirmador(parte ,parte2,this.ataques,this.acciones1,this.acciones2,this.batalla.getJugador1() ,this.batalla.getJugador2());
//          
            }
            
            else{
            confirmador(parte2 ,parte,this.ataques2,this.acciones2,this.acciones1,this.batalla.getJugador2() ,this.batalla.getJugador1());    
            
            }
        }
        
     if (!ae.getSource().equals(this.vb.getBtConfirmarA()) && !ae.getSource().equals(this.vb.getBtListo())){
        
        if (this.turno.equals(this.batalla.getJugador1())){
            habilitador(this.acciones1,this.acciones2);
           
       }
        else {
            habilitador(this.acciones2,this.acciones1);
          
        
        
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

     
   public void habilitador(ArrayList<JToggleButton> bAtacantes,ArrayList<JToggleButton> bAtacados){
    for (JToggleButton boton :bAtacantes){
            if (boton.isSelected()){
                if (bAtacantes.equals(this.acciones1)){
                this.seleccionador1=boton;
                }
                else{
                this.seleecionador2=boton;
                }
                
                
                
                botonDisabled(bAtacantes,boton);
                botonEnabled( bAtacados);
    
                 for(JToggleButton boton2 : bAtacados){
                      if (boton2.isSelected()){
                         if (bAtacantes.equals(this.acciones1)){
                             this.seleecionador2=boton2;
                                }
                             else{
                                 this.seleccionador1=boton2;
                         }
                         botonDisabled( bAtacados,boton2);
                            break;
               
                             
               }
                 }
            break;
                 
            }
            
            else if (!boton.isSelected()) { 
//           this.seleccionador1.setSelected(false);
//            this.seleecionador2.setSelected(false);
            botonDisabled( bAtacados,null);
            botonEnabled(bAtacantes);}
            
            
        }
   
   
   }
   public void confirmador(int parteAtacante ,int parteAtacado,ArrayList <ArrayList> lista,ArrayList<JToggleButton> bAtacantes,ArrayList<JToggleButton>bAtacado,Medaboot ataca ,Medaboot atacado ){
        switch(parteAtacante){ // teniendo el numero alamacenado en parte , se tomaran la medaparte a la que corresponde tal numero 
                     // y se guardara en una lista , definida en atributo 
            case 0: lista.add(new ArrayList(Arrays.asList(ataca.getBrazoIzq(),null)));
                  setPH1( ataca.getBrazoIzq().getPh(),ataca);
                  break;
            case 1: lista.add(new ArrayList(Arrays.asList(ataca.getBrazoDer(),null)) );
                  setPH1( ataca.getBrazoDer().getPh(),ataca);
                  break;
            case 2: lista.add(new ArrayList(Arrays.asList(ataca.getPiernaIzq(),null)) );
                  setPH1( ataca.getPiernaIzq().getPh(),ataca);
                  break;
            case 3: lista.add(new ArrayList(Arrays.asList(ataca.getPiernaDer(),null)) );
                  setPH1( ataca.getPiernaDer().getPh(),ataca);
                  break;   
            case 4:lista.add(new ArrayList(Arrays.asList(ataca.getCabeza(),null)) );
                  setPH1( ataca.getCabeza().getPh(),ataca);
                  break;   
            default: System.out.println("error");
                 }
         switch(parteAtacado){ // teniendo el numero alamacenado en parte , se tomaran la medaparte a la que corresponde tal numero 
                     // y se guardara en una lista , definida en atributo 
            case 0: lista.get(lista.size()-1).set(1, atacado.getBrazoIzq());
            
                  break;
            case 1:lista.get(lista.size()-1).set(1, atacado.getBrazoDer());
                  break;
            case 2: lista.get(lista.size()-1).set(1, atacado.getPiernaIzq());
                  break;
            case 3: lista.get(lista.size()-1).set(1, atacado.getPiernaDer());
                  break;   
            case 4:lista.get(lista.size()-1).set(1, atacado.getCabeza());
                  break;   
            default: System.out.println("error");
            
                }
            System.out.println(this.ataques);
             System.out.println(this.ataques2);
            this.seleccionador1.setSelected(false);
           this.seleecionador2.setSelected(false);
            botonEnabled(bAtacantes);
            botonDisabled(bAtacado,null);
   
   }
}
        
