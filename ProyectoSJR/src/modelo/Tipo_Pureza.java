package modelo;

public class Tipo_Pureza {

    private String cod_pureza;
    private double temperatura;//convertir
    private double ph;//convertir
    private String turbides;
    private double cloro;//convertir
    private String coliformidad;

    public Tipo_Pureza(String cod_pureza, double temperatura, double ph, String turbides, double cloro, String coliformidad) {
        this.cod_pureza = cod_pureza;
        this.temperatura = temperatura;
        this.ph = ph;
        this.turbides = turbides;
        this.cloro = cloro;
        this.coliformidad = coliformidad;
    }

    public Tipo_Pureza() {
    }

    public String getCod_pureza() {
        return cod_pureza;
    }

    public void setCod_pureza(String cod_pureza) {
        this.cod_pureza = cod_pureza;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getPh() {
        return ph;
    }

    public void setPh(double ph) {
        this.ph = ph;
    }

    public String getTurbides() {
        return turbides;
    }

    public void setTurbides(String turbides) {
        this.turbides = turbides;
    }

    public double getCloro() {
        return cloro;
    }

    public void setCloro(double cloro) {
        this.cloro = cloro;
    }

    public String getColiformidad() {
        return coliformidad;
    }

    public void setColiformidad(String coliformidad) {
        this.coliformidad = coliformidad;
    }
    
}
