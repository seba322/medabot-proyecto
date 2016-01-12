
package ClasePrincipal;

import Vista.VistaRegistro1;
import Vista.VistaRegistro2;
import Controlador.ControladorRegistro;



public class ClasePrincipal {

    
    public static void main(String[] args) {
        VistaRegistro1 vt1= new VistaRegistro1();
        VistaRegistro2 vt2= new VistaRegistro2();
        ControladorRegistro ct= new ControladorRegistro( vt1,vt2,"Ingreso");
        System.out.println("Comienza la Ejecucion");
        
    }
    
}
