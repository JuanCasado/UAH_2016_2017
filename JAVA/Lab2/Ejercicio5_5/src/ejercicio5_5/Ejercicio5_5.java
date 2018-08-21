/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5_5;
import java.io.*;
/**
 *
 * @author mr.blissfulgrin
 */
public class Ejercicio5_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        int numero, contador=0;
        System.out.print("Introduzca un número entero: ");
        numero =Integer.parseInt(input.readLine());
        System.out.print("El numero "+numero+" tiene ");
        while(numero>0)
        {
            numero=numero/10;
            contador++;
        }    
        System.out.println(contador+" cifras");
    }
    
}
