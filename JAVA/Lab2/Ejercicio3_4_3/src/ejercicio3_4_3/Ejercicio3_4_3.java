/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3_4_3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author mr.blissfulgrin
 */
public class Ejercicio3_4_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
        BufferedReader input= new BufferedReader(new InputStreamReader(System.in));
        int hora,minutos,segundos;
        System.out.print("\nIntroduzca las horas: ");
        hora =Integer.parseInt(input.readLine());
        System.out.print("Introduzca los minutos: ");
        minutos=Integer.parseInt(input.readLine());
        System.out.print("Introduzca los segundos: ");
        segundos=Integer.parseInt(input.readLine());
        System.out.print("["+hora+":"+minutos+":"+segundos+"]-->");
        if (segundos==0)
        {
            segundos=59;
            if (minutos==0)
            {
               minutos=59;
                if(hora==0)
                    hora=23;                 
                else
                    hora--;
            }
            else
                minutos--;
        }
        else
            segundos--;
        System.out.println("["+hora+":"+minutos+":"+segundos+"]");
    }
    
}

