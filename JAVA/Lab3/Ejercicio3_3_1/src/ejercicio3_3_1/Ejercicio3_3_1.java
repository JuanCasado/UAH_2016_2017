/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3_3_1;

import java.io.*;
/**
 *
 * @author mr.blissfulgrin
 */
public class Ejercicio3_3_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException
    {   
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        
        String telefono;
        int prefijo;
        long numero;
        
        
        System.out.println("Introduzca un número de teléfono (xx-xxxxxxx): ");
        telefono=input.readLine();
        
        prefijo=obtenerPrefijo(telefono);
        numero=obtenerNumero(telefono);
    
        System.out.println("Su prefijo es: "+prefijo+" y su número de teléfono es: "+numero);
    }

    private static int obtenerPrefijo(String telefono) {
        int prefijo;
        
        prefijo=Integer.parseInt(telefono.split("-")[0]);
        
        return prefijo;
    }

    private static long obtenerNumero(String telefono) {
        long numero;
        
        numero=Long.parseLong(telefono.split("-")[1]);
        
        return numero;
    }
    
}
