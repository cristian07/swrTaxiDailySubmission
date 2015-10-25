package entidades;

public class FichaTecnica {

    private int idFichaTecnica;
    private int kmCorreaMovil;
    private int kmAceiteMovil;
    private int kmFiltro;
    private Movil movil;

    public FichaTecnica(int idFichaTecnica, int kmCorreaMovil, int kmAceiteMovil, int kmFiltro, Movil movil) {
        this.idFichaTecnica = idFichaTecnica;
        this.kmCorreaMovil = kmCorreaMovil;
        this.kmAceiteMovil = kmAceiteMovil;
        this.kmFiltro = kmFiltro;
    }

    public FichaTecnica() {
    }

    public int getIdFichaTecnica() {
        return idFichaTecnica;
    }

    public void setIdFichaTecnica(int idFichaTecnica) {
        this.idFichaTecnica = idFichaTecnica;
    }

    public int getKmCorreaMovil() {
        return kmCorreaMovil;
    }

    public void setKmCorreaMovil(int kmCorreaMovil) {
        this.kmCorreaMovil = kmCorreaMovil;
    }

    public int getKmAceiteMovil() {
        return kmAceiteMovil;
    }

    public void setKmAceiteMovil(int kmAceiteMovil) {
        this.kmAceiteMovil = kmAceiteMovil;
    }

    public int getKmFiltro() {
        return kmFiltro;
    }

    public void setKmFiltro(int kmFiltro) {
        this.kmFiltro = kmFiltro;
    }

    public Movil getMovil() {
        return movil;
    }

    public void setMovil(Movil movil) {
        this.movil = movil;
    }

}
