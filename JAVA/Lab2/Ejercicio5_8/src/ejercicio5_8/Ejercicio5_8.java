/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5_8;
import java.io.*;
/**
 *
 * @author mr.blissfulgrin
 */
public class Ejercicio5_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        long numero;
        boolean resultado=false;
        System.out.print("Instroduzca un numero: ");
        numero=Long.parseLong(input.readLine());
        for (long x=2;x<numero&&!resultado;x++)   
        {
            resultado=numero%x==0;
        }
        if(resultado)
            System.out.println("EL numero "+ numero+" NO es primo");
        else
            System.out.println("EL numero "+ numero+" SI es primo");
    }
    
}
