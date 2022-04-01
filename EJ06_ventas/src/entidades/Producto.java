package entidades;

public class Producto {
    private String nombre;
    private Integer precio;
    
    //constructores
    public Producto() {
    }
    
    //Getters y Setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPrecio() {
        return precio;
    }
    public void setPrecio(Integer precio) {
        this.precio = precio;
    }
    
    //ToString

    @Override
    public String toString() {
        return "Producto{" + 
                "nombre=" + nombre + 
                ", precio=" + precio + 
                '}';
    }
    
    
    
}
