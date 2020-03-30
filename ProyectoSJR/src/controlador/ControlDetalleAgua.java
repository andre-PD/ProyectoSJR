package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.FrmDetalleAgua;

public class ControlDetalleAgua implements ActionListener {

    FrmDetalleAgua vDetalleAgua;

    public ControlDetalleAgua(FrmDetalleAgua vDetalleAgua) {
        this.vDetalleAgua = vDetalleAgua;
        activarListener();
    }

    private void activarListener() {
        vDetalleAgua.getBtnCalcular().addActionListener(this);
        vDetalleAgua.getBtnNuevo().addActionListener(this);
        vDetalleAgua.getBtnSalir().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(vDetalleAgua.getBtnCalcular())) {

        }
        if (e.getSource().equals(vDetalleAgua.getBtnNuevo())) {

        }

        if (e.getSource().equals(vDetalleAgua.getBtnSalir())) {

        }
       
    }

}
