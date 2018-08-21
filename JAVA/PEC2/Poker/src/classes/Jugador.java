package classes;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * 
 * @author mr.blissfulgrin
 */
public abstract class Jugador implements Serializable
{
     //Atributos
    private String NIF;
    private String nombre;
    private double saldo;
    private String apellidos;
    private final LocalDate fechanacimiento;
    

    //Métodos
    /**
     *  Get the value of NIF
     * 
     * @return String NIF
     */
    public String getNIF() 
    {
        return NIF;
    }
    
    /**
     * Set the value of NIF
     * 
     * @param NIF 
     */
    public void setNIF(String NIF) 
    {
        this.NIF = NIF;
    }
    
    /**
     *  Get the value of nombre
     * 
     * @return String nombre
     */
    public String getNombre() 
    {
        return nombre;
    }

    /** 
     * Set the value of nombre 
     * 
     * @param nombre 
     */
    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    /**
     * Get the value of saldo
     * 
     * @return Double saldo
     */
    public double getSaldo() 
    {
        return saldo;
    }

    /**
     * Set the value of saldo
     * 
     * @param saldo 
     */
    public void setSaldo(double saldo) 
    {
        this.saldo = saldo;
    }
    
    /**
     * Get the value of apellidos
     *
     * @return the value of String apellidos
     */
    public String getApellidos() 
    {
        return apellidos;
    }
    
     /**
     * Set the value of apellidos
     *
     * @param Apellidos new value of apellidos
     */
    public void setApellidos(String Apellidos) 
    {
        this.apellidos = Apellidos;
    }
    /**
     * Get the value of fecha
     *
     * @return the value of fecha
     */
    public LocalDate getFecha() 
    {
        return fechanacimiento;
    }


    /**
     * Aumenta el saldo del jugador
     * @param dinero 
     */
    public abstract void aumentarSaldo(double dinero);
    
    /**
     * Permite al jugador retirar los bneficios de su cuenta en el juego e ingresárselos de nuevo
     * @param dinero 
     */
    public abstract void retirarBeneficios(double dinero);

    //Constructor
    /**
     * 
     * @param NIF
     * @param nombre
     * @param saldo
     * @param apellidos
     * @param fechanacimiento         Fecha de nacimiento
     */
    public Jugador(String NIF, String nombre, double saldo, String apellidos, LocalDate fechanacimiento) {
        this.NIF = NIF;
        this.nombre = nombre;
        this.saldo = saldo;
        this.apellidos = apellidos;
        this.fechanacimiento = fechanacimiento;
    }
}
