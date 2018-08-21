package classes;

import screens.*;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.ImageIcon;


public class Baraja {
    //Atributos
    private  ArrayList<Carta> baraja = new ArrayList<>();
    private final String[]figuras={"As","Dos","Tres","Cuatro","Cinco","Seis","Siete","Ocho","Nueve","Sota","Caballo","Rey"};
    private final String[]palos={"Oros","Copas","Espadas","Bastos"};
    private  ArrayList<Carta> mano = new ArrayList<>();
    private  int pedidas=0;
    //Métodos
    
    /**
     * Otorga cartas a los jugadores, a la máquina y a los descartes, en total 12 cartas como máximo
     * 
     * @param cantidad Cantidad de cartas que pides (Se pueden pedir un máximo de 12 cartas por baraja)
     * @return ArrayList < Carta > --> Array con 5 cartas al azar
     */
    public ArrayList < Carta > darCartas(int cantidad)
    {
        try
        {
            if (pedidas> 48)
            {
                throw new Ex("No se han repartido las cartas correctamente");
            }
        }
        catch(Ex e)
        {
            ErrorX er = new ErrorX();
            er.setTexto(e.getMessage());
            er.setVisible(true);
        }
        
        Random rand=new Random();
        int aleatorio;
        mano.clear();
        
        for (int x=0; x < cantidad; x++)
        {
            aleatorio = rand.nextInt(baraja.size());
            mano.add(baraja.get(aleatorio));
            baraja.remove(aleatorio);
        }       

        return mano;
    }
    
    //Constructor
    /**
     * Genera una baraja completa de 48 cartas
     */
    public Baraja() 
    {
        int contador=1;
        int ajuste =0;
        int peso;
        ImageIcon imagen;
        //Creamos las imágenes
        try 
        {

            //Creamos la baraja con todos los objetos tipo carta posibles
            for (String palo : palos) 
            {
                for (String figura : figuras) 
                {

                    imagen = new ImageIcon("./src/Cartas/"+contador+".jpg");
 
                    if ((contador-ajuste) == 1)
                        peso = 0;
                    else if ((contador-ajuste) > 10)
                        peso = 10;
                    else 
                        peso = (contador-ajuste);
                    
                    Carta carta=new Carta(figura,palo,imagen,contador,peso);
                    baraja.add(carta);
                    contador++; //Variable para ordenar y reconocer las cartas
                }
                ajuste +=12;//Variable para calcular el peso de la carta dentro de su palo
            }
        }
        catch (Exception e) 
        {
            ErrorX er = new ErrorX();
            er.setTexto("No se pudieron cargar las imágenes\n"+e.toString());
            er.setVisible(true);
        }
    }
}
