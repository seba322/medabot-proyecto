
package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Modelo.*;
import Vista.VistaHistorial;
import Vista.VistaMenu;
import java.awt.BorderLayout;
import java.io.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladorHistorial implements ActionListener {
    private String nombreUsuarioPrincipal;
    private VistaHistorial vth;
    private VistaMenu vm;
    private ArrayList<String> nombres;
    
    public ControladorHistorial(String nombreUsuarioPrincipal,VistaHistorial vth,VistaMenu vm) throws SQLException{
        this.nombreUsuarioPrincipal=nombreUsuarioPrincipal;
        Usuario usuario=new Usuario(nombreUsuarioPrincipal);
        this.vth=vth;
        this.vm=vm;
        String OrigenCarpeta ="C:\\HistorialMedaboot";
        File directorio = new File( OrigenCarpeta );        
        directorio.mkdir(); 
        //Se encarga por defecto de  completar el historial
        //Para el usuario que tiene la seccion activa
        this.vth.getTxtBganadas().setText(Integer.toString(usuario.getVictorias()));
        this.vth.getTxtBperdidas().setText(Integer.toString(usuario.getDerrotas()));
        this.vth.getTxtTorneos().setText(Integer.toString(usuario.getTorneos()));
        this.vth.getTxtHusuario().setText(nombreUsuarioPrincipal);
        this.nombres=new Usuario().getNombresUsers();
        for(String nombre:nombres){
            if(nombre.equals("CPU1") || nombre.equals("CPU2") || nombre.equals("CPU3")){
                this.vth.getItCpu().addItem(nombre);
            }
            else{
                this.vth.getItUsuarios().addItem(nombre);
            }
        }
        this.vth.getBtUsuarios().addActionListener(this);
        this.vth.getBtCpu().addActionListener(this);
        this.vth.getBtTxt().addActionListener(this);
        this.vth.getBtAtras().addActionListener(this);
        this.vth.getBtBuscar().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        //Permite ver el historial del usuario seleccionado
       if(ae.getSource().equals(this.vth.getBtUsuarios())){
           
           try {
               
               this.vth.getLbArchivo().setVisible(false);
               String nombre=(String) this.vth.getItUsuarios().getSelectedItem();
               Usuario usuario=new Usuario(nombre);
               this.vth.getTxtBganadas().setText(Integer.toString(usuario.getVictorias()));
               this.vth.getTxtBperdidas().setText(Integer.toString(usuario.getDerrotas()));
               this.vth.getTxtTorneos().setText(Integer.toString(usuario.getTorneos()));
               this.vth.getTxtHusuario().setText(nombre);
               
           } catch (SQLException ex) {
               Logger.getLogger(ControladorHistorial.class.getName()).log(Level.SEVERE, null, ex);
           }
           
       }
       //Permite ver el historial de la Cpu seleccionada
       else if(ae.getSource().equals(this.vth.getBtCpu())){
           try {
               this.vth.getLbArchivo().setVisible(false);
               String nombre=(String) this.vth.getItCpu().getSelectedItem();
               Usuario usuario=new Usuario(nombre);
               this.vth.getTxtBganadas().setText(Integer.toString(usuario.getVictorias()));
               this.vth.getTxtBperdidas().setText(Integer.toString(usuario.getDerrotas()));
               this.vth.getTxtTorneos().setText(Integer.toString(usuario.getTorneos()));
               this.vth.getTxtHusuario().setText(nombre);
           } catch (SQLException ex) {
               Logger.getLogger(ControladorHistorial.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
       //Permite obtener el historial del usuario escrito en el buscador
       else if(ae.getSource().equals(this.vth.getBtBuscar())){
           boolean conf=false;
           String nombreU=this.vth.getTxtBuscar().getText();
           for(String nombre:this.nombres){
               if(nombreU.equals(nombre)){
                    this.vth.getLbError().setVisible(false);
                    this.vth.getLbArchivo().setVisible(false);
                    conf=true;
                    Usuario usuario = null;
                   try {
                       usuario = new Usuario(nombreU);
                    } catch (SQLException ex) {
                       Logger.getLogger(ControladorHistorial.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    this.vth.getTxtBganadas().setText(Integer.toString(usuario.getVictorias()));
                    this.vth.getTxtBperdidas().setText(Integer.toString(usuario.getDerrotas()));
                    this.vth.getTxtTorneos().setText(Integer.toString(usuario.getTorneos()));
                    this.vth.getTxtHusuario().setText(nombreU);   
                }
                 
            }
           if(conf==false){
               this.vth.getLbError().setVisible(true); 
           }
        }
       //Permite escribir el historial en un archivo de texto al pulsar el boton 
       else if(ae.getSource().equals(this.vth.getBtTxt())){
           PrintWriter procesador=null;
           try {
               String nombre="Historial"+this.vth.getTxtHusuario().getText();
               File adquisicion= new File("C:\\HistorialMedaboot\\"+nombre+".txt");
               procesador = new PrintWriter(adquisicion);
               procesador.println("\nHistorial de Victorias y Derrotas de "+this.vth.getTxtHusuario().getText()+"\n");
               procesador.println();
               procesador.println("\nEl numero de Batallas ganadas es: "+this.vth.getTxtBganadas().getText()+"\n");
               procesador.println("\nEl numero de Batallas perdidas es: "+this.vth.getTxtBperdidas().getText()+"\n");
               procesador.println("\nEl numero de Torneos ganados es: "+this.vth.getTxtTorneos().getText()+"\n");
               procesador.close();
               this.vth.getLbArchivo().setVisible(true);
           } catch (FileNotFoundException ex) {
               Logger.getLogger(ControladorHistorial.class.getName()).log(Level.SEVERE, null, ex);
           } finally {
               procesador.close();
           }
       }
       //Permite volver al menu Principal
       else if(ae.getSource().equals(this.vth.getBtAtras())){
          this.vm.getContentPane().removeAll();
          this.vm.getContentPane().add(this.vm.getjPanel1(),BorderLayout.CENTER);
          this.vm.getContentPane().revalidate();
          this.vm.getContentPane().repaint();
       }
        
    }
    
}
