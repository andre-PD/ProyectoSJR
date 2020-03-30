package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.FrmDetalleAgua;
import vista.FrmIngresoLectura;

public class ControlIngresoLectura implements ActionListener {

    FrmIngresoLectura visFrmIngresoLectura;

    public ControlIngresoLectura(FrmIngresoLectura visFrmIngresoLectura) {
        this.visFrmIngresoLectura = visFrmIngresoLectura;
        activarListener();
    }

    private void activarListener() {
        visFrmIngresoLectura.getBtnGuardarLectura().addActionListener(this);
        visFrmIngresoLectura.getBtnNuevoLec().addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(visFrmIngresoLectura.getBtnGuardarLectura())) {
            
        }
        if (e.getSource().equals(visFrmIngresoLectura.getBtnNuevoLec())) {
            
        }
    }

}
