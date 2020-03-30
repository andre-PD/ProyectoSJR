
package modelo;


public class Lecturas {
    private String cod_lecturas;
    private String periodo_consumo;
    private String fecha_lectura;
    private String lectura_anterior;
    private String lectura_actual;
    private double metros3;
    private String  num_medidor;
    private String estado;

    public Lecturas(String cod_lecturas, String periodo_consumo, String fecha_lectura, String lectura_anterior, String lectura_actual, double metros3, String num_medidor, String estado) {
        this.cod_lecturas = cod_lecturas;
        this.periodo_consumo = periodo_consumo;
        this.fecha_lectura = fecha_lectura;
        this.lectura_anterior = lectura_anterior;
        this.lectura_actual = lectura_actual;
        this.metros3 = metros3;
        this.num_medidor = num_medidor;
        this.estado = estado;
    }
    
    public Lecturas() {
    }

    public  String getCod_lecturas() {
        return cod_lecturas;
    }

    public void setCod_lecturas(String cod_lecturas) {
        this.cod_lecturas = cod_lecturas;
    }

    public String getPeriodo_consumo() {
        return periodo_consumo;
    }

    public void setPeriodo_consumo(String periodo_consumo) {
        this.periodo_consumo = periodo_consumo;
    }

    public String getFecha_lectura() {
        return fecha_lectura;
    }

    public void setFecha_lectura(String fecha_lectura) {
        this.fecha_lectura = fecha_lectura;
    }

    public String getLectura_anterior() {
        return lectura_anterior;
    }

    public void setLectura_anterior(String lectura_anterior) {
        this.lectura_anterior = lectura_anterior;
    }

    public String getLectura_actual() {
        return lectura_actual;
    }

    public void setLectura_actual(String lectura_actual) {
        this.lectura_actual = lectura_actual;
    }

    public double getMetros3() {
        return metros3;
    }

    public void setMetros3(double metros3) {
        this.metros3 = metros3;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNum_medidor() {
        return num_medidor;
    }

    public void setNum_medidor(String num_medidor) {
        this.num_medidor = num_medidor;
    }
    
    
}
