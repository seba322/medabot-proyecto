
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
    private VistaRegistro1 vt1;
    private int usuarios;
    
    
    
    public ControladorTorneo(VistaMenuTorneo vmt,VistaPreparacionTorneo vpt,VistaTranscursoTorneo vtt,VistaMenu vm,Torneo torneo){
        this.torneo=torneo;
        this.vmt=vmt;
        this.vpt=vpt;
        this.vtt=vtt;
        this.usuarios=1;
        this.vm=vm;
        this.vmt.getBtTnormal().addActionListener(this);
        this.vpt.getBtRegistro().addActionListener(this);
        this.vpt.getBtComenzar().addActionListener(this);
        this.vpt.getBtEmparejar().addActionListener(this);
        this.vpt.getBtLimpiar().addActionListener(this);
        this.vtt.getBtSig().addActionListener(this);
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
        else if(ae.getSource().equals(this.vtt.getBtSig())){
            int contador=0;
        
            while(contador< this.torneo.getCombatientes().size()){
                VistaBatalla vb=new VistaBatalla();
                Batalla batalla=new Batalla(this.torneo.getCombatientes().get(contador),this.torneo.getCombatientes().get(contador+1));
                ControladorBatalla2 ctb2= new ControladorBatalla2(batalla,vb,this.vm);
                vb.setSize(844, 584);
                this.vm.getContentPane().removeAll();
                this.vm.getContentPane().add(vb,BorderLayout.CENTER);
                this.vm.getContentPane().revalidate();
                this.vm.getContentPane().repaint();
                contador+=2;
            }
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
            this.vt1=new VistaRegistro1();
             ControladorRegistro controlador= new ControladorRegistro(this.vt1,new VistaRegistro2(),"kimbo");
             controlador.getVt1().getBtEntrar().addActionListener(this);
             if(this.usuarios>=7){
                 this.vpt.getBtRegistro().setEnabled(false); 
                 this.vpt.getBtEmparejar().setEnabled(true);
                 this.vpt.getBtLimpiar().setEnabled(true);
            }
        
        }
        //Agregar el  usuario a la lista de usuarios participanes
        else if(ae.getSource().equals(this.vt1.getBtEntrar())){
            try {
                String nombreUsuario2=this.vt1.getTxtUsuario().getText();
                String contraseña2=this.vt1.getTxtContraseña().getText();
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
