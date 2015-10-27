package entidades;

import java.util.Date;

public class Chofer {

    private int DNI;
    private String nombre;
    private String apellido;
    private String domicilio;
    private String localidad;
    private String provincia;
    private String telefono;
    private String celular;
    private Date fechaCarnet;
    private int licenciaCarnet;

    /**
     * @return the DNI
     */
    public int getDNI() {
        return DNI;
    }

    /**
     * @param DNI the DNI to set
     */
    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the domicilio
     */
    public String getDomicilio() {
        return domicilio;
    }

    /**
     * @param domicilio the domicilio to set
     */
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    /**
     * @return the localidad
     */
    public String getLocalidad() {
        return localidad;
    }

    /**
     * @param localidad the localidad to set
     */
    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    /**
     * @return the provincia
     */
    public String getProvincia() {
        return provincia;
    }

    /**
     * @param provincia the provincia to set
     */
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the celular
     */
    public String getCelular() {
        return celular;
    }

    /**
     * @param celular the celular to set
     */
    public void setCelular(String celular) {
        this.celular = celular;
    }

    /**
     * @return the fechaCarnet
     */
    public Date getFechaCarnet() {
        return fechaCarnet;
    }

    /**
     * @param fechaCarnet the fechaCarnet to set
     */
    public void setFechaCarnet(Date fechaCarnet) {
        this.fechaCarnet = fechaCarnet;
    }

    /**
     * @return the licenciaCarnet
     */
    public int getLicenciaCarnet() {
        return licenciaCarnet;
    }

    /**
     * @param licenciaCarnet the licenciaCarnet to set
     */
    public void setLicenciaCarnet(int licenciaCarnet) {
        this.licenciaCarnet = licenciaCarnet;
    }

}
