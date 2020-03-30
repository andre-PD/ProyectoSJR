package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import javax.swing.Icon;
import vista.FrmConsumoPago;
//import vista.FrmCreacionUsuario;
//import vista.FrmEntrada;
import vista.FrmMenuPrincipal;

public class ControlMenuPrincipal implements ActionListener {
    FrmMenuPrincipal vistaPrincipal;

    public ControlMenuPrincipal(FrmMenuPrincipal vistaPrincipal) {
        this.vistaPrincipal = vistaPrincipal;
        this.vistaPrincipal.setExtendedState(6);
        activarListener();
        
        vistaPrincipal.setVisible(true);
    }
    
    private void activarListener(){
        vistaPrincipal.getItmNuevoUsuario().addActionListener(this);
        vistaPrincipal.getItmPagoConsumo().addActionListener(this);
   
    }
    @Override
    public void actionPerformed(ActionEvent e) {
//        if(e.getSource().equals(vistaPrincipal.getItmNuevoUsuario())){
//            FrmEntrada frmEntrada = new FrmEntrada(vistaPrincipal, true);
//            ControlEntrada controlEntrada = new ControlEntrada(frmEntrada, vistaPrincipal);
//            frmEntrada.setVisible(true);
//              
//               
//        }      
        if(e.getSource().equals(vistaPrincipal.getItmPagoConsumo())){
            FrmConsumoPago vConsumoPago = new FrmConsumoPago(vistaPrincipal, true);
            ControlConsumoPago controlConsumoPago = new ControlConsumoPago(vConsumoPago);
            vConsumoPago.setVisible(true);
        }
        
//        if(e.getSource().equals(vistaPrincipal.getItmConsultarPago())){
//            FrmConsultarPago vConsultarPago = new FrmConsultarPago(vistaPrincipal, true);
//            ControlConsultarPago controlConsumoPago = new ControlConsultarPago(vConsultarPago);
//            vConsultarPago.setVisible(true);
//        }    

    }            
   
}
