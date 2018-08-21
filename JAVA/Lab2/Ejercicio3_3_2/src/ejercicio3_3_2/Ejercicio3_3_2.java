/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3_3_2;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author mr.blissfulgrin
 */
public class Ejercicio3_3_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double radio,area,longitud;
        System.out.print("\nIntroduce el radio: ");
        radio=entrada.nextDouble();
        area= Math.PI * Math.pow(radio, 2);
        longitud= Math.PI * 2 * radio;
        System.out.println("\nPara un círculo de radio "+ radio+"u:\n\tEl área es: "+area+"u\n\tLa longitud es: "+longitud+"u");
    }
    
}
