package entidades.utilidades;


import entidades.Pelicula;
import java.util.Comparator;

public class Comparadores {
    
    public static Comparator<Pelicula> ordenDuracionDsc = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t1, Pelicula t2) {
            return t2.getDuracion().compareTo(t1.getDuracion());
        }
    };
    public static Comparator<Pelicula> ordenDuracionAsc = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t1, Pelicula t2) {
            return t1.getDuracion().compareTo(t2.getDuracion());
        }
    };
    public static Comparator<Pelicula> ordenTituloAsc = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t1, Pelicula t2) {
            return t1.getTitulo().compareTo(t2.getTitulo());
        }
    };
    public static Comparator<Pelicula> ordenDirectorAsc = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t1, Pelicula t2) {
            return t1.getDirector().compareTo(t2.getDirector());
        }
    };
    
    
    
}
