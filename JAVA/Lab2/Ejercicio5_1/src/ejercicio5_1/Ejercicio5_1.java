/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5_1;
import java.io.*;
/**
 *
 * @author mr.blissfulgrin
 */
public class Ejercicio5_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        int limite,contador=0;
        System.out.print("Introduzca el limite del sumatorio: ");
        limite = Integer.parseInt(input.readLine());
        for (int x=limite;x>0;x--)
        {
            contador +=x;
        }
        System.out.println("\nEl resultado es: "+contador);
        
    }
    
}
