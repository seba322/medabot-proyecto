
package Modelo;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class Torneo {
    private ArrayList<Usuario> participantes;
    private Usuario user;
    private ArrayList<Medaboot> combatientes;
    private ArrayList<Medaboot> personajes;
    private Medaboot cpu;
    public Torneo(Usuario user) throws SQLException{
        this.cpu= new Medaboot("'CPU1'");
        this.participantes=new ArrayList<Usuario>();
        this.combatientes= new ArrayList<Medaboot>();
        this.personajes= new ArrayList<Medaboot>();
        this.user=user;
        this.participantes.add(this.user);
        
    }

    public Usuario getUser() {
        return user;
    }

    public ArrayList<Usuario> getParticipantes() {
        return participantes;
    }

    public Medaboot getCpu() {
        return cpu;
    }

    public void setCpu(Medaboot cpu) {
        this.cpu = cpu;
    }

    public ArrayList<Medaboot> getPersonajes() {
        return personajes;
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
        for(Usuario usuario:this.participantes){
            this.personajes.add(usuario.getPersonajes()[0]);
        }
        ArrayList<Integer> numerosAzar= new ArrayList<Integer>();
        int contador=0;
        while(contador<8){
            int valorEntero = (int) Math.floor(Math.random()*(7-0+1)+0);// Valor entre 7 y 0, ambos incluidos.
            while(numerosAzar.contains(valorEntero)==true){
                 valorEntero = (int) Math.floor(Math.random()*(7-0+1)+0);// Valor entre 7 y 0, ambos incluidos.
            }
            this.combatientes.add(personajes.get(valorEntero));
            numerosAzar.add(valorEntero);
            System.out.println(valorEntero);
            ++contador;
            
        }
        
       
    }
    
    public void activarPjOculto(String nombreUsuario) throws SQLException{
        DBConection conexion=new DBConection();
        if(conexion.conectar()){
            String nombre="'"+nombreUsuario+"'";
            String instruccion="UPDATE USUARIO SET PJOCULTO= true WHERE NOMBRE="+nombre;
            Statement consulta = conexion.consultar();  
            consulta.executeUpdate(instruccion);
        
        }
        conexion.desconectar();
    }
    
    
}
