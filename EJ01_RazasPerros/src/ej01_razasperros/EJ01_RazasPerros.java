package ej01_razasperros;

import java.util.ArrayList;
import java.util.Scanner;

/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String.
El programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si
decide salir, se mostrará todos los perros guardados en el ArrayList
*/

public class EJ01_RazasPerros {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<String>perros = new ArrayList();
        
        int n=0;
        System.out.println("COLECCION DE RAZAS CANINAS");
        System.out.println("elija el numero de la opcion deseada");
        while(n!=3){

            System.out.println("1) Ingrese una raza de perro");
            System.out.println("2) Mostrar coleccion actual");
            System.out.println("3) Salir");
            
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
            }
        }  
    }
    
}
