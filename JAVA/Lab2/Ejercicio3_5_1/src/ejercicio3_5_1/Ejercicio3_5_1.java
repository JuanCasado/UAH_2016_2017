/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3_5_1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author mr.blissfulgrin
 */
public class Ejercicio3_5_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int veces;
        String palabra;
        System.out.print("\nIntroduzca la palabra que quiere que se repita: ");
        palabra = input.readLine();
        System.out.print("Introduzca las veces que quiere que se repita la palabra: ");
        veces= Integer.parseInt(input.readLine());
        System.out.print(palabra);
        veces-=2;
        for (int x=veces;x>0;x--)
        {
            System.out.print(",\t"+palabra);
        }
        System.out.println(",\t"+palabra+".");
        
    }
    
}
