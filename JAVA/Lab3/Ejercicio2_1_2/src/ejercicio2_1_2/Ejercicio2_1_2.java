/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2_1_2;
import java.util.Random;
/**
 *
 * @author mr.blissfulgrin
 */
public class Ejercicio2_1_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int longitud=50,numero_vocales;
        
        int [] numeros=new int[longitud];
        
        generar(numeros);
        numero_vocales=contarVocales(numeros);
        
        System.out.println("Se han generado "+numero_vocales+" vocales");
    }
    
    public static void generar(int[] numeros)
    {
        Random rand=new Random();
        
        for(int x=0;x<numeros.length;x++)        
            numeros[x]=rand.nextInt(26)+97;        
    }
    public static int contarVocales(int[] numeros)
    {
        char letra_equivalente;
        int contador=0;
        
        for(int x=0;x<numeros.length;x++)        
        {   
            letra_equivalente=(char)numeros[x];            
            if (letra_equivalente=='a'||letra_equivalente=='e'||letra_equivalente=='i'||letra_equivalente=='o'||letra_equivalente=='u')
                contador++;
        }
        return contador;                    
    }
}
