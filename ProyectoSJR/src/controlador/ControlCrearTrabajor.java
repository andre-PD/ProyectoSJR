
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.FrmCrearTrabajador;


public class ControlCrearTrabajor implements ActionListener{
    FrmCrearTrabajador visCrearTrabajador;

  public void ControlCrearTrabajor(FrmCrearTrabajador visCrearTrabajador){
      this.visCrearTrabajador= visCrearTrabajador;
      activarListener();
      
  }
  public void activarListener(){
      visCrearTrabajador.getBtnGuardarT().addActionListener(this);
  }
   
    public void actionPerformed(ActionEvent a) {
        if (a.getSource().equals(visCrearTrabajador.getBtnGuardarT())) {
            
        }
        if (a.getSource().equals(visCrearTrabajador.getBtnSalir())) {
            
        }
     
    }
   
    
}
