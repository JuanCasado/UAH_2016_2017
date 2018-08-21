package ejercicio3_2_1;

import java.io.*;
import java.util.StringTokenizer;
/**
 * @author mr.blissfulgrin
 */
public class Ejercicio3_2_1 {

    public static void main(String[] args) throws IOException{
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        
        String telefono;
        int prefijo;
        long numero;
        
        System.out.print("Introduzca el número de teléfono (xx-xxxxxxx): ");
        telefono= input.readLine();
        
        prefijo=obtenerPrefijo(telefono);
        numero=obtenerNumero(telefono);
        
        System.out.println("El prefijo es: "+prefijo+" y el número es: "+numero);
    }
    
    public static int obtenerPrefijo(String telefono)
    {
        StringTokenizer token=new StringTokenizer(telefono,"-");
        
        int prefijo;
        
        prefijo= Integer.parseInt(token.nextToken());
        return prefijo;
    }

    private static long obtenerNumero(String telefono) {
        StringTokenizer token=new StringTokenizer(telefono,"-");
        
        long numero;
        
        token.nextToken();
        numero=Long.parseLong(token.nextToken());
        
        return numero;
    }
    
}
