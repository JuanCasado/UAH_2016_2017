/**
 * @author Juan Casado Ballesteros
 */
package PEC1;
import java.util.Random;
public class Baraja
{
    //Atributos
    static Carta[] baraja=new Carta[20];
    String[]palos={"As","Dos","Sota","Caballo","Rey"};
    String[]figuras={"Oros","Espadas","Bastos","Copas"};
    
    //Métodos
    public Carta[] crearMano()
    {
        Random rand=new Random();
        int[] seleccion=new int[5];
        Carta[] mano=new Carta[5];
        int temporal;
        boolean asignar;
        
        //Array de enteros aleatorios no repetidos
        for (int x=0;x<5;x++) 
        {
            asignar=true;
            temporal=rand.nextInt(20);
             for (int y=0;y<x;y++)
             {
                 if(temporal==seleccion[y])
                 {
                     x--;
                     asignar=false;
                 }
             }
             if (asignar)
                 seleccion[x]=temporal;
        }
        //Rellenamos el array de objetos tipo carta
        System.out.println("Mano:");
        for(int x=0;x<seleccion.length;x++)
        {
            mano[x]=baraja[seleccion[x]];
            //Mostramos la mano por pantalla
            System.out.println("\t"+mano[x].toString());
        }
        return mano;
    }
    
    //Constructor
    public Baraja() 
    {
        int contador=0;
        
        //Creamos la baraja con todos los 20 objetos tipo carta posibles
        for (String palo : palos) 
        {
            for (String figura : figuras) 
            {
                Carta carta=new Carta(figura,palo);
                baraja[contador]=carta;
                contador++;
            }      
        }
    }
}