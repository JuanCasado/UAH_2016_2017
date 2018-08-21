
package ejercicio3_2_2;
import java.io.*;
import java.util.StringTokenizer;
/**

 * @author mr.blissfulgrin
 */
public class Ejercicio3_2_2 {

    public static void main(String[] args) throws IOException{
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
                
        String frase;
        int contador=0;
        
        System.out.print("Introduzca una frase: ");
        frase=input.readLine();
        StringTokenizer token=new StringTokenizer(frase);
        
        while(token.hasMoreTokens())
        {
            contador++;
            token.nextToken();
        }
        
        System.out.println("La frase tiene "+contador+" palabras.");
    }
    
}
