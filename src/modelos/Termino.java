/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author danie
 */
public class Termino {
    
    private String nombreTermino;
    private String descripcionTermino;

    public Termino(String nombreTermino, String descripcionTermino) {
        this.nombreTermino = nombreTermino;
        this.descripcionTermino = descripcionTermino;
    }

    /**
     * @return the nombreTermino
     */
    public String getNombreTermino() {
        return nombreTermino;
    }

    /**
     * @param nombreTermino the nombreTermino to set
     */
    public void setNombreTermino(String nombreTermino) {
        this.nombreTermino = nombreTermino;
    }

    /**
     * @return the descripcionTermino
     */
    public String getDescripcionTermino() {
        return descripcionTermino;
    }

    /**
     * @param descripcionTermino the descripcionTermino to set
     */
    public void setDescripcionTermino(String descripcionTermino) {
        this.descripcionTermino = descripcionTermino;
    }
    
}
