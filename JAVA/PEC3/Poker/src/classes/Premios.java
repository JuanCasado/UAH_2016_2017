/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author mr.blissfulgrin
 */
public class Premios implements Serializable
{
    private int pareja = 0;
    private int parejaMesa = 0;
    private int doblePareja = 0;
    private int dobleParejaMesa = 0;
    private int trio = 0;
    private int trioMesa = 0;
    private int full = 0;
    private int fullMesa = 0;
    private int color = 0;
    private int colorMesa = 0;
    private int poker = 0;
    private int pokerMesa = 0;
    
    private ArrayList <Premio> listado;
    
    /**
     * Permite añadir un premio nuevo
     * @param premio 
     */
    public void addPremio(Premio premio)
    {
        if(premio.getEnMesa())
        {
            switch(premio.getTipo())
            {
                case 0:
                    addParejaMesa();
                    break;
                case 1:
                    addDobleParejaMesa();
                    break;
                case 2:
                    addTrioMesa();
                    break;
                case 3:
                    addColorMesa();
                    break;
                case 4:
                    addFullMesa();
                    break;
                case 5:
                    addPokerMesa();
                    break;
            }
        }
        else
        {
            switch(premio.getTipo())
            {
                case 0:
                    addPareja();
                    break;
                case 1:
                    addDoblePareja();
                    break;
                case 2:
                    addTrio();
                    break;
                case 3:
                    addColor();
                    break;
                case 4:
                    addFull();
                    break;
                case 5:
                    addPoker();
                    break;
            }
        }
        listado.add(premio);   
    }
    
    /**
     * Devuekve el listado con todos los premios
     * @return listado
     */
    public ArrayList getPremios()
    {
        return listado;
    }
    
    /**
     * Añade una pareja
     */
    private void addPareja()
    {
        pareja++;
    }
    
    /**
     * Añade una pareja de mesa
     */
    private void addParejaMesa()
    {
        parejaMesa++;
    }
    
    /**
     * Añade una doble pareja
     */
    private void addDoblePareja()
    {
        doblePareja++;
    }
    
    /**
     * Añade una doble pareja de mesa
     */
    private void addDobleParejaMesa()
    {
        dobleParejaMesa++;
    }
    
    /**
     * Añade un trio
     */
    private void addTrio()
    {
        trio++;
    }

    /**
     * Añade un trio de mesa
     */
    private void addTrioMesa()
    {
        trioMesa++;
    }
    
    /**
     * Añade un poker
     */
    private void addPoker()
    {
        poker++;
    }
    
    /**
     * Añade un poker de mesa
     */
    private void addPokerMesa()
    {
        pokerMesa++;
    }
    
    /**
     * Añade un full
     */
    private void addFull()
    {
        full++;
    }
    
    /**
     * Añade un full de mesa
     */
    private void addFullMesa()
    {
        fullMesa++;
    }
    
    /**
     * Añade un color
     */
    private void addColor()
    {
        color++;
    }
    
    /**
     * Añade un color de mesa
     */
    private void addColorMesa()
    {
        colorMesa++;
    }
    
    /**
     * Número de parejas
     * 
     * @return int pareja
     */
    public int getPareja()
    {
        return pareja;
    }
    
    /**
     * Número de parejas de mesa
     * 
     * @return int parejaMesa
     */
    public int getParejaMesa()
    {
        return parejaMesa;
    }
    
    /**
     * Número de dobles parejas
     * 
     * @return int doblePareja
     */
    public int getDoblePareja()
    {
        return doblePareja;
    }
    
    /**
     * Número de dobles parejas de mesa
     * 
     * @return int dobleParejaMesa
     */
    public int getDobleParejaMesa()
    {
        return dobleParejaMesa;
    }
    
    /**
     * Número de trios
     * 
     * @return int trio
     */
    public int getTrio()
    {
        return trio;
    }
    
    /**
     * Número de trios de mesa
     * 
     * @return int trioMesa
     */
    public int getTrioMesa()
    {
        return trioMesa;
    }
    
    /**
     * Número de poker
     * 
     * @return int poker
     */
    public int getPoker()
    {
        return poker;
    }
    
    /**
     * Número de poker de mesa
     * 
     * @return int pokerMesa
     */
    public int getPokerMesa()
    {
        return pokerMesa;
    }
    
    /**
     * Número de full
     * 
     * @return int full
     */
    public int getFull()
    {
        return full;
    }
    
    /**
     * Número de full de mesa
     * 
     * @return int fullMesa
     */
    public int getFullMesa()
    {
        return fullMesa;
    }
    
    /**
     * Número de color
     * 
     * @return int color
     */
    public int getColor()
    {
        return color;
    }
    
    /**
     * Número de color de mesa
     * 
     * @return int colorMesa
     */
    public int getColorMesa()
    {
        return colorMesa;
    }
    
    public Premios()
    {
        this.listado = new ArrayList<>();    
    }
}
