// Modelo Tratamiento
package edu.softech.MySpa.modelo;

/**
 *
 * @author logic
 */
public class Tratamiento {

    private int idTratamiento;
    private String nombre;
    private String descripcion;
    private float costo;
    private int estatus;

    public Tratamiento() {
    }

    public Tratamiento(int idTratamiento, String nombre, String descripcion, float costo, int estatus) {
        this.idTratamiento = idTratamiento;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.costo = costo;
        this.estatus = estatus;
    }

    public int getIdTratamiento() {
        return idTratamiento;
    }

    public void setIdTratamiento(int idTratamiento) {
        this.idTratamiento = idTratamiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public int getEstatus() {
        return estatus;
    }

    public void setEstatus(int estatus) {
        this.estatus = estatus;
    }

}
