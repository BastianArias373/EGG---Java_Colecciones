package ej02_razasperros_con_iterador;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/*
Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le
pedirá un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista.
Si el perro está en la lista, se eliminará el perro que ingresó el usuario y se mostrará
la lista ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y
se mostrará la lista ordenada
*/
public class EJ02_RazasPerros_con_Iterador {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<String>perros = new ArrayList();
        
        int n=0;
        System.out.println("COLECCION DE RAZAS CANINAS");
        System.out.println("elija el numero de la opcion deseada");
        while(n!=4){

            System.out.println("1) Ingrese una raza de perro");
            System.out.println("2) Mostrar coleccion actual");
            System.out.println("3) Eliminar un elemento de la lista");
            System.out.println("4) Salir");
            
            n = leer.nextInt();
            
            switch(n){    
                case 1:
                    perros.add(leer.next());
                    break;
                case 2:
                    for (String perro : perros) {
                        System.out.println(perro);
                    }
                    break;
                case 3:
                    
                    Iterator<String>it = perros.iterator(); 
                    
                    String next; 
                    
                    System.out.println("Que raza desea descartar?");
                    String descarte = leer.next();
                        
                    while (it.hasNext()){
                        next = it.next();

                        if(next.equals(descarte)){
                            it.remove();
                        }

                    }
                    
            }
        }  
    }
    
}
