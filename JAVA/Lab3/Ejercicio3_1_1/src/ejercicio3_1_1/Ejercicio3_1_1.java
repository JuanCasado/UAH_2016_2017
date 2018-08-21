/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3_1_1;
import java.io.*;
/**
 *
 * @author mr.blissfulgrin
 */
public class Ejercicio3_1_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        
        int letras;
        String palabra,auxiliar,transformada;
        
        System.out.print("Introduzca la palabra: ");
        palabra=input.readLine();
        System.out.print("Introduzca el número de letras que quiere desplazar: ");
        letras=Integer.parseInt(input.readLine());
        
        auxiliar=palabra.substring(letras, palabra.length());
        transformada=auxiliar.concat(palabra.substring(0, letras));
        System.out.println(transformada);
        
    }
    
}
