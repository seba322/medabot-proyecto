
package Modelo;

import Vista.VistaBatalla;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JToggleButton;


public class Medaboot {
    private String nombre;
    private Medalla medalla;
    private int salud;
    private int saludMax;
    private String ph;
    private int llamadoMeda;
    private int contraAtaque;
    private String posicion;
   private boolean medaFuerza;
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
     private ArrayList<Integer> esquives=new ArrayList<Integer> ();
    private ArrayList<String> msj;
    private  String tipo;
    private String nombreUsuatrio;
  //  private Medaparte modificador;
    
    public Medaboot (String nombre) throws SQLException{
        this.llamadoMeda=1;
        this.ph="10";
        DBConection conexion=new DBConection();
        if(conexion.conectar()){
         String nombreComillas="'"+nombre+"'";
         Statement stm=conexion.consultar();
         String seleccionar= "SELECT *FROM MEDABOT WHERE NOMBRE="+nombreComillas;
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
         if(this.medalla.getPotenciador().equals("Ataque")){
            for(Medaparte parte:this.armadura){
                parte.setAtaque(10);
            }
           
        }
        else if(this.medalla.getPotenciador().equals("Defensa")){
            for(Medaparte parte:this.armadura){
                parte.setDefensa(parte.getDefensa()+6);
            }
        }
        else if(this.medalla.getPotenciador().equals("Esquive")){
             for(Medaparte parte:this.armadura){
                parte.setEsquive(10+parte.getEsquive());
            }
        }
        else if(this.medalla.getPotenciador().equals("Precision")){
            for(Medaparte parte:this.armadura){
                parte.setPrecision(10+parte.getPrecision());
            }
        }
        else if(this.medalla.getPotenciador().equals("Ph")){
             setPh("12");
        }
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
         this.esquives.add(this.brazoIz.getEsquive());
         this.esquives.add(this.brazoDe.getEsquive());
         this.esquives.add(this.piernaIz.getEsquive());
         this.esquives.add(this.piernaDe.getEsquive());
         this.esquives.add(this.cabeza.getEsquive());
         
         System.out.println("AQUI SALUD"+this.salud);
         this.ataque=this.brazoIz.getAtaque()+this.brazoDe.getAtaque()+this.piernaIz.getAtaque()+this.piernaDe.getAtaque()+this.cabeza.getAtaque();
         this.esquive = (this.brazoIz.getEsquive()+this.brazoDe.getEsquive()+this.piernaIz.getEsquive()+this.piernaDe.getEsquive()+this.cabeza.getEsquive()); 
        // this.modificador= null;
         System.out.println(this.nombre);
         System.out.println("MEDABOTTTTTTTTTTTTTTTTTTTTTTTTTTTTT");
        }
        this.medaFuerza=false;
        this.msj=new ArrayList<String>();
        this.contraAtaque=0;
        this.posicion="";
        
    }

    public String getNombre() {
       
        return this.nombre;
    
    }

    public void setPh(String ph) {
        this.ph = ph;
    }
    

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
    
    

    public int getContraAtaque() {
        return contraAtaque;
    }

    public void setContraAtaque(int contraAtaque) {
        this.contraAtaque = contraAtaque;
    }
    
    
    public void setMedafuerza(boolean medafuerza) {
        this.medaFuerza = medafuerza;
    }
    public boolean getMedafuerza() {
       return this.medaFuerza;
    }

    public ArrayList<String> getMsj() {
        return msj;
    }

    public void setMsj() {
        this.msj.clear();
    }
    
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

    public String getPh() {
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
        ,Medaboot jugador2,VistaBatalla vistaPH,String defensa , String esquive,int player) {
         
         ArrayList <Integer> ordenadorAta=(ArrayList<Integer>) this.ataques.clone();
         ArrayList<Integer> ordenadorDef=(ArrayList<Integer>) jugador2.defensas.clone();
       
         Comparator<Integer> comparador = Collections.reverseOrder();
         Collections.sort(ordenadorAta, comparador);
         Collections.sort(ordenadorDef,comparador);
        
          int contadorPH=10;
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
               if (player==1){
               contadorPH =Integer.parseInt(vistaPH.getTxtPhabilidad1().getText());}
               if (player==2){
               contadorPH =Integer.parseInt(vistaPH.getTxtPhabilidad2().getText());}
               System.out.println(Integer.parseInt(vistaPH.getTxtPhabilidad2().getText()));
               i+=1;
                
              try {
                  Thread.sleep(500);
              } catch (InterruptedException ex) {
                  Logger.getLogger(Medaboot.class.getName()).log(Level.SEVERE, null, ex);
              }
            
              
           }
          
       
        System.out.println("ESTE ES PH"+Integer.parseInt(vistaPH.getTxtPhabilidad2().getText()));
       }
    
   
    }


   if (turno>0){
        
       if (this.esquive >= 0.3){
           
           System.out.println("SI ESTA ESQUIVANDO");
               if (player==1){
               vistaPH.getJtEsquivar1().doClick();}
               if (player==2){
               vistaPH.getJtEsquivar2().doClick();} }
       else{
            System.out.println("SI ESTA DEFENDIENDO");
               if (player==1){
               vistaPH.getJtDefender1().doClick();}
               if (player==2){
               vistaPH.getJtDefender2().doClick();}}
       if (defensa.equals("si")){
         while(contadorPH>0){
             System.out.println("ESTE ATAQUE defensa SI FUNCIONA1aaa");
           int posicion2 = jugador2.defensas.indexOf(ordenadorDef.get(0));
           System.out.println("ESTE ES PH"+Integer.parseInt(vistaPH.getTxtPhabilidad2().getText()));
           for(int ataque : ordenadorAta){
               int posicion1 = this.ataques.indexOf(ataque);
               if (! botonesObjetivo.get(posicion2).isVisible()){
                   posicion2+=1;
               }
                botonesAtacante.get(posicion1).doClick();
                botonesObjetivo.get(posicion2).doClick();
                vistaPH.getBtConfirmarA().doClick();
              if (player==1){
               contadorPH =Integer.parseInt(vistaPH.getTxtPhabilidad1().getText());}
               if (player==2){
               contadorPH =Integer.parseInt(vistaPH.getTxtPhabilidad2().getText());}
                System.out.println(Integer.parseInt(vistaPH.getTxtPhabilidad2().getText()));
               
              
               }
        }
     }
       
       else if (esquive.equals("si")){
            while(contadorPH>0){
                
               System.out.println("ESTE ATAQUE ESQUIVE SI FUNCIONA1");
           System.out.println("ESTE ES PH"+Integer.parseInt(vistaPH.getTxtPhabilidad2().getText()));
           for(int ataque : ordenadorAta){
               int posicion1 = ataques.indexOf(ataque);
                botonesAtacante.get(posicion1).doClick();
                 if (jugador2.brazoDe.getEsquive()>jugador2.brazoIz.getEsquive()){;
                     botonesObjetivo.get(2).doClick();}
                else if (jugador2.brazoDe.getEsquive()<jugador2.brazoIz.getEsquive()){
                    botonesObjetivo.get(3).doClick();}
                else {botonesObjetivo.get(1).doClick();}
                
                vistaPH.getBtConfirmarA().doClick();
                if (player==1){
               contadorPH =Integer.parseInt(vistaPH.getTxtPhabilidad1().getText());
                System.out.println("LLEGUE AQUI 1");
                }
               if (player==2){
               contadorPH =Integer.parseInt(vistaPH.getTxtPhabilidad2().getText());}
                System.out.println(Integer.parseInt(vistaPH.getTxtPhabilidad2().getText()));
               
                try {
                  Thread.sleep(500);
              } catch (InterruptedException ex) {
                  Logger.getLogger(Medaboot.class.getName()).log(Level.SEVERE, null, ex);
              }
                
               }
        }
       
       
       
       
       
       }
       
   
  
   
    
   }

}






public void manejarCpu2(int turno ,ArrayList<JToggleButton> botonesAtacante ,ArrayList<JToggleButton> botonesObjetivo
        ,Medaboot jugador2,VistaBatalla vistaPH,String defensa , String esquive,int player ){
         
         ArrayList <Integer> ordenadorAta=(ArrayList<Integer>) this.ataques.clone();
         ArrayList<Integer> ordenadorDef=(ArrayList<Integer>) jugador2.defensas.clone();
          ArrayList<Integer> ordenadorEsq=(ArrayList<Integer>) jugador2.defensas.clone();
         Comparator<Integer> comparador = Collections.reverseOrder();
         Collections.sort(ordenadorAta, comparador);
         Collections.sort(ordenadorDef,comparador);
         Collections.sort(ordenadorEsq,comparador);
        
          int contadorPH=10;
          System.out.println( "esta es la lista de ataques"+ordenadorAta);
           System.out.println( "esta es la lista de defensas"+ordenadorDef);
           System.out.println("esta es la lista de defensas"+ordenadorDef);
     if (turno==0){
         
      while(contadorPH>0){
          int i=ordenadorDef.size()-1;
           System.out.println("ESTE ES PH"+Integer.parseInt(vistaPH.getTxtPhabilidad2().getText()));
           for(int ataque : ordenadorAta){
               int posicion1 = this.ataques.indexOf(ataque);
               System.out.println("ESTE ES ATAQUE"+ataques.indexOf(ataque));
               System.out.println("ESTE ES PH"+Integer.parseInt(vistaPH.getTxtPhabilidad2().getText()));
               System.out.println("ESTE ES DEFENSA"+jugador2.defensas.indexOf(ordenadorDef.get(i)));
               int posicion2 = jugador2.defensas.indexOf(ordenadorDef.get(i));
//               if ( botonesAtacante.get(posicion1).isVisible()){
//                   posicion1=this.ataques.indexOf(ordenadorAta.get(i));
//               }
              if ( !(botonesObjetivo.get(posicion2).isVisible())){
                   int valorEntero = (int) Math.floor(Math.random()*(4-0+1)+0);
                   posicion2=valorEntero;
               }
               botonesAtacante.get(posicion1).doClick();
             
               botonesObjetivo.get(posicion2).doClick();
               
               vistaPH.getBtConfirmarA().doClick();
               if (player==1){
               contadorPH =Integer.parseInt(vistaPH.getTxtPhabilidad1().getText());}
               if (player==2){
               contadorPH =Integer.parseInt(vistaPH.getTxtPhabilidad2().getText());}
               System.out.println(Integer.parseInt(vistaPH.getTxtPhabilidad2().getText()));
               
               
              
           }
          
       
        System.out.println("ESTE ES PH"+Integer.parseInt(vistaPH.getTxtPhabilidad2().getText()));
       }
    
   
    }


   if (turno>0){
        
       if (this.esquive >= 0.5){
           if (player==1){
               System.out.println("SI ESTA ESQUIVANDO2");
               vistaPH.getJtEsquivar1().doClick();
           }
           else{
               System.out.println("SI ESTA ESQUIVANDO2");
              vistaPH.getJtEsquivar2().doClick(); 
           }
       }
       
       else{
           System.out.println("SI ESTA DEFENDIENDO 2");
          if (player==1){
               vistaPH.getJtDefender1().doClick();}
               if (player==2){
               vistaPH.getJtDefender2().doClick();}
       }
       if (defensa.equals("si")){
         while(contadorPH>0){
             System.out.println("ESTE ATAQUE defensa SI FUNCIONA");
           int posicion2 = jugador2.defensas.indexOf(ordenadorDef.get(0));
           System.out.println("ESTE ES PH"+Integer.parseInt(vistaPH.getTxtPhabilidad2().getText()));
           for(int ataque : ordenadorAta){
               int posicion1 = this.ataques.indexOf(ataque);
               if ( !(botonesObjetivo.get(posicion2).isVisible())){
                   int valorEntero = (int) Math.floor(Math.random()*(4-0+1)+0);
                   posicion2=valorEntero;
               }
                botonesAtacante.get(posicion1).doClick();
                 botonesObjetivo.get(posicion2).doClick();
                vistaPH.getBtConfirmarA().doClick();
               if (player==1){
               contadorPH =Integer.parseInt(vistaPH.getTxtPhabilidad1().getText());
                System.out.println("LLEGUE AQUI 1");
                }
               if (player==2){
               contadorPH =Integer.parseInt(vistaPH.getTxtPhabilidad2().getText());}
                System.out.println(Integer.parseInt(vistaPH.getTxtPhabilidad2().getText()));
               
               }
        }
     }
       
       else if (esquive.equals("si")){
            while(contadorPH>0){
                int i =0;
               System.out.println("ESTE ATAQUE esquive SI FUNCIONA");
           System.out.println("ESTE ES PH"+Integer.parseInt(vistaPH.getTxtPhabilidad2().getText()));
           for(int ataque : ordenadorAta){
               int posicion1 = ataques.indexOf(ataque);
               int posicion2= jugador2.esquives.indexOf(ordenadorEsq.get(i));
                botonesAtacante.get(posicion1).doClick();
                
                    System.out.println("esta es la posicion 2"+posicion2);
                            
                    botonesObjetivo.get(2).doClick();

                
                vistaPH.getBtConfirmarA().doClick();
                if (player==1){
               contadorPH =Integer.parseInt(vistaPH.getTxtPhabilidad1().getText());
                System.out.println("LLEGUE AQUI 99");
                }
               if (player==2){
               contadorPH =Integer.parseInt(vistaPH.getTxtPhabilidad2().getText());}
                System.out.println(Integer.parseInt(vistaPH.getTxtPhabilidad2().getText()));
               i+=1;
               if (i>4){
                   break;
               }
           }
           }
           
           
        }
       
       
       
       
       
       }
       
//          
   
    
   }


public void manejarCpu3(int turno ,ArrayList<JToggleButton> botonesAtacante ,ArrayList<JToggleButton> botonesObjetivo
        ,Medaboot jugador2,VistaBatalla vistaPH,String defensa , String esquive,int player,ArrayList <ArrayList> acciones) {
         
         ArrayList <Integer> ordenadorAta=(ArrayList<Integer>) this.ataques.clone();
         ArrayList<Integer> ordenadorDef=(ArrayList<Integer>) jugador2.defensas.clone();
         ArrayList <Integer> salud = new ArrayList <Integer>();
         salud.add(jugador2.getBrazoIzq().getSalud());
         salud.add(jugador2.getBrazoDer().getSalud());
         salud.add(jugador2.getPiernaIzq().getSalud());
         salud.add(jugador2.getPiernaDer().getSalud());
         salud.add(jugador2.getCabeza().getSalud());
         ArrayList<Integer> ordenadorSalud= (ArrayList<Integer>) salud.clone();
       
         Comparator<Integer> comparador = Collections.reverseOrder();
         Collections.sort(ordenadorAta, comparador);
         Collections.sort(ordenadorDef,comparador);
         Collections.sort(ordenadorSalud,comparador);
        
          int contadorPH=10;
          System.out.println( "esta es la lista de ataques"+ordenadorAta);
           System.out.println( "esta es la lista de defensas"+ordenadorDef);
    if (turno==0){
         
       while(contadorPH>0){
             System.out.println("ESTE ATAQUE defensa SI FUNCIONA");
           int posicion2 = jugador2.defensas.indexOf(ordenadorDef.get(0));
           System.out.println("ESTE ES PH"+Integer.parseInt(vistaPH.getTxtPhabilidad2().getText()));
           for(int ataque : ordenadorAta){
               int posicion1 = this.ataques.indexOf(ataque);
               if ( !(botonesObjetivo.get(posicion2).isVisible())){
                   int valorEntero = (int) Math.floor(Math.random()*(4-0+1)+0);
                   posicion2=valorEntero;
               }
                botonesAtacante.get(posicion1).doClick();
                 botonesObjetivo.get(posicion2).doClick();
                vistaPH.getBtConfirmarA().doClick();
               if (player==1){
               contadorPH =Integer.parseInt(vistaPH.getTxtPhabilidad1().getText());
                System.out.println("LLEGUE AQUI 1");
                }
               if (player==2){
               contadorPH =Integer.parseInt(vistaPH.getTxtPhabilidad2().getText());}
                System.out.println(Integer.parseInt(vistaPH.getTxtPhabilidad2().getText()));
               
               }
        }
   
    }


   if (turno>0){
       if (acciones.size()>0){
           if (player==1){
               vistaPH.getJtDefender1().doClick();}
               if (player==2){
               vistaPH.getJtDefender2().doClick();}}
       }
     
               
       if (defensa.equals("si")||esquive.equals("si")){
         while(contadorPH>0){
             System.out.println("ESTE ATAQUE defensa SI FUNCIONA1aaa");
           int i=0;
           System.out.println("ESTE ES PH"+Integer.parseInt(vistaPH.getTxtPhabilidad2().getText()));
           for(int ataque : ordenadorAta){
               int posicion1 = this.ataques.indexOf(ataque);
               int posicion2=salud.indexOf(ordenadorSalud.get(i));
               if (! botonesObjetivo.get(posicion2).isVisible()){
                    int valorEntero = (int) Math.floor(Math.random()*(4-0+1)+0);
                   posicion2=valorEntero;
               }
                botonesAtacante.get(posicion1).doClick();
                botonesObjetivo.get(posicion2).doClick();
                vistaPH.getBtConfirmarA().doClick();
              if (player==1){
               contadorPH =Integer.parseInt(vistaPH.getTxtPhabilidad1().getText());}
               if (player==2){
               contadorPH =Integer.parseInt(vistaPH.getTxtPhabilidad2().getText());}
                System.out.println(Integer.parseInt(vistaPH.getTxtPhabilidad2().getText()));
               
              
               }
        }
     }
       
       else if (true){
           while(contadorPH>0){
             System.out.println("ESTE ATAQUE defensa SI FUNCIONA1aaa");
           int posicion2 = jugador2.defensas.indexOf(ordenadorDef.get(0));
           System.out.println("ESTE ES PH"+Integer.parseInt(vistaPH.getTxtPhabilidad2().getText()));
           for(int ataque : ordenadorAta){
               int posicion1 = this.ataques.indexOf(ataque);
               if (! botonesObjetivo.get(posicion2).isVisible()){
                   posicion2+=1;
               }
                botonesAtacante.get(posicion1).doClick();
                botonesObjetivo.get(posicion2).doClick();
                vistaPH.getBtConfirmarA().doClick();
              if (player==1){
               contadorPH =Integer.parseInt(vistaPH.getTxtPhabilidad1().getText());}
               if (player==2){
               contadorPH =Integer.parseInt(vistaPH.getTxtPhabilidad2().getText());}
                System.out.println(Integer.parseInt(vistaPH.getTxtPhabilidad2().getText()));
               
              
               }
        }
       
       
       
       
       }
       
   
  
   
    
   }






   public String getEstadisticas() {
       String estadisticas ="Medalla:"+this.medalla.getNombre()+"\n"+ "Ataque:"+Integer.toString(this.ataque)+"\n"+
               "Defensa:"+Integer.toString(this.defensa)+"\n"+
               "Esquive:"+Integer.toString(this.esquive)+"\n"+
               "Salud:"+Integer.toString(this.salud)+"\n"+
               "BrazoIz:"+(this.brazoIz.getNombre())+"\n"+"BrazoDe:"+(this.brazoDe.getNombre())+"\n"+
               "PiernaIz:"+(this.piernaIz.getNombre())+"\n"+"PiernaDe:"+(this.piernaDe.getNombre())+"\n"+
               "Cabeza:"+(this.cabeza.getNombre());
       return estadisticas;
    }

    
    
    
}
    
    
