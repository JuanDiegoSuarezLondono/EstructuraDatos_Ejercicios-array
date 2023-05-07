/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayejerciciocine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 *
 * @author suare
 */
public class ArrayEjercicioCine {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int ciclos=0;
        boolean encontrada=false;
        String  peli;        
        ArrayList<peliculasOfrecidas> listaPelisOfrocidas=new ArrayList<peliculasOfrecidas>();
        ArrayList<personasQueIngresan> listaPersonasIngresan=new ArrayList<personasQueIngresan>();
        ArrayList<personasViendoPeliculas> listaPersonasViendoPelis=new ArrayList<personasViendoPeliculas>();
        ArrayList<personasQueIngresan> listaPersonasCancelaron=new ArrayList<personasQueIngresan>();
        int contador=0;
        int retener=0;
        do {
        System.out.println();
        System.out.println("1) Ingresar las peliculas");
        System.out.println("2) Ingresar las personas");
        System.out.println("3) Listar las personas que estan viendo cine");
        System.out.println("4) Listar las personas que estan viendo cine a una hora especifica");
        System.out.println("5) Listar las pelicuas que se estan ofreciendo (activas)");
        System.out.println("6) Listar las peliculas que se proyectan a una hora especifica");
        System.out.println("7) Cancelar entrada de una persona");
        System.out.println("8) Listar personas que cancelaron entrada");
        switch(Integer.parseInt(br.readLine())) {
            
            case 1:
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println("¿Cuantas peliculas va a ingresar?");
                ciclos=Integer.parseInt(br.readLine());
                for(int i=0;i<ciclos;i++) {
                    System.out.println("Ingrese nombre, codigo, clasificacion, hora de entrada y si esta activa, de la pelicula "+(i+1)+": ");
                    listaPelisOfrocidas.add(new peliculasOfrecidas(br.readLine(), Integer.parseInt(br.readLine()), br.readLine(), Integer.parseInt(br.readLine()), Boolean.parseBoolean(br.readLine())));
                }
                
            break;
            
            case 2:
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println("¿Cuantas personas va a ingresar?");
                ciclos=Integer.parseInt(br.readLine());
                do {
                    System.out.println("Ingrese el nombre de la pelicula");
                    peli=br.readLine();
                    for (int i=0;i<listaPelisOfrocidas.size();i++) {
                        if(listaPelisOfrocidas.get(i).getNombrePelicula().equalsIgnoreCase(peli) && listaPelisOfrocidas.get(i).isEstaActiva()) {
                            encontrada=true;
                            break;
                        }
                    }
                    if(encontrada==true) {
                        break;
                    }         
                    else {
                        System.out.println("No se encontro pelicula");
                    }
                } while(true);
                encontrada=false;
                for(int i=0;i<ciclos;i++) {
                    System.out.println("Ingrese el nombre, cedula, genero(H o M) y edad de la persona "+(i+1)+": ");
                    listaPersonasIngresan.add(new personasQueIngresan(br.readLine(), Integer.parseInt(br.readLine()),br.readLine().charAt(0), Integer.parseInt(br.readLine())));
                    listaPersonasViendoPelis.add(new personasViendoPeliculas(listaPersonasIngresan.get(listaPersonasIngresan.size()-1).getNombrePersona(),peli));
                }
            break;
            
            case 3:
                System.out.println("\n\n\n\n\n\n\n");
                for (int i=0;i<listaPersonasIngresan.size();i++) {
                    System.out.println("Nombre: "+listaPersonasIngresan.get(i).getNombrePersona());
                    System.out.println("Edad: "+listaPersonasIngresan.get(i).getEdad());   
                    System.out.println("Genero: "+listaPersonasIngresan.get(i).getGenero());   
                    System.out.println("Cedula: "+listaPersonasIngresan.get(i).getCedula());
                    System.out.println();
                    }
                    System.out.println("Ingrese cualquier comando para seguir.");
                    br.readLine();
            break;
            
            case 4:
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println("¿Que hora?");
                retener=Integer.parseInt(br.readLine());
                String[] nombreRetener=new String[listaPelisOfrocidas.size()];
                for (int i=0;i<listaPelisOfrocidas.size();i++) {
                    if(listaPelisOfrocidas.get(i).getHoraDeEntrada()==retener) {
                        nombreRetener[contador]=listaPelisOfrocidas.get(i).getNombrePelicula();
                        contador++;
                    }
                }
                for (int i=0;i<listaPersonasViendoPelis.size();i++) {
                    for(int j=0;j<contador;j++) {
                        System.out.println(listaPersonasViendoPelis.get(i).getNombrePelicula());
                        if(listaPersonasViendoPelis.get(i).getNombrePelicula().equalsIgnoreCase(nombreRetener[j])){
                            System.out.println("Nombre: "+listaPersonasIngresan.get(i).getNombrePersona());
                            System.out.println("Edad: "+listaPersonasIngresan.get(i).getEdad());   
                            System.out.println("Genero: "+listaPersonasIngresan.get(i).getGenero());   
                            System.out.println("Cedula: "+listaPersonasIngresan.get(i).getCedula());
                            System.out.println();
                        }
                    }
                }
                contador=0;
                System.out.println("Ingrese cualquier comando para seguir.");
                br.readLine();
                retener=0;                
            break;
            
            case 5:
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println("Las peliculas activas son:");
                for (int i=0;i<listaPelisOfrocidas.size();i++) {
                    if(listaPelisOfrocidas.get(i).isEstaActiva()) {
                        System.out.println("Nombre: "+listaPelisOfrocidas.get(i).getNombrePelicula());
                        System.out.println("Codigo pelicula: "+listaPelisOfrocidas.get(i).getCodPelicula());   
                        System.out.println("Clasifiacion: "+listaPelisOfrocidas.get(i).getClasificacion());   
                        System.out.println("Hora(24Hs): "+listaPelisOfrocidas.get(i).getHoraDeEntrada());  
                        System.out.println();
                    }
                }
                System.out.println("Ingrese cualquier comando para seguir.");
                br.readLine();
                
            break;
            
            case 6:
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println("¿Que hora?");
                retener=Integer.parseInt(br.readLine());
                for (int i=0;i<listaPelisOfrocidas.size();i++) {
                    if(retener==listaPelisOfrocidas.get(i).getHoraDeEntrada()) {
                        System.out.println("Nombre: "+listaPelisOfrocidas.get(i).getNombrePelicula());
                        System.out.println("Codigo pelicula: "+listaPelisOfrocidas.get(i).getCodPelicula());   
                        System.out.println("Clasifiacion: "+listaPelisOfrocidas.get(i).getClasificacion());   
                        System.out.println("Esta activa: "+listaPelisOfrocidas.get(i).isEstaActiva());
                        System.out.println();
                        }
                    }
                System.out.println("Ingrese cualquier comando para seguir.");
                br.readLine();
                retener=0;
            break;
            
            case 7:
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println("¿Cual va a cancelar?");
                for (int i=0;i<listaPersonasIngresan.size();i++) {
                    System.out.println((i+1)+".");
                    System.out.println("Nombre: "+listaPersonasIngresan.get(i).getNombrePersona());
                    System.out.println("Edad: "+listaPersonasIngresan.get(i).getEdad());   
                    System.out.println("Genero: "+listaPersonasIngresan.get(i).getGenero());   
                    System.out.println("Cedula: "+listaPersonasIngresan.get(i).getCedula()); 
                    System.out.println();                    
                    }
                retener=Integer.parseInt(br.readLine());
                for (int i=0;i<listaPersonasIngresan.size();i++) {
                    if(retener==(i+1)) {
                        listaPersonasCancelaron.add(listaPersonasIngresan.get(i));
                        listaPersonasIngresan.remove(i);
                        }
                    }
                System.out.println("Ingrese cualquier comando para seguir.");
                br.readLine();
                retener=0;
            break;
            
            case 8:
                for (int i=0;i<listaPersonasCancelaron.size();i++) {
                    System.out.println((i+1)+".");
                    System.out.println("Nombre: "+listaPersonasCancelaron.get(i).getNombrePersona());
                    System.out.println("Edad: "+listaPersonasCancelaron.get(i).getEdad());   
                    System.out.println("Genero: "+listaPersonasCancelaron.get(i).getGenero());   
                    System.out.println("Cedula: "+listaPersonasCancelaron.get(i).getCedula()); 
                    System.out.println();                    
                    }
            break;
            } 
        
        }while(true);
        
    }
    
}
