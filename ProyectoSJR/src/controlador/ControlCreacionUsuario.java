package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import vista.FrmCreacionUsuario;

public class ControlCreacionUsuario implements ActionListener, WindowListener{
    FrmCreacionUsuario vCreacionUsuario;
    Cliente cli = new Cliente();

    public ControlCreacionUsuario(FrmCreacionUsuario vCreacionUsuario) {
        this.vCreacionUsuario = vCreacionUsuario;
        activarListener();
    }
    
    private void activarListener(){
        vCreacionUsuario.addWindowListener(this);
        vCreacionUsuario.getBtnCrear().addActionListener(this);
        
    }
    
    public String sacarFecha(){
        String fecha = "";
        try {
            /*SimpleDateFormat PERMITE DAR FORMATO A UNA FECHa
            */
            SimpleDateFormat formato = new SimpleDateFormat("dd/MMM/yyyy");
            Date date = formato.parse(formato.format(vCreacionUsuario.getDatFechaNacimiento().getDate()));
            fecha = formato.format(date);
            System.out.println(fecha);
        } catch (ParseException ex) {
            Logger.getLogger(ControlCreacionUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return fecha;
    }
    
    public void obtenerDatos(){
        String cedula = vCreacionUsuario.getTxtCedula().getText();
        String nombre = vCreacionUsuario.getTxtNombre().getText();
        String apellido = vCreacionUsuario.getTxtApellido().getText(); 
        String direccion = vCreacionUsuario.getTxtDireccion().getText();
        String correo = vCreacionUsuario.getTxtCorreo().getText();
        String fechaNacimiento = sacarFecha();
        String telefono = vCreacionUsuario.getTxtTelefono().getText();
        String numMedidior = vCreacionUsuario.getTxtMedidor().getText();
        Cliente cliente = new Cliente(numMedidior, cedula, nombre, apellido, fechaNacimiento, direccion, telefono, correo);
        if(cli.ingresarDatos(cliente)){
            JOptionPane.showMessageDialog(vCreacionUsuario, "se guardo");
        }else{
            JOptionPane.showMessageDialog(vCreacionUsuario, "no se guardo");
        }
    }
    
    
    public void cargarClientes(){
        ArrayList <String[]> lista = cli.sacarDatos();
        String[] lis = new String[8];
        DefaultTableModel modelo = (DefaultTableModel) vCreacionUsuario.getTabClientes().getModel();
        for(int i = 0; i < lista.size(); i++){
            lis = (lista.get(i));
            modelo.addRow(lis);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(vCreacionUsuario.getBtnCrear())){
            obtenerDatos();
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {
        if (e.getSource().equals(vCreacionUsuario)) {
            cargarClientes();
        }
    }

    @Override
    public void windowClosing(WindowEvent e) {
        
    }

    @Override
    public void windowClosed(WindowEvent e) {
        
    }

    @Override
    public void windowIconified(WindowEvent e) {
        
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        
    }

    @Override
    public void windowActivated(WindowEvent e) {
        
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        
    }
    
    
}
