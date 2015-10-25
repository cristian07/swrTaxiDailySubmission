package entidades;

public class GncCtaCte {

    private int idGncCtaCte;
    private double precioActual;

    private GncCtaCte() {

    }

    public GncCtaCte(int idGncCtaCte, float precioActual) {
        this.idGncCtaCte = idGncCtaCte;
        this.precioActual = precioActual;
    }

    public int getIdGncCtaCte() {
        return idGncCtaCte;
    }

    public void setIdGncCtaCte(int idGncCtaCte) {
        this.idGncCtaCte = idGncCtaCte;
    }

    public double getPrecioActual() {
        return precioActual;
    }

    public void setPrecioActual(float precioActual) {
        this.precioActual = precioActual;
    }

}
