/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1_4_1;
import java.io.*;
/**
 *
 * @author mr.blissfulgrin
 */
public class Ejercicio1_4_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException 
    {
        int limite1,limite2;
        
        int intervalo [];
        
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Introduzca uno de los límites del intervalo: ");
        limite1=Integer.parseInt(input.readLine());
        System.out.print("Introduzca otro de los límites del intervalo: ");
        limite2=Integer.parseInt(input.readLine());
        intervalo = calcular_intervalo(limite1,limite2);
        mostrar_intervalo(intervalo);
    }
    public static int[] calcular_intervalo(int limite1, int limite2)            
    {
        int intervalo[];
        if (limite1>limite2)
        {
            int temporal;
            temporal=limite1;
            limite1=limite2;
            limite2=temporal;
        }
        intervalo=new int[limite2-limite1-1];
        for(int x=limite1+1;x<limite2;x++)
        {
            intervalo[x-limite1-1]=x;
        }
        return intervalo;
    }
    
    public static void mostrar_intervalo( int[] intervalo)
    {
        for(int x=0;x<intervalo.length;x++)
        {
            System.out.println(intervalo[x]);
        }
    }
    
}
