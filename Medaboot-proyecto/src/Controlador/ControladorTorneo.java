
package Controlador;
import Vista.*;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Modelo.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.*;
import javax.swing.JTextField;



public class ControladorTorneo implements ActionListener{
    private VistaMenuTorneo vmt;
    private VistaPreparacionTorneo vpt;
    private VistaTranscursoTorneo vtt;
    private VistaMenu vm;
    private Torneo torneo;
    private VistaRegistro1 vt11;
    private int usuarios;
    private int contadorGlobal;
    private int contadorCasillas;
    private VistaFinalB vf;
    private Batalla batalla;
    private ArrayList<Medaboot> perdedores;
    
    
    
    public ControladorTorneo(VistaMenuTorneo vmt,VistaPreparacionTorneo vpt,VistaTranscursoTorneo vtt,VistaMenu vm,Torneo torneo){
        this.torneo=torneo;
        this.perdedores=new ArrayList<Medaboot>();
        this.vf=new VistaFinalB();
        this.contadorGlobal=0;
        this.contadorCasillas=1;
        this.usuarios=1;
        this.vmt=vmt;
        this.vpt=vpt;
        this.vtt=vtt;
        this.vm=vm;
        this.vmt.getBtTnormal().addActionListener(this);
        this.vpt.getBtRegistro().addActionListener(this);
        this.vpt.getBtComenzar().addActionListener(this);
        this.vpt.getBtEmparejar().addActionListener(this);
        this.vpt.getBtLimpiar().addActionListener(this);
        this.vtt.getBtRonda1().addActionListener(this);
        this.vtt.getBtRonda2().addActionListener(this);
        this.vtt.getBtFinal().addActionListener(this);
        //this.vf.getBtContinuar2().addActionListener(this);
        this.vpt.getBtAtras2().addActionListener(this);
        this.vpt.getTxtParticipantes().append("1)"+this.torneo.getUser().getNombreUsuario()+":                             "+this.torneo.getUser().getPersonajes()[0].getNombre()+"\n");
    }
    
    

    @Override
    public void actionPerformed(ActionEvent ae) {
        //Comenzar el torneo
        if(ae.getSource().equals(this.vpt.getBtComenzar())){
            this.vtt.setSize(844, 584);
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
           
            
            
        }
        else if(ae.getSource().equals(this.vtt.getBtFinal())){
            VistaBatalla vb=new VistaBatalla();
            this.vf=new VistaFinalB();
                
                this.batalla=new Batalla(this.torneo.getCombatientes().get(contadorGlobal),this.torneo.getCombatientes().get(contadorGlobal+1));
                ControladorBatalla2 ctb2= new ControladorBatalla2(this.batalla,vb,this.vm,this.vtt,"Torneo",this.vf);
                ctb2.getVf().getBtContinuar2().addActionListener(this);
                vb.setSize(844, 584);
                System.out.println(this.torneo.getCombatientes());
                
                this.vm.getContentPane().removeAll();
                this.vm.getContentPane().add(vb,BorderLayout.CENTER);
                this.vm.getContentPane().revalidate();
                this.vm.getContentPane().repaint();
                this.vtt.getBtFinal().setEnabled(false);
                this.vtt.getBtTerminar().setEnabled(true);
                
        }
        
        else if(ae.getSource().equals(this.vtt.getBtRonda2())){
             VistaBatalla vb=new VistaBatalla();
             this.vf=new VistaFinalB();
                
                this.batalla=new Batalla(this.torneo.getCombatientes().get(contadorGlobal),this.torneo.getCombatientes().get(contadorGlobal+1));
                ControladorBatalla2 ctb2= new ControladorBatalla2(batalla,vb,this.vm,this.vtt,"Torneo",this.vf);
                ctb2.getVf().getBtContinuar2().addActionListener(this);
                vb.setSize(844, 584);
                System.out.println(this.torneo.getCombatientes());
                
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
                    for(Medaboot perdedor:this.perdedores){
                        this.torneo.getCombatientes().remove(perdedor);
                    }
                    this.perdedores.clear();
                    this.contadorGlobal=0;
                }
        }
        
        else if(ae.getSource().equals(this.vtt.getBtRonda1())){
                VistaBatalla vb=new VistaBatalla();
                this.vf=new VistaFinalB();
                
                this.batalla=new Batalla(this.torneo.getCombatientes().get(contadorGlobal),this.torneo.getCombatientes().get(contadorGlobal+1));
                ControladorBatalla2 ctb2= new ControladorBatalla2(batalla,vb,this.vm,this.vtt,"Torneo",this.vf);
                ctb2.getVf().getBtContinuar2().addActionListener(this);
                vb.setSize(844, 584);
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
                    for(Medaboot perdedor:this.perdedores){
                        this.torneo.getCombatientes().remove(perdedor);
                    }
                    this.perdedores.clear();
                    this.contadorGlobal=0;
                }
        }
        
        else if(ae.getSource().equals(this.vf.getBtContinuar2())){
            
            this.vtt.setSize(844, 584);
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
                    break;
                case 5:
                    this.vtt.getTxtPjr13().setText(this.batalla.getGanador().getNombre());
                    break;
                case 6:
                    this.vtt.getTxtPjr23().setText(this.batalla.getGanador().getNombre());
                    break;
                case 7:
                    this.vtt.getTxtGanador().setText(this.batalla.getGanador().getNombre());
                    this.vtt.getLbGanador().setVisible(true);
                    break;
                default:
                    break;
            }
            this.contadorCasillas=this.contadorCasillas+1;
            System.out.print("ESTE ES EL CONTADOR CASILLAS"+this.contadorCasillas);
            
            
        }
                
        
        //Cambiar a vista de preparacion torneo, cuando se pula el torneo normal
        else if(ae.getSource().equals(this.vmt.getBtTnormal())){
            this.vpt.setSize(844, 584);
            this.vm.getContentPane().removeAll();
            this.vm.getContentPane().add(this.vpt,BorderLayout.CENTER);
            this.vm.getContentPane().revalidate();
            this.vm.getContentPane().repaint();  
        }
        //Boton que permite que se registren los 7 jugadores restantes para el torneo
        //Cuando esten registrados los 8 jugadores se habilita las opciones para comenzar la batalla
        
        else if(ae.getSource().equals(this.vpt.getBtRegistro())){
            this.vt11=new VistaRegistro1();
             ControladorRegistro controlador= new ControladorRegistro(this.vt11,new VistaRegistro2(),"kimbo");
             controlador.getVt1().getBtEntrar().addActionListener(this);
             if(this.usuarios>=7){
                 this.vpt.getBtRegistro().setEnabled(false); 
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
                if (new Usuario(nombreUsuario2,contraseña2).validarUsuario(nombreUsuario2, contraseña2)==true && this.torneo.verificarUsuario(new Usuario(nombreUsuario2,contraseña2))==true){
                    this.torneo.getParticipantes().add(new Usuario(nombreUsuario2,contraseña2));
                    System.out.println(this.torneo.getParticipantes());
                    
                    this.vpt.getTxtParticipantes().append(Integer.toString(this.usuarios+1)+")"+this.torneo.getParticipantes().get(usuarios).getNombreUsuario()+":                             "+this.torneo.getParticipantes().get(usuarios).getPersonajes()[0].getNombre()+"\n");
                    ++this.usuarios;
                    System.out.println(this.usuarios);
                
                }
                else{
                    System.out.println("ERROR");
                }
            } catch (SQLException ex) {
                Logger.getLogger(ControladorTorneo.class.getName()).log(Level.SEVERE, null, ex);
            }
            
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
            this.vpt.getTxtParticipantes().setText("");
            this.torneo.getCombatientes().clear();
            this.torneo.getParticipantes().clear();
            this.torneo.getParticipantes().add(this.torneo.getUser());
            this.usuarios=1;
            this.vpt.getTxtParticipantes().append("Usuario                              Personaje\n");
            this.vpt.getTxtParticipantes().append("1)"+this.torneo.getUser().getNombreUsuario()+":                             "+this.torneo.getUser().getPersonajes()[0].getNombre()+"\n");
        }
        
    }
    
}

