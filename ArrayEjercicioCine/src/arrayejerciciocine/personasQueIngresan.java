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
public class personasQueIngresan {
    String nombrePersona;
    int cedula;
    char genero;
    int edad;

    public personasQueIngresan(String nombrePersona, int cedula, char genero, int edad) {
        this.nombrePersona = nombrePersona;
        this.cedula = cedula;
        this.genero = genero;
        this.edad = edad;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
