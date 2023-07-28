/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Alejo-PC
 */
public class Cliente extends Persona {

    private String codigoCliente;
    private int edadCliente;

    public Cliente() {
    }

    public Cliente(String codigoCliente, int edadCliente, String nombreP, String telefonoP, String correoP) {
        super(nombreP, telefonoP, correoP);
        this.codigoCliente = codigoCliente;
        this.edadCliente = edadCliente;
    }

    public Cliente(String nombreCliente, String telefonoCliente, String correoCliente, String codigoCliente, int edadCliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    /**
     * Get the value of edadCliente
     *
     * @return the value of edadCliente
     */
    public int getEdadCliente() {
        return edadCliente;
    }

    /**
     * Set the value of edadCliente
     *
     * @param edadCliente new value of edadCliente
     */
    public void setEdadCliente(int edadCliente) {
        this.edadCliente = edadCliente;
    }

    /**
     * Get the value of codigoCliente
     *
     * @return the value of codigoCliente
     */
    public String getCodigoCliente() {
        return codigoCliente;
    }

    /**
     * Set the value of codigoCliente
     *
     * @param codigoCliente new value of codigoCliente
     */
    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    @Override
    public String toString() {
        return super.toString()+ "Cliente{" + "codigoCliente=" + codigoCliente + ", edadCliente=" + edadCliente + '}';
    }

    public String getNombreCliente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getTelefonoCliente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getCorreoCliente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
