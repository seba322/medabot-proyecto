package Controlador;

import Modelo.Batalla;
import Modelo.*;
import Vista.VistaBatalla;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JToggleButton;
import java.lang.System;
import java.util.Arrays;
import Vista.*;
import java.awt.BorderLayout;

// falta instanciar acciones 1 y acciones 2 
// ordenar funcionamiento de lista ataques y ataque
// la idea es en ataque guardar el ataque de una medaparte a otr , y luego y juntando estos en lista ataques


public class ControladorBatalla2 implements ActionListener {
    
    private VistaBatalla vb;
    private VistaMenu vm;
    private VistaFinalB vf;
    private VistaTranscursoTorneo vtt;
    private Batalla batalla;
    private ArrayList <ArrayList>  ataques=new <ArrayList> ArrayList();// lista que guardara todos los ataques de un turno
    private ArrayList<ArrayList> ataques2=new <ArrayList> ArrayList();
    private ArrayList<JToggleButton> acciones1= new ArrayList<JToggleButton>();// guardara los botones del jugador 1
    private ArrayList<JToggleButton> acciones2=new ArrayList<JToggleButton>();// guardara botones del jugador 2 
    private Medaboot turno ;
    private JToggleButton seleccionador1=null;
    private JToggleButton seleecionador2=null;
    private int contador =0;
    private String modalidad;
    private String tipo;
    private String tipoTorneo;
    private String esquivar1 ="";
    private String esquivar2="";
    private String defender1="";
    private String defender2="";
    private int numeroTurno=0;
    
    public ControladorBatalla2(Batalla b ,VistaBatalla vb,VistaMenu vm,VistaTranscursoTorneo vtt,String modalidad,String tipo,VistaFinalB vf,String tipoTorneo){
        this.tipoTorneo=tipoTorneo;
        this.vf=vf;
        this.vm=vm;
        this.vtt=vtt;
        this.batalla=b;
        this.modalidad=modalidad;
        this.tipo=tipo;
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
        this.vb.getJtDefender1().addActionListener(this);
        this.vb.getJtEsquivar1().addActionListener(this);
        this.vb.getJtDefender2().addActionListener(this);
        this.vb.getJtEsquivar2().addActionListener(this);
        this.vf.getBtContinuar2().addActionListener(this);
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
        this.vb.getBtListo().setSelected(true);
        
        this.vb.getJpBrazoDE1().setMaximum(this.batalla.getJugador1().getBrazoDer().getSaludMax());
        this.vb.getJpBrazoIZ1().setMaximum(this.batalla.getJugador1().getBrazoIzq().getSaludMax());
        this.vb.getJpPiernaIZ1().setMaximum(this.batalla.getJugador1().getPiernaIzq().getSaludMax());
        this.vb.getJpPiernaDE1().setMaximum(this.batalla.getJugador1().getPiernaDer().getSaludMax());
        this.vb.getJpCabeza1().setMaximum(this.batalla.getJugador1().getCabeza().getSaludMax());
        this.vb.getJpBrazoDE2().setMaximum(this.batalla.getJugador2().getBrazoDer().getSaludMax());
        this.vb.getJpBrazoIZ2().setMaximum(this.batalla.getJugador2().getBrazoIzq().getSaludMax());
        this.vb.getJpPiernaIZ2().setMaximum(this.batalla.getJugador2().getPiernaIzq().getSaludMax());
        this.vb.getJpPiernaDE2().setMaximum(this.batalla.getJugador2().getPiernaDer().getSaludMax());
        this.vb.getJpCabeza2().setMaximum(this.batalla.getJugador2().getCabeza().getSaludMax());
        this.vb.getJpVida1().setMaximum(this.batalla.getJugador1().getSaludMax());
        
        this.vb.getJpBrazoIZ1().setMaximum(this.batalla.getJugador1().getBrazoIzq().getSaludMax());
        this.vb.getJpVida2().setMaximum(this.batalla.getJugador2().getSaludMax());
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
        
      
        this.vb.getJBContinuar().addActionListener(this);
        
        
        
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
       
        
        
        
       botonDisabled(this.acciones2,null);
       this.vb.getBtConfirmarA().setEnabled(false);
       this.vb.getJtEsquivar2().setEnabled(false);
       this.vb.getJtDefender2().setEnabled(false);
       this.vb.getJBContinuar().setVisible(false);
       this.vb.getJMensaje().setVisible(false);
       
      if (this.modalidad.equals("BatallaCpuPj") && this.batalla.getJugador1().getNombre().equals("'CPU1'")){
           this.batalla.getJugador1().manejarCpu1(numeroTurno, acciones1, acciones2, this.batalla.getJugador2(), this.vb, this.defender2, this.esquivar2,1);
          }
       else  if (this.modalidad.equals("BatallaCpuPj") && this.batalla.getJugador1().getNombre().equals("'CPU2'")){
           this.batalla.getJugador1().manejarCpu1(numeroTurno, acciones1, acciones2, this.batalla.getJugador2(), this.vb, this.defender2, this.esquivar2,1);
          }
       
//        realizarBatalla();
          
    }

    public VistaFinalB getVf() {
        return vf;
    }

    public VistaBatalla getVb() {
        return vb;
    }
    
    
    //Metodo que se encarga de finalizarla batala, restableciendo datos
    // recompensando al ganador y guardando ls resultados en el historial
    public void finalizarBatalla(Medaboot ganador,Medaboot perdedor){
        
        this.vf.setSize(844, 584);
        this.vm.getContentPane().removeAll();
        this.vm.getContentPane().add(this.vf,BorderLayout.CENTER);
        this.vm.getContentPane().revalidate();
        this.vm.getContentPane().repaint();
        this.batalla.restablecerVida(ganador);
        this.batalla.restablecerVida(perdedor);
        this.vf.getTxGanador().setText(this.batalla.getGanador().getNombre());
        this.vf.getTxPerdedor().setText(this.batalla.getPerdedor().getNombre()); 
        String parte=this.batalla.asignarMedaparte(ganador,perdedor);
        this.vf.getTxRecompensa().setText(parte);
             //guardarHistorial;
        this.batalla.setEstado("Finalizada");
            
    }
    //Metodo que se encarga de finalizarla batala, restableciendo datos
    // recompensando al ganador y guardando ls resultados en el historial
    public void finalizarBatallaAvanzado(Medaboot ganador,Medaboot perdedor){
        
        this.vf.setSize(844, 584);
        this.vm.getContentPane().removeAll();
        this.vm.getContentPane().add(this.vf,BorderLayout.CENTER);
        this.vm.getContentPane().revalidate();
        this.vm.getContentPane().repaint();
        this.batalla.setHpVeinte(ganador);
        this.batalla.restablecerVida(perdedor);
        this.vf.getTxGanador().setText(this.batalla.getGanador().getNombre());
        this.vf.getTxPerdedor().setText(this.batalla.getPerdedor().getNombre()); 
        String parte=this.batalla.asignarMedaparte(ganador,perdedor);
        this.vf.getTxRecompensa().setText(parte);
             //guardarHistorial;
        this.batalla.setEstado("Finalizada");
            
    }
    
   //Metodo que se encarga de imprimir las acciones del jugador2
    //y modificar su barra de vida
    public void setEscenario(ArrayList<String> msj,ArrayList<Medaparte> parte){
        
        int i=0;
        System.out.println(msj);
        System.out.println(parte);
        for( String texto: msj){

            

            this.vb.getTxAcciones().append(texto+"\n");
            if(i<parte.size()){
                if(parte.get(i).getNombre().endsWith("(PD)")){
                    
                    this.vb.getJpPiernaDE2().setValue(this.batalla.getJugador2().getPiernaDer().getSalud());
                    System.out.println("ESTOY AQUI!!1");
                }
                 if(parte.get(i).getNombre().endsWith("(PI)")){
                    this.vb.getJpPiernaIZ1().setValue(this.batalla.getJugador2().getPiernaIzq().getSalud());
                    System.out.println("ESTOY AQUI!!2");
                }
                 if(parte.get(i).getNombre().endsWith("(BD)")){
                    this.vb.getJpBrazoDE2().setValue(this.batalla.getJugador2().getBrazoDer().getSalud());
                    System.out.println("ESTOY AQUI!!3");
                }
                 if(parte.get(i).getNombre().endsWith("(BI)")){
                    this.vb.getJpBrazoIZ2().setValue(this.batalla.getJugador2().getBrazoIzq().getSalud());
                    System.out.println("ESTOY AQUI!!4");
                }
                 if(parte.get(i).getNombre().endsWith("(C)")){
                    this.vb.getJpCabeza2().setValue(this.batalla.getJugador2().getCabeza().getSalud());
                    System.out.println("ESTOY AQUI!!5");
                }
            
        }
            }
            
            i=i+1;
             
        this.vb.getJpVida2().setValue(this.batalla.getJugador2().getSalud());
        System.out.println("ESTOY AQUI!!");
        this.batalla.setMensajes();
        this.batalla.setPartes();
        
    }
    //Metodo que se encarga de imprimir las acciones del jugador2
    //y modificar su barra de vida
    public void setEscenario2(ArrayList<String> msj,ArrayList<Medaparte> parte){
        
        int i=0;
        System.out.println(msj);
        System.out.println(parte);
        for( String texto: msj){
            this.vb.getTxAcciones().append(texto+"\n");
            if(i<parte.size()){
                if(parte.get(i).getNombre().endsWith("(PD)")){
                    this.vb.getJpPiernaDE1().setValue(this.batalla.getJugador1().getPiernaDer().getSalud());
                }
                 if(parte.get(i).getNombre().endsWith("(PI)")){
                    this.vb.getJpPiernaIZ1().setValue(this.batalla.getJugador1().getPiernaIzq().getSalud());
                }
                 if(parte.get(i).getNombre().endsWith("(BD)")){
                    this.vb.getJpBrazoDE1().setValue(this.batalla.getJugador1().getBrazoDer().getSalud());
                }
                 if(parte.get(i).getNombre().endsWith("(BI)")){
                    this.vb.getJpBrazoIZ1().setValue(this.batalla.getJugador1().getBrazoIzq().getSalud());
                }
                 if(parte.get(i).getNombre().endsWith("(C)")){
                    this.vb.getJpCabeza1().setValue(this.batalla.getJugador1().getCabeza().getSalud());
                }
            
            }
            i=i+1;
             
        }
        this.vb.getJpVida1().setValue(this.batalla.getJugador1().getSalud());
        
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
    
    
    


    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if(ae.getSource().equals(this.vf.getBtContinuar2())){
            if(this.tipo.equals("Batalla")){
                this.vm.getContentPane().removeAll();
                this.vm.getContentPane().add(this.vm.getjPanel1(),BorderLayout.CENTER);
                this.vm.getContentPane().revalidate();
                this.vm.getContentPane().repaint();
            }
//           
//                
//            
        }
        else if (ae.getSource().equals(this.vb.getJBContinuar())){
            if(this.tipoTorneo.equals("Avanzado")){
                if (this.batalla.getJugador1().getSalud()<=0){
                    this.batalla.setGanador(this.batalla.getJugador2());
                    this.batalla.setPerdedor(this.batalla.getJugador1());
                    finalizarBatallaAvanzado(this.batalla.getJugador2(), this.batalla.getJugador1());
                }    
               else if (this.batalla.getJugador2().getSalud()<=0){
                    this.batalla.setGanador(this.batalla.getJugador1());
                    this.batalla.setPerdedor(this.batalla.getJugador2());
                    finalizarBatallaAvanzado(this.batalla.getJugador1(), this.batalla.getJugador2());
                }
           
           }
            else{
           
                if (this.batalla.getJugador1().getSalud()<=0){
                    this.batalla.setGanador(this.batalla.getJugador2());
                    this.batalla.setPerdedor(this.batalla.getJugador1());
                    finalizarBatalla(this.batalla.getJugador2(), this.batalla.getJugador1());
                }
                else if (this.batalla.getJugador2().getSalud()<=0){
                    this.batalla.setGanador(this.batalla.getJugador1());
                    this.batalla.setPerdedor(this.batalla.getJugador2());
                    finalizarBatalla(this.batalla.getJugador1(), this.batalla.getJugador2());
                }
            }
        }
     
        
        
    // escuchador de evento de botones  enfocado a defensa y esquive 
        else if (ae.getSource().equals(this.vb.getJtEsquivar1())){// boton de esquivar , del jugador1
            if(Integer.parseInt(this.vb.getTxtPhabilidad1().getText())>=2){
            this.vb.getJtDefender1().setEnabled(false);
            this.vb.getJtEsquivar1().setEnabled(false);
            this.esquivar1="si";
            setPH1(2, this.batalla.getJugador1());
            }
        }
        
        else if (ae.getSource().equals(this.vb.getJtDefender1())){// boton de  defensa , del jugador1 
            if(Integer.parseInt(this.vb.getTxtPhabilidad1().getText())>=2){ 
            this.vb.getJtEsquivar1().setEnabled(false);
             this.vb.getJtDefender1().setEnabled(false);
            this.defender1="si";
             setPH1(2, this.batalla.getJugador1());
            }
        }
       else  if (ae.getSource().equals(this.vb.getJtEsquivar2())){//boton de esquivar , del jugador2
            if(Integer.parseInt(this.vb.getTxtPhabilidad2().getText())>=2){
             this.vb.getJtDefender2().setEnabled(false);
            this.vb.getJtEsquivar2().setEnabled(false);
            this.esquivar2="si";
             setPH1(2, this.batalla.getJugador2());
            }
         }
        else  if (ae.getSource().equals(this.vb.getJtDefender2())){// boton de defensa ,del jugador 2 
            if(Integer.parseInt(this.vb.getTxtPhabilidad2().getText())>=2){
              this.vb.getJtEsquivar2().setEnabled(false);
            this.vb.getJtDefender2().setEnabled(false);
             this.defender2="si";
              setPH1(2, this.batalla.getJugador2());
            }
            }
            
       
     else  if  (ae.getSource().equals(this.vb.getBtListo())){ // aacion a realizar , al presionar boton listo 
          
          if (this.contador==0){ // cuando es 0 el boton es porque se apreto por jugador 1 , pasa el turno a jugador 2
          
//          finalizarBatalla(this.batalla.getJugador1(), this.batalla.getJugador2());
          this.turno=this.batalla.getJugador2();
          this.contador+=1;// contador que determina quien y en que orden de batalla se ejecuta este evento
          this.vb.getJtDefender1().setEnabled(false);
          this.vb.getJtEsquivar1().setEnabled(false);
          this.vb.getJtDefender2().setEnabled(true);
          this.vb.getJtEsquivar2().setEnabled(true);
          botonDisabled(this.acciones1,null);
          botonEnabled(acciones2);
          this.numeroTurno +=1;// cuenta los turnos
         
          if (this.modalidad.equals("BatallaCpuPj") && this.batalla.getJugador2().getNombre().equals("'CPU1'")){
            this.batalla.getJugador2().manejarCpu1(numeroTurno, this.acciones2, this.acciones1, this.batalla.getJugador1(), this.vb,this.defender1,this.esquivar1,2);
          }
          
          if (this.modalidad.equals("BatallaCpuPj") && this.batalla.getJugador2().getNombre().equals("CPU2")){
            this.batalla.getJugador2().manejarCpu2(numeroTurno, acciones2, acciones1, this.batalla.getJugador1(), this.vb,this.defender1,this.esquivar1,2);
          }
          
          
        
          
         }
          else if (this.contador==1){
          this.batalla.activarMedafuerza(this.batalla.getJugador1(),this.batalla.getJugador2(), this.numeroTurno);
          this.batalla.activarMedafuerza(this.batalla.getJugador2(),this.batalla.getJugador1(), this.numeroTurno);
          this.turno=this.batalla.getJugador1();
          System.out.println(this.batalla.getJugador1().getBrazoDer().getSalud());
          System.out.println("La salud es:"+this.batalla.getJugador1().getSalud());
          this.batalla.ejecutarAcciones(this.ataques,this.ataques2,this.batalla.getJugador2(),this.batalla.getJugador1(),this.defender2,this.esquivar2);
          System.out.println(this.batalla.getJugador1().getBrazoDer().getSalud());
          setEscenario(this.batalla.getMensajes(), this.batalla.getPartes());
          System.out.println(this.batalla.getJugador1().getBrazoDer().getSalud());
          this.batalla.ejecutarAcciones(this.ataques2,this.ataques,this.batalla.getJugador1(),this.batalla.getJugador2(),this.defender1,this.esquivar1);
              
          System.out.println(this.batalla.getJugador1().getBrazoDer().getSalud());
          setEscenario2(this.batalla.getMensajes(),this.batalla.getPartes());
          System.out.println("La salud es:"+this.batalla.getJugador1().getSalud());
          this.ataques.clear();
          this.ataques2.clear();
          this.vb.getTxtPhabilidad1().setText("10");
          this.vb.getTxtPhabilidad2().setText("10");
          
          botonDisabled(this.acciones2,null);
          botonEnabled(acciones1);
          
          this.vb.getJtEsquivar1().setEnabled(true);
          this.vb.getJtDefender1().setEnabled(true);
          this.vb.getJtEsquivar2().setEnabled(false);
          this.vb.getJtDefender2().setEnabled(false);
          
          this.contador=0;
          this.batalla.activarMedafuerza(this.batalla.getJugador1(), this.batalla.getJugador2(),this.numeroTurno);
          comprobarMedapartes(this.batalla.getJugador1(),this.acciones1);
          comprobarMedapartes(this.batalla.getJugador2(),this.acciones2) ; 
           if (this.batalla.getJugador1().getSalud() <= 0  ||this.batalla.getJugador2().getSalud() <= 0){
              this.vb.getBtConfirmarA().setVisible(false);
              this.vb.getBtListo().setVisible(false);
              this.vb.getJMensaje().setVisible(true);
              this.vb.getJBContinuar().setVisible(true);
            }
          
         
          if (this.modalidad.equals("BatallaCpuPj") && this.batalla.getJugador1().getNombre().equals("'CPU1'")){
           this.batalla.getJugador1().manejarCpu1(numeroTurno, this.acciones1, this.acciones2, this.batalla.getJugador2(), this.vb, this.defender2, this.esquivar2,1);
          }
          else if (this.modalidad.equals("BatallaCpuPj") && this.batalla.getJugador1().getNombre().equals("CPU2")){
           this.batalla.getJugador1().manejarCpu2(numeroTurno, this.acciones1, this.acciones2, this.batalla.getJugador2(), this.vb, this.defender2, this.esquivar2,1);
          }
          this.esquivar1="";
          this.esquivar2="";
          this.defender1="";
          this.defender2="";
            this.numeroTurno +=1;
         
         
          
          
          
           
           
          
          }    
          
    }
//       if(this.acciones1.contains(this.seleecionador2) /*&& this.acciones2.contains(this.seleecionador2)*/){
//          this.vb.getBtConfirmarA().setEnabled(true);}
     else  if (ae.getSource().equals(this.vb.getBtConfirmarA())){// areglar esto 
            
           
            
            int parte = this.acciones1.indexOf(this.seleccionador1);
            System.out.println(parte);
            int parte2= this.acciones2.indexOf(this.seleecionador2);
            if (this.turno.equals(this.batalla.getJugador1())){
            confirmador(parte ,parte2,this.ataques,this.acciones1,this.acciones2,this.batalla.getJugador1() ,this.batalla.getJugador2());
            controlarPH(Integer.parseInt(this.vb.getTxtPhabilidad1().getText()),this.batalla.getJugador1(),this.acciones1);
            }
            
            else{
            confirmador(parte2 ,parte,this.ataques2,this.acciones2,this.acciones1,this.batalla.getJugador2() ,this.batalla.getJugador1());    
             controlarPH(Integer.parseInt(this.vb.getTxtPhabilidad2().getText()),this.batalla.getJugador2(),this.acciones2);
            }
      
             this.vb.getBtConfirmarA().setEnabled(false);
            if (Integer.parseInt(this.vb.getTxtPhabilidad1().getText())<=0){
                botonDisabled(this.acciones1, null);
                
                   }
            if (Integer.parseInt(this.vb.getTxtPhabilidad2().getText())<=0){
            botonDisabled(this.acciones2, null);
            }
      }
        
        
        else if (!ae.getSource().equals(this.vb.getBtConfirmarA()) && !ae.getSource().equals(this.vb.getBtListo()) ){
        
        if (this.turno.equals(this.batalla.getJugador1())){
            habilitador(this.acciones1,this.acciones2,this.batalla.getJugador1());
           
       }
        else {
            habilitador(this.acciones2,this.acciones1,this.batalla.getJugador2());
          
        
        
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

     
   public void habilitador(ArrayList<JToggleButton> bAtacantes,ArrayList<JToggleButton> bAtacados , Medaboot ataca ){
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
                         this.vb.getBtConfirmarA().setEnabled(true);
                         break;
               
                             
               }
                      else if (!boton2.isSelected()){
                      this.vb.getBtConfirmarA().setEnabled(false);
                      
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

   // este metodo pregunta despues de cada accion si el ph de cada medaparte es mayor al ph disponible
   // asi se deshabilitan las que tiene ph mayor 
    private void controlarPH(int PhActual,Medaboot jugador,ArrayList<JToggleButton> lista) {
      
     if (jugador.getBrazoIzq().getPh()>PhActual){
     lista.get(0).setEnabled(false);
     }  
     if (jugador.getBrazoDer().getPh()>PhActual){
     lista.get(1).setEnabled(false);
     }   
     if (jugador.getPiernaIzq().getPh()>PhActual){
     lista.get(2).setEnabled(false);
     }   
     if (jugador.getPiernaDer().getPh()>PhActual){
     lista.get(3).setEnabled(false);
     }   
     if (jugador.getCabeza().getPh()>PhActual){
     lista.get(4).setEnabled(false);
     }   
    }

    private void comprobarMedapartes(Medaboot jugador, ArrayList<JToggleButton> lista) {
     if (jugador.getBrazoIzq().getSalud()<=0){
         jugador.setDefensa(jugador.getDefensa()-jugador.getBrazoIzq().getDefensa());
         lista.get(0).setVisible(false);
     }  
     if (jugador.getBrazoDer().getSalud()<=0){
         jugador.setDefensa(jugador.getDefensa()-jugador.getBrazoDer().getDefensa());
         lista.get(1).setVisible(false);
     }   
     if (jugador.getPiernaIzq().getSalud()<=0){
         jugador.setDefensa(jugador.getDefensa()-jugador.getPiernaIzq().getDefensa());
         lista.get(2).setVisible(false);
     }   
     if (jugador.getPiernaDer().getSalud()<=0){
         jugador.setDefensa(jugador.getDefensa()-jugador.getPiernaDer().getDefensa());
         lista.get(3).setVisible(false);
     }   
     if (jugador.getCabeza().getPh()<=0){
         jugador.setDefensa(jugador.getDefensa()-jugador.getCabeza().getDefensa());
         lista.get(4).setVisible(false);
     }   
    }
}
        
