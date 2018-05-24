/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio2.logica;

/**
 *
 * @author Parra G
 */
public class Producto {
    private int cantidad,disponible;
    private String nombre;
    private int codigo;
    private double precio;

    public Producto( int codigo, double precio, int cantidad,int disponible, String nombre) {
        this.precio = precio;
        this.cantidad = cantidad;
        this.disponible = disponible;
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public void setDisponible(int disponible) {
        this.disponible = disponible;
    }

    public int getDisponible() {
        return disponible;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}
