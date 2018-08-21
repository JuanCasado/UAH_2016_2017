/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.io.Serializable;

/**
 *
 * @author mr.blissfulgrin
 */
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
            case 1:
                texto = "PAREJA";
                break;
            case 2:
                texto = "DOBLE_PAREJA";
                break;
            case 3:
                texto = "TRIO";
                break;
            case 4:
                texto = "COLOR";
                break;
            case 5:
                texto = "FULL";
                break;
            case 6:
                texto = "POKER";
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
