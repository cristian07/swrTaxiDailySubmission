package entidades;

public class Turno {

    private int idTurno;
    private Turno tipoTurno;
    private double comision;
    private double gastosGncCtaCte;
    private double gastoGncOtros;
    private double gastoLavado;
    private double gastoOtros;
    private double gananciaNeta;
    private String novedades;
    private int kmInicial;
    private int kmFinal;

    public Turno(int idTurno, Turno tipoTurno, double comision, double gastosGncCtaCte, double gastoGncOtros, double gastoLavado, double gastoOtros, double gananciaNeta, String novedades, int kmInicial, int kmFinal) {
        this.idTurno = idTurno;
        this.tipoTurno = tipoTurno;
        this.comision = comision;
        this.gastosGncCtaCte = gastosGncCtaCte;
        this.gastoGncOtros = gastoGncOtros;
        this.gastoLavado = gastoLavado;
        this.gastoOtros = gastoOtros;
        this.gananciaNeta = gananciaNeta;
        this.novedades = novedades;
        this.kmInicial = kmInicial;
        this.kmFinal = kmFinal;
    }

    public int getIdTurno() {
        return idTurno;
    }

    public void setIdTurno(int idTurno) {
        this.idTurno = idTurno;
    }

    public Turno getTipoTurno() {
        return tipoTurno;
    }

    public void setTipoTurno(Turno tipoTurno) {
        this.tipoTurno = tipoTurno;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    public double getGastosGncCtaCte() {
        return gastosGncCtaCte;
    }

    public void setGastosGncCtaCte(double gastosGncCtaCte) {
        this.gastosGncCtaCte = gastosGncCtaCte;
    }

    public double getGastoGncOtros() {
        return gastoGncOtros;
    }

    public void setGastoGncOtros(double gastoGncOtros) {
        this.gastoGncOtros = gastoGncOtros;
    }

    public double getGastoLavado() {
        return gastoLavado;
    }

    public void setGastoLavado(double gastoLavado) {
        this.gastoLavado = gastoLavado;
    }

    public double getGastoOtros() {
        return gastoOtros;
    }

    public void setGastoOtros(double gastoOtros) {
        this.gastoOtros = gastoOtros;
    }

    public double getGananciaNeta() {
        return gananciaNeta;
    }

    public void setGananciaNeta(double gananciaNeta) {
        this.gananciaNeta = gananciaNeta;
    }

    public String getNovedades() {
        return novedades;
    }

    public void setNovedades(String novedades) {
        this.novedades = novedades;
    }

    public int getKmInicial() {
        return kmInicial;
    }

    public void setKmInicial(int kmInicial) {
        this.kmInicial = kmInicial;
    }

    public int getKmFinal() {
        return kmFinal;
    }

    public void setKmFinal(int kmFinal) {
        this.kmFinal = kmFinal;
    }

}
