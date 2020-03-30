
package modelo;

public class Detalle_Planilla {
    private int cod_detalle_planilla;
private double precio_unitario;
private double precio_total;

    public Detalle_Planilla(int cod_detalle_planilla, double precio_unitario, double precio_total) {
        this.cod_detalle_planilla = cod_detalle_planilla;
        this.precio_unitario = precio_unitario;
        this.precio_total = precio_total;
    }

    public Detalle_Planilla() {
    }

    public int getCod_detalle_planilla() {
        return cod_detalle_planilla;
    }

    public void setCod_detalle_planilla(int cod_detalle_planilla) {
        this.cod_detalle_planilla = cod_detalle_planilla;
    }

    public double getPrecio_unitario() {
        return precio_unitario;
    }

    public void setPrecio_unitario(double precio_unitario) {
        this.precio_unitario = precio_unitario;
    }

    public double getPrecio_total() {
        return precio_total;
    }

    public void setPrecio_total(double precio_total) {
        this.precio_total = precio_total;
    }


}
