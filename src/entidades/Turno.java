package entidades;

public class Turno {
    private double gastosVarios;
    private double recaudacion;
    private String fecha;
    private int kmInicial;
    private int kmFinal;
    private String ticketRelevo;
    private String tipo;
    private int Movil_idMovil;

    public Turno(){
        
    }
    /**
     * @return the gastosVarios
     */
    public double getGastosVarios() {
        return gastosVarios;
    }

    /**
     * @param gastosVarios the gastosVarios to set
     */
    public void setGastosVarios(double gastosVarios) {
        this.gastosVarios = gastosVarios;
    }

    /**
     * @return the recaudacion
     */
    public double getRecaudacion() {
        return recaudacion;
    }

    /**
     * @param recaudacion the recaudacion to set
     */
    public void setRecaudacion(double recaudacion) {
        this.recaudacion = recaudacion;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the kmInicial
     */
    public int getKmInicial() {
        return kmInicial;
    }

    /**
     * @param kmInicial the kmInicial to set
     */
    public void setKmInicial(int kmInicial) {
        this.kmInicial = kmInicial;
    }

    /**
     * @return the kmFinal
     */
    public int getKmFinal() {
        return kmFinal;
    }

    /**
     * @param kmFinal the kmFinal to set
     */
    public void setKmFinal(int kmFinal) {
        this.kmFinal = kmFinal;
    }

    /**
     * @return the ticketRelevo
     */
    public String getTicketRelevo() {
        return ticketRelevo;
    }

    /**
     * @param ticketRelevo the ticketRelevo to set
     */
    public void setTicketRelevo(String ticketRelevo) {
        this.ticketRelevo = ticketRelevo;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the Movil_idMovil
     */
    public int getMovil_idMovil() {
        return Movil_idMovil;
    }

    /**
     * @param Movil_idMovil the Movil_idMovil to set
     */
    public void setMovil_idMovil(int Movil_idMovil) {
        this.Movil_idMovil = Movil_idMovil;
    }

  
    
}
