package ejercicio3_3_2;

import java.io.*;
/**
 * @author mr.blissfulgrin
 */
public class Ejercicio3_3_2 {

    public static void main(String[] args)throws IOException {
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
                
        String frase;
        int contador;
        
        System.out.print("Introduzca una frase: ");
        frase=input.readLine();
        
        contador=frase.split(" ").length;
        
        System.out.println("La frase tiene "+contador+" palabras.");
    }
    
}
