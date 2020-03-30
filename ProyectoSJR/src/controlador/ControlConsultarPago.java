package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.FrmConsultarPago;

public class ControlConsultarPago implements ActionListener{
    FrmConsultarPago vConsultarPago;

    public ControlConsultarPago(FrmConsultarPago vConsultarPago) {
        this.vConsultarPago = vConsultarPago;
        activarListener();
    }
    
    private void activarListener(){
        vConsultarPago.getBtnConsultar().addActionListener(this);
    }
   
    @Override
    public void actionPerformed(ActionEvent co) {
        if (co.getSource().equals(vConsultarPago.getBtnConsultar())) {
            
        }
        if (co.getSource().equals(vConsultarPago.getBtnSalirC())) {
            
        }
    }
    
}
