/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4_1;
import java.io.*;
/**
 *
 * @author mr.blissfulgrin
 */
public class Ejercicio4_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException  {
      int contador=0,total=0;
      double media=0;
      String nota;
       //Objeto para leer una cadena del teclado
      BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
  
       do
       {
         System.out.print( "\nTeclee calificación (A,B,C,D,E)\nF para salir\n==> " );
         nota = entrada.readLine().toUpperCase();
        
        switch (nota) 
        {
            case "A":
                total+=4;
                break;
            case "B":
                total+=3;
                break;
            case "C":
                total+=2;
                break;
            case "D":
                total+=1;
                break;
            case "E":
                break;
            case "F":
                break;
            default:
                System.out.println("*********************************");
                System.out.println("Ha introducido un dato erroneo,\n"+nota+"\nPruebe de nuevo.");
                System.out.println("*********************************");
                contador--;
                break;
        }
        if (!"F".equals(nota))
        {
          contador++;
          media = (double)total / contador;
          System.out.print("\tLa media es: " + media);

        }
      }
      while(!"F".equals(nota));
      System.out.println("*********************************************************************");
      System.out.println("Fin de programa.\n\nEl promedio del grupo es: " + media);
      System.out.println("*********************************************************************");
    }
    
}
