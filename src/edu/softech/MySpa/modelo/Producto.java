// Modelo Producto
package edu.softech.MySpa.modelo;

/**
 *
 * @author Víctor
 */
public class Producto {
    
    // Atributos del producto
    private int idProducto;
    private String nombre;
    private String marca;
    private int estatus;
    private float precioUso;
    /*
    Constructores para el objeto Producto
    Existe un constructor para cada o casos en concreto:
    1. 
    */
    
    public Producto(){
    }
    
    public Producto(int idProducto, String nombre, String marca, int estatus, float precioUso) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.marca = marca;
        this.estatus = estatus;
        this.precioUso = precioUso;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getEstatus() {
        return estatus;
    }

    public void setEstatus(int estatus) {
        this.estatus = estatus;
    }

    public float getPrecioUso() {
        return precioUso;
    }

    public void setPrecioUso(float precioUso) {
        this.precioUso = precioUso;
    }

    
}
