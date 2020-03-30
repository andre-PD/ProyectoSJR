package principal;

//import controlador.CreacionUsuariosCtrl;
import controlador.ControlIncio;
import vista.FrmCreacionUsuario;
import vista.FrmInicio;

public class main {

    
    public static void main(String[] args) {
        FrmInicio fInicio = new FrmInicio();
        ControlIncio control = new ControlIncio(fInicio);
        fInicio.setVisible(true);
        
//        FrmCreacionUsuario frmCreacionUsuario = new FrmCreacionUsuario();
        
  //      CreacionUsuariosCtrl creacionUsuariosCtrl = new CreacionUsuariosCtrl(frmCreacionUsuario);
                
    }
    
}
