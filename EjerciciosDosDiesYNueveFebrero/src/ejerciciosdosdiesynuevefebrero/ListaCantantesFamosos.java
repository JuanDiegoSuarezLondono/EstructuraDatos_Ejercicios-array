/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosdosdiesynuevefebrero;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/**
 *
 * @author suare
 */
public class ListaCantantesFamosos {
    ArrayList<cantanteFamoso> listacantantesFamosos=new ArrayList<cantanteFamoso>();
    
     public void AñadirCantante(cantanteFamoso cantante) {
        this.listacantantesFamosos.add(cantante);
    }      

    public ArrayList<cantanteFamoso> getListacantantesFamosos() {
        return listacantantesFamosos;
    }   
    
    public void Remove(int contador){
                listacantantesFamosos.remove(contador);
    }
    public void set(int contador,String nombre) {
        cantanteFamoso cantante=listacantantesFamosos.get(contador);
        cantante.setNombre(nombre);
        listacantantesFamosos.set(contador, cantante);
    }
    
    public void listaDiscosVendidos() {
        cantanteFamoso retenerCantante;
        ArrayList<cantanteFamoso> listacantantesOrganizada=listacantantesFamosos;
        for(int i=0;i<listacantantesFamosos.size();i++) {
            retenerCantante=listacantantesOrganizada.get(i);
            for(int j=i;j<listacantantesFamosos.size();j++) {
                System.out.println("----------------------");
                System.out.println("retener: "+retenerCantante.getDiscosVendidos());
                System.out.println("lista: "+listacantantesOrganizada.get(j).getDiscosVendidos());
                System.out.println("i: "+i);
                System.out.println("j: "+j);
                if(retenerCantante.getDiscosVendidos()<listacantantesOrganizada.get(j).getDiscosVendidos()) {
                    listacantantesOrganizada.remove(i);  
                    listacantantesOrganizada.add(retenerCantante);
                    i--;
                    break;
                    }                
            }
        }
        for(int j=0;j<listacantantesFamosos.size();j++) {
            System.out.println();
            System.out.println("Nombre: "+listacantantesOrganizada.get(j).getNombre());
            System.out.println("Disco mas vendido: "+listacantantesOrganizada.get(j).getDiscoConMasVentas());
            System.out.println("Discos vendidos: "+listacantantesOrganizada.get(j).getDiscosVendidos());
        }
    }
}
