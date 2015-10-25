package entidades;

public class RelojMovil {

    private int idRelojMovil;
    private int kmReloj;
    private Movil movil;

    public RelojMovil(int idRelojMovil, int kmReloj, Movil movil) {
        this.idRelojMovil = idRelojMovil;
        this.kmReloj = kmReloj;
        this.movil = movil;
    }

    public RelojMovil() {

    }

    public int getIdRelojMovil() {
        return idRelojMovil;
    }

    public void setIdRelojMovil(int idRelojMovil) {
        this.idRelojMovil = idRelojMovil;
    }

    public int getKmReloj() {
        return kmReloj;
    }

    public void setKmReloj(int kmReloj) {
        this.kmReloj = kmReloj;
    }

    public Movil getMovil() {
        return movil;
    }

    public void setMovil(Movil movil) {
        this.movil = movil;
    }

}
