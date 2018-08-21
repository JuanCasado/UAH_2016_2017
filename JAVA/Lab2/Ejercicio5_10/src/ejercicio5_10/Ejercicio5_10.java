/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5_10;
import java.io.*;
import java.util.Random;
/**
 *
 * @author mr.blissfulgrin
 */
public class Ejercicio5_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        Random rand=new Random();        
        int secreto=rand.nextInt(101)-1,numero;        
        do
        {
            System.out.print("Introduzca un número: ");
            numero=Integer.parseInt(input.readLine());
            if (numero<secreto)            
                System.out.println("El número es mayor");            
            else
                System.out.println("El número es menor");
        }
        while(secreto!=numero);
        System.out.println("Has acertado, el número era "+ secreto);
    }
    
}
