/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3_1_4;

import java.io.*;

/**
 *
 * @author mr.blissfulgrin
 */
public class Ejercicio3_1_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException 
    {
        {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            int numero_DNI;
            char letra_DNI_calculada,letra_DNI_dada;
            String DNI;
            
            System.out.print("Introduzca el DNI (8 números y una letra): ");
            DNI=input.readLine();
            
            numero_DNI = obtenerNumero(DNI);
            letra_DNI_calculada = calcularLetra(numero_DNI);
            letra_DNI_dada=obtenerLetra(DNI);
            
            if(letra_DNI_dada==letra_DNI_calculada)
                System.out.println("La letra del DNI: "+ DNI +" es correcta.");
            else
                System.out.println("La letra del DNI: "+DNI+" no es correcta, debería de ser: "+letra_DNI_calculada);
        }
    }
    

    public static int obtenerNumero(String DNI) 
    {

        int numero_DNI;
        numero_DNI=Integer.parseInt(DNI.substring(0,8));
        
        return numero_DNI;
    }

    public static char calcularLetra(int numero_DNI) 
    {
        char letra_DNI;
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        letra_DNI = letras[numero_DNI % 23];

        return letra_DNI;
    }
    
    public static char obtenerLetra(String DNI)
    {
        char letra_DNI_dada;
        
        letra_DNI_dada=DNI.charAt(8);
        
        return letra_DNI_dada;
    }
    

}
