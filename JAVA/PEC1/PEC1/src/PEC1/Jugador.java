/**
 * @author Juan Casado Ballesteros
 */
package PEC1;

public class Jugador 
{
    //Atributos
    private String NIF;
    private String nombreApellidos;
    private double saldo;
    
    //Métodos
    public String getNIF() 
    {
        return NIF;
    }

    public void setNIF(String NIF) 
    {
        this.NIF = NIF;
    }

    public String getNombreApellidos() 
    {
        return nombreApellidos;
    }

    public void setNombreApellidos(String nombreApellidos) 
    {
        this.nombreApellidos = nombreApellidos;
    }

    public double getSaldo() 
    {
        return saldo;
    }

    public void setSaldo(double saldo) 
    {
        this.saldo = saldo;
    }

    //Constructor
    public Jugador(String NIF, String nombreApellidos) 
    {
        this.NIF = NIF;
        this.nombreApellidos = nombreApellidos;
        //Pedimos el saldo en el main tras haber creado a los jugadores y lo añadimos con setSaldo();
    }   
}