/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercico3_1_2;
import java.io.*;
/**
 *
 * @author mr.blissfulgrin
 */
public class Ejercico3_1_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        
        String palabra;
        
        char letra;
        
        System.out.print("Introduzcxa la palabra: ");
        palabra=input.readLine();
        System.out.print("Introduzca la letra que quiere buscar: ");
        letra=input.readLine().charAt(0);
        for (int x=0;x<palabra.length();x++)
        {
            if (letra==palabra.charAt(x))
            {
                System.out.println("La letra "+letra+" esta en la posición "+x);
            }
        }
                       
    }
    
}
