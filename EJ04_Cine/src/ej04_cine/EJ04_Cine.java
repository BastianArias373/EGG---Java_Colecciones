package ej04_cine;

import entidades.Pelicula;
import entidades.servicios.peliculaServicio;
import java.util.Scanner;

/*
Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para
esto, tendremos una clase Pelicula con el titulo, director y duración de la película (en
horas). Implemente las clases y métodos necesarios para esta situación, teniendo en
cuenta lo que se pide a continuación:

En el main deberemos tener un bucle que crea un objeto Pelicula pidiéndole al
usuario todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si
quiere crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:

    •Mostrar en pantalla todas las películas.

    •Mostrar en pantalla todas las películas con una duración mayor a 1 hora.

    •Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo
     en pantalla.

    •Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo
     en pantalla.

    •Ordenar las películas por titulo, alfabéticamente y mostrarlo en pantalla.

    •Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.

*/


public class EJ04_Cine {

    public static void main(String[] args) {
        
        
        
        Scanner leer = new Scanner(System.in);
        peliculaServicio ps = new peliculaServicio();
        
        char n = 'y';
        while(n!='n'){
            Pelicula peliNew = ps.crearPelicula();
            System.out.println("Desea agregar otra Pelicula? y/n");
            n = leer.next().toLowerCase().charAt(0);
            
        }
        ps.menu();
    }
    
}
