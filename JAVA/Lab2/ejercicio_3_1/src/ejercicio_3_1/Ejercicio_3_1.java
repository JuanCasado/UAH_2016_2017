package ejercicio_3_1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Ejercicio_3_1{
 
    public static void main(String args[]) throws IOException {
        //Objeto para leer una cadena del teclado
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
 
        String nombre;
        int edad;
        double altura;
       
        System.out.println("\nIntroduce tu nombre: ");
        nombre = entrada.readLine();
 
        System.out.println("\nIntroduce tu edad: ");
        edad = Integer.parseInt(entrada.readLine()); //conversión de cadena a número
       
        System.out.println("\nIntroduce tu altura (en metros): "); //decimal con punto
        altura = Double.parseDouble(entrada.readLine());
 
        System.out.print("\nTe llamas " + nombre + ", tienes " + edad + " años y mides " + altura + " metros.");
    }
}
