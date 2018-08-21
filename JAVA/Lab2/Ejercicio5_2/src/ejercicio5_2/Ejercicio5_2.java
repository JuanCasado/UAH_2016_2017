/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5_2;
import java.io.*;
/**
 *
 * @author mr.blissfulgrin
 */
public class Ejercicio5_2  {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
        BufferedReader input =new BufferedReader(new InputStreamReader(System.in));
        int limite,contador=1;
        System.out.print("Introduzca el numero del que quiere calcular el factrorial: ");
        limite=Integer.parseInt(input.readLine());
        for (int x=limite;x>1;x--)
        {
            contador*=x;
            //System.out.println("El factorial de "+limite+" es "+contador);
        }
        System.out.println("El factorial de "+limite+" es "+contador);
    }
    
}
