package ejercicio7;
/**

 * @author mr.blissfulgrin
 */
public class Taller {
    
    private String nombre;

    private String telefono;

    private double precioHora;

    public double getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(double precioHora) {
        this.precioHora = precioHora;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public double repararVehiculo(Vehículo vehiculo, double horas)
    {
        double coste=0;
        coste+=horas*this.getPrecioHora();
        for (Pieza pieza : vehiculo.getPiezas()) 
        {
            coste+=pieza.getPrecio();
        }
        return coste;
    }
    
    public Taller(String nombre, String telefono, double precioHora) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.precioHora = precioHora;
    }

}
