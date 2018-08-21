/**
 * @author Juan Casasdo Ballesteros
 */
package PEC1;
public class Carta 
{
    //Atributos
    private final String palo;
    private final String figura;

    //Métodos
    public String getPalo() 
    {
        return palo;
    }
    
    public String getFigura() 
    {
        return figura;
    }

    @Override
    public String toString() 
    {
        return figura+"\tde\t"+palo;
    }
    
    //Constructor
    public Carta(String palo, String figura) 
    {
        this.palo = palo;
        this.figura = figura;
    }
}