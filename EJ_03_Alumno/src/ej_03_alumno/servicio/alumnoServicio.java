package ej_03_alumno.servicio;

import ej_03_alumno.entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;


public class alumnoServicio {
    
    //declaramos... pero no iniciamos
    private Scanner leer;
    private ArrayList<Alumno> alumnosDatos;

    // constructor del servicio para iniciar Array y Scanner
    // cada vez que creemos un objeto servicio, se inicilizara 
    // un Array y un Scanner
    // No iniciaremos el objeto aqui, ya que solo lo usaremos una vez
    // El objeto se va a generar como algo que devuelve crearAlumno()
    public alumnoServicio() {
        this.alumnosDatos = new ArrayList();
        this.leer =  new Scanner(System.in).useDelimiter("\n");
    }
    
    //retornaremos un objeto usando el constructor 
    //un constructor que junte la informacion que pasemos por teclado
    
    
    public Alumno crearAlumno(){
        
        Alumno nAlumno = new Alumno();
        
        //seteamos nombre
        System.out.println("Nombre: ");
        nAlumno.setNombre(leer.next());
        
        //guardamos notas en variables
        System.out.println("Nota 1");
        int nota1 = leer.nextInt();
        System.out.println("Nota 2");
        int nota2 = leer.nextInt();
        System.out.println("Nota 3");
        int nota3 = leer.nextInt();
        //creamos un ArrayList auxiliar que albergue las variables
        ArrayList<Integer> listaNotas = new ArrayList();
        listaNotas.add(nota1);
        listaNotas.add(nota2);
        listaNotas.add(nota3);
        nAlumno.setNotas(listaNotas);
        
        alumnosDatos.add(nAlumno);

        return nAlumno;
    }  
    
    public void recorrerAlumno(Alumno nAlumno){
        for (Alumno aux : alumnosDatos) {
            System.out.println(aux);
        }
    }
    
//    public void notaFinal(){
//        int sumatoria = 0;
//        System.out.println("Nombre del alumno: ");
//        
//        for (Alumno aux : alumnosDatos) {
//            
//        }
//    }
}
