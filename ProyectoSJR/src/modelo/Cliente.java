package modelo;

import Conexion.ConexionBd;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Cliente extends Persona{
    private String num_medidor;
    ConexionBd conn = new ConexionBd();
    
    private final String SELECT = "SELECT cedula_cli, nombre, apellido, direccion, correo, fecha_nacimiento, telefono, num_medidor FROM cliente;";

    public Cliente() {
    }

    public Cliente(String num_medidor) {
        this.num_medidor = num_medidor;
    }

    public Cliente(String num_medidor, String cedula, String nombre, String apellido, String fechaNacimiento, String direccion, String telefono, String correo) {
        super(cedula, nombre, apellido, fechaNacimiento, direccion, telefono, correo);
        this.num_medidor = num_medidor;
    }

    public String getNum_medidor() {
        return num_medidor;
    }

    public void setNum_medidor(String num_medidor) {
        this.num_medidor = num_medidor;
    }

    public boolean ingresarDatos(Cliente cliente){
        String INSERT = "INSERT INTO cliente(cedula_cli, nombre, apellido, direccion, correo, telefono, num_medidor) "
            + "VALUES('"+getCedula()+"', '"+getNombre()+"','"+getApellido()+"','"+getDireccion()+"','"+getCorreo()+"', '"+getCorreo()+"', '"+getTelefono()+"', '"+getNum_medidor()+"');";
        try {
            Statement comando = conn.conectar("postgres", "1", false).createStatement(); 
            //metodo createStatement() usar solo con la clase Statement
            comando.executeUpdate(INSERT);
            comando.close();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public ArrayList<String[]> sacarDatos(){
        ArrayList<String[]> lis = new ArrayList<>();
        
        try {
            Statement comando = conn.conectar("postgres", "1", false).createStatement();
            ResultSet result = comando.executeQuery(SELECT);
            while(result.next()){
                String[] lista = new String[8];
                lista[0] = (result.getString("cedula_cli"));
                lista[1] = (result.getString("nombre"));
                lista[2] = (result.getString("apellido"));
                lista[3] = (result.getString("direccion"));
                lista[4] = (result.getString("correo"));
                lista[5] = (result.getString("fecha_nacimiento"));
                lista[6] = (result.getString("telefono"));
                lista[7] = (result.getString("num_medidor"));
                lis.add(lista);
            }
            result.close();
            comando.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return lis;
    }
    
}
