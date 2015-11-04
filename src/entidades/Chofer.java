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
    private String fechaCarnetOtorgamiento;
    private String fechaCarnetVencimiento;
    private String categoria;

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
     * @return the fechaCarnetOtorgamiento
     */
    public String getFechaCarnetOtorgamiento() {
        return fechaCarnetOtorgamiento;
    }

    /**
     * @param fechaCarnetOtorgamiento the fechaCarnetOtorgamiento to set
     */
    public void setFechaCarnetOtorgamiento(String fechaCarnetOtorgamiento) {
        this.fechaCarnetOtorgamiento = fechaCarnetOtorgamiento;
    }

    /**
     * @return the fechaCarnetVencimiento
     */
    public String getFechaCarnetVencimiento() {
        return fechaCarnetVencimiento;
    }

    /**
     * @param fechaCarnetVencimiento the fechaCarnetVencimiento to set
     */
    public void setFechaCarnetVencimiento(String fechaCarnetVencimiento) {
        this.fechaCarnetVencimiento = fechaCarnetVencimiento;
    }

    /**
     * @return the categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

}
