
package Modelo;

import java.util.ArrayList;
import Controlador.*;


public class Batalla {
   private Medaboot jugador1;
   private Medaboot jugador2;
   private ArrayList<Medaboot> personajes;
   private ControladorBatalla2 ctb2;
   private ArrayList mensajes;
    
    public Batalla (Medaboot jugador1,Medaboot jugador2){
        this.jugador1= jugador1;
        this.jugador2=jugador2;
        this.personajes=new ArrayList();
        personajes.add(this.jugador1);
        personajes.add(this.jugador2);
        
    }
    public Batalla(ControladorBatalla2 ctb2){
        this.ctb2=ctb2;
    }

    public Medaboot getJugador1() {
        return jugador1;
    }

    public Medaboot getJugador2() {
        return jugador2;
        
    }

    public ArrayList getMensajes() {
        return mensajes;
    }
    
    
    public ArrayList definirPrimero(ArrayList personajes){
        
        return personajes;
    }
    public ArrayList getPersonajes(){
        return this.personajes;
    }
    // Metodo que ejecuta las acciones de cada personaje, tales como atacar , con cada medaparte 
    // y modificar sus puntos de vida, dependiendo de la defensa
    public void ejecutarAcciones(ArrayList<ArrayList> ataques,Medaboot personaje,String Adef,String Aesquive){
        int dañoTotal=0;
        int defTotal=0;
        for(ArrayList<Medaparte> accion:ataques){
            int daño= accion.get(0).getAtaque();
            int def=accion.get(1).getDefensa();
            this.mensajes.add(accion.get(1));
            if(daño>def){
                accion.get(1).setSalud(daño,def);
            }
            else{
                String mensaje="La defense evita que el jugador reciba daño";
                this.mensajes.add(mensaje);
                
            dañoTotal+=daño;
            
        }
           if(Adef.equals("si")){
               int dafTotal=personaje.getDefensa();
                if(defTotal>dañoTotal){
                    String mensaje2="No recibe daño";
                    this.mensajes.add(mensaje2);
                }
                else{
                  dañoTotal-=defTotal;
                  
                }
            }
           personaje.setSalud(dañoTotal);
        }
        
        
    }
        
        
}
