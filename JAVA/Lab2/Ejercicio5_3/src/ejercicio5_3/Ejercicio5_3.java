/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5_3;
import java.io.*;
/**
 *
 * @author mr.blissfulgrin
 */
public class Ejercicio5_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        double lado1,lado2,lado3;
        System.out.print("Introduzca el primer lado de su trángulo: ");
        lado1=Double.parseDouble(input.readLine());
        System.out.print("Introduzca el primer lado de su trángulo: ");
        lado2=Double.parseDouble(input.readLine());
        System.out.print("Introduzca el primer lado de su trángulo: ");
        lado3=Double.parseDouble(input.readLine());
        if (lado1+lado2>lado3&&lado2+lado3>lado1&&lado1+lado3>lado2)
            System.out.println("Eso es un triángulo");
        else
            System.out.println("No se puede generar un trángulo con los lados dados");
    }
    
}