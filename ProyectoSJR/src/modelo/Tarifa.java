package modelo;

public class Tarifa {

    private int cod_tarifa;
    private String tarifa;
    private double metros_3;

    public Tarifa(int cod_tarifa, String tarifa, double metros_3) {
        this.cod_tarifa = cod_tarifa;
        this.tarifa = tarifa;
        this.metros_3 = metros_3;
    }

    public Tarifa() {
    }

    public int getCod_tarifa() {
        return cod_tarifa;
    }

    public void setCod_tarifa(int cod_tarifa) {
        this.cod_tarifa = cod_tarifa;
    }

    public String getTarifa() {
        return tarifa;
    }

    public void setTarifa(String tarifa) {
        this.tarifa = tarifa;
    }

    public double getMetros_3() {
        return metros_3;
    }

    public void setMetros_3(double metros_3) {
        this.metros_3 = metros_3;
    }

}
