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
public class Vendedor extends Persona implements M_darInfo{
    
    Vendedor(String nombre,String direccion, int telefono){
        this.m_nombre = nombre;
        this.m_direccion = direccion;
        this.m_telefono = telefono;
    }

    public String getM_nombre() {
        return m_nombre;
    }

    public String getM_direccion() {
        return m_direccion;
    }

    public int getM_telefono() {
        return m_telefono;
    }

    public void setM_nombre(String m_nombre) {
        this.m_nombre = m_nombre;
    }

    public void setM_direccion(String m_direccion) {
        this.m_direccion = m_direccion;
    }

    public void setM_telefono(int m_telefono) {
        this.m_telefono = m_telefono;
    }

    @Override
    public void M_darInfo() {
        System.out.println(this.getM_nombre() +" "+this.getM_telefono() + " " + this.getM_direccion());
    }
    
}
