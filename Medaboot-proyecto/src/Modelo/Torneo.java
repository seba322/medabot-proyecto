
package Modelo;

import java.util.ArrayList;


public class Torneo {
    private ArrayList<Usuario> participantes;
    private Usuario user;
    private ArrayList<Medaboot> combatientes;
    public Torneo(Usuario user){
        this.participantes=new ArrayList<Usuario>();
        this.combatientes= new ArrayList<Medaboot>();
        this.user=user;
        this.participantes.add(this.user);
    }

    public Usuario getUser() {
        return user;
    }

    public ArrayList<Usuario> getParticipantes() {
        return participantes;
    }

    public ArrayList<Medaboot> getCombatientes() {
        return combatientes;
    }
    
    //Metodo que se encarga de verifica si ya se registro un ususario al torneo
    public  boolean verificarUsuario(Usuario user){
        for(Usuario usuario:this.participantes){
            if(user.getNombreUsuario().equals(usuario.getNombreUsuario())){
                return false;
                
            }
        }
        return true;
    }
    //Metodo que se encarga de crear una lista, que define el orden de forma aleatoria para el torneo
    public void emparejarPjs(){
        ArrayList<Integer> numerosAzar= new ArrayList<Integer>();
        int contador=0;
        while(contador<8){
            int valorEntero = (int) Math.floor(Math.random()*(7-0+1)+0);// Valor entre M y N, ambos incluidos.
            while(numerosAzar.contains(valorEntero)==true){
                 valorEntero = (int) Math.floor(Math.random()*(7-0+1)+0);// Valor entre M y N, ambos incluidos.
            }
            this.combatientes.add(participantes.get(valorEntero).getPersonajes()[0]);
            numerosAzar.add(valorEntero);
            System.out.println(valorEntero);
            ++contador;
            
        }
    }
    
    
}
