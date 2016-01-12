
package Modelo;

import java.util.ArrayList;


public class Batalla {
   private Medaboot jugador1;
   private Medaboot jugador2;
    
    public Batalla (Medaboot jugador1,Medaboot jugador2){
        this.jugador1= jugador1;
        this.jugador2=jugador2;
        ArrayList personajes=new ArrayList();
        personajes.add(this.jugador1);
        personajes.add(this.jugador2);
        
    }

    public Medaboot getJugador1() {
        return jugador1;
    }

    public Medaboot getJugador2() {
        return jugador2;
    }
    
    public ArrayList definirPrimero(ArrayList personajes){
        return personajes;
    }
        
        
    
    
    
            
            
       
            
    
}
