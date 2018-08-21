package classes;
import java.util.ArrayList;

public class Apuesta 
{
    //Atributos
    private int premio;                             //Tipo de premio obtenido
    private int ganador;            //Quien obtiene el premio
    private String texto;                           //Premio en formato texto
    private double ganacia;                         //Lo que se ha de dar a los jugadores
        
    //Métodos
    /**
     * Devuelve la ganacia obtenida por la apuesta
     * 
     * @return double resultado
     */
    public double verPremio()
    {        
        return ganacia;
    }
    
    /**
     * Devuelve el tipo de premio obtenido para que este pueda almacenarse
     * 
     * @return int premio
     */
    public int getPremio()
    {
        return premio;
    }
    
    /**
     * Devuelve el ganador del primio 
     * 
     * @return ArrayList ganador
     */
    public int getGanador()
    {
        return ganador;
    }
    
    /**
     * Devuelve el premio en formato textual
     * 
     * @return String texto
     */
    public String getTexto()
    {
        return texto;
    }


    //Constructor
    public Apuesta(ArrayList <ArrayList <Carta>> mano, double enJuego)
    {        
        int max = 0;
        boolean empate = false;
        //Buscar el número mayor y dice quien lo tiene
        for (int x = 0; x < mano.size(); x++) 
        {
            int acumula = 0;
            for (Carta carta : mano.get(x)) 
            {
                acumula+=carta.getPeso();
            }
            if ((acumula > max)&&(acumula<22))
            {
                max = acumula;
                ganador = x;
            }
            else if (acumula == max)
            {
                ganador = x;
                empate = true;
            }
        }
        
        //Busca el tipo de premio y la ganacia
        if (max == 0)
        {
            texto="Pierden ambos; +21";
            premio = 0;
            ganacia = (enJuego);
        }
        else if (empate)
        {
            texto = "Empate";
            premio = 0;
            ganacia = enJuego;
        }
        else if (max == 21)
        {
            texto = "BlackJack";
            premio = 2;
            ganacia = enJuego*4;
        }
        else
        {
            texto = "Superior";
            premio = 1;
            ganacia = enJuego*2;
        }     
    }
}
