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
    int codigo;
    public Factura(Supermercado s, int codigo, Vendedor vendedor, Cliente cliente) {
        this.s = s;
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.productos = new ArrayList();
    }

    public Supermercado getS() {
        return s;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void getProducto(int codigo){
        
        
       String nombre = s.productoPorCodigo(codigo).getNombre();
       
       double 
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
    
    
    
}
