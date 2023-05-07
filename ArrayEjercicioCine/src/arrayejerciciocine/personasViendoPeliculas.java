/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayejerciciocine;

/**
 *
 * @author suare
 */
public class personasViendoPeliculas {
    String nombrePersona;
    String nombrePelicula;

    public personasViendoPeliculas(String nombrePersona, String nombrePelicula) {
        this.nombrePersona = nombrePersona;
        this.nombrePelicula = nombrePelicula;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getNombrePelicula() {
        return nombrePelicula;
    }

    public void setNombrePelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }
    
}
