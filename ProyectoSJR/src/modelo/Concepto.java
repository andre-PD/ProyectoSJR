
package modelo;

public class Concepto {
    private int cod_concepto;
    private double valor;//convertir
  private String concepto;

    public Concepto(int cod_concepto, double valor, String concepto) {
        this.cod_concepto = cod_concepto;
        this.valor = valor;
        this.concepto = concepto;
    }

    public Concepto() {
    }

    public int getCod_concepto() {
        return cod_concepto;
    }

    public void setCod_concepto(int cod_concepto) {
        this.cod_concepto = cod_concepto;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }
    
    
}
