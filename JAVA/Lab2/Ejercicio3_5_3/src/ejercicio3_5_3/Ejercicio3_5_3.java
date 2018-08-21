/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3_5_3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author mr.blissfulgrin
 */
public class Ejercicio3_5_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        int dimension;
        System.out.print("Introduzca la dimensión del triángulo: ");
        dimension=Integer.parseInt(input.readLine());
        for(int x=dimension;x>0;x--)
        {
            for (int y=x;y>0;y--)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
}
