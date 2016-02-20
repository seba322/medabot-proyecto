/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Vista.VistaBatalla;
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
    private int ataque;
    private ArrayList<Integer> ataques=new ArrayList<Integer> ();
    private ArrayList<Integer> defensas=new ArrayList<Integer> ();
    private  String tipo;
    private String nombreUsuatrio;
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
            this.tipo=re.getString(11);
            System.out.println("ESTE ES EL TIPO DE PERSONAJE"+this.tipo);
            this.piernaDe= new Medaparte(re.getString(8));
            this.cabeza= new Medaparte(re.getString(4));
            this.armadura=new ArrayList<Medaparte> ();
            this.nombreUsuatrio=re.getString(3);
            this.salud= re.getInt (1);
            this.saludMax=re.getInt (1);
          
         }
         
         this.armadura.add(this.cabeza);
         this.armadura.add(this.piernaDe);
         this.armadura.add(this.piernaIz);
         this.armadura.add(this.brazoDe);
         this.armadura.add(this.brazoIz);
         System.out.println("AQUIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII"+this.armadura);
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
    public void setHpVeinte(){
        this.salud=this.salud+((this.saludMax*20)/100);
        if(this.salud>this.saludMax){
            this.salud=this.saludMax;
        }
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

    public String getTipo() {
        return tipo;
    }
    

   public ArrayList<Integer> getDefensas(){
       return this.defensas;
   }
   public ArrayList<Integer> getAtaques(){
       return this.ataques;
   }

    public String getNombreUsuatrio() {
        return nombreUsuatrio;
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
        ,Medaboot jugador2,VistaBatalla vistaPH,String defensa , String esquive){
         
         ArrayList <Integer> ordenadorAta=(ArrayList<Integer>) this.ataques.clone();
         ArrayList<Integer> ordenadorDef=(ArrayList<Integer>) jugador2.defensas.clone();
       
         Comparator<Integer> comparador = Collections.reverseOrder();
         Collections.sort(ordenadorAta, comparador);
         Collections.sort(ordenadorDef,comparador);
        
          int contadorPH=Integer.parseInt(vistaPH.getTxtPhabilidad2().getText());
          System.out.println( "esta es la lista de ataques"+ordenadorAta);
           System.out.println( "esta es la lista de defensas"+ordenadorDef);
    if (turno==0){
         
      while(contadorPH>0){
          int i=0;
           System.out.println("ESTE ES PH"+Integer.parseInt(vistaPH.getTxtPhabilidad2().getText()));
           for(int ataque : ordenadorAta){
               int posicion1 = this.ataques.indexOf(ataque);
               System.out.println("ESTE ES ATAQUE"+ataques.indexOf(ataque));
               System.out.println("ESTE ES PH"+Integer.parseInt(vistaPH.getTxtPhabilidad2().getText()));
               System.out.println("ESTE ES DEFENSA"+jugador2.defensas.indexOf(ordenadorDef.get(i)));
               int posicion2 = jugador2.defensas.indexOf(ordenadorDef.get(i));
               
               botonesAtacante.get(posicion1).doClick();
//               botonesAtacante.get(posicion1).setSelected(true);
               botonesObjetivo.get(posicion2).doClick();
               
               vistaPH.getBtConfirmarA().doClick();
               contadorPH =Integer.parseInt(vistaPH.getTxtPhabilidad2().getText());
               System.out.println(Integer.parseInt(vistaPH.getTxtPhabilidad2().getText()));
               i+=1;
               
              
           }
          
       
        System.out.println("ESTE ES PH"+Integer.parseInt(vistaPH.getTxtPhabilidad2().getText()));
       }
    vistaPH.getBtListo().doClick();
   
    }


   if (turno>0){
        
       if (this.esquive >= 0.3){vistaPH.getJtEsquivar2().doClick(); }
       else{vistaPH.getJtDefender2();}
       if (defensa.equals("si")){
         while(contadorPH>0){
           int posicion2 = jugador2.defensas.indexOf(ordenadorDef.get(0));
           System.out.println("ESTE ES PH"+Integer.parseInt(vistaPH.getTxtPhabilidad2().getText()));
           for(int ataque : ordenadorAta){
               int posicion1 = this.ataques.indexOf(ataque);
                botonesAtacante.get(posicion1).doClick();
                botonesObjetivo.get(posicion2).doClick();
                vistaPH.getBtConfirmarA().doClick();
                contadorPH =Integer.parseInt(vistaPH.getTxtPhabilidad2().getText());
                System.out.println(Integer.parseInt(vistaPH.getTxtPhabilidad2().getText()));
               
               }
        }
     }
       
       else if (esquive.equals("si")){
            while(contadorPH>0){
                
               
           System.out.println("ESTE ES PH"+Integer.parseInt(vistaPH.getTxtPhabilidad2().getText()));
           for(int ataque : ordenadorAta){
               int posicion1 = ataques.indexOf(ataque);
                botonesAtacante.get(posicion1).doClick();
                 if (jugador2.brazoDe.getEsquive()>jugador2.brazoIz.getEsquive()){;
                     botonesObjetivo.get(2).doClick();}
                else if (jugador2.brazoDe.getEsquive()<jugador2.brazoIz.getEsquive()){
                    botonesObjetivo.get(3).doClick();}
                else {}
                
                vistaPH.getBtConfirmarA().doClick();
                contadorPH =Integer.parseInt(vistaPH.getTxtPhabilidad2().getText());
                System.out.println(Integer.parseInt(vistaPH.getTxtPhabilidad2().getText()));
               
               }
        }
       
       
       
       
       
       }
       
   
  
   
    vistaPH.getBtListo().doClick();
   }

}






public void manejarCpu2(int turno ,ArrayList<JToggleButton> botonesAtacante ,ArrayList<JToggleButton> botonesObjetivo
        ,Medaboot jugador2,VistaBatalla vistaPH,String defensa , String esquive){
         
         ArrayList <Integer> ordenadorAta=(ArrayList<Integer>) this.ataques.clone();
         ArrayList<Integer> ordenadorDef=(ArrayList<Integer>) jugador2.defensas.clone();
       
         Comparator<Integer> comparador = Collections.reverseOrder();
         Collections.sort(ordenadorAta, comparador);
         Collections.sort(ordenadorDef,comparador);
        
          int contadorPH=Integer.parseInt(vistaPH.getTxtPhabilidad2().getText());
          System.out.println( "esta es la lista de ataques"+ordenadorAta);
           System.out.println( "esta es la lista de defensas"+ordenadorDef);
    if (turno==0){
         
      while(contadorPH>0){
         
           System.out.println("ESTE ES PH"+Integer.parseInt(vistaPH.getTxtPhabilidad2().getText()));
           for(int ataque : ordenadorAta){
               int posicion1 = this.ataques.indexOf(ataque);
             
               int posicion2 = 4;
               
               botonesAtacante.get(posicion1).doClick();
//               botonesAtacante.get(posicion1).setSelected(true);
               botonesObjetivo.get(posicion2).doClick();
               
               vistaPH.getBtConfirmarA().doClick();
               contadorPH =Integer.parseInt(vistaPH.getTxtPhabilidad2().getText());
               System.out.println(Integer.parseInt(vistaPH.getTxtPhabilidad2().getText()));
              
               
              
           }
          
       
        System.out.println("ESTE ES PH"+Integer.parseInt(vistaPH.getTxtPhabilidad2().getText()));
       }
    vistaPH.getBtListo().doClick();
   
    }


   if (turno>0){
        
       if (this.esquive >= 0.5){vistaPH.getJtEsquivar2().doClick(); }
       else{vistaPH.getJtDefender2();}
       if (defensa.equals("si")){
         while(contadorPH>0){
           int posicion2 = jugador2.defensas.indexOf(ordenadorDef.get(0));
           System.out.println("ESTE ES PH"+Integer.parseInt(vistaPH.getTxtPhabilidad2().getText()));
           for(int ataque : ordenadorAta){
               int posicion1 = this.ataques.indexOf(ataque);
                botonesAtacante.get(posicion1).doClick();
                botonesObjetivo.get(posicion2).doClick();
                vistaPH.getBtConfirmarA().doClick();
                contadorPH =Integer.parseInt(vistaPH.getTxtPhabilidad2().getText());
                System.out.println(Integer.parseInt(vistaPH.getTxtPhabilidad2().getText()));
               
               }
        }
     }
       
       else if (esquive.equals("si")){
            while(contadorPH>0){
                
               
           System.out.println("ESTE ES PH"+Integer.parseInt(vistaPH.getTxtPhabilidad2().getText()));
           for(int ataque : ordenadorAta){
               int posicion1 = ataques.indexOf(ataque);
                botonesAtacante.get(posicion1).doClick();
                 if (jugador2.brazoDe.getEsquive()>jugador2.brazoIz.getEsquive()){;
                     botonesObjetivo.get(2).doClick();}
                else if (jugador2.brazoDe.getEsquive()<jugador2.brazoIz.getEsquive()){
                    botonesObjetivo.get(3).doClick();}
                else {}
                
                vistaPH.getBtConfirmarA().doClick();
                contadorPH =Integer.parseInt(vistaPH.getTxtPhabilidad2().getText());
                System.out.println(Integer.parseInt(vistaPH.getTxtPhabilidad2().getText()));
               
               }
        }
       
       
       
       
       
       }
       
   
  
   
    vistaPH.getBtListo().doClick();
   }

}
   
    
    
    
}
    
    
