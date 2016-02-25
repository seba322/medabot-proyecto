
package Modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import static java.time.Clock.system;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import javax.naming.spi.DirStateFactory;
import java.io.*;

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
   private ArrayList<String> registroAcciones;
   private Medaboot[] personajes;
   private int victorias;
   private int derrotas;
   private int torneos;
  // private Medaboot personaje2; 
   //private Medaboot érsonaje3;
   
   
   //private Medabot medabot1;   
   //private Medabot medabot2;
   //private Medabot medabot3;
   
    public Usuario(String nmU, String contra) throws SQLException  {
        DBConection conexion=new DBConection();
        System.out.println("aca tambien");
       if(conexion.conectar()){
         String nombre=nmU;
         nmU="'"+nmU+"'";
         System.out.println("aca tambien1");
         Statement stm=conexion.consultar();
         System.out.println("aca tambien2");
         
         String crear= "SELECT NOMBRE,PERSONAJE FROM USUARIO WHERE NOMBRE ="+nmU;
         System.out.println("aca tambien3");
         String inventario1="SELECT USUARIO,MEDAPARTEES FROM MEDAPARTEUSUARIO WHERE USUARIO="+nmU ;
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
         this.nombreUsuario= nombre;
         this.contraseña=contra;
        this.registroAcciones=new ArrayList();
     
         
         
        
         
        medalla.close();
        conexion.desconectar();
         System.out.println("aca tambien12");
         System.out.println("AQUI TERMINA USUARIOOOOOOOOOOOOOOOOOOOOOOOOOO");
         
    
        }
        
        
        
    
    }
    public Usuario(String nombreUsuario) throws SQLException{
        DBConection conexion=new DBConection();
        if(conexion.conectar()){
             String nombre="'"+nombreUsuario+"'";
             String instruccion= "SELECT VICTORIAS,DERROTAS,TORNEOS FROM USUARIO WHERE NOMBRE ="+nombre;
             Statement stm=conexion.consultar();
             ResultSet informacion=stm.executeQuery(instruccion);
             while(informacion.next()){
                 this.victorias=informacion.getInt(1);
                 this.derrotas=informacion.getInt(2);
                 this.torneos=informacion.getInt(3);
                 
             }
        informacion.close();
        conexion.desconectar();
        }
        this.nombreUsuario=nombreUsuario;
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

    public ArrayList<String> getRegistroAcciones() {
        return registroAcciones;
    }
    

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public int getVictorias() {
        return victorias;
    }

    public int getTorneos() {
        return torneos;
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
            String insertar= "INSERT INTO USUARIO(NOMBRE,PASS,PERSONAJE,PJOCULTO) VALUES ('"+nombreUsuario+"','"+contraseña+"','"+nombreMedabot+"',false)";
            String insertarMedabotA="INSERT INTO MEDABOT( SALUDMAXIMA,NOMBRE,USUARIO,CABEZA,BRAZOIZQ,BRAZODER,PIERNAIZQ,PIERNADER,MEDALLA,IMAGEN) VALUES (50,'"+nombreMedabot+"A',"+"'"+nombreUsuario+"',"+"'"+"Cabeza Generica (C)"+"',"+"'"+"Brazo Generico (BI)"+"',"+"'"+"Brazo Generico (BD)"+"',"+"'"+"Pierna Generica (PI)"+"',"+"'"+"Pierna Generica (PD)"+"',"+"'"+"Perro"+"',"+"10)"; 
            String insertarMedabotB="INSERT INTO MEDABOT( SALUDMAXIMA,NOMBRE,USUARIO,CABEZA,BRAZOIZQ,BRAZODER,PIERNAIZQ,PIERNADER,MEDALLA,IMAGEN) VALUES (50,'"+nombreMedabot+"B',"+"'"+nombreUsuario+"',"+"'"+"Cabeza Generica (C)"+"',"+"'"+"Brazo Generico (BI)"+"',"+"'"+"Brazo Generico (BD)"+"',"+"'"+"Pierna Generica (PI)"+"',"+"'"+"Pierna Generica (PD)"+"',"+"'"+"Perro"+"',"+"10)";
            String insetarMedapartes="INSERT INTO MEDAPARTEUSUARIO( USUARIO ) VALUES('"+nombreUsuario+"')" ;       
            String insertarMedabotC="INSERT INTO MEDABOT( SALUDMAXIMA,NOMBRE,USUARIO,CABEZA,BRAZOIZQ,BRAZODER,PIERNAIZQ,PIERNADER,MEDALLA,IMAGEN) VALUES (50,'"+nombreMedabot+"C',"+"'"+nombreUsuario+"',"+"'"+"Cabeza Generica (C)"+"',"+"'"+"Brazo Generico (BI)"+"',"+"'"+"Brazo Generico (BD)"+"',"+"'"+"Pierna Generica (PI)"+"',"+"'"+"Pierna Generica (PD)"+"',"+"'"+"Perro"+"',"+"10)";
            String insertarMedallas="INSERT INTO MEDALLAUSUARIO(USUARIO,MEDALLA) VALUES ('"+nombreUsuario+"','Gato,Toro,Aguila') ";        
            int respuesta=stm.executeUpdate(insertar);
            int creacionA=stm.executeUpdate(insertarMedabotA);
            int creacionB=stm.executeUpdate(insertarMedabotB);
            int creacionC=stm.executeUpdate(insertarMedabotC);
            int creacionMedalla= stm.executeUpdate(insertarMedallas);
            int creacionMedapartes=stm.executeUpdate(insetarMedapartes);
            if (respuesta==1 && creacionA==1 && creacionB==1 && creacionC==1 && creacionMedalla==1 && creacionMedapartes==1){
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
         String instruccion1 = "UPDATE MEDALLAUSUARIO SET MEDALLA='"+modificador+"' WHERE USUARIO="+this.nombreUsuario;
           Statement consulta = conexion.consultar();  
         int actu=consulta.executeUpdate(instruccion1);       
        }
        else{
        this.medapartes.set(index, nombre);
        for (Object elemento:this.medapartes){
            modificador= modificador+elemento+",";
        
        }
         String instruccion= "UPDATE MEDAPARTEUSUARIO SET MEDAPARTEES='"+modificador+"' WHERE USUARIO="+this.nombreUsuario;
         Statement consulta = conexion.consultar();  
         int actu=consulta.executeUpdate(instruccion);
           
        }
        conexion.desconectar();
       }
    
        else {
        System.out.println ("no funciona");
        }
    
    }
    //Se encarga de crear una lista con todos los nombre de usuarios
    //Disponibles en a base de datos
    public ArrayList<String> getNombresUsers() throws SQLException{
        ArrayList<String> nombres= new ArrayList<String>();
        DBConection conexion=new DBConection();
        if(conexion.conectar()){
            
            Statement stm=conexion.consultar();
            String instruccion="SELECT NOMBRE FROM USUARIO";
            ResultSet informacion=stm.executeQuery(instruccion);
            while( informacion.next()){
                nombres.add(informacion.getString(1));
            }
            informacion.close();
            System.out.println(nombres);
            conexion.desconectar();
        }
        return nombres;
    }
    public String mostrarHora(){
        Date fechaActual=new Date();
        SimpleDateFormat formato=new SimpleDateFormat("dd/MM/yyyy 'a las' hh:mm a");
        String fecha=formato.format(fechaActual); 
        return fecha;
         
    }
    public void escribirAcciones(String registro) throws FileNotFoundException, IOException{
        File archivo= new File("C:\\Users\\kimbo\\Documents\\NetBeansProjects\\medabot-proyect7\\Medaboot-proyecto\\Registro"+this.nombreUsuario+".txt");
        ArrayList<String> registroA=new ArrayList<String>();
        if(archivo.exists()){
            FileReader carga=new FileReader(archivo);
            BufferedReader procesador=new BufferedReader(carga);
            String linea=procesador.readLine();
            while(linea !=null){
                registroA.add(linea);
                linea=procesador.readLine();
            }
            carga.close();
            procesador.close();
            registroA.add(registro);
            PrintWriter procesador2= new PrintWriter(archivo);
            for(String linea2:registroA){
                System.out.println(linea);
                procesador2.println(linea2);
            }
            procesador2.close();
            
            
        }
        else{
            PrintWriter procesador= new PrintWriter(archivo);
            
            procesador.print(registro);
            procesador.close();
            
        }
       
    }
    
    public boolean cargarAcciones() throws FileNotFoundException, IOException{
        File archivo= new File("C:\\Users\\kimbo\\Documents\\NetBeansProjects\\medabot-proyect7\\Medaboot-proyecto\\Registro"+this.nombreUsuario+".txt");
        if(archivo.exists()){
            FileReader carga=new FileReader(archivo);
            BufferedReader procesador=new BufferedReader(carga);
            String linea=procesador.readLine();
            while(linea !=null){
                System.out.println(linea);
                this.registroAcciones.add(linea);
                linea=procesador.readLine();
            }
            carga.close();
            procesador.close();
            return true;
        }
        else{
            return false;
        }
    }
    //Comprueba si el usuario tiene el pj oculto activo
    public boolean comprobarPjOculto() throws SQLException{
        boolean pjOculto=false;
        DBConection conexion=new DBConection();
        if(conexion.conectar()){
            String nombre="'"+this.nombreUsuario+"'";
            Statement stm=conexion.consultar();
            String insertar= "SELECT PJOCULTO FROM USUARIO WHERE NOMBRE="+nombre;
            ResultSet respuesta=stm.executeQuery(insertar);
            while(respuesta.next()){
              pjOculto=respuesta.getBoolean(1);
                
            }
        respuesta.close();
        conexion.desconectar();
        }
        return pjOculto;
        
    }
    
    
        

   
}
    