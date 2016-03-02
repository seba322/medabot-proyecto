
package Modelo;

import java.util.ArrayList;
import Controlador.*;
import java.lang.Math.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Batalla {
   private Medaboot jugador1;
   private Medaboot jugador2;
   private ArrayList<Medaboot> personajes;
   
   private Medaboot ganador;
   private Medaboot perdedor;
   
   private String estado;
  
    
    public Batalla (Medaboot jugador1,Medaboot jugador2){
        this.estado="En Proceso";
        
        this.jugador1= jugador1;
        this.jugador1.setPosicion("izquierda");
        this.jugador2=jugador2;
        this.personajes=new ArrayList();
        personajes.add(this.jugador1);
        personajes.add(this.jugador2);
        
    }
    

    public Medaboot getJugador1() {
        return jugador1;
    }

    public Medaboot getJugador2() {
        return jugador2;
        
    }

    public String getEstado() {
        return estado;
    }
    

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
  

  
    public Medaboot getGanador() {
        return ganador;
    }

    public Medaboot getPerdedor() {
        return perdedor;
    }

    public void setGanador(Medaboot ganador) {
        this.ganador = ganador;
    }

    public void setPerdedor(Medaboot perdedor) {
        this.perdedor = perdedor;
    }

   public void setHpVeinte(Medaboot personaje){
       personaje.setHpVeinte();
       personaje.getBrazoDer().setHp2veinte();
       personaje.getBrazoIzq().setHp2veinte();
       personaje.getPiernaDer().setHp2veinte();
       personaje.getPiernaIzq().setHp2veinte();
       personaje.getCabeza().setHp2veinte();
   }
    


    //Se encarga de modificar la informacon de victorias y derrotas
    //De los usuarios, en la base de datos
    public void asignarHistorial(Medaboot ganador,Medaboot perdedor){
       try {
           DBConection conexion=new DBConection();
           if(conexion.conectar()){
               int victorias=0;
               int derrotas=0;
               Statement stm=conexion.consultar();
               String nombreG="'"+ganador.getNombreUsuatrio()+"'";
               String nombreP="'"+perdedor.getNombreUsuatrio()+"'";
               String instruccion="SELECT VICTORIAS FROM USUARIO WHERE NOMBRE="+nombreG;
               String instruccion2="SELECT DERROTAS FROM USUARIO WHERE NOMBRE="+nombreP;
               ResultSet informacion=stm.executeQuery(instruccion);
               while( informacion.next()){
                   victorias=informacion.getInt(1);
               }
               informacion.close();
               Statement stm2=conexion.consultar();
               ResultSet informacion2=stm2.executeQuery(instruccion2);
               while( informacion2.next()){
                   derrotas=informacion2.getInt(1);
               }
               informacion2.close();
               String modVictorias="UPDATE USUARIO SET VICTORIAS="+(victorias+1)+"WHERE NOMBRE="+nombreG;
               String modDerrotas="UPDATE USUARIO SET DERROTAS="+(derrotas+1)+"WHERE NOMBRE="+nombreP;
               stm.executeUpdate(modVictorias);
               stm.executeUpdate(modDerrotas);
               conexion.conectar();
               
           }
       } catch (SQLException ex) {
           Logger.getLogger(Batalla.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
       
    //Se encarga de asignar una medaparte al azar al ganador, accediendo a la base de datos de las medapartes del usuario
    public String asignarMedaparte(Medaboot personajeG,Medaboot personajeP){
        int valorEntero = (int) Math.floor(Math.random()*(4-0+1)+0);// Valor entre M y N, ambos incluidos.
        Medaparte parte=personajeP.getArmadura().get(valorEntero);
        DBConection conexion=new DBConection();
       try {
           if(conexion.conectar()){
               String medapartes="";
               Statement stm=conexion.consultar();
               String nombre="'"+personajeG.getNombreUsuatrio()+"'";
               String inventario="SELECT MEDAPARTEES FROM MEDAPARTEUSUARIO WHERE USUARIO="+nombre ;
               ResultSet informacion=stm.executeQuery(inventario);
               while( informacion.next()){
                   medapartes=informacion.getString(1);
                   
               }
              informacion.close();
              medapartes=medapartes+parte.getNombre();
              
              String instruccion="UPDATE MEDAPARTEUSUARIO SET MEDAPARTEES='"+medapartes+"' WHERE USUARIO="+nombre;
              System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"+medapartes);
              stm.executeUpdate(instruccion);
              conexion.desconectar();
           }
           
       } catch (SQLException ex) {
           Logger.getLogger(Batalla.class.getName()).log(Level.SEVERE, null, ex);
       }
        
        return parte.getNombre();
    }
     public int getPorcent(Medaboot personaje){
        int porcent=(personaje.getSalud()*100)/personaje.getSaludMax();
        return porcent;
    
    }
     public void restablecerAtaque(Medaboot personaje){
               personaje.getBrazoDer().setAtaque(-10);
               personaje.getBrazoIzq().setAtaque(-10);
               personaje.getPiernaDer().setAtaque(-10);
               personaje.getPiernaIzq().setAtaque(-10);
               personaje.getCabeza().setAtaque(-10);
     }
     public void restablecerEsquive(Medaboot personaje){
         int EsquiveA=personaje.getEsquive();
          personaje.setEsquive((EsquiveA+-100));
     }
     public void restablecerPh(Medaboot personaje){
         personaje.setPh(10);
     }
     public void restablecerVida(Medaboot personaje){
         personaje.setSaludF();
         personaje.getBrazoDer().setSalud();
               personaje.getBrazoIzq().setSalud();
               personaje.getPiernaDer().setSalud();
               personaje.getPiernaIzq().setSalud();
               personaje.getCabeza().setSalud();
         
         
     }
     
    

  
    public ArrayList definirPrimero(ArrayList personajes){
        
        return personajes;
    }
    public ArrayList getPersonajes(){
        return this.personajes;
    }
    public void desactivarMdafuerza(Medaboot personaje){
        if(personaje.getMedalla().getMedaFuerza().equals("Velocidad")){
            restablecerEsquive(personaje);
        }
        else if(personaje.getMedalla().getMedaFuerza().equals("Poder")){
            restablecerAtaque(personaje);
        }
        else if(personaje.getMedalla().getMedaFuerza().equals("Reaccion")){
            restablecerPh(personaje);
        }
    
    }
    //Metodo que se encarga de verificar la  medafuerza de los persoanjes
    // De ser el caso, este se encarga de activarla
    public void activarMedafuerza(Medaboot personaje, Medaboot personaje2, int turno){
        System.out.println("MEDALLA"+personaje.getMedalla().getCarga());
        System.out.println("MEDALLA"+personaje.getMedalla().getPotenciador());
        if(personaje.getMedalla().getCarga().equals("Venganza")){
           if(personaje.getMedalla().getMedaFuerza().equals("Velocidad")){
                if(getPorcent(personaje)<=75 &&getPorcent(personaje)>50 && personaje.getLlamadoMeda() <=1 ){
                    int EsquiveA=personaje.getEsquive();
                    personaje.setEsquive((EsquiveA+100));
                    personaje.setMedafuerza(true);
                    personaje.setLlamadoMeda();
                }
                else if(getPorcent(personaje)<=50 &&getPorcent(personaje)>25 && personaje.getLlamadoMeda() <=2){
                    int EsquiveA=personaje.getEsquive();
                    personaje.setEsquive((EsquiveA+100));
                    personaje.setMedafuerza(true);
                    personaje.setLlamadoMeda(); 
                }
                else if(getPorcent(personaje)<=25 &&getPorcent(personaje)>0 && personaje.getLlamadoMeda() <=3){
                    int EsquiveA=personaje.getEsquive();
                    personaje.setEsquive((EsquiveA+100));
                    personaje.setMedafuerza(true);
                    personaje.setLlamadoMeda(); 
                }
            }
           else{
                if(getPorcent(personaje)<=75 &&getPorcent(personaje)>50 && personaje.getLlamadoMeda() <=1 ){
                    personaje.setPh(20);
                    personaje.setMedafuerza(true);
                    personaje.setLlamadoMeda();
                }
                else if(getPorcent(personaje)<=50 &&getPorcent(personaje)>25 && personaje.getLlamadoMeda() <=2){
                    personaje.setPh(20);
                    personaje.setMedafuerza(true);
                    personaje.setLlamadoMeda(); 
                }
                else if(getPorcent(personaje)<=25 &&getPorcent(personaje)>0 && personaje.getLlamadoMeda() <=3){
                    personaje.setPh(20);
                    personaje.setMedafuerza(true);
                    personaje.setLlamadoMeda(); 
                }
           }
            
            
            
        }
        else if(personaje.getMedalla().getCarga().equals("Racha")){
            if(getPorcent(personaje2)<=75 &&getPorcent(personaje2)>50 && personaje.getLlamadoMeda() <=1 ){
               personaje.getBrazoDer().setAtaque(10);
               personaje.getBrazoIzq().setAtaque(10);
               personaje.getPiernaDer().setAtaque(10);
               personaje.getPiernaIzq().setAtaque(10);
               personaje.getCabeza().setAtaque(10);
               personaje.setMedafuerza(true);
               personaje.setLlamadoMeda();
            }
            else if(getPorcent(personaje2)<=50 &&getPorcent(personaje2)>25 && personaje.getLlamadoMeda() <=2){
               personaje.getBrazoDer().setAtaque(10);
               personaje.getBrazoIzq().setAtaque(10);
               personaje.getPiernaDer().setAtaque(10);
               personaje.getPiernaIzq().setAtaque(10);
               personaje.getCabeza().setAtaque(10);
               personaje.setMedafuerza(true);
                personaje.setLlamadoMeda(); 
            }
            else if(getPorcent(personaje2)<=25 &&getPorcent(personaje2)>0 && personaje.getLlamadoMeda() <=3){
               personaje.getBrazoDer().setAtaque(10);
               personaje.getBrazoIzq().setAtaque(10);
               personaje.getPiernaDer().setAtaque(10);
               personaje.getPiernaIzq().setAtaque(10);
               personaje.getCabeza().setAtaque(10);
               personaje.setMedafuerza(true);
               personaje.setLlamadoMeda(); 
            }
        }
        
        else if(personaje.getMedalla().getCarga().equals("Concentracion")){
            if(turno==15){
                personaje.masSalud((personaje.getSaludMax()*100)/25);
                personaje.getBrazoDer().masSalud((personaje.getBrazoDer().getSaludMax()*100)/25);
                personaje.getBrazoIzq().masSalud((personaje.getBrazoIzq().getSaludMax()*100)/25);
                personaje.getPiernaIzq().masSalud((personaje.getPiernaIzq().getSaludMax()*100)/25);
                personaje.getPiernaDer().masSalud((personaje.getPiernaDer().getSaludMax()*100)/25);
                personaje.getCabeza().masSalud((personaje.getCabeza().getSaludMax()*100)/25);
                personaje.setMedafuerza(true);
                
            }
        }
        
    }
    
        
    
    // Metodo que ejecuta las acciones de cada personaje, tales como atacar , con cada medaparte 
    // y modificar sus puntos de vida, dependiendo de la defensa
    public void ejecutarAcciones(ArrayList<ArrayList> ataques,ArrayList<ArrayList> contraAtaques,Medaboot personajeO,Medaboot personajeA,String Adef,String Aesquive){
        int dañoTotal=0;
        int defTotal=0;
        for(ArrayList<Medaparte> accion:ataques){
            int daño= accion.get(0).getAtaque();
            int def=accion.get(1).getDefensa();
            
//         // Verifica la precision de cada medaparte al atacar   
//         int valorEntero = (int) Math.floor(Math.random()*(100-1+1)+1);// Valor entre 100 y 1, ambos incluidos.
//         if(valorEntero>accion.get(0).getPrecision()){
//              personajeA.getMsj().add("El ataque de "+personajeA.getNombre()+" con "+accion.get(0).getNombre()+" falló");
//             continue;
//         }
            //Se enarga de verificar el esquive del personaje objetivo
            if(Aesquive.equals("si")){
                Aesquive="no";
                int esquive=personajeO.getEsquive();
                int valorEntero2 = (int) Math.floor(Math.random()*(100-1+1)+1);// Valor entre 100 y 1, ambos incluidos.
                if(valorEntero2<=esquive){
                    dañoTotal=0;
                    personajeA.getMsj().add(personajeO.getNombre()+" No recibe daño, esquive efectivo");
                    break;
                }
                
                
            }
            
            if(daño>def){
                //Misiles rastreadores
                if(accion.get(0).getHabilidad().equals("Misiles rastreadores")){
                   boolean defContraAtaque=false;
                   for(ArrayList<Medaparte> contraAtaque:contraAtaques){
                        if(contraAtaque.get(0).getHabilidad().equals("Anti aereos")){
                            
                            
                            personajeO.setContraAtaque(personajeO.getContraAtaque()+contraAtaque.get(0).getAtaque()); 
                            
                            personajeA.getMsj().add(personajeO.getNombre()+contraAtaques+" aassassdevuelve y anula el daño de los misiles rastreadores lanzados por "+personajeO.getNombreUsuatrio()+"");
                            defContraAtaque=true;
                            break;
                    
                        } 
                       
                   }    
                   if(defContraAtaque==false){
                        accion.get(1).setSalud(daño, def);
                        personajeA.getMsj().add(personajeA.getNombre()+" Causa "+daño+" con misiles astreadores a "+accion.get(1).getNombre()+" de "+personajeO.getNombre());
                        for(Medaparte parte:personajeO.getArmadura()){
                         if(parte!=accion.get(1)){
                                parte.setSalud((daño*30)/100, 0);
                                personajeA.getMsj().add(parte.getNombre()+" de "+personajeO.getNombre()+" se ve afectado por el daño en area de "+(daño*30)/100+"los misilesrastreadores");
                            }
                        }
                     
                        dañoTotal+=daño;
                   } 
               } 
                            
                            
                
                
                 
                     
                 
                //Regeneracion
                else if(accion.get(0).getHabilidad().equals("Regeneracion")){
                    accion.get(1).setSalud(daño, def);
                    personajeA.getMsj().add(personajeA.getNombre()+" causa "+daño+" con regeneracion a "+accion.get(1).getNombre()+" de "+personajeO.getNombre());
                    personajeA.masSalud((40*personajeA.getSaludMax())/100);
                    for(Medaparte parte: personajeA.getArmadura()){
                        parte.masSalud((5*parte.getSaludMax())/100);

                         personajeA.getMsj().add(parte.getNombre()+" de "+personajeA.getNombre()+" se cura "+(5*parte.getSaludMax())/100);
                    }
                    
                    dañoTotal+=daño;
                }
                //Daño de losanti 
                else if(accion.get(0).getHabilidad().equals("Anti aereos")){
                    ArrayList<Medaparte> borrar=new ArrayList();
                    if(personajeA.getPosicion().equals("izquierda")){
                        for(ArrayList<Medaparte> contraA:contraAtaques){
                           if(contraA.get(0).getHabilidad().equals("Misiles rastreadores")){
                               accion.get(1).setSalud(contraA.get(0).getAtaque(),def);
                               dañoTotal+=contraA.get(0).getAtaque();
                               borrar=contraA;
                               
                                personajeA.getMsj().add(personajeA.getNombre()+" devuelve y anula el daño de los misiles rastreadores lanzados por "+personajeO.getNombreUsuatrio()+"");
                                personajeA.getMsj().add(personajeA.getNombre()+" contraAtaca con "+contraA.get(0).getAtaque()+ " de daños utilizando misiles antiaereos anti aeros a "+accion.get(1).getNombre()+" de "+personajeO.getNombre());
                                break;
                           }
                           
                        }
                         contraAtaques.remove(borrar);
                           
                    }
                    else{
                        accion.get(1).setSalud(personajeA.getContraAtaque(),def);
                        dañoTotal+=personajeA.getContraAtaque();
                         personajeA.getMsj().add(personajeA.getNombre()+" contraAtaca con "+personajeA.getContraAtaque()+ " de daños utilizando misiles antiaereos anti aeros a "+accion.get(1).getNombre()+" de "+personajeO.getNombre());     
                    }
                }
                
                //Cuerpo a cuerpo o Disparo
                else{
                    
                    accion.get(1).setSalud(daño,def);

                     personajeA.getMsj().add(personajeA.getNombre()+" causa "+Integer.toString(daño-def)+" de daño con "+accion.get(1).getNombre()+" a "+accion.get(0).getNombre()+" de "+personajeO.getNombre());
                     dañoTotal+=daño;
                }
            }
            else{

                 personajeA.getMsj().add(accion.get(1).getNombre()+" de "+personajeO.getNombre()+" gracias a su defensa ");
            }
           
           
        }
        if(Adef.equals("si")){
               int dafTotal=personajeO.getDefensa();
                if(defTotal>dañoTotal){
                    dañoTotal=0;
                     personajeA.getMsj().add(personajeO.getNombre()+ "no recibe daño a causa de su defensa");
                  
                }
                else{
                  dañoTotal-=defTotal;
                  personajeA.getMsj().add("aqui si");
                }
            }
       
        personajeO.setSalud(dañoTotal);
    }
        
        
}
