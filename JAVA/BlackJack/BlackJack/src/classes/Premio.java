package classes;

import java.io.Serializable;

public class Premio implements Serializable
{

    private final boolean enMesa;
    private final double premio;
    private final int tipo;
    
    /**
     * Dice si el premio en o no en mesa
     * @return enMesa
     */
    public boolean getEnMesa()
    {
        return enMesa;
    }
    
    /**
     * Cantidad del premio
     * @return premio
     */
    public double getPremio()
    {
        return premio;
    }
    
    /**
     * Identifica al premio
     * @return tipo
     */
    public int getTipo()
    {
        return tipo;
    }
    
    @Override
    public String toString()
    {
        String texto="";
        
        switch(tipo)
        {
            case 0:
                texto = "EMPATE";
                break;
            case 1:
                texto = "SUPERIOR";
                break;
            case 2:
                texto = "BLACKJACK";
                break;

        }
        
        if (enMesa)
            return texto+" consegid@ en mesa obteniendo "+premio;
        else
            return texto+" consegid@ contra la máquina obteniendo "+premio;
    }
    
    public Premio(double premio, boolean enMesa, int tipo)
    {
        this.premio = premio;
        this.enMesa = enMesa;
        this.tipo = tipo;
    }
}
