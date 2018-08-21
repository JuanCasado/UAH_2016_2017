/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercico1_4_5;
import java.io.*;
/**
 *
 * @author mr.blissfulgrin
 */
public class Ejercico1_4_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        BufferedReader input=new BufferedReader (new InputStreamReader(System.in));
        
        char operador;
        double numero1,numero2,resultado;
        
        System.out.print("Introduzca el primero numero: ");
        numero1=Double.parseDouble(input.readLine());
        System.out.print("Introduzca el operador: ");
        operador=input.readLine().charAt(0);
        System.out.print("Introduzca el segundo numero: ");
        numero2=Double.parseDouble(input.readLine());
        
        resultado=calculadora(numero1,numero2,operador);
        
        System.out.println( numero1 + ""+operador+"" + numero2+" = "+ resultado);
        
    }
    
    public static double calculadora(double numero1,double  numero2,char operador)
    {
        double resultado;
        
        switch (operador)
        {
            case '+':
                resultado=numero1+numero2;                
                break;
            case '-':
                resultado=numero1-numero2;
                break;
            case '*':
                resultado=numero1*numero2;
                break;
            case '/':
                resultado=numero1/numero2;
                break;
            default:
                System.out.println("\nEl operador "+operador+" es incorrecto");
                resultado=0;
                break;
        }
        
        return resultado;
    }
}
