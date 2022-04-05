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
        System.out.println("Que producto desea quitar?");
        String forDelete = leer.next();
        for (Map.Entry<String,Producto> aux : productoHashMap.entrySet()) {
            if (aux.getKey().equals(forDelete)) {
                productoHashMap.remove(aux);
            }
        }
    }
    
    public void cambiarPrecio(){
        System.out.println("Que producto desea actualizar?");
        String forUpdate = leer.next();
        for (Map.Entry<String,Producto> aux : productoHashMap.entrySet()) {
            if(aux.getKey().equals(forUpdate)){
                System.out.println("Precio nuevo del producto");
                Integer precioNuevo = leer.nextInt();
                aux.getValue().setPrecio(precioNuevo);
            }
            
        }
    }
    
    public void menu(){
        System.out.println("1) Agregar producto"+"\n"+
                           "2) Eliminar producto"+"\n"+
                           "3) Cambiar precio"+"\n"+
                           "4) Mostrar productos"+"\n"+
                           "5) Salir"+"\n");
        
        int eleccion = leer.nextInt();
        
        switch(eleccion){
            case 1:
                agregarProducto();
                break;
            case 2:
                eliminarProducto();
                break;
            case 3:
                cambiarPrecio();
                break;
            case 4:
                mostrarProductos();
                break;
            case 5:
                break;
        }
    }
}
