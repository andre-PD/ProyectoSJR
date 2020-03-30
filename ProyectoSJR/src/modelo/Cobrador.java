
package modelo;


public class Cobrador  {
    private int cod_cobrador;
    private String hora_entrada;
     private String hora_salida;

    public Cobrador(int cod_cobrador, String hora_entrada, String hora_salida) {
        this.cod_cobrador = cod_cobrador;
        this.hora_entrada = hora_entrada;
        this.hora_salida = hora_salida;
    }

    public Cobrador() {
    }

    public int getCod_cobrador() {
        return cod_cobrador;
    }

    public void setCod_cobrador(int cod_cobrador) {
        this.cod_cobrador = cod_cobrador;
    }

    public String getHora_entrada() {
        return hora_entrada;
    }

    public void setHora_entrada(String hora_entrada) {
        this.hora_entrada = hora_entrada;
    }

    public String getHora_salida() {
        return hora_salida;
    }

    public void setHora_salida(String hora_salida) {
        this.hora_salida = hora_salida;
    }
     
}
