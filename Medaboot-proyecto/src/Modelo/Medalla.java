
package Modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Medalla {
    String nombre;
    String potenciador;
    String carga;
    String medaFuerza;
    int cantidad;
    
    public Medalla(String nombre) throws SQLException{
       DBConection conexion= new DBConection();
       if(conexion.conectar()){
           Statement stm=conexion.consultar();
           String seleccionar= "SELECT * FROM MEDALLA WHERE NOMBRE="+nombre;
           ResultSet respuesta=stm.executeQuery(seleccionar);
           while(respuesta.next()){
           this.nombre=respuesta.getString(1);
           this.potenciador=respuesta.getString(2);
           this.carga=respuesta.getString(4);
           this.medaFuerza=respuesta.getString(5);
           this.cantidad=respuesta.getInt(3);
           }
           respuesta.close();
           conexion.desconectar();
           
           
       }
       
       
       
        
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    
    }

    public String getPotenciador() {
        return potenciador;
    }

    public String getCarga() {
        return carga;
    }

    public String getMedaFuerza() {
        return medaFuerza;
    }
    
}

