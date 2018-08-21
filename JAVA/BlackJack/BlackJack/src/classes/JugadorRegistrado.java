package classes;

import java.io.Serializable;
import java.time.LocalDate;

public class JugadorRegistrado extends Jugador implements Serializable
{
    //Atributos
    private String cuentaBancaria;
    private int partidasJugadas; 
    private String contraseña;
    private final LocalDate fechaRegistro;
    public Premios premios;

    //Métodos
     /**
     * Get the value of fechaRegistro
     *
     * @return the value of fechaRegistro
     */
    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }
    
     /**
     * Get the value of contraseña
     *
     * @return the value of contraseña
     */
    public String getContraseña() {
        return contraseña;
    }

    /**
     * Set the value of contraseña
     *
     * @param contraseña new value of contraseña
     */
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    /**
     * Devuelve la información bancaria del jugador
     * 
     * @return Strig  numero de cuenta
     */
    public String getInformacionBancaria() 
    {
        //La información bancaria se corresponde con una cuenta bancaria
        return cuentaBancaria;
    }

    /**
     * Permite modificar la cuenta bancaria del jugador
     * 
     * @param cuentaBancaria 
     */
    public void setInformacionBancaria(String cuentaBancaria) 
    {
        this.cuentaBancaria = cuentaBancaria;
    }

    /**
     * Dice cuantas partidas ha jugado el jugador
     * 
     * @return int partidasJugadas
     */
    public int getPartidasJugadas()
    {
        return partidasJugadas;
    }
    
    /**
     * Añade una nueva partida jugada
     * 
     */
    public void añadirPartida()
    {
        partidasJugadas++;
    }
    
    
    
    @Override
    public void retirarBeneficios(double dinero)
    {
        this.setSaldo(this.getSaldo()-dinero);
        
    }
    
    @Override
    public void aumentarSaldo(double dinero)
    {
        this.setSaldo(this.getSaldo()+dinero);
    }
    
    
    /**
     * 
     * @return "Jugador registrado, "+ Nombre y apellidos y NIF
     */
    @Override
    public String toString() 
    {
        return "Jugador registrado, "+getNombre()+" "+getApellidos()+", con NIF "+getNIF();
    }
    
    //Constructor
    /**
     * 
     * @param cuentaBancaria
     * @param NIF
     * @param nombre
     * @param saldo
     * @param apellidos
     * @param fechanacimiento
     * @param contraseña 
     */
    public JugadorRegistrado(String cuentaBancaria, String NIF, String nombre, double saldo, String apellidos, LocalDate fechanacimiento, String contraseña) 
    {
        super(NIF, nombre, saldo, apellidos, fechanacimiento);
        this.cuentaBancaria = cuentaBancaria;
        this.contraseña=contraseña;
        this.premios = new Premios();
        partidasJugadas=0;
        fechaRegistro=LocalDate.now();
    }
    
}
