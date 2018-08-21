package classes;

import javax.swing.ImageIcon;

/**
 * @author mr.blissfulgrin
 */
public class Carta
{
    //Atributos
    private final String palo;
    private final String figura;
    private final ImageIcon imagen;
    private final int orden;
    private final int peso;

    //Métodos
    
    /**
     * Get the value of peso
     * 
     * @return int peso --> valor de la carta dentro de su palo
     */
    public int getPeso()
    {
        return peso;
    }
    
    /**
     * Get the value of palo
     *
     * @return String palo --> Palo de la carta
     */
    public String getPalo() 
    {
        return palo;
    }
    
    /**
     * Get the value of figura
     *
     * @return String figura --> Figura de la carta
     */
    public String getFigura() 
    {
        return figura;
    }

    /**
     * Get the value of imagen
     *
     * @return ImageIcon imagen --> Imagen asociada a la carta
     */
    public ImageIcon getImagen() 
    {
        return imagen;
    }
    
    /**
     * Get the value of orden
     *
     * @return int orden --> Prioridad de la carta (para ordenarla)
     */
    public int getOrden() 
    {
        return orden;
    }
    
    /**
     * Da la ingormación de la carta en formato texto
     * 
     * @return String --> Nombre de la carta para ser impresa por linea de comandos
     */
    @Override
    public String toString() 
    {
        return figura+"\tde\t"+palo;
    }
    
    //Constructor
    /**
     * Genera un Objeto tipo carta
     * 
     * @param palo --> Palo de la carta
     * @param figura --> Figura de la carta
     * @param imagen --> Imagen asociada a la carta
     * @param orden --> Prioridad de la carta (para ordenarla)
     * @param peso --> Valor de la carta dentro de su palo para calcular premios
     */
    public Carta(String figura, String palo,ImageIcon imagen, int orden, int peso) 
    {
        this.palo = palo;
        this.figura = figura;
        this.imagen = imagen;
        this.orden = orden;
        this.peso = peso;
    }    
}
