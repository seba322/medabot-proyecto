/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.*;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JToggleButton;

/**
 *
 * @author sebastian
 */
public class Medaboot {
    protected String nombre;
    protected Medalla medalla;
    protected int salud;
    protected int saludMax;
    protected int ph;
    protected int llamadoMeda;
    protected ArrayList<Medaparte> armadura;
    protected Medaparte brazoIz;
    protected Medaparte brazoDe;
    protected Medaparte cabeza;
    protected Medaparte piernaIz;
    protected Medaparte piernaDe;
    protected int esquive;
    protected int defensa;
    protected int ataque;
    protected ArrayList<Integer> ataques=new ArrayList<Integer> ();
    protected ArrayList<Integer> defensas=new ArrayList<Integer> ();
    protected String tipo;
  //  private Medaparte modificador;
    
    public Medaboot (String nombre) throws SQLException{
        this.llamadoMeda=1;
        DBConection conexion=new DBConection();
        if(conexion.conectar()){
         Statement stm=conexion.consultar();
         String seleccionar= "SELECT *FROM MEDABOT WHERE NOMBRE="+nombre;
         ResultSet re=stm.executeQuery(seleccionar);
         this.nombre=nombre;
         while(re.next()){
         this.medalla= new Medalla("'"+re.getString(9)+"'");
         System.out.println(re.getString(5));
         this.brazoIz = new Medaparte(re.getString(5));
         this.brazoDe= new Medaparte(re.getString(6));
         this.piernaIz= new Medaparte(re.getString(7));
         this.piernaDe= new Medaparte(re.getString(8));
         this.cabeza= new Medaparte(re.getString(4));
         this.armadura=new ArrayList<Medaparte> ();
         
         this.salud= re.getInt (1);
         this.saludMax=re.getInt (1);
          
         }
         
         this.armadura.add(this.cabeza);
         this.armadura.add(this.piernaDe);
         this.armadura.add(this.piernaIz);
         this.armadura.add(this.brazoDe);
         this.armadura.add(this.brazoIz);
         this.defensa=this.brazoIz.getDefensa()+this.brazoDe.getDefensa()+this.piernaIz.getDefensa()+this.piernaDe.getDefensa()+this.cabeza.getDefensa();
         this.ataques.add(this.brazoIz.getAtaque());
         this.ataques.add(this.brazoDe.getAtaque());
         this.ataques.add(this.piernaIz.getAtaque());
         this.ataques.add(this.piernaDe.getAtaque());
         this.ataques.add(this.cabeza.getAtaque());
         this.defensas.add(this.brazoIz.getDefensa());
         this.defensas.add(this.brazoDe.getDefensa());
         this.defensas.add(this.piernaIz.getDefensa());
         this.defensas.add(this.piernaDe.getDefensa());
         this.defensas.add(this.cabeza.getDefensa());
         System.out.println("AQUI SALUD"+this.salud);
         this.ataque=this.brazoIz.getAtaque()+this.brazoDe.getAtaque()+this.piernaIz.getAtaque()+this.piernaDe.getAtaque()+this.cabeza.getAtaque();
         this.esquive = (this.brazoIz.getEsquive()+this.brazoDe.getEsquive()+this.piernaIz.getEsquive()+this.piernaDe.getEsquive()+this.cabeza.getEsquive())/100; 
        // this.modificador= null;
         System.out.println(this.nombre);
         System.out.println("MEDABOTTTTTTTTTTTTTTTTTTTTTTTTTTTTT");
        }
    
    
    
    }

    public String getNombre() {
       
        return this.nombre;
    
    }

    /**
     *
     * @return
     */
    public Medaparte getPiernaDer() {
        return this.piernaDe;
    }

    public Medaparte getPiernaIzq() {
        return this.piernaIz;
    }

    public Medaparte getBrazoDer() {
        return this.brazoDe;
    }

    public Medaparte getBrazoIzq() {
        return this.brazoIz;
    }
    public Medaparte getCabeza() {
       return this.cabeza;
    }

    public Medalla getMedalla() {
        return this.medalla;
        
    }

    public int getEsquive() {
        return esquive;
    }

    public int getDefensa() {
        return this.defensa;
    }

    public int getSalud() {
        return salud;
    }

    public int getPh() {
        return ph;
    }

    public void setSalud(int dañoTotal) {
        this.salud = this.salud-dañoTotal;
    }

    public int getSaludMax() {
        return saludMax;
    }

    public int getLlamadoMeda() {
        return llamadoMeda;
    }

    public void setEsquive(int esquive) {
        this.esquive = esquive;
    }

    public void setLlamadoMeda() {
        this.llamadoMeda += 1;
    }
    public void masSalud(int suma){
        this.salud+=suma;
    }

    public void setPh(int ph) {
        this.ph = ph;
    }
    public void setSaludF(){
        this.salud=saludMax;
    }

    public ArrayList<Medaparte> getArmadura() {
        return armadura;
    }
     public void setDefensa(int i) {
      this.defensa=i;
    }
    public int getAtaque() {
        return this.ataque;
    
    }

   public ArrayList<Integer> getDefensas(){
       return this.defensas;
   }
   public ArrayList<Integer> getAtaques(){
       return this.ataques;
   }
    
   
    
    
    
    

    public void setMedaparte( String cambio , String tipo) throws SQLException{
      
      switch (tipo){
          case "BRAZOIZQ" : this.brazoIz= new Medaparte (cambio);
          break;
          case "BRAZODER" : this.brazoDe= new Medaparte (cambio);
          break;
          case "PIERNAIZQ" : this.piernaIz= new Medaparte (cambio);
          break;
          case "PIERNADER" : this.piernaDe= new Medaparte (cambio);
          break;
          case "CABEZA" : this.cabeza= new Medaparte (cambio);
          break;
          default :System.out.println("error");
          
      }
      
      System.out.println("estas es"+this.piernaIz.getNombre());
      
        DBConection conexion =new DBConection();
        if(conexion.conectar()){
        Statement consulta = conexion.consultar();
        String modificar = "UPDATE MEDABOT SET "+tipo+"="+"'"+cambio+"'"+" WHERE NOMBRE ="+this.nombre;
        int actualizar=consulta.executeUpdate(modificar);
        conexion.desconectar();
      }
    }
    //agregar contenido

    public void setMedalla(String cambio) throws SQLException {
      this.medalla= new Medalla("'"+cambio+"'");
      
      DBConection conexion =new DBConection();
      if(conexion.conectar()){
      Statement consulta = conexion.consultar();
      String modificar = "UPDATE MEDABOT SET MEDALLA="+"'"+cambio+"'"+" WHERE NOMBRE ="+this.nombre;
      int actualizar=consulta.executeUpdate(modificar);
     conexion.desconectar();
      }
    }

   
public void manejarCpu1(int turno ,ArrayList<JToggleButton> botonesAtacante ,ArrayList<JToggleButton> botonesObjetivo
        ,ArrayList<Integer> ataques,ArrayList<Integer> defensasObjetivo,JTextPane PhActual,JButton confirmar){
         
         ArrayList <Integer> ordenadorAta=(ArrayList<Integer>) ataques.clone();
         ArrayList<Integer> ordenadorDef=(ArrayList<Integer>) defensasObjetivo.clone();
         Comparator<Integer> comparador = Collections.reverseOrder();
         Collections.sort(ordenadorAta, comparador);
         Collections.sort(ordenadorDef,comparador);
    if (turno>=0){
         int i=0;
      while(Integer.parseInt(PhActual.getText())>0){
           for(int ataque : ordenadorAta){
               int posicion1 = ataques.indexOf(ataque);
               int posicion2 = defensasObjetivo.indexOf(ordenadorDef.get(i));
               i+=1;
               botonesAtacante.get(posicion1).doClick();
               botonesObjetivo.get(posicion2).doClick();
               
               confirmar.doClick();
               
              
           }
          
       
       }
    
    }


//   if (turno>1){
//        
//       if (this.esquive >= 0.3){ }
       
   
   
   
   
//   }

}

   
    
    
    
}
    
    