
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import vista.FrmInicio;
import vista.FrmMenuPrincipal;
import vista.FrmEntrada;

public class ControlIncio {
    
    private FrmInicio login;
    private Timer timer;

    public ControlIncio(FrmInicio login) {
        this.login = login;
        timer = new Timer(50, new progreso());
        timer.start();
    }
    
    public class progreso implements ActionListener {

        public void actionPerformed(ActionEvent evt) {
            int n = login.getCargar().getValue();
            if (n < 100) {
                n = n + 2;
                login.getCargar().setValue(n);
            } else {
                timer.stop();
                login.dispose();
                FrmEntrada frmEntrada = new FrmEntrada();
                ControlEntrada control = new ControlEntrada();
                frmEntrada.setVisible(true);
//                FrmMenuPrincipal vPrincipal = new FrmMenuPrincipal();
//                ControlMenuPrincipal control = new ControlMenuPrincipal(vPrincipal);
//                vPrincipal.setVisible(true);
            }
        }
    }
}
