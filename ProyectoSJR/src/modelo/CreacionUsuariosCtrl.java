
package modelo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import modelo.Usuario;
import vista.FrmCreacionUsuario;

public class CreacionUsuariosCtrl implements ActionListener{
    
    // ---------------------- VARIABLES --------------------------------
    
    private final FrmCreacionUsuario frmCreacionUsuario;
    private DefaultTableModel modeloTabla;
    
    // --------------------- CONSTRUCTOR -------------------------------

    public CreacionUsuariosCtrl(FrmCreacionUsuario frmCreacionUsuario) {
        this.frmCreacionUsuario = frmCreacionUsuario;
        
        initComponents();
    }
    
    // --------------------- METODOS -----------------------------------
    
    private void initComponents(){
        
//        modeloTabla =  (DefaultTableModel)frmCreacionUsuario.getTblUsuarios().getModel();
        
        obtenerUsuarios();
                
        frmCreacionUsuario.setLocationRelativeTo(null);
        frmCreacionUsuario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmCreacionUsuario.setVisible(true);
    }
    
    // ----------------------------------------------------------------
    
    private void addListener(){
        
        frmCreacionUsuario.getBtnCrear().addActionListener(this);
    }
    
    // ---------------------------------------------------------------
    
    private void CrearUsuario(){
        
        Usuario usuario = new Usuario();
        
        String id = frmCreacionUsuario.getTxtCedula().getText();
        int edad = Integer.parseInt(frmCreacionUsuario.getTxtTelefono().getText());
        
        usuario.ingresarDatos(id, id, id, id, id, id, id, id);
    }
    
    // --------------------------------------------------------------
     private void obtenerUsuarios(){
        
         modeloTabla.setRowCount(0);
        Usuario usuario = new Usuario();
       
         //ArrayList <Usuario> listaUsuarios  = usuario.obtenerUsuarios(null, null, null, null, 0, null, null, null);
             
             for (int i = 0; i < 6; i++) {
                 
                 modeloTabla.addRow(
                 
                   new Object [] {
                      
                       "0105736326",
                       "5",
                       "usuario",
                       "perro"
                   }
                 );
             
         }
    }

    // --------------------- EVENTOS ---------------------------------
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource().equals(frmCreacionUsuario.getBtnCrear())){
            
            
        }
    }
}
