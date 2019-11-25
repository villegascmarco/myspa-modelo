package edu.softech.MySpa.modelo;

/**
 *
 * @author Víctor Alejandro Santillán Martínez
 */
public class Producto_Sucursal {
    
    private int idProducto_Sucursal;
    private Sucursal sucursal;
    private Producto producto;
    private int stock;
    
    public Producto_Sucursal(){
    }

    public Producto_Sucursal(int idProducto_Sucursal, Sucursal sucursal, Producto producto, int stock) {
        this.idProducto_Sucursal = idProducto_Sucursal;
        this.sucursal = sucursal;
        this.producto = producto;
        this.stock = stock;
    }

    public int getIdProducto_Sucursal() {
        return idProducto_Sucursal;
    }

    public void setIdProducto_Sucursal(int idProducto_Sucursal) {
        this.idProducto_Sucursal = idProducto_Sucursal;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    
        
}
