package ejercicio6_1;
/**
 *
 * @author mr.blissfulgrin
 */
public class Titular {
    
    private String nif;

    private String nombre;

    private String telefono;
    
    private String direccion;

    private Cuentas cuenta = null;

    public Cuentas getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuentas cuenta) {
        this.cuenta = cuenta;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    @Override
    public String toString() {
        return "Titular{" + "nif=" + nif + ", nombre=" + nombre + ", telefono=" + telefono + ", direccion=" + direccion + '}';
    }

    public Titular(String nif, String nombre, String telefono, String direccion) {
        this.nif = nif;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }

}
