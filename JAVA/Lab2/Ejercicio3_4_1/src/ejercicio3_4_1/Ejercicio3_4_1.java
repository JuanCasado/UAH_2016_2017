/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3_4_1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author mr.blissfulgrin
 */
public class Ejercicio3_4_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int entrada1,entrada2;
        System.out.print("\nIntroduzca el primer entero: ");
        entrada1 = Integer.parseInt(entrada.readLine());
        System.out.print("Introduzca el segundo entero: ");
        entrada2 = Integer.parseInt(entrada.readLine());
        if (entrada1>entrada2)
        {
            System.out.println("\nEl númewro mayor es: "+ entrada1+"\nEl número menor es: "+entrada2);
        }
        else if (entrada1<entrada2)
        {
            System.out.println("\nEl númewro mayor es: "+ entrada2+"\nEl número menor es: "+entrada1);
        }
        else
        {
            System.out.println("\nLos números son iguales: "+entrada1);
        }
    }
    
}
