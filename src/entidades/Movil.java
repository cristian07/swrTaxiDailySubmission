package entidades;

public class Movil {

    private int nroMovil;
    private String nroPatente;
    private String nroLicencia;
    private int kmTablero;

    public Movil() {

    }

    public Movil(int nroMovil, String nroPatente, String nroLicencia, int kmTablero) {
        this.nroMovil = nroMovil;
        this.nroPatente = nroPatente;
        this.nroLicencia = nroLicencia;
        this.kmTablero = kmTablero;
    }

    public int getNroMovil() {
        return nroMovil;
    }

    public void setNroMovil(int nroMovil) {
        this.nroMovil = nroMovil;
    }

    public String getNroPatente() {
        return nroPatente;
    }

    public void setNroPatente(String nroPatente) {
        this.nroPatente = nroPatente;
    }

    public String getNroLicencia() {
        return nroLicencia;
    }

    public void setNroLicencia(String nroLicencia) {
        this.nroLicencia = nroLicencia;
    }

    public int getKmTablero() {
        return kmTablero;
    }

    public void setKmTablero(int kmTablero) {
        this.kmTablero = kmTablero;
    }

}
