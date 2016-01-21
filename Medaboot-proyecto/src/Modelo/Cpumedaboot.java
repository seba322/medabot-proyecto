/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.awt.Button;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JButton;
import javax.swing.JToggleButton;


public class Cpumedaboot  extends Medaboot {
    private String tipo;
    private ArrayList <Medaparte>  ataques;
    private ArrayList<Medaparte> ordenadas;
    private ArrayList<Medaparte> ordenadas2;
    public Cpumedaboot(String nombre) throws SQLException  {
        super(nombre);
        this.ordenadas=new <Medaparte>ArrayList();
        this.ordenadas2=new <Medaparte>ArrayList();
        this.ataques = new <Medaparte> ArrayList();
        this.ataques.add(this.brazoIz);
        this.ataques.add(this.brazoDe);
        this.ataques.add(this.piernaIz);
        this.ataques.add(this.piernaDe);
        this.ataques.add(this.cabeza);
        
    }
    
    public void ordenarMedapartes(){
        int maximo;
        int posicion;
        ArrayList<Integer> listaNumeros=new ArrayList<Integer>();
        for(Medaparte parte:this.ataques){
            listaNumeros.add(parte.getAtaque());
        }

        while(ordenadas.size()<5){
            
                maximo=Collections.max(listaNumeros);
                posicion=listaNumeros.indexOf(maximo);
                ordenadas.add(ataques.get(posicion));
                listaNumeros.set(posicion, 0);
            
        }
        
        
        
        
        System.out.println(ordenadas);
            
    }
    
    
     public void ordenarMedapartes2(Medaboot jugador){
        int maximo;
        int posicion;
        ArrayList<Medaparte> listaJugador2=new ArrayList<Medaparte>();
        listaJugador2.add(jugador.getBrazoIzq());
        listaJugador2.add(jugador.getBrazoDer());
        listaJugador2.add(jugador.getPiernaIzq());
        listaJugador2.add(jugador.getPiernaDer());
        listaJugador2.add(jugador.getCabeza());
        ArrayList<Integer> listaNumeros=new ArrayList<Integer>();
        for(Medaparte parte:listaJugador2){
            listaNumeros.add(parte.getDefensa());
        }

        while(ordenadas2.size()<5){
            
                maximo=Collections.max(listaNumeros);
                posicion=listaNumeros.indexOf(maximo);
                ordenadas2.add(listaJugador2.get(posicion));
                listaNumeros.set(posicion, 0);
            
        }
    
     }
    
   
public void menejarCpu1(String tipo, int turno,ArrayList<JToggleButton> botones1 ,ArrayList<JToggleButton> botones2, JButton confirmar , Medaboot jugador1){
    if (turno == 1){
        ordenarMedapartes();
        ordenarMedapartes2(jugador1);
       
       for ( int i =0 ;i< this.ordenadas.size();){
            switch (this.ordenadas.get(i).toString()){
                case "brazoIz": botones1.get(0).doClick();
                                break;
                case "brazoDe":botones1.get(1).doClick();
                                break;
                case "piernaIz":botones1.get(2).doClick();
                                break;
                case "piernaDe":botones1.get(3).doClick();
                                break;
                case "cabeza" :  botones1.get(4).doClick();
                                break;  
            }
            
                                
           switch (this.ordenadas2.get(i).toString()){
                case "brazoIz": botones2.get(0).doClick();
                                break;
                case "brazoDe":botones2.get(1).doClick();
                                break;
                case "piernaIz":botones2.get(2).doClick();
                                break;
                case "piernaDe":botones2.get(3).doClick();
                                break;
                case "cabeza" :  botones2.get(4).doClick();
                                break;                       
            }
           confirmar.doClick();
           this.ordenadas.remove(i);
           this.ordenadas2.remove(i);
           
       }
        
        
        }
   
   
         
         
     }
     
     
    
         
            
         
     
     }
        
    
    
    








