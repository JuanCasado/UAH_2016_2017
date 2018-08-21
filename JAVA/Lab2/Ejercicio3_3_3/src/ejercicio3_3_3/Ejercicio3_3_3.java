/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3_3_3;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author mr.blissfulgrin
 */
public class Ejercicio3_3_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada= new Scanner(System.in);
       entrada.useLocale(Locale.US);
       double x1,x2,y1,y2,pendiente;
       System.out.print("\nIntroduce la componente x1: ");
       x1=entrada.nextDouble();
       System.out.print("Introduce la componente y1: ");
       y1=entrada.nextDouble();
       System.out.print("Introduce la componente x2: ");
       x2=entrada.nextDouble();
       System.out.print("Introduce la componente y2: ");
       y2=entrada.nextDouble();
       pendiente = (y2-y1) / (x2-x1);
       System.out.println("\n\tLa pendiente de la recta es: "+ pendiente);
       
       
    }
    
}
