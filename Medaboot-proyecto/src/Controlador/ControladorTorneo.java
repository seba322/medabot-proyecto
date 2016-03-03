
package Controlador;
import Vista.*;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Modelo.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.*;
import javax.swing.JTextField;



public class ControladorTorneo implements ActionListener{
    private VistaMenuTorneo vmt;
    private VistaPreparacionTorneo vpt;
    private VistaPreparacionCpuTorneo vpct;
    private VistaTranscursoTorneo vtt;
    private VistaMenu vm;
    private Torneo torneo;
    private VistaRegistro1 vt11;
    private VistaAdmin vta;
    private int usuarios;
    private int contadorGlobal;
    private int contadorCasillas;
    private int contadorParticipantes;
    private int contadorCajasPj;
    private String tipoTorneo;
    private VistaFinalB vf;
    private VistaFinalizarTorneo vft;
    private Batalla batalla;
    private ArrayList<Medaboot> perdedores;
    private ArrayList<ArrayList> botones;
    private String modalidad;
    
    
    
    public ControladorTorneo(VistaMenuTorneo vmt,VistaPreparacionTorneo vpt,VistaTranscursoTorneo vtt,VistaMenu vm,Torneo torneo){
        this.torneo=torneo;
       this.batalla=null;
       this.vta=new VistaAdmin();
       
        this.tipoTorneo="";
        this.modalidad="BatallaPj";
        this.perdedores=new ArrayList<Medaboot>();
        this.botones=new ArrayList<ArrayList>();
        this.vf=new VistaFinalB();
        this.contadorGlobal=0;
        this.contadorCasillas=1;
        this.usuarios=1;
        this.contadorCajasPj=1;
        this.contadorParticipantes=1;
        this.vmt=vmt;
        this.vpt=vpt;
        this.vtt=vtt;
        this.vpct=new VistaPreparacionCpuTorneo();
        this.vm=vm;
        
        this.vpt.getBtAdm1().addActionListener(this);
        this.vpt.getBtAdm2().addActionListener(this);
        this.vpt.getBtAdm3().addActionListener(this);
        this.vpt.getBtAdm4().addActionListener(this);
        this.vpt.getBtAdm5().addActionListener(this);
        this.vpt.getBtAdm6().addActionListener(this);
        this.vpt.getBtAdm7().addActionListener(this);
        this.vpt.getBtAdm8().addActionListener(this);
        this.vft=new VistaFinalizarTorneo();
        this.vmt.getBtAtras1().addActionListener(this);
        this.vmt.getBtTnormal().addActionListener(this);
        this.vmt.getBtTavanzado().addActionListener(this);
        this.vpt.getBtRegistro().addActionListener(this);
        this.vpt.getBtComenzar().addActionListener(this);
        this.vpt.getBtEmparejar().addActionListener(this);
        this.vpt.getBtLimpiar().addActionListener(this);
        this.vpt.getBtCPU().addActionListener(this);
        this.vtt.getBtRonda1().addActionListener(this);
        this.vtt.getBtRonda2().addActionListener(this);
        this.vtt.getBtFinal().addActionListener(this);
        this.vtt.getBtTerminar().addActionListener(this);
        this.vft.getBtContinuar2().addActionListener(this);
        this.vpct.getBtSeleccionar().addActionListener(this);
        this.vpct.getBtAtras().addActionListener(this);
        this.vf.getBtContinuar2().addActionListener(this);
        this.vpt.getBtAtras2().addActionListener(this);
        this.vpt.getLbPart1().setText(this.contadorParticipantes+") "+this.torneo.getUser().getNombreUsuario()+"("+this.usuarios+"):");
        this.vpt.getTxtPart1().setText(this.torneo.getUser().getPersonajes()[0].getNombre());
    }
    
    

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        //Comenzar el torneo
        if(ae.getSource().equals(this.vpt.getBtComenzar())){
            try {
                this.vtt.setSize(1086, 672);
                this.vm.getContentPane().removeAll();
                this.vm.getContentPane().add(this.vtt,BorderLayout.CENTER);
                this.vm.getContentPane().revalidate();
                this.vm.getContentPane().repaint();
                this.vtt.getTxtPjr1().setText(this.torneo.getCombatientes().get(0).getNombre());
                this.vtt.getTxtPjr2().setText(this.torneo.getCombatientes().get(1).getNombre());
                this.vtt.getTxtPjr3().setText(this.torneo.getCombatientes().get(2).getNombre());
                this.vtt.getTxtPjr4().setText(this.torneo.getCombatientes().get(3).getNombre());
                this.vtt.getTxtPjr5().setText(this.torneo.getCombatientes().get(4).getNombre());
                this.vtt.getTxtPjr6().setText(this.torneo.getCombatientes().get(5).getNombre());
                this.vtt.getTxtPjr7().setText(this.torneo.getCombatientes().get(6).getNombre());
                this.vtt.getTxtPjr8().setText(this.torneo.getCombatientes().get(7).getNombre());
                String registroAcciones=" "+this.torneo.getUser().getNombreUsuario()+" a organizado un torneo  el dia "+this.torneo.getUser().mostrarHora();
                this.vm.getTxtRegistroAcciones().append("\n"+registroAcciones);
                this.torneo.getUser().escribirAcciones(registroAcciones);
                for(Usuario user:this.torneo.getParticipantes()){
                    if(user.equals(this.torneo.getUser())){
                        continue;
                    }
                    String registroAcciones2=" "+user.getNombreUsuario()+" a participado en un torneo organizado por "+this.torneo.getUser().getNombreUsuario()+" el dia "+user.mostrarHora();
                    user.escribirAcciones(registroAcciones2);
                }
            } catch (IOException ex) {
                Logger.getLogger(ControladorTorneo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        else if(ae.getSource().equals(this.vtt.getBtFinal())){
                VistaBatalla vb=new VistaBatalla();
                this.vf=new VistaFinalB();
                 if(this.torneo.getCombatientes().get(contadorGlobal).getTipo().equals("CPU") || this.torneo.getCombatientes().get(contadorGlobal+1).getTipo().equals("CPU") ){
                    this.modalidad="BatallaCpuPj";
                }
                else if(this.torneo.getCombatientes().get(contadorGlobal).getTipo().equals("CPU") && this.torneo.getCombatientes().get(contadorGlobal+1).getTipo().equals("CPU")){
                    this.modalidad="BatallaCpuVsCpu";
                }
                 
                this.batalla=new Batalla(this.torneo.getCombatientes().get(contadorGlobal),this.torneo.getCombatientes().get(contadorGlobal+1));
                ControladorBatalla2 ctb2= new ControladorBatalla2(this.batalla,vb,this.vm,this.vtt,this.modalidad,"Torneo",this.vf,"");
                ctb2.getVf().getBtContinuar2().addActionListener(this);
                vb.setSize(1402, 684);
                System.out.println(this.torneo.getCombatientes());
                
                this.vm.getContentPane().removeAll();
                this.vm.getContentPane().add(vb,BorderLayout.CENTER);
                this.vm.getContentPane().revalidate();
                this.vm.getContentPane().repaint();
                this.vtt.getBtFinal().setEnabled(false);
                this.vtt.getBtTerminar().setVisible(true);
                
        }
        
        else if(ae.getSource().equals(this.vtt.getBtRonda2())){
                VistaBatalla vb=new VistaBatalla();
                this.vf=new VistaFinalB();
                 if(this.torneo.getCombatientes().get(contadorGlobal).getTipo().equals("CPU") || this.torneo.getCombatientes().get(contadorGlobal+1).getTipo().equals("CPU") ){
                    this.modalidad="BatallaCpuPj";
                }
                this.batalla=new Batalla(this.torneo.getCombatientes().get(contadorGlobal),this.torneo.getCombatientes().get(contadorGlobal+1));
                ControladorBatalla2 ctb2= new ControladorBatalla2(batalla,vb,this.vm,this.vtt,this.modalidad,"Torneo",this.vf,this.tipoTorneo);
                ctb2.getVf().getBtContinuar2().addActionListener(this);
                vb.setSize(1402, 684);
                
                System.out.println(this.torneo.getCombatientes());
                System.out.println("ESTA ES MI SALUDDDDDDD"+this.torneo.getCombatientes().get(contadorGlobal).getSalud());
                System.out.println("ESTA ES MI SALUDDDDDDD"+this.torneo.getCombatientes().get(contadorGlobal+1).getSalud());
                this.vm.getContentPane().removeAll();
                this.vm.getContentPane().add(vb,BorderLayout.CENTER);
                this.vm.getContentPane().revalidate();
                this.vm.getContentPane().repaint();
                if(this.contadorGlobal<2){
                    this.contadorGlobal+=2;
                    
                }
                else{
                    this.vtt.getBtRonda2().setEnabled(false);
                    this.vtt.getBtFinal().setEnabled(true);
                   
                    this.contadorGlobal=0;
                }
        }
        
        else if(ae.getSource().equals(this.vtt.getBtRonda1())){
               
                VistaBatalla vb=new VistaBatalla();
                this.vf=new VistaFinalB();
                if(this.torneo.getCombatientes().get(contadorGlobal).getTipo().equals("CPU") || this.torneo.getCombatientes().get(contadorGlobal+1).getTipo().equals("CPU") ){
                    this.modalidad="BatallaCpuPj";
                }
                this.batalla=new Batalla(this.torneo.getCombatientes().get(contadorGlobal),this.torneo.getCombatientes().get(contadorGlobal+1));
                System.out.println("ESTE ES EL JUGADOR 1"+this.batalla.getJugador1().getNombre());
                System.out.println("ESTE ES EL JUGADOR 2"+this.batalla.getJugador2().getNombre());
                
                
                ControladorBatalla2 ctb2= new ControladorBatalla2(batalla,vb,this.vm,this.vtt,this.modalidad,"Torneo",this.vf,this.tipoTorneo);
                ctb2.getVf().getBtContinuar2().addActionListener(this);
                vb.setSize(1402, 684);
                System.out.println(this.torneo.getCombatientes());
                
                
                this.vm.getContentPane().removeAll();
                this.vm.getContentPane().add(vb,BorderLayout.CENTER);
                this.vm.getContentPane().revalidate();
                this.vm.getContentPane().repaint();
               
                if(this.contadorGlobal<6){
                    this.contadorGlobal=this.contadorGlobal+2;
                    System.out.println("este es el Numero"+this.contadorGlobal);
                }
                else{
                    this.vtt.getBtRonda1().setEnabled(false);
                    this.vtt.getBtRonda2().setEnabled(true);
                    
                    this.contadorGlobal=0;
                }
        }
        
        else if(ae.getSource().equals(this.vf.getBtContinuar2())){
            
            this.vtt.setSize(1086, 672);
            this.vm.getContentPane().removeAll();
            this.vm.getContentPane().add(this.vtt,BorderLayout.CENTER);
            this.vm.getContentPane().revalidate();
            this.vm.getContentPane().repaint();
                
            this.perdedores.add(this.batalla.getPerdedor());
            System.out.println("FINALIZANDO BATALLA");
            
            switch (this.contadorCasillas) {
                case 1:
                    this.vtt.getTxtPjr12().setText(this.batalla.getGanador().getNombre());
                    break;
                case 2:
                    this.vtt.getTxtPjr22().setText(this.batalla.getGanador().getNombre());
                    
                    break;
                case 3:
                    this.vtt.getTxtPjr32().setText(this.batalla.getGanador().getNombre());
                    break;
                case 4:
                    this.vtt.getTxtPjr42().setText(this.batalla.getGanador().getNombre());
                    for(Medaboot perdedor:this.perdedores){
                        this.torneo.getCombatientes().remove(perdedor);
                    }
                    this.perdedores.clear();
                    break;
                case 5:
                    this.vtt.getTxtPjr13().setText(this.batalla.getGanador().getNombre());
                    break;
                case 6:
                    this.vtt.getTxtPjr23().setText(this.batalla.getGanador().getNombre());
                     for(Medaboot perdedor:this.perdedores){
                        this.torneo.getCombatientes().remove(perdedor);
                    }
                    this.perdedores.clear();
                    break;
                case 7:
                    this.vtt.getTxtGanador().setText(this.batalla.getGanador().getNombre());
                    this.vtt.getLbGanador().setVisible(true);
            {
                try {
                    this.torneo.activarPjOculto(this.batalla.getGanador().getNombreUsuatrio());
                } catch (SQLException ex) {
                    Logger.getLogger(ControladorTorneo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                    break;
                default:
                    break;
            }
            this.contadorCasillas=this.contadorCasillas+1;
            System.out.print("ESTE ES EL CONTADOR CASILLAS"+this.contadorCasillas);
            
            
        }
                
        
        //Cambiar a vista de preparacion torneo, cuando se pulsa el torneo normal
        else if(ae.getSource().equals(this.vmt.getBtTnormal())){
            this.vpt.setSize(925, 757);
            this.vm.getContentPane().removeAll();
            this.vm.getContentPane().add(this.vpt,BorderLayout.CENTER);
            this.vm.getContentPane().revalidate();
            this.vm.getContentPane().repaint();  
        }
        //Cambiar a vista preparacion torneo, y permite que se sigan 
        //Las reglas del torneo avanzado, cambiando el tributo "tipoTorneo"
        else if(ae.getSource().equals(this.vmt.getBtTavanzado())){
            this.vpt.setSize(925, 757);
            this.vm.getContentPane().removeAll();
            this.vm.getContentPane().add(this.vpt,BorderLayout.CENTER);
            this.vm.getContentPane().revalidate();
            this.vm.getContentPane().repaint();
            this.tipoTorneo="Avanzado";
            System.out.println(tipoTorneo);
        }
        
        //Permite acceder a la pantalla para seleccionar una CPU
        else if(ae.getSource().equals(this.vpt.getBtCPU())){
            this.vpct.getBtAtras().setEnabled(false);
            this.vpct.setSize(932, 678);
            this.vm.getContentPane().removeAll();
            this.vm.getContentPane().add(this.vpct,BorderLayout.CENTER);
            this.vm.getContentPane().revalidate();
            this.vm.getContentPane().repaint();
             if(this.contadorParticipantes>=7){
                 this.vpt.getBtRegistro().setEnabled(false); 
                 this.vpt.getBtEmparejar().setEnabled(true);
                 this.vpt.getBtCPU().setEnabled(false);
                 this.vpt.getBtLimpiar().setEnabled(true);
                 
            }
        }
        //Permite seleccionar la CPU que se desee utilizar
        else if(ae.getSource().equals(this.vpct.getBtSeleccionar())){
            String cpu=(String) this.vpct.getiTCpu().getSelectedItem();
            try {
                Medaboot cpuSelected=new Medaboot(cpu);
                this.torneo.setCpu(cpuSelected);
                this.vpct.getTxtEstadisticas().setText("");
                 String estadisticas = "nombre :"+ cpuSelected.getNombre()+"\n"
                        + "salud:"+cpuSelected.getSalud()+"\n"+"esquive:"+cpuSelected.getEsquive()+"\n"
                        +"defensa:"+cpuSelected.getDefensa()+"\n"+"ataque:"+cpuSelected.getAtaque()+"\n";
                 this.vpct.getTxtEstadisticas().append(estadisticas);
                 this.vpct.getBtAtras().setEnabled(true);
            } catch (SQLException ex) {
                Logger.getLogger(ControladorTorneo.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        //Permite volver a la pantalla de preparacion de torneo, y agrega la CPU
        // Seleccionada a la lista de personajes participantes
        else if(ae.getSource().equals(this.vpct.getBtAtras())){
             
            this.vpt.setSize(925, 757);
            this.vm.getContentPane().removeAll();
            this.vm.getContentPane().add(this.vpt,BorderLayout.CENTER);
            this.vm.getContentPane().revalidate();
            this.vm.getContentPane().repaint();
            this.torneo.getPersonajes().add(this.torneo.getCpu());
            //Permite rellenar la vista con el nombre de los participantes que se van agregando
            switch(this.contadorParticipantes){
                        case 1:
                             this.vpt.getLbPart2().setText(this.contadorParticipantes+1+") CPU(PNJ) :");
                             this.vpt.getTxtPart2().setText(this.torneo.getCpu().getNombre());
                             this.vpt.getLbPart2().setVisible(true);
                             this.vpt.getTxtPart2().setVisible(true);
                            break;
                        case 2:
                            
                            this.vpt.getLbPart3().setText(this.contadorParticipantes+1+") CPU(PNJ) :");
                             this.vpt.getTxtPart3().setText(this.torneo.getCpu().getNombre());
                             this.vpt.getLbPart3().setVisible(true);
                             this.vpt.getTxtPart3().setVisible(true);
                            break;
                        case 3:
                            this.vpt.getLbPart4().setText(this.contadorParticipantes+1+") CPU(PNJ) :");
                             this.vpt.getTxtPart4().setText(this.torneo.getCpu().getNombre());
                             this.vpt.getLbPart4().setVisible(true);
                             this.vpt.getTxtPart4().setVisible(true);
                            break;            
                        case 4:
                            this.vpt.getLbPart5().setText(this.contadorParticipantes+1+") CPU(PNJ) :");
                             this.vpt.getTxtPart5().setText(this.torneo.getCpu().getNombre());
                             this.vpt.getLbPart5().setVisible(true);
                             this.vpt.getTxtPart5().setVisible(true);
                            break;
                        case 5:
                            this.vpt.getLbPart6().setText(this.contadorParticipantes+1+") CPU(PNJ) :");
                             this.vpt.getTxtPart6().setText(this.torneo.getCpu().getNombre());
                             this.vpt.getLbPart6().setVisible(true);
                             this.vpt.getTxtPart6().setVisible(true);
                            break;    
                        case 6:
                            this.vpt.getLbPart7().setText(this.contadorParticipantes+1+") CPU(PNJ) :");
                             this.vpt.getTxtPart7().setText(this.torneo.getCpu().getNombre());
                             this.vpt.getLbPart7().setVisible(true);
                             this.vpt.getTxtPart7().setVisible(true);
                            break;   
                        case 7:
                            this.vpt.getLbPart8().setText(this.contadorParticipantes+1+") CPU(PNJ) :");
                             this.vpt.getTxtPart8().setText(this.torneo.getCpu().getNombre());
                             this.vpt.getLbPart8().setVisible(true);
                             this.vpt.getTxtPart8().setVisible(true);
                            break; 
                        default:
                            break;
                    }
            ++this.contadorParticipantes;
        }

        //Mostrar por pantalla los diferentes emparejamientos del torneo
        else if(ae.getSource().equals(this.vpt.getBtEmparejar())){
            this.torneo.emparejarPjs();
            int contador=0;
            int lugar=1;
            while(contador< this.torneo.getCombatientes().size()){
                this.vpt.getTxtEncuentros().append(Integer.toString(lugar)+")"+this.torneo.getCombatientes().get(contador).getNombre()+" ");
                this.vpt.getTxtEncuentros().append("  Vs  "+this.torneo.getCombatientes().get(contador+1).getNombre()+"\n");
                this.vpt.getTxtEncuentros().append("\n");
                contador=contador+2;
                lugar+=1;
                
            }
            this.vpt.getBtComenzar().setEnabled(true);
        }
        //Evento que se encarga de limpiar la lista de participantes
        else if(ae.getSource().equals(this.vpt.getBtLimpiar())){
            this.vpt.getTxtEncuentros().setText("");
            this.vpt.getBtEmparejar().setEnabled(false);
            this.vpt.getBtRegistro().setEnabled(true);
            this.vpt.getBtLimpiar().setEnabled(false);
            this.vpt.getBtComenzar().setEnabled(false);
            //this.vpt.getTxtParticipantes().setText("");
            this.torneo.getCombatientes().clear();
            this.torneo.getParticipantes().clear();
            this.torneo.getParticipantes().add(this.torneo.getUser());
            this.usuarios=1;
            this.contadorParticipantes=1;
           // this.vpt.getTxtParticipantes().append("Usuario                              Personaje\n");
            //this.vpt.getTxtParticipantes().append("1)"+this.torneo.getUser().getNombreUsuario()+":                             "+this.torneo.getUser().getPersonajes()[0].getNombre()+"\n");
        }
        else if(ae.getSource().equals(this.vtt.getBtTerminar())){
            this.vft.setSize(918, 651);
            this.vft.getTxtGanador().setText(this.batalla.getGanador().getNombre());
            this.vm.getContentPane().removeAll();
            this.vm.getContentPane().add(this.vft,BorderLayout.CENTER);
            this.vm.getContentPane().revalidate();
            this.vm.getContentPane().repaint();
            
        }
        //Permite volver al menu de torneo
        else if(ae.getSource().equals(this.vpt.getBtAtras2())){
            this.vmt.setSize(844, 584);
            this.vm.getContentPane().removeAll();
            this.vm.getContentPane().add(this.vmt,BorderLayout.CENTER);
            this.vm.getContentPane().revalidate();
            this.vm.getContentPane().repaint();
            
        }
        else if(ae.getSource().equals(this.vmt.getBtAtras1())){
            
            this.vm.getContentPane().removeAll();
            this.vm.getContentPane().add(this.vm.getjPanel1(),BorderLayout.CENTER);
            this.vm.getContentPane().revalidate();
            this.vm.getContentPane().repaint();
            
        }
        else if(ae.getSource().equals(this.vft.getBtContinuar2())){
         
            this.vm.getContentPane().removeAll();
            this.vm.getContentPane().add(this.vm.getjPanel1(),BorderLayout.CENTER);
            this.vm.getContentPane().revalidate();
            this.vm.getContentPane().repaint();
             System.out.println(this.torneo.getUser().getNombreUsuario());
                System.out.println(this.batalla.getGanador().getNombreUsuatrio());
            if(this.torneo.getUser().getNombreUsuario().equals("'"+this.batalla.getGanador().getNombreUsuatrio()+"'")){
                System.out.println(this.torneo.getUser().getNombreUsuario());
                System.out.println(this.batalla.getGanador().getNombreUsuatrio());
                this.vm.getBtOculto().setEnabled(true);
            }
        }
        else if(ae.getSource().equals(this.vta.getBtAtras())){
            this.vpt.setSize(925, 757);
            this.vm.getContentPane().removeAll();
            this.vm.getContentPane().add(this.vpt,BorderLayout.CENTER);
            this.vm.getContentPane().revalidate();
            this.vm.getContentPane().repaint();
            
            //Determina que casilla modificar para el cambio de personaje
            switch(this.contadorCajasPj){
                case 1:
                this.vpt.getTxtPart1().setText(this.torneo.getParticipantes().get(0).getPersonajes()[0].getNombre());
                break;
                case 2:
                this.vpt.getTxtPart2().setText(this.torneo.getParticipantes().get(1).getPersonajes()[0].getNombre());
                break;
                case 3:
                this.vpt.getTxtPart3().setText(this.torneo.getParticipantes().get(2).getPersonajes()[0].getNombre());
                case 4:
                this.vpt.getTxtPart4().setText(this.torneo.getParticipantes().get(3).getPersonajes()[0].getNombre());
                break;
                case 5:
                this.vpt.getTxtPart5().setText(this.torneo.getParticipantes().get(4).getPersonajes()[0].getNombre());
                break;
                case 6:
                this.vpt.getTxtPart6().setText(this.torneo.getParticipantes().get(5).getPersonajes()[0].getNombre());
                break;
                case 7:
                this.vpt.getTxtPart7().setText(this.torneo.getParticipantes().get(6).getPersonajes()[0].getNombre());
                break;
                case 8:
                this.vpt.getTxtPart8().setText(this.torneo.getParticipantes().get(7).getPersonajes()[0].getNombre());
                break;
                default:
                    break;
            }   
        }
        //Serie de botones que permite a cada usuarip acceder al panel de administracion
        //de `personaje
        else if(ae.getSource().equals(this.vpt.getBtAdm1())){
            this.vta=new VistaAdmin();
            this.vta.setSize(1162, 654);
            this.vm.getContentPane().removeAll();
            this.vm.getContentPane().add(this.vta,BorderLayout.CENTER);
            this.vm.getContentPane().revalidate();
            this.vm.getContentPane().repaint();
            ControladorAdministracion cta =new ControladorAdministracion(this.vta, this.torneo.getParticipantes().get(0), this.vm, "torneo");
            this.vta.getBtAtras().addActionListener(this);
            this.contadorCajasPj=1;
        }
        else if(ae.getSource().equals(this.vpt.getBtAdm2())){
            this.vta=new VistaAdmin();
            this.vta.setSize(1162, 654);
            this.vm.getContentPane().removeAll();
            this.vm.getContentPane().add(this.vta,BorderLayout.CENTER);
            this.vm.getContentPane().revalidate();
            this.vm.getContentPane().repaint();
            ControladorAdministracion cta =new ControladorAdministracion(this.vta, this.torneo.getParticipantes().get(1), this.vm, "torneo");
            this.vta.getBtAtras().addActionListener(this);
            this.contadorCajasPj=2;
        
        }
        else if(ae.getSource().equals(this.vpt.getBtAdm3())){
            this.vta=new VistaAdmin();
            this.vta.setSize(1162, 654);
            this.vm.getContentPane().removeAll();
            this.vm.getContentPane().add(this.vta,BorderLayout.CENTER);
            this.vm.getContentPane().revalidate();
            this.vm.getContentPane().repaint();
            ControladorAdministracion cta =new ControladorAdministracion(this.vta, this.torneo.getParticipantes().get(2), this.vm, "torneo");
            this.vta.getBtAtras().addActionListener(this);
            this.contadorCajasPj=3;
        
        }
        else if(ae.getSource().equals(this.vpt.getBtAdm4())){
            this.vta=new VistaAdmin();
            this.vta.setSize(1162, 654);
            this.vm.getContentPane().removeAll();
            this.vm.getContentPane().add(this.vta,BorderLayout.CENTER);
            this.vm.getContentPane().revalidate();
            this.vm.getContentPane().repaint();
            ControladorAdministracion cta =new ControladorAdministracion(this.vta, this.torneo.getParticipantes().get(3), this.vm, "torneo");
            this.vta.getBtAtras().addActionListener(this);
            this.contadorCajasPj=4;
        
        }
        else if(ae.getSource().equals(this.vpt.getBtAdm5())){
            this.vta=new VistaAdmin();
            this.vta.setSize(1162, 654);
            this.vm.getContentPane().removeAll();
            this.vm.getContentPane().add(this.vta,BorderLayout.CENTER);
            this.vm.getContentPane().revalidate();
            this.vm.getContentPane().repaint();
            ControladorAdministracion cta =new ControladorAdministracion(this.vta, this.torneo.getParticipantes().get(4), this.vm, "torneo");
            this.vta.getBtAtras().addActionListener(this);
            this.contadorCajasPj=5;
        
        }
        else if(ae.getSource().equals(this.vpt.getBtAdm6())){
            this.vta=new VistaAdmin();
            this.vta.setSize(1162, 654);
            this.vm.getContentPane().removeAll();
            this.vm.getContentPane().add(this.vta,BorderLayout.CENTER);
            this.vm.getContentPane().revalidate();
            this.vm.getContentPane().repaint();
            ControladorAdministracion cta =new ControladorAdministracion(this.vta, this.torneo.getParticipantes().get(5), this.vm, "torneo");
            this.vta.getBtAtras().addActionListener(this);
            this.contadorCajasPj=6;
        
        }
        else if(ae.getSource().equals(this.vpt.getBtAdm7())){
            this.vta=new VistaAdmin();
            this.vta.setSize(1162, 654);
            this.vm.getContentPane().removeAll();
            this.vm.getContentPane().add(this.vta,BorderLayout.CENTER);
            this.vm.getContentPane().revalidate();
            this.vm.getContentPane().repaint();
            ControladorAdministracion cta =new ControladorAdministracion(this.vta, this.torneo.getParticipantes().get(6), this.vm, "torneo");
            this.vta.getBtAtras().addActionListener(this);
            this.contadorCajasPj=7;
        
        }
        else if(ae.getSource().equals(this.vpt.getBtAdm8())){
            this.vta=new VistaAdmin();
            this.vta.setSize(1162, 654);
            this.vm.getContentPane().removeAll();
            this.vm.getContentPane().add(this.vta,BorderLayout.CENTER);
            this.vm.getContentPane().revalidate();
            this.vm.getContentPane().repaint();
            ControladorAdministracion cta =new ControladorAdministracion(this.vta, this.torneo.getParticipantes().get(7), this.vm, "torneo");
            this.vta.getBtAtras().addActionListener(this);
            this.contadorCajasPj=6;
        
        }
        //Boton que permite que se registren los 7 jugadores restantes para el torneo
        //Cuando esten registrados los 8 jugadores se habilita las opciones para comenzar la batalla
        
        else if(ae.getSource().equals(this.vpt.getBtRegistro())){
            this.vt11=new VistaRegistro1();
             ControladorRegistro controlador= new ControladorRegistro(this.vt11,new VistaRegistro2(),"kimbo");
             controlador.getVt1().getBtEntrar().addActionListener(this);
             if(this.contadorParticipantes>=7){
                 this.vpt.getBtRegistro().setEnabled(false);
                 this.vpt.getBtCPU().setEnabled(false);
                 this.vpt.getBtEmparejar().setEnabled(true);
                 this.vpt.getBtLimpiar().setEnabled(true);
            }
            
        
        }
                //Agregar el  usuario a la lista de usuarios participanes
        else if(ae.getSource().equals(this.vt11.getBtEntrar())){
            try {
                String nombreUsuario2=this.vt11.getTxtUsuario().getText();
                String contraseña2=this.vt11.getTxtContraseña().getText();
                Usuario usuarioN=new Usuario(nombreUsuario2,contraseña2);
                if (usuarioN.validarUsuario(nombreUsuario2, contraseña2)==true && this.torneo.verificarUsuario(usuarioN)==true){
                    this.torneo.getParticipantes().add(usuarioN);
                    System.out.println(this.torneo.getParticipantes());
                    
                    switch(this.contadorParticipantes){
                        case 1:
                             this.vpt.getLbPart2().setText(this.contadorParticipantes+1+") "+this.torneo.getParticipantes().get(this.usuarios).getNombreUsuario()+"("+(this.usuarios+1)+"):");
                             this.vpt.getTxtPart2().setText(this.torneo.getParticipantes().get(this.usuarios).getPersonajes()[0].getNombre());
                             this.vpt.getLbPart2().setVisible(true);
                             this.vpt.getTxtPart2().setVisible(true);
                            break;
                        case 2:
                            
                            this.vpt.getLbPart3().setText(this.contadorParticipantes+1+") "+this.torneo.getParticipantes().get(this.usuarios).getNombreUsuario()+"("+(this.usuarios+1)+"):");
                            this.vpt.getTxtPart3().setText(this.torneo.getParticipantes().get(this.usuarios).getPersonajes()[0].getNombre());
                            this.vpt.getLbPart3().setVisible(true);
                             this.vpt.getTxtPart3().setVisible(true);
                            break;
                        case 3:
                            this.vpt.getLbPart4().setText(this.contadorParticipantes+1+") "+this.torneo.getParticipantes().get(this.usuarios).getNombreUsuario()+"("+(this.usuarios+1)+"):");
                             this.vpt.getTxtPart4().setText(this.torneo.getParticipantes().get(this.usuarios).getPersonajes()[0].getNombre());
                            this.vpt.getLbPart4().setVisible(true);
                             this.vpt.getTxtPart4().setVisible(true);
                             break;            
                        case 4:
                            this.vpt.getLbPart5().setText(this.contadorParticipantes+1+") "+this.torneo.getParticipantes().get(this.usuarios).getNombreUsuario()+"("+(this.usuarios+1)+"):");
                             this.vpt.getTxtPart5().setText(this.torneo.getParticipantes().get(this.usuarios).getPersonajes()[0].getNombre());
                            this.vpt.getLbPart5().setVisible(true);
                             this.vpt.getTxtPart5().setVisible(true);
                             break;
                        case 5:
                            this.vpt.getLbPart6().setText(this.contadorParticipantes+1+") "+this.torneo.getParticipantes().get(this.usuarios).getNombreUsuario()+"("+(this.usuarios+1)+"):");
                             this.vpt.getTxtPart6().setText(this.torneo.getParticipantes().get(this.usuarios).getPersonajes()[0].getNombre());;
                            this.vpt.getLbPart6().setVisible(true);
                             this.vpt.getTxtPart6().setVisible(true);
                             break;    
                        case 6:
                            this.vpt.getLbPart7().setText(this.contadorParticipantes+1+") "+this.torneo.getParticipantes().get(this.usuarios).getNombreUsuario()+"("+(this.usuarios+1)+"):");
                             this.vpt.getTxtPart7().setText(this.torneo.getParticipantes().get(this.usuarios).getPersonajes()[0].getNombre());
                            this.vpt.getLbPart7().setVisible(true);
                             this.vpt.getTxtPart7().setVisible(true);
                             break;   
                        case 7:
                            this.vpt.getLbPart8().setText(this.contadorParticipantes+1+") "+this.torneo.getParticipantes().get(this.usuarios).getNombreUsuario()+"("+(this.usuarios+1)+"):");
                             this.vpt.getTxtPart8().setText(this.torneo.getParticipantes().get(this.usuarios).getPersonajes()[0].getNombre());
                            this.vpt.getLbPart8().setVisible(true);
                             this.vpt.getTxtPart8().setVisible(true);
                             break; 
                        default:
                            break;
                    }
                        
                    
                    

                    ++this.usuarios;
                    ++this.contadorParticipantes;
                    System.out.println(this.usuarios);
                    //Habilita los botones de administracion de usuario para 
                    //cada usuario que se registra
                    switch(this.usuarios){
                        
                        case 2:
                            
                            this.vpt.getBtAdm2().setEnabled(true);
                            break;
                        case 3:
                            this.vpt.getBtAdm3().setEnabled(true);
                            break;
                        case 4:
                            this.vpt.getBtAdm4().setEnabled(true);
                            break;            
                        case 5:
                            this.vpt.getBtAdm5().setEnabled(true);
                            break;
                        case 6:
                            this.vpt.getBtAdm6().setEnabled(true);
                            break;    
                        case 7:
                            this.vpt.getBtAdm7().setEnabled(true);
                            break;   
                        case 8:
                            this.vpt.getBtAdm8().setEnabled(true);
                            break; 
                        default:
                            break;
                    }
                
                }
                else{
                    System.out.println("ERROR");
                    this.vpt.getBtRegistro().setEnabled(true);
                    this.vpt.getBtCPU().setEnabled(true);
                }
            } catch (SQLException ex) {
                Logger.getLogger(ControladorTorneo.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
    
}

