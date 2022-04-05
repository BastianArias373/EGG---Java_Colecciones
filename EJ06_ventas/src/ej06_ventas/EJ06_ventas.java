package ej06_ventas;

import entidades.servicio.productoServicio;
import java.util.Scanner;

/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los
distintos productos que venderemos y el precio que tendrán. Además, se necesita
que la aplicación cuente con las funciones básicas.
Estas las realizaremos en el main. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
*/
public class EJ06_ventas {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        productoServicio ps = new productoServicio();
        
        char x = 's';
        while (x != 'n') { 
            ps.crearProducto();
            ps.menu();
            System.out.println("Desea agregar otro producto? y/n");
            x = leer.next().toLowerCase().charAt(0);
        }
        
        
    }
    
}
