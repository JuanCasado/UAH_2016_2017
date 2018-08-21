/**
 * @author Juan Casado Ballesteros
 */
package PEC1;

import java.io.Serializable;

public class Jugador_Registrado extends Jugador implements Serializable
{
    //Atributos
    private String cuentaBancaria;

    //Métodos
    public String getInformacionBancaria() 
    {
        //La información bancaria se corresponde con una cuenta bancaria
        return " cuenta bancaria "+cuentaBancaria;
    }

    public void setInformacionBancaria(String cuentaBancaria) 
    {
        this.cuentaBancaria = cuentaBancaria;
    }

    @Override
    public String toString() 
    {
        return "Jugador registrado, "+getNombreApellidos()+", con NIF "+getNIF();
    }

    //Constructor
    public Jugador_Registrado(String cuentaBancaria, String NIF, String nombreApellidos) 
    {        
        super(NIF, nombreApellidos);
        this.cuentaBancaria = cuentaBancaria;
    }
}