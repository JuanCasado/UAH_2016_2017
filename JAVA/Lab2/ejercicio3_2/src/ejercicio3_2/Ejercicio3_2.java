package ejercicio3_2;
import java.util.Locale;
import java.util.Scanner;
public class Ejercicio3_2 {
    public static void main(String[] args) {
        //Objeto para leer una cadena del teclado
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); //para introducir los decimales con punto y no con coma
       
        String nombre;
        int edad;
        double altura;
 
        System.out.print("Introduce tu nombre: ");
        //lectura de un String
        nombre = entrada.nextLine();
 
        System.out.print("Introduce tu edad: ");
        //lectura de un int
        edad = entrada.nextInt();
       
        System.out.print("Introduce tu altura (en metros): ");
        //lectura de un double
        altura = entrada.nextDouble();
 
        System.out.print("\nTe llamas " + nombre + ", tienes " + edad + " años y mides " + altura + " metros.");
    }
    
}
