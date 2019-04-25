/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pruebaweb.clase;

/**
 *
 * @author duvan
 */
public class Mensaje {
    private String mensaje;
    private String mensaje1;

    public Mensaje() {
    }

    public Mensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    /**
     * @return the mensaje
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * @param mensaje the mensaje to set
     */
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    /**
     * @return the mensaje1
     */
    public String getMensaje1() {
        return mensaje1;
    }

    /**
     * @param mensaje1 the mensaje1 to set
     */
    public void setMensaje1(String mensaje1) {
        this.mensaje1 = mensaje1;
    }
    
}
