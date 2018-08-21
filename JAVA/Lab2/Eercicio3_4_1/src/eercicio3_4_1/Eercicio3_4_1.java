/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eercicio3_4_1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author mr.blissfulgrin
 */
public class Eercicio3_4_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
        int numero;
        System.out.print("\nIntroduzca un número entero: ");
        numero= Integer.parseInt(entrada.readLine());
        if (numero%2==0)
            System.out.println("nEl número "+numero+" es par");
        else
            System.out.println("El número "+numero+" es impar");
    }
    
}
