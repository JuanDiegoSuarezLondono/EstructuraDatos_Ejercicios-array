/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosdosdiesynuevefebrero;

/**
 *
 * @author suare
 */
public class cantanteFamoso {
    String nombre;
    String discoConMasVentas;
    int discosVendidos;

    public cantanteFamoso(String nombre, String discoConMasVentas, int discosVendidos) {
        this.nombre = nombre;
        this.discoConMasVentas = discoConMasVentas;
        this.discosVendidos =discosVendidos;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre=nombre;
    }
    
    public String getDiscoConMasVentas() {
        return discoConMasVentas;
    }   

    public int getDiscosVendidos() {
        return discosVendidos;
    }    
    
}
