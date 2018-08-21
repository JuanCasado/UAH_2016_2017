package ejercicio3_3_3;

import java.io.*;
import java.util.StringTokenizer;

public class Ejercicio3_3_3 {

    public static void main(String[] args)throws IOException {
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        
        String frase;
        String[] palabras;
        
        System.out.print("Introduzca una frase: ");
        frase=input.readLine();
        
        palabras=frase.split(" ");
        System.out.print("La nueva frase es: ");
        for (String palabra : palabras) 
        {
            palabra=voltear(palabra);
            System.out.print(palabra+" ");
        }
        System.out.println("");
    }
        
    public static String voltear(String palabra)
    {
        StringBuilder volteada=new StringBuilder();
        
        for(int x=palabra.length()-1;x>=0;x--)
        {
            volteada.append(palabra.charAt(x));
        }
        
        return volteada.toString();
    }
}
