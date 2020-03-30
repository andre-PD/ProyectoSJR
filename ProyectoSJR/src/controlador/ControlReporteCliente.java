package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.FrmReporteCliente;

public class ControlReporteCliente implements ActionListener {

    FrmReporteCliente visReporteCliente;

    public void ControlReporteCliente(ControlReporteCliente visReporteCliente) {
        this.visReporteCliente = this.visReporteCliente;
        activarListener();
    }

    public void activarListener() {
        visReporteCliente.getBtnBuscar().addActionListener(this);
        visReporteCliente.getBtnRegresar().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(visReporteCliente.getBtnBuscar())) {
            
        }
        if (e.getSource().equals(visReporteCliente.getBtnRegresar())) {
            
        }
    }
}


