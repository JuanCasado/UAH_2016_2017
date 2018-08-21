/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1_4_4;
import java.io.*;
/**
 *
 * @author mr.blissfulgrin
 */
public class Ejercicio1_4_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        
        int mayor;
        int [] numeros=new int[3];
        
        System.out.print("Introduzca el primer número: ");
        numeros[0]=Integer.parseInt(input.readLine());
        System.out.print("Introduzca el segundo número: ");
        numeros[1]=Integer.parseInt(input.readLine());
        System.out.print("Introduzca el tercer número: ");
        numeros[2]=Integer.parseInt(input.readLine());
        
        mayor=elMayor(numeros);
        
        System.out.print("El mayor de ");
        
        for (int x=0;x<numeros.length;x++)
        {
            System.out.print(numeros[x]);
            if (x<numeros.length-2)
                System.out.print(", ");
            else if(x==numeros.length-2)
                System.out.print(" y ");
            else 
                System.out.print(" es: ");
        }
        System.out.println(mayor);
    }
    
    public static int elMayor(int [] numeros)
    {
       int mayor=0;
       
       for(int x=0; x<numeros.length;x++)
       {
           if (x==0)
               mayor=numeros[x];
           else
           {
               if (numeros[x]>mayor)
                   mayor=numeros[x];
           }
       }
    
       return mayor;
    }
   
}
