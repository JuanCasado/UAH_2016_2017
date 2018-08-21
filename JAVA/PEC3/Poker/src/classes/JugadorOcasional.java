package classes;

import java.time.LocalDate;

/**
 * @author mr.blissfulgrin
 */
public class JugadorOcasional extends Jugador
{
    //Atributos
    private String tarjetaDeCredito;

    //Métodos
    /**
     * Devuelve la información bancaria del jugador
     * 
     * @return "Tarjeta de credito" + el número de la tarjeta
     */
    public String getInformacionBancaria() 
    {
        //La información bancaria se corresponde con una tarjeta de credito
        return "Tarjeta de credito "+tarjetaDeCredito;
    }
    /**
     * Permite modificar la cuenta bancaria del jugador
     * 
     * @param tarjetaDeCredito 
     */
    public void setInformacionBancaria(String tarjetaDeCredito) 
    {
        this.tarjetaDeCredito = tarjetaDeCredito;
    }

    @Override
    /**
     *
     * Devuelve el nombre, apellidos y NIF en forma de String
     */
    public String toString() 
    {
        return "Jugador ocasional, "+getNombre()+" "+getApellidos()+", con NIF "+getNIF();
    }
    
    @Override
    public void retirarBeneficios(double dinero)
    {
        double negativo = (dinero*(-1));
        CasaDeApuestas.addDineroOcasional(negativo);
        this.setSaldo(this.getSaldo()-dinero);

    }
    
    @Override
    public void aumentarSaldo(double dinero)
    {
        CasaDeApuestas.addDineroOcasional(dinero);
        this.setSaldo(this.getSaldo()+dinero);
    }
    
    //Constructor
    /**
     * 
     * @param tarjetaDeCredito
     * @param NIF
     * @param nombre
     * @param saldo
     * @param apellidos
     * @param fechanacimiento 
     */
    public JugadorOcasional(String tarjetaDeCredito, String NIF, String nombre, double saldo, String apellidos, LocalDate fechanacimiento) {
        super(NIF, nombre, saldo, apellidos, fechanacimiento);
        this.tarjetaDeCredito = tarjetaDeCredito;
        CasaDeApuestas.addDineroOcasional(saldo);
    }
}
