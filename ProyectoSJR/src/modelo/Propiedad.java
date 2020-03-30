package modelo;

public class Propiedad {

    private int cod_propiedad;
    private String descripcion;
    private String direccion;

    public Propiedad(int cod_propiedad, String descripcion, String direccion) {
        this.cod_propiedad = cod_propiedad;
        this.descripcion = descripcion;
        this.direccion = direccion;
    }

    public Propiedad() {
    }

    public int getCod_propiedad() {
        return cod_propiedad;
    }

    public void setCod_propiedad(int cod_propiedad) {
        this.cod_propiedad = cod_propiedad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

}
