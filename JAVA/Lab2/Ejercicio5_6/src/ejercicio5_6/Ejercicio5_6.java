/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5_6;
import java.io.*;
/**
 *
 * @author mr.blissfulgrin
 */
public class Ejercicio5_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        BufferedReader input =new BufferedReader(new InputStreamReader(System.in));
        int año,mes,dia;
        boolean resultado;
        System.out.print("Introduzca el año: ");
        año=Integer.parseInt(input.readLine());
        System.out.print("Introduzca el mes: ");
        mes=Integer.parseInt(input.readLine());
        System.out.print("Introduzca el día: ");
        dia=Integer.parseInt(input.readLine());
        switch (mes)
        {
            case 1:
                resultado=dia<=31;
                break;
            case 2:
                if (año%100==0&&año%400==0)
                    resultado=dia<=29;
                else
                    resultado=dia<=28;
                break;
            case 3:
                resultado=dia<=31;
                break;
            case 4:
                resultado=dia<=30;
                break;
            case 5:
                resultado=dia<=31;
                break;
            case 6:
                resultado=dia<=30;
                break;
            case 7:
                resultado=dia<=31;
                break;
            case 8:
                resultado=dia<=31;
                break;
            case 9:
                resultado=dia<=30;
                break;
            case 10:
                resultado=dia<=31;
                break;
            case 11:
                resultado=dia<=30;
                break;
            case 12:
                resultado=dia<=31;
                break;
            default:
                resultado=false;
                break;
        }
        if (dia<=0||mes<=0||año<0)
            resultado=false;
        if (resultado)
            System.out.println("La fecha introducida es válida:\n["+dia+"/"+mes+"/"+año+"]");
        else
            System.out.println("La fecha introducida no es válida");
    }
    
}
