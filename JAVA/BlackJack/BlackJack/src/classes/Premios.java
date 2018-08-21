package classes;

import java.io.Serializable;
import java.util.ArrayList;

public class Premios implements Serializable
{
    private int empate = 0;
    private int empateMesa = 0;
    private int superior = 0;
    private int superiorMesa = 0;
    private int blackjack = 0;
    private int blackjackMesa = 0;
    
    
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
                    addEmpateMesa();
                    break;
                case 1:
                    addSuperiorMesa();
                    break;
                case 2:
                    addBlackJackMesa();
                    break;
            }
        }
        else
        {
            switch(premio.getTipo())
            {
                case 0:
                    addEmpate();
                    break;
                case 1:
                    addSuperior();
                    break;
                case 2:
                    addBlackJack();
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
     * Añade un empate
     */
    private void addEmpate()
    {
        empate++;
    }
    
    /**
     * Añade un empate de mesa
     */
    private void addEmpateMesa()
    {
        empateMesa++;
    }
    
    /**
     * Añade un superior
     */
    private void addSuperior()
    {
        superior++;
    }
    
    /**
     * Añade un superior de mesa
     */
    private void addSuperiorMesa()
    {
        superiorMesa++;
    }
    
    /**
     * Añade un blackjack
     */
    private void addBlackJack()
    {
        blackjack++;
    }

    /**
     * Añade un blackjack de mesa
     */
    private void addBlackJackMesa()
    {
        blackjackMesa++;
    }
    
    
    /**
     * Número de empates
     * 
     * @return int empate
     */
    public int getEmpate()
    {
        return empate;
    }
    
    /**
     * Número de empates de mesa
     * 
     * @return int empateMesa
     */
    public int getEmpateMesa()
    {
        return empateMesa;
    }
    
    /**
     * Número de superiores
     * 
     * @return int superior
     */
    public int getSuperior()
    {
        return superior;
    }
    
    /**
     * Número de superiores de mesa
     * 
     * @return int superiorMesa
     */
    public int getSuperiorMesa()
    {
        return superiorMesa;
    }
    
    /**
     * Número de blackjacks
     * 
     * @return int blackjack
     */
    public int getBlackJack()
    {
        return blackjack;
    }
    
    /**
     * Número de blackjacks de mesa
     * 
     * @return int blackjackMesa
     */
    public int getBlackJackMesa()
    {
        return blackjackMesa;
    }
    
    
    public Premios()
    {
        this.listado = new ArrayList<>();    
    }
}
