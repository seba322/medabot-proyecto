/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author sebastian
 */
public class Cpumedaboot  extends Medaboot {
    private String tipo;
    private ArrayList <Integer>  ataques;
    
    public Cpumedaboot(String nombre) throws SQLException  {
        super(nombre);
        this.ataques = new <Integer> ArrayList();
        this.ataques.add(this.brazoIz.getSalud());
        this.ataques.add(this.brazoDe.getSalud());
        this.ataques.add(this.piernaIz.getSalud());
        this.ataques.add(this.piernaDe.getSalud());
        this.ataques.add(this.cabeza.getSalud());
        
    }
    
    
public void menejarCpu1(String tipo, int turno){
    if (turno == 1){
      
    
    }
    







}
public void menejarCpu2(String tipo){}
public void menejarCpu3(String tipo){}
}
