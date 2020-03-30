package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import vista.FrmCreacionUsuario;
import vista.FrmEntrada;
import vista.FrmMenuPrincipal;

public class ControlEntrada implements ActionListener {

    FrmEntrada vEntrada;
    FrmMenuPrincipal menu;

    public ControlEntrada() {
    }

    public ControlEntrada(FrmMenuPrincipal menu) {
        this.vEntrada = vEntrada;
        this.menu = menu;
        activarListener();
    }

    private void activarListener() {
        vEntrada.getBtn_ingreso().addActionListener(this);
    }

    public void validar() {
        String usuario = "ista";
        String contra = "1234";
        
        System.out.println(" aqui ");
        if (vEntrada.getTxt_usuario().getText().equals(usuario) && vEntrada.getPass().getText().equals(contra)) {
            
            vEntrada.setVisible(false);
           
            ControlMenuPrincipal controlMenuPrincipal = new ControlMenuPrincipal(new FrmMenuPrincipal());
            
        } else {
            JOptionPane.showMessageDialog(vEntrada, "Error en el proceso de identificación");
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(vEntrada.getBtn_ingreso())) {
            validar();
        }
    }
}
