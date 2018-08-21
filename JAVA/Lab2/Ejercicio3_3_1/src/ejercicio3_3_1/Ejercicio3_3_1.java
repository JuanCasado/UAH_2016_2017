/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3_3_1;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author mr.blissfulgrin
 */
public class Ejercicio3_3_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); //para introducir los decimales con punto y no con coma
        double dato,redondeo;
        System.out.print("Introduce un número a rendondear: ");
        dato = entrada.nextDouble();
        if ((dato%0.1 )>0.05)
        {
            redondeo =(dato - dato%0.1 + 0.1);
        }
        else
        {
            redondeo =dato - dato%0.1;
        }
        
        System.out.print("\nHas introducido: " + dato +"\nQueda redondeado a: "+ redondeo);
    }
    
}
