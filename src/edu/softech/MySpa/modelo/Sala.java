/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.softech.MySpa.modelo;

/**
 *
 * @author Esau
 */
public class Sala
{
    private int idSala;
    private String nombre;
    private String descripcion;
    private String foto;
    private String rutaFoto;
    private int estatus;
    private Sucursal sucursal;

    public Sala()
    {
        sucursal = new Sucursal();
    }

    public Sala(int idSala,
                String nombre,
                String descripcion,
                String foto,
                String rutaFoto,
                int estatus,
                Sucursal sucursal)
    {
        this.idSala = idSala;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.foto = foto;
        this.rutaFoto = rutaFoto;
        this.estatus = estatus;
        this.sucursal = sucursal;
    }

    public int getIdSala()
    {
        return idSala;
    }

    public void setIdSala(int idSala)
    {
        this.idSala = idSala;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getDescripcion()
    {
        return descripcion;
    }

    public void setDescripcion(String descripcion)
    {
        this.descripcion = descripcion;
    }

    public String getFoto()
    {
        return foto;
    }

    public void setFoto(String foto)
    {
        this.foto = foto;
    }

    public String getRutaFoto()
    {
        return rutaFoto;
    }

    public void setRutaFoto(String rutaFoto)
    {
        this.rutaFoto = rutaFoto;
    }

    public int getEstatus()
    {
        return estatus;
    }

    public void setEstatus(int estatus)
    {
        this.estatus = estatus;
    }

    public Sucursal getSucursal()
    {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal)
    {
        this.sucursal = sucursal;
    }

    @Override
    public String toString()
    {
        return "Sala{" + "idSala=" + idSala + ", nombre=" + nombre + ", descripcion=" + descripcion + ", foto=" + foto + ", rutaFoto=" + rutaFoto + ", estatus=" + estatus + ", sucursal=" + sucursal + '}';
    }
    
}
