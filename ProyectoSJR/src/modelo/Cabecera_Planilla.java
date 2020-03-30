package modelo;

public class Cabecera_Planilla {

    private int cod_cabe_planilla;
    private String observaciones;
    private double mora;
    private double imp_medio_ambiente;
    private double sub_total;
    private double descuento;
    private int base_pago;//transformar
    private double iva;
    private double total;

    public Cabecera_Planilla(int cod_cabe_planilla, String observaciones, double mora, double imp_medio_ambiente, double sub_total, double descuento, int base_pago, double iva, double total) {
        this.cod_cabe_planilla = cod_cabe_planilla;
        this.observaciones = observaciones;
        this.mora = mora;
        this.imp_medio_ambiente = imp_medio_ambiente;
        this.sub_total = sub_total;
        this.descuento = descuento;
        this.base_pago = base_pago;
        this.iva = iva;
        this.total = total;
    }

    public Cabecera_Planilla() {
    }

    public int getCod_cabe_planilla() {
        return cod_cabe_planilla;
    }

    public void setCod_cabe_planilla(int cod_cabe_planilla) {
        this.cod_cabe_planilla = cod_cabe_planilla;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public double getMora() {
        return mora;
    }

    public void setMora(double mora) {
        this.mora = mora;
    }

    public double getImp_medio_ambiente() {
        return imp_medio_ambiente;
    }

    public void setImp_medio_ambiente(double imp_medio_ambiente) {
        this.imp_medio_ambiente = imp_medio_ambiente;
    }

    public double getSub_total() {
        return sub_total;
    }

    public void setSub_total(double sub_total) {
        this.sub_total = sub_total;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public int getBase_pago() {
        return base_pago;
    }

    public void setBase_pago(int base_pago) {
        this.base_pago = base_pago;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

}
