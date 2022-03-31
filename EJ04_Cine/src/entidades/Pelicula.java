
package entidades;

import java.util.ArrayList;

public class Pelicula {
    
    //ATRIBUTOS: titulo, director y duración de la película
    private String titulo;
    private String director;
    private Integer duracion;

    //constructor
    public Pelicula() {
    }
    public Pelicula(String titulo, String director, Integer duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    //Getters y Setters
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getDuracion() {
        return duracion;
    }
    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    //toString
    @Override
    public String toString() {
        return "Pelicula{" + 
                "titulo=" + titulo + 
                ", director=" + director + 
                ", duracion=" + duracion + 
                '}';
    }
    
}
