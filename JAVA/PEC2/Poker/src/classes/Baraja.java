package classes;

import screens.*;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.ImageIcon;

/**
 * @author mr.blissfulgrin
 */
public class Baraja {
    //Atributos
    private  ArrayList<Carta> baraja = new ArrayList<>();
    private final String[]figuras={"As","Dos","Tres","Cuatro","Cinco","Seis","Siete","Ocho","Nueve","Sota","Caballo","Rey"};
    private final String[]palos={"Oros","Copas","Espadas","Bastos"};
    private  ArrayList<Integer> seleccion = new ArrayList<>();
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
            if (pedidas>=12)
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
        ArrayList<Carta> mano = new ArrayList<>();
        int temporal;
        boolean asignar;
        
        //Array de enteros aleatorios no repetidos 
        for (int x=0;x<cantidad;x++) 
        {
            asignar=true;
            temporal=rand.nextInt(48);

            for (int y=0;y<seleccion.size();y++)
            {
                if(temporal==seleccion.get(y))
                {
                    x--;
                    asignar=false;
                }
            }
            if (asignar)
               seleccion.add(temporal);
        }
        //Rellenamos el array de objetos tipo carta (Tantos como se hayan solicitado)

        for(int carta=pedidas; carta<cantidad+pedidas; carta++)
        {
            mano.add(baraja.get(seleccion.get(carta)));
        }
        pedidas+=cantidad;

        return mano;
    }
    
    //Constructor
    /**
     * Genera una baraja completa de 48 cartas
     */
    public Baraja() 
    {
        int contador=1;
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
 
                    Carta carta=new Carta(figura,palo,imagen,contador);
                    baraja.add(carta);
                    contador++; //Variable para ordenar y reconocer las cartas
                }      
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
