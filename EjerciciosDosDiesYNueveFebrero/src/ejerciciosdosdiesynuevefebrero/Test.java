/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosdosdiesynuevefebrero;

import java.awt.event.*;
import java.io.*;

/**
 *
 * @author suare
 */
public class Test {
    static int contador[]={0,0};
    static int menu=0;
    static ListaCantantesFamosos lista=new ListaCantantesFamosos();
    static boolean seleccionado[]={false,false};
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
        System.out.println("Para navegar en el menu ingrese U para ir arriba, D para ir abajo o S para seleccionar.");
        System.out.println("Ingrese cantante uno, el disco mas vendido y el numero de discos vendidos: ");        
        lista.AñadirCantante(new cantanteFamoso(br.readLine(), br.readLine(),Integer.parseInt(br.readLine()))); 
        System.out.println();
        System.out.println("Ingrese cantante dos, el disco mas vendido y el numero de discos vendidos: ");        
        lista.AñadirCantante(new cantanteFamoso(br.readLine(), br.readLine(),Integer.parseInt(br.readLine())));   
        System.out.println("Ingrese U para ir arriba, D para ir abajo o S para seleccionar.");
        do {
            System.out.println("\n\n\n\n\n\n\n\n");
            if(seleccionado[0]==false) {
                if(contador[0]==lista.getListacantantesFamosos().size()) {
                    System.out.println((contador[0]+1)+". Añadir+");
                    }
                else if(contador[0]==lista.getListacantantesFamosos().size()+1) {
                    System.out.println((contador[0]+1)+". Cantantes con los discos mas vendidos");
                }
                else if(contador[0]==lista.getListacantantesFamosos().size()+2) {
                    System.out.println((contador[0]+1)+". Salir");
                }
                else {
                System.out.println((contador[0]+1)+".");
                System.out.println("Nombre: "+lista.getListacantantesFamosos().get(contador[0]).getNombre());
                System.out.println("Disvo mas vendido: "+lista.getListacantantesFamosos().get(contador[0]).getDiscoConMasVentas());
                System.out.println("Discos vendidos: "+lista.getListacantantesFamosos().get(contador[0]).getDiscosVendidos());
                }
                Iterador(br.readLine());
            }
            else {
                if(contador[0]<lista.getListacantantesFamosos().size()) {
                    do {
                        System.out.println("\n\n\n\n\n\n\n\n");
                        if(seleccionado[1]==false) {
                            menu=1;
                            if(contador[1]==0) {
                                System.out.println("1. Eliminar");
                            }
                            if(contador[1]==1) {
                                System.out.println("2. Cambiar nombre");
                            }
                            if(contador[1]==2) {
                                System.out.println("3. Salir");
                            }
                            Iterador(br.readLine());
                        }
                        else {
                            if(contador[1]==0) {
                                lista.Remove(contador[0]); 
                                break;
                            }
                            if(contador[1]==1) {
                                System.out.println("Ingrese el nuevo nombre: ");
                                lista.set(contador[0], br.readLine()); 
                                break;
                            }
                            if(contador[1]==2) {
                                break;
                            }
                            contador[1]=1;
                        }
                    }while(true);   
                    menu=0;
                    contador[0]=0;
                    contador[1]=0;
                    seleccionado[0]=false;
                    seleccionado[1]=false;
                }
                if(contador[0]==lista.getListacantantesFamosos().size()) {
                    System.out.println("Ingrese el nuevo cantante, el disco mas vendido y el numero de discos vendidos: ");        
                    lista.AñadirCantante(new cantanteFamoso(br.readLine(), br.readLine(),Integer.parseInt(br.readLine()))); 
                    }
                if(contador[0]==lista.getListacantantesFamosos().size()+1) {
                    lista.listaDiscosVendidos();
                    System.out.println("Ingrese cualquier valor para regresar al menu");
                    br.readLine();
                    }
                if(contador[0]==lista.getListacantantesFamosos().size()+2) {
                    break;
                }
                seleccionado[0]=false;
            }
        } while(true);
    }  
    
    public static void Iterador(String comando) {
        if(menu==0) {
            if(comando.equalsIgnoreCase("U") && contador[0]<=lista.getListacantantesFamosos().size()+1) {
                contador[0]++;
            }
            else if(comando.equalsIgnoreCase("D") && contador[0]>0) {
                contador[0]--;
            }
            else if(comando.equalsIgnoreCase("S")) {
                seleccionado[0]=true;
            }
        }
        else{
            if(comando.equalsIgnoreCase("U") && contador[1]<2) {
                contador[1]++;
            }
            else if(comando.equalsIgnoreCase("D") && contador[1]>0) {
                contador[1]--;
            }
            else if(comando.equalsIgnoreCase("S")) {
                seleccionado[1]=true;
            }            
        }
    }
    
}
