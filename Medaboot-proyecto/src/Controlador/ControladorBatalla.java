/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Vista.VistaBatalla;
import Vista.VistaMenuB;
import Vista.VistaPreparacionBPj;
import Vista.VistaMenu;
import Vista.VistaRegistro1;
import Vista.VistaRegistro2;
import java.awt.BorderLayout;

public class ControladorBatalla implements ActionListener {
    VistaMenuB vmb;
    VistaBatalla vb;
    VistaPreparacionBPj vtp;
    VistaMenu vm;
    
    public ControladorBatalla(VistaMenuB vmb,VistaBatalla vb,VistaPreparacionBPj vtp,VistaMenu vm){
        
        this.vm=vm;
        this.vb=vb;
        this.vmb=vmb;
        this.vtp=vtp;
        this.vmb.getBtJugador().addActionListener(this);
        this.vtp.getBtComenzar().addActionListener(this);
        this.vtp.getBtAtras().addActionListener(this);
        this.vmb.getBtAtras().addActionListener(this);
        this.vtp.getBtRegistro2().addActionListener(this);
              
    }
    

    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource().equals(this.vmb.getBtJugador())){
            
            this.vtp.setSize(844, 584);
            this.vm.getContentPane().removeAll();
            this.vm.getContentPane().add(this.vtp,BorderLayout.CENTER);
            this.vm.getContentPane().revalidate();
            this.vm.getContentPane().repaint();
            
          
        }
        
        else if(ae.getSource().equals(this.vtp.getBtComenzar())){
            this.vb.setSize(844, 584);
            this.vm.getContentPane().removeAll();
            this.vm.getContentPane().add(this.vb,BorderLayout.CENTER);
            this.vm.getContentPane().revalidate();
            this.vm.getContentPane().repaint();
        }
        
        else if(ae.getSource().equals(this.vmb.getBtAtras())){
          this.vm.getContentPane().removeAll();
          this.vm.getContentPane().add(this.vm.getjPanel1(),BorderLayout.CENTER);
          this.vm.getContentPane().revalidate();
          
          this.vm.getContentPane().repaint();
           
        }
        else if(ae.getSource().equals(this.vtp.getBtAtras())){
          
            vmb.setSize(844, 584);
            this.vm.getContentPane().removeAll();
            this.vm.getContentPane().add(vmb,BorderLayout.CENTER);
            this.vm.getContentPane().revalidate();
            this.vm.getContentPane().repaint();
        }
        
        else if(ae.getSource().equals(this.vtp.getBtRegistro2())){
            ControladorRegistro ct= new ControladorRegistro( new VistaRegistro1(),new VistaRegistro2(),null);
        }
       
    }
    
}
