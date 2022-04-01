package entidades.servicio;

import entidades.Producto;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class productoServicio {
    
    //Scanner y Coleccion
    private Scanner leer;
    private HashMap<String,Producto> productoHashMap;

    //constructor
    public productoServicio() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.productoHashMap = new HashMap();
    }
    
    
    public Producto crearProducto(){
        Producto p1 = new Producto();
        System.out.println("Nombre del producto: ");
        p1.setNombre(leer.next());
        System.out.println("Precio del producto: ");
        p1.setPrecio(leer.nextInt());
        
        //agregando objeto al HashMap
        productoHashMap.put(p1.getNombre(),p1);
        return p1;
    }
    
    public void mostrarProductos(){ 
        for (Map.Entry<String,Producto> aux : productoHashMap.entrySet()) {
            System.out.println(aux.getKey()+" "+aux.getValue().getPrecio());
        }
    }
    
    public void agregarProducto(){    
        crearProducto();
    }
    
    public void eliminarProducto(){   
    }
    
    public void cambiarPrecio(){
        for (Map.Entry<String,Producto> aux : productoHashMap.entrySet()) {
        }
    }
}
