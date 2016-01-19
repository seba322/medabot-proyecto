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

/**
 *
 * @author sebastian
 */
public class Medaboot {
    private String nombre;
    private Medalla medalla;
    private int salud;
    private int saludMax;
    private int ph;
    private int llamadoMeda;
    private ArrayList<Medaparte> armadura;
    private Medaparte brazoIz;
    private Medaparte brazoDe;
    private Medaparte cabeza;
    private Medaparte piernaIz;
    private Medaparte piernaDe;
    private int esquive;
    private int defensa;
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
         this.armadura.add(this.cabeza);
         this.armadura.add(this.piernaDe);
         this.armadura.add(this.piernaIz);
         this.armadura.add(this.brazoDe);
         this.armadura.add(this.brazoIz);
          
         this.salud= re.getInt (1);
         this.saludMax=re.getInt (1);
         System.out.println("AQUI SALUD"+this.salud);
                
         }
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
        return defensa;
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

    
}
    
    