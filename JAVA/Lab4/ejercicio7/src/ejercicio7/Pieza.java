package ejercicio7;
/**
 * @author mr.blissfulgrin
 */
public class Pieza {
  
    private String nombre;

    private double precio;

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pieza(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
  
}
