/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import static java.time.Clock.system;
import java.util.ArrayList;
import java.util.Arrays;
import javax.naming.spi.DirStateFactory;

/**
 *
 * @author kimbo
 */
public class Usuario {
   private String nombreUsuario;
   private String contraseña;
   //private String nombreMedabot;
   private ArrayList medapartes;
   private ArrayList medallas ;
   private Medaboot[] personajes;
  // private Medaboot personaje2; 
   //private Medaboot érsonaje3;
   
   
   //private Medabot medabot1;   
   //private Medabot medabot2;
   //private Medabot medabot3;
   
    public Usuario(String nmU, String contra) throws SQLException  {
        DBConection conexion=new DBConection();
        System.out.println("aca tambien");
       if(conexion.conectar()){
         nmU="'"+nmU+"'";
         System.out.println("aca tambien1");
         Statement stm=conexion.consultar();
         System.out.println("aca tambien2");
         
         String crear= "SELECT NOMBRE,PERSONAJE FROM USUARIO WHERE NOMBRE ="+nmU;
         System.out.println("aca tambien3");
         String inventario1="SELECT USUARIO,MEDAPARTE FROM MEDAPARTEUSUARIO WHERE USUARIO="+nmU ;
         String inventario2="SELECT USUARIO,MEDALLA FROM MEDALLAUSUARIO WHERE USUARIO="+nmU;
         System.out.println("aca tambien4");
         ResultSet informacion=stm.executeQuery(crear);
         while( informacion.next()){
         System.out.println("aca tambien5");
         String prueba = "'"+informacion.getString(2);
         
         System.out.println(prueba);
         System.out.println("aca tambien6");
         this.personajes=new Medaboot[3];
        System.out.println("aca tambien7");
         this.personajes[0]= new Medaboot(prueba+"A'");
         
         this.personajes[1]= new Medaboot(prueba+"B'");
         this.personajes[2]= new Medaboot(prueba+"C'");
         System.out.println("aca tambien8");
       }
         informacion.close();
         Statement stm2=conexion.consultar();
         
         ResultSet medapar=stm2.executeQuery(inventario1);
         while(medapar.next()){
         this.medapartes = new ArrayList(Arrays.asList(medapar.getString(2).split(",")));
         System.out.println("aca tambien9");
         System.out.println(medapartes);
         }
         medapar.close();
         Statement stm3=conexion.consultar();
         ResultSet medalla=stm3.executeQuery(inventario2);
         
         while(medalla.next()){
         System.out.println("aca tambien10");
         this.medallas= new ArrayList(Arrays.asList(medalla.getString(2).split(",")));
                 System.out.println("aca tambien11");
         }
         medalla.close();
         this.nombreUsuario= nmU;
         this.contraseña=contra;
      
     
         
         
        
         
        medalla.close();
        conexion.desconectar();
         System.out.println("aca tambien12");
         System.out.println("AQUI TERMINA USUARIOOOOOOOOOOOOOOOOOOOOOOOOOO");
         
    
        }
        
        
        
    
    }

    public Usuario() {
        
    }
    

    public Medaboot[] getPersonajes() {
        return personajes;
    }

    public ArrayList getMedallas() {
        return medallas;
    }

    public ArrayList getMedapartes() {
        return medapartes;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }
    
    
    
    
    public boolean validarUsuario(String nombreUsuario, String contraseña) throws SQLException{
        boolean  estado = false;
        DBConection conexion=new DBConection();
        if(conexion.conectar()){
         Statement stm=conexion.consultar();
         String insertar= "SELECT NOMBRE,PASS FROM USUARIO";
         ResultSet respuesta=stm.executeQuery(insertar);
            while(respuesta.next()) {       
                String nombre = respuesta.getString(1);
                
                String pass = respuesta.getString(2);
                
                if(nombre.equals(nombreUsuario)&&pass.equals(contraseña)){
                    respuesta.close();
                    conexion.desconectar();
                     estado=true;
                    break;
                }
                
            }
        respuesta.close();
        conexion.desconectar();
        }
       
        return estado;
    }       
    
    public boolean validarUsuario(String nombreUsuario, String contraseña, String nombreMedabot){
        return true;
                // LLamar a la base de datos y preguntar si existen estos datos
                //retornar true o false depeniendo del caso
   
    }
    
    public void crearUsuario(String nombreUsuario, String contraseña,String nombreMedabot) throws SQLException{
        DBConection conexion=new DBConection();
        if(conexion.conectar()){
            Statement stm=conexion.consultar();
            String insertar= "INSERT INTO USUARIO(NOMBRE,PASS,PERSONAJE) VALUES ('"+nombreUsuario+"','"+contraseña+"','"+nombreMedabot+"')";
            String insertarMedabotA="INSERT INTO MEDABOT( SALUDMAXIMA,NOMBRE,USUARIO,CABEZA,BRAZOIZQ,BRAZODER,PIERNAIZQ,PIERNADER,MEDALLA,IMAGEN) VALUES (50,'"+nombreMedabot+"A',"+"'"+"default"+"',"+"'"+"Cabeza Generica (C)"+"',"+"'"+"Brazo Generico (BI)"+"',"+"'"+"Brazo Generico (BD)"+"',"+"'"+"Pierna Generica (PI)"+"',"+"'"+"Pierna Generica (PD)"+"',"+"'"+"Escarabajo"+"',"+"10)"; 
            String insertarMedabotB="INSERT INTO MEDABOT( SALUDMAXIMA,NOMBRE,USUARIO,CABEZA,BRAZOIZQ,BRAZODER,PIERNAIZQ,PIERNADER,MEDALLA,IMAGEN) VALUES (50,'"+nombreMedabot+"B',"+"'"+"default"+"',"+"'"+"Cabeza Generica (C)"+"',"+"'"+"Brazo Generico (BI)"+"',"+"'"+"Brazo Generico (BD)"+"',"+"'"+"Pierna Generica (PI)"+"',"+"'"+"Pierna Generica (PD)"+"',"+"'"+"Escarabajo"+"',"+"10)";
                    
            String insertarMedabotC="INSERT INTO MEDABOT( SALUDMAXIMA,NOMBRE,USUARIO,CABEZA,BRAZOIZQ,BRAZODER,PIERNAIZQ,PIERNADER,MEDALLA,IMAGEN) VALUES (50,'"+nombreMedabot+"C',"+"'"+"default"+"',"+"'"+"Cabeza Generica (C)"+"',"+"'"+"Brazo Generico (BI)"+"',"+"'"+"Brazo Generico (BD)"+"',"+"'"+"Pierna Generica (PI)"+"',"+"'"+"Pierna Generica (PD)"+"',"+"'"+"Escarabajo"+"',"+"10)";
                    
            int respuesta=stm.executeUpdate(insertar);
            int creacionA=stm.executeUpdate(insertarMedabotA);
            int creacionB=stm.executeUpdate(insertarMedabotB);
            int creacionC=stm.executeUpdate(insertarMedabotC);
            if (respuesta==1 && creacionA==1 && creacionB==1 && creacionC==1){
                System.out.println("Correcto");
            }
            
            
        conexion.desconectar();
        }
        
        
         // LLama a la base de datos y solicita que agrege los datos
         // retorna true si el proceso  se realizo correectamente
         // Ser crea la cuenta de usuario nueva
                 
    }

    public void setArrays(int index, String nombre,String medalla) throws SQLException {
        System.out.println(index);
        String modificador ="";
        String comando ="";
      
        
        System.out.println(modificador);
        DBConection conexion =new DBConection();
        if(conexion.conectar()){
             if( medalla.equals("MEDALLA")){
        this.medallas.set(index,nombre);
        for (Object elemento:this.medallas){
            modificador= modificador+elemento+",";
        
        }
         String instruccion1 = "UPDATE MEDALLAUSUARIO SET MEDAPARTE='"+modificador+"' WHERE USUARIO="+this.nombreUsuario;
           Statement consulta = conexion.consultar();  
         int actu=consulta.executeUpdate(instruccion1);       
        }
        else{
        this.medapartes.set(index, nombre);
        for (Object elemento:this.medapartes){
            modificador= modificador+elemento+",";
        
        }
         String instruccion= "UPDATE MEDAPARTEUSUARIO SET MEDAPARTE='"+modificador+"' WHERE USUARIO="+this.nombreUsuario;
         Statement consulta = conexion.consultar();  
         int actu=consulta.executeUpdate(instruccion);
           
        }
        conexion.desconectar();
       }
    
        else {
        System.out.println ("no funciona");
        }
    
    }
    
    
        

    public String getNombre() {
        return this.nombreUsuario;
    }

    
    
}
     