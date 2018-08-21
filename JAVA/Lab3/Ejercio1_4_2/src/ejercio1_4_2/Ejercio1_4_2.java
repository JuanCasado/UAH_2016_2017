/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercio1_4_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author mr.blissfulgrin
 */
public class Ejercio1_4_2 {

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
        
        int cuenta=0, ajuste=0;
        
        if (limite1>limite2)
        {
            int temporal;
            temporal=limite1;
            limite1=limite2;
            limite2=temporal;
        }
        if (limite1%2==0||limite2%2==0)
            ajuste=-1;
        intervalo=new int[(int)((limite2-limite1)/2)+ajuste];
        for(int x=limite1+1;x<limite2;x++)
        {            
            if (esPar(x))
            {
                intervalo[cuenta]=x;
                cuenta++;
            }
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
    
    public static boolean esPar(int x)
    {
        boolean es_par=false;
        if (x%2==0)
            es_par=true;
        return es_par;
    }
    
}
