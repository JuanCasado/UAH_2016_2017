/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author mr.blissfulgrin
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double media = 0, total = 0, notanum = 0;
        int contador = 0;
        String notatxt = "";
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        while (!notatxt.equals("Z")) 
        {
            try 
            {
                System.out.print("\nTeclee calificación (A-F), Z para terminar: ");
                notatxt = entrada.readLine().toUpperCase();
                switch (notatxt)
                {
                    case "A":
                      notanum = 10; 
                        break;
                    case "B":
                      notanum = 9;
                        break;
                    case "C":
                        notanum = 8;
                        break;
                    case "D":
                        notanum = 6;
                        break;
                    case "E":
                        notanum = 5;
                        break;
                    case "F":
                        notanum = 0;
                        break;
                    case "Z":
                        break;
                    default:
                       throw new NotaMal("El caracter introducido "+notatxt+" no está entre [A-F]"); 
                }
                if (!notatxt.equals("Z"))
                {
                    total += notanum;
                    contador++;
                }
                if (media == 0)
                {
                    throw new NotaMal();
                }
            }
            catch (NotaMal nm) 
            {
                System.out.println("\n" + nm.getMessage());
            } 

            catch (IOException ioe) {
                System.out.println("\nError de entrada/salida: " + ioe.toString());
            } 
            catch (Exception e) {
                // Captura cualquier otra excepción
                System.out.println("Excepción: " + e.toString());
            }
        }
 
        if (contador != 0) {
            media = (double) total / contador;
            System.out.println("\nEl promedio del grupo es: " + media);
        } else {
            System.out.println("\nNo se introdujeron calificaciones.");
        }
    }
    
}
