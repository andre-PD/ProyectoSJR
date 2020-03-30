
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.FrmAgregarUsuario;

public class ControlAgregarUsuario implements ActionListener{
    FrmAgregarUsuario visAgregarUsuario;

    public ControlAgregarUsuario(FrmAgregarUsuario visAgregarUsuario) {
        this.visAgregarUsuario = visAgregarUsuario;
        activarListener();
    }  
    
      private void activarListener(){
          visAgregarUsuario.getBtnGuardar().addActionListener(this);            
    }
     public void actionPerformed(ActionEvent e) {
         if (e.getSource().equals(visAgregarUsuario.getBtnGuardar())) {
             
         }
     }
  
}
