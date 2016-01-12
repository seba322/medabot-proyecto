/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author sebastian
 */
public class Medaboot {
    private String nombre;
    private Medalla medalla;
    private int salud;
    private Medaparte brazoIz;
    private Medaparte brazoDe;
    private Medaparte cabeza;
    private Medaparte piernaIz;
    private Medaparte piernaDe;
    private int esquive;
    private int defensa;
  //  private Medaparte modificador;
    
    public Medaboot (String nombre) throws SQLException{
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
         this.salud= re.getInt (1);
         
         }
        // this.modificador= null;
         System.out.println(this.nombre);
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
    

    public void setMedaparte(Medaparte medaparte, String cambio , String tipo) throws SQLException{
      medaparte = new Medaparte(cambio);
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

    public void setMedalla(Medalla medalla, String cambio) throws SQLException {
      medalla= new Medalla(cambio);
      
      DBConection conexion =new DBConection();
      if(conexion.conectar()){
      Statement consulta = conexion.consultar();
      String modificar = "UPDATE MEDABOT SET MEDALLA='"+cambio+"' WHERE NOMBRE ="+this.nombre;
      int actualizar=consulta.executeUpdate(modificar);
     conexion.desconectar();
      }
    }

    
}
    
    