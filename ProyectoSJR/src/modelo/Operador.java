
package modelo;


public class Operador{
     private int cod_operador;
     private String ruta;

    public Operador(int cod_operador, String ruta) {
        this.cod_operador = cod_operador;
        this.ruta = ruta;
    }


    public Operador() {
    }

    public int getCod_operador() {
        return cod_operador;
    }

    public void setCod_operador(int cod_operador) {
        this.cod_operador = cod_operador;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
     
     
}
