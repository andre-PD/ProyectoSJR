package modelo;

public class Usuario extends Persona {

    private String cod_usuario;

    public Usuario() {
    }

    //**************************CONSTRUCTOR********************************//
    public Usuario(String cod_usuario) {
        this.cod_usuario = cod_usuario;
    }

    public Usuario(String cod_usuario, String cedula, String nombre, String apellido, String edad, String direccion, String telefono, String correo) {
        super(cedula, nombre, apellido, edad, direccion, telefono, correo);
        this.cod_usuario = cod_usuario;
    }

    public void ingresarDatos(String cod_usuario, String cedula, String nombre, String apellido, String edad, String direccion, String telefono, String correo) {

    }

    public void obtenerUsuarios(String cod_usuario, String cedula, String nombre, String apellido, String edad, String direccion, String telefono, String correo) {

    }

}
