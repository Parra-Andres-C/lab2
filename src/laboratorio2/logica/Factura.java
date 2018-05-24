/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio2.logica;

import java.util.ArrayList;

/**
 *
 * @author Parra G
 */
public class Factura {
    Supermercado s;
    ArrayList<Producto> productos;
    Vendedor vendedor;
    Cliente cliente;
    int codigo, cantidad_comprada;
    public Factura(Supermercado s, int codigo,int cc,  Vendedor vendedor, Cliente cliente) {
        this.s = s;
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.productos = new ArrayList();
        this.cantidad_comprada = cc;
    }

    public Supermercado getS() {
        return s;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void addProducto(int codigo, int cc){
        
        
       String nombre = s.productoPorCodigo(codigo).getNombre();
       
       double precio = s.productoPorCodigo(codigo).getPrecio();
       
       int cantidad = cc;
       Producto p = new Producto(codigo, precio, cantidad, nombre);
       this.productos.add(p);
    }
    
    
    
    public Vendedor getVendedor() {
        return vendedor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setS(Supermercado s) {
        this.s = s;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public void impri(){
        
    }
    
    public void imprimir(){
        int cantotal=0;
        System.out.println(s.getNombre() +"\n"+ s.getDireccion());
        System.out.println("Productos comprados: nombre, codigo, cantidad, precio por unidad");
        for (Producto p : this.productos){
            System.out.println("\t"+p.getNombre()+" "+p.getCodigo()+" "+p.getCantidad()+" "+p.getPrecio());
            cantotal += p.getCantidad();
        }
        System.out.println("Numero de articulos comprados:" + cantotal);
        if(cliente != null){
            System.out.println("Cliente: " + cliente.getM_nombre()+" Direccion: "+ cliente.getM_direccion());
            System.out.println("Puntos Acumulados: "+cliente.getPuntos());
        }
    }
    
}
