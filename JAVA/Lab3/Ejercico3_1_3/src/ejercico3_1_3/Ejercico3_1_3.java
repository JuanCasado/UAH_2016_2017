/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercico3_1_3;
import java.io.*;
/**
 *
 * @author mr.blissfulgrin
 */
public class Ejercico3_1_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        
        boolean control;
        int y;
        int[]contador=new int[5];
        char[] letras={'a','e','i','o','u'};
        
        String palabra;
        
        System.out.print("Introduzca una palabra: ");
        palabra=input.readLine();
        
        for (int x=0;x<palabra.length();x++)
        {
            control=true;
            y=0;
            do 
            {   
                if (palabra.charAt(x)==letras[y])
                {
                    contador[y]++;
                    control=false;
                }
                y++;
            }
            while(y<letras.length&&control);
            
        }
        for (int x=0;x<contador.length;x++)
            System.out.println("Hay "+ contador[x]+" "+letras[x]+ "'s");                  
    }
    
}
