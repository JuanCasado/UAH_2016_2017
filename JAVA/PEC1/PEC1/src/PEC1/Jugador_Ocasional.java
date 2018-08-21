/**
 * @author Juan Casado Ballesteros
 */
package PEC1;
public class Jugador_Ocasional extends Jugador
{
    //Atributos
    private String tarjetaDeCredito;

    //Métodos
    public String getInformacionBancaria() 
    {
        //La información bancaria se corresponde con una tarjeta de credito
        return " tarjeta de credito "+tarjetaDeCredito;
    }

    public void setInformacionBancaria(String tarjetaDeCredito) 
    {
        this.tarjetaDeCredito = tarjetaDeCredito;
    }

    @Override
    public String toString() 
    {
        return "Jugador ocasional, "+getNombreApellidos()+", con NIF "+getNIF();
    }
   
    //Constructor
    public Jugador_Ocasional(String tarjetaDeCredito, String NIF, String nombreApellidos) 
    {
        super(NIF, nombreApellidos);
        this.tarjetaDeCredito = tarjetaDeCredito;
    }  
}