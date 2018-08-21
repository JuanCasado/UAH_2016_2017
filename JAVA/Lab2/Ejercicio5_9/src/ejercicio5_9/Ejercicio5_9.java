/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5_9;
import java.io.*;
/**
 *
 * @author mr.blissfulgrin
 */
public class Ejercicio5_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        long limite;
        boolean resultado,encontrado=true;
        System.out.print("Introduzca un número: ");
        limite=Long.parseLong(input.readLine());
        for(long y=limite+1;encontrado;y++)
        {   
            resultado=true;
            for (long x=2;x<y&&resultado;x++)
            {
                if (y%x==0)
                    resultado=false;
            }
            if(resultado)
            {    
                encontrado=false;
                System.out.println("El siguiente primo es: "+ y);
            }   
        }

    }
    
}
