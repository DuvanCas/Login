/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pruebaweb.clase;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author duvan
 */
public class Materia {
    //List<Materia> recor = new ArrayList();
    private String nombre;
    private String contra;
    private int id;
    private String token;
    private String mensaje;
    public Materia() {
    }

    public Materia(String nombre, String contra, int id, String token) {
        this.nombre = nombre;
        this.contra = contra;
        this.id = id;
        this.token = token;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the id
     */
    public String getContra() {
        return contra;
    }

    /**
     * @param id the id to set
     */
    public void setContra(String contra) {
        this.contra = contra;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the token
     */
    public String getToken() {
        return token;
    }

    /**
     * @param token the token to set
     */
    public void setToken(String token) {
        this.token = token;
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
}

