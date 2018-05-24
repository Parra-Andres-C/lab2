/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio2.logica;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Parra G
 */
public class Supermercado {
    private String m_nombre, m_direccion;
    private ArrayList<Producto> m_inventario;
    
    
    public Supermercado(String nombre, String direccion) {
        this.m_nombre = nombre;
        this.m_direccion = direccion;
        this.m_inventario = new ArrayList();
    }

    public String getNombre() {
        return m_nombre;
    }

    public String getDireccion() {
        return m_direccion;
    }

    public ArrayList<Producto> getInventario() {
        return m_inventario;
    }

    public void setNombre(String nombre) {
        this.m_nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.m_direccion = direccion;
    }
    public void addProducto(Producto p){
        this.m_inventario.add(p);
        
    }
    public void darInfoInventario(){
        for ( Producto p : this.m_inventario){
            System.out.println("codigo :" + p.getCodigo() + " precio:" + " " + p.getPrecio() + " cantidad:" + " "+ p.getCantidad() +" disponible:"+" "+ p.getDisponible() + " nombre:" + " " + p.getNombre());
        }
    }
    public Producto productoPorCodigo(int codigo){
        for ( Producto p : this.m_inventario){
            if (p.getCodigo() == codigo){
                return p;
            }else{
                //System.out.println("no se encuentra producto");
            }
        }
        return null;
    }
}
