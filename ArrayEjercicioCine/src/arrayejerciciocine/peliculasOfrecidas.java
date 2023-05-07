/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayejerciciocine;

public class peliculasOfrecidas {
    String nombrePelicula;
    int codPelicula;    
    String clasificacion;    
    int horaDeEntrada;
    boolean estaActiva;

    public peliculasOfrecidas(String nombrePelicula, int codPelicula, String clasificacion, int horaDeEntrada, boolean estaActiva) {
        this.nombrePelicula = nombrePelicula;
        this.codPelicula = codPelicula;
        this.clasificacion = clasificacion;
        this.horaDeEntrada = horaDeEntrada;
        this.estaActiva = estaActiva;
    }

    public String getNombrePelicula() {
        return nombrePelicula;
    }

    public int getCodPelicula() {
        return codPelicula;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public int getHoraDeEntrada() {
        return horaDeEntrada;
    }

    public boolean isEstaActiva() {
        return estaActiva;
    }

    public void setNombrePelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }

    public void setCodPelicula(int codPelicula) {
        this.codPelicula = codPelicula;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public void setHoraDeEntrada(int horaDeEntrada) {
        this.horaDeEntrada = horaDeEntrada;
    }

    public void setEstaActiva(boolean estaActiva) {
        this.estaActiva = estaActiva;
    }    
}
