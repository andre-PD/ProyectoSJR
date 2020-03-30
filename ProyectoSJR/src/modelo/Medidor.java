
package modelo;


public class Medidor {
     private int num_medidor;
      private String estado;

    public Medidor(int num_medidor, String estado) {
        this.num_medidor = num_medidor;
        this.estado = estado;
    }

    public Medidor() {
    }

    public int getNum_medidor() {
        return num_medidor;
    }

    public void setNum_medidor(int num_medidor) {
        this.num_medidor = num_medidor;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
      
}
