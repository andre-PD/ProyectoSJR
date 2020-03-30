
package modelo;


public class Consumo {
    private int cod_consumo;
    private double mora;

    public Consumo(int cod_consumo, double mora) {
        this.cod_consumo = cod_consumo;
        this.mora = mora;
    }

    public Consumo() {
    }

    public int getCod_consumo() {
        return cod_consumo;
    }

    public void setCod_consumo(int cod_consumo) {
        this.cod_consumo = cod_consumo;
    }

    public double getMora() {
        return mora;
    }

    public void setMora(double mora) {
        this.mora = mora;
    }
    
}
