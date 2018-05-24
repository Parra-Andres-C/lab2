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
public class Caja {
    private final Supermercado m_sm;
    private double subcosto=0;
    public Caja(Supermercado sm){
        this.m_sm = sm;
    }
    public void registrarProducto(int codigo, int cantidad){
        if(this.m_sm.productoPorCodigo(codigo).getDisponible() < cantidad){
            System.out.println("no hay producto disponible");
        }else{
            this.subcosto += this.m_sm.productoPorCodigo(codigo).getPrecio() * cantidad;
            System.out.println(this.subcosto);
            this.m_sm.productoPorCodigo(codigo).setDisponible(this.m_sm.productoPorCodigo(codigo).getDisponible() - cantidad);
            
        }
        
    }
}
