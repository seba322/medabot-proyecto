
package Controlador;
import Vista.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ControladorTorneo implements ActionListener{
    VistaMenuTorneo vmt;
    VistaPreparacionTorneo vpt;
    VistaTranscursoTorneo vtt;
    VistaMenu vm;
    
    public ControladorTorneo(VistaMenuTorneo vmt,VistaPreparacionTorneo vpt,VistaTranscursoTorneo vtt,VistaMenu vm){
        this.vmt=vmt;
        this.vpt=vpt;
        this.vtt=vtt;
        this.vm=vm;
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
    }
    
}
