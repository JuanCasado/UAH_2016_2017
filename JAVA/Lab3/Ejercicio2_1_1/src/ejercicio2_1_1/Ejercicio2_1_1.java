/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2_1_1;
import java.util.Random;
/**
 *
 * @author mr.blissfulgrin
 */
public class Ejercicio2_1_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        int longitud=100;
        
        int [] numeros=new int[longitud];
        char[] pares=new char[longitud];

        rellenar(numeros);
        paridad(pares,numeros);
        mostrar(pares,numeros);
            
    }
    public static void rellenar(int[]numeros)
    {
        Random rand=new Random();
        for (int x=0;x<numeros.length;x++)
            numeros[x]=rand.nextInt(499)+1;
    }
    
    public static void paridad(char[]pares,int[]numeros)
    {
        for (int x=0;x<numeros.length;x++)
        {
            if (numeros[x]%2==0)
                pares[x]='p';
            else
                pares[x]='i';
        }
    }
    
    public static void mostrar(char[]pares,int[]numeros)
    {
        for (int x=0;x<numeros.length;x++)
        {
            System.out.print(numeros[x]+""+ pares[x] +" \t ");
            if ((x+1)%10==0)
                System.out.println("");
        }
    }
}
