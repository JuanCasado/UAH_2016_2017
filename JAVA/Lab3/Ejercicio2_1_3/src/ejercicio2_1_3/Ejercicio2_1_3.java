/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2_1_3;
import java.io.*;
/**
 *
 * @author mr.blissfulgrin
 */
public class Ejercicio2_1_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException
    {
        int numero_DNI;
        char letra_DNI;
        
        numero_DNI=pedirNumero();
        letra_DNI=calcularLetra(numero_DNI);
        mostrar(numero_DNI,letra_DNI);
    }
    
    public static int pedirNumero()throws IOException
    {
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        
        int numero_DNI;
                
        System.out.print("Escriba el número de su DNI (8 dígitos): ");
        numero_DNI=Integer.parseInt(input.readLine());
        return numero_DNI;
    }
    public static char calcularLetra(int numero_DNI)
    {
        char letra_DNI;
        char[] letras={'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        letra_DNI=letras[numero_DNI%23];

        return letra_DNI;
    }
    public static void mostrar(int numero_DNI,char letra_DNI)
    {
        System.out.println("Su DNI es: " +numero_DNI+"-"+letra_DNI);
    }
    
}
