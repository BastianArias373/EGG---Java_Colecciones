package entidades.servicios;

import entidades.Pelicula;
import entidades.utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class peliculaServicio {
    
    private Scanner leer;
    private ArrayList<Pelicula> listaPelis;

    public peliculaServicio() {
        this.listaPelis = new ArrayList();
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }
    
    public Pelicula crearPelicula(){
        
        System.out.println("Titulo");
        String titulo = leer.next();
        System.out.println("Autor");
        String autor = leer.next();
        System.out.println("Duracion");
        int duracion = leer.nextInt();
        Pelicula p1 = new Pelicula(titulo,autor,duracion);
        listaPelis.add(p1);
        return p1;
    }
    
    public void pelisVer(){
        for (Pelicula aux : listaPelis) {
            System.out.println(aux);
        }
    }
    public void pelisLargas(){
        for (Pelicula aux : listaPelis) {
            Pelicula p1 = aux;
            if (p1.getDuracion() > 1) {
                System.out.println(aux);
            }
        }
    }
    public void pelisOrdenDuracionDsc(){
        Collections.sort(listaPelis, Comparadores.ordenDuracionDsc);
        for (Pelicula aux : listaPelis) {
            System.out.println(aux);  
        }
    }
    public void pelisOrdenDuracionAsc(){
        Collections.sort(listaPelis, Comparadores.ordenDuracionAsc);
        for (Pelicula aux : listaPelis) {
            System.out.println(aux);
        }
    }
    public void pelisOrdenTituloAsc(){
        Collections.sort(listaPelis, Comparadores.ordenTituloAsc);
        for (Pelicula aux : listaPelis) {
            System.out.println(aux);
        }
    }
    public void pelisOrdenAutorAsc(){
        Collections.sort(listaPelis, Comparadores.ordenDirectorAsc);
        for (Pelicula aux : listaPelis) {
            System.out.println(aux);
        }
    }
    
    public void menu(){
        System.out.println("Elija una accion: \n" +
                            "1) Mostrar Peliculas \n" +
                            "2) Pelis Largas \n" + 
                            "3) Ordenar por duracion (Ascendente) \n" +
                            "4) Ordenar por duracion (Descendente) \n" +
                            "5) Ordenar por Titulo (Alfabeticamente) \n" + 
                            "6) Ordenar por Autor (Alfabeticamente) \n");
        
        int opcion = leer.nextInt();
        menuElecciones(opcion);
    }
    
    public void menuElecciones(int eleccion){
        switch (eleccion) {
            case 1:
                pelisVer();
                break;
            case 2:
                pelisLargas();
                break;
            case 3:
                pelisOrdenDuracionAsc();
                break;
            case 4:
                pelisOrdenDuracionDsc();
                break;
            case 5:
                pelisOrdenTituloAsc();
                break;
            case 6:
                pelisOrdenTituloAsc();
                break;
            default:
                throw new AssertionError();
        }
    }
    
    
    
    
}
