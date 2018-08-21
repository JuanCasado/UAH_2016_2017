/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1_4_3;
import java.io.*;
/**
 *
 * @author mr.blissfulgrin
 */
public class Ejercicio1_4_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        
        int numero1,numero2,mayor;
        
        System.out.print("Introduzca el primer número: ");
        numero1=Integer.parseInt(input.readLine());
        System.out.print("Introduzca el segundo número: ");
        numero2=Integer.parseInt(input.readLine());
        
        mayor=elMayor(numero1,numero2);
        
        System.out.println("El mayor de "+numero1+" y "+numero2+" es: "+mayor);
    }
    
    public static int elMayor(int numero1,int numero2)
    {
       int mayor;
       
       if(numero1>numero2)
           mayor=numero1;
       else
           mayor=numero2;
       
       return mayor;
    }
   
}
