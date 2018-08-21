/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5_7;
import java.io.*;
/**
 *
 * @author mr.blissfulgrin
 */
public class Ejercicio5_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        BufferedReader input =new BufferedReader(new InputStreamReader(System.in));
        int año,mes,dia,año2,mes2,dia2,contador=0,temporal=0;
        boolean resultado;
        System.out.print("\tPRIMERA FECHA:\nIntroduzca el año: ");
        año=Integer.parseInt(input.readLine());
        System.out.print("Introduzca el mes: ");
        mes=Integer.parseInt(input.readLine());
        System.out.print("Introduzca el día: ");
        dia=Integer.parseInt(input.readLine());
        System.out.print("\t SEGUNDA FECHA:\nIntroduzca el año: ");
        año2=Integer.parseInt(input.readLine());
        System.out.print("Introduzca el mes: ");
        mes2=Integer.parseInt(input.readLine());
        System.out.print("Introduzca el día: ");
        dia2=Integer.parseInt(input.readLine());
        //Comprobar que las fechas sean validas
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
        if (resultado)
        {
        switch (mes2)
        {
            case 1:
                resultado=dia2<=31;
                break;
            case 2:
                if (año2%100==0&&año2%400==0)
                    resultado=dia2<=29;
                else
                    resultado=dia2<=28;
                break;
            case 3:
                resultado=dia2<=31;
                break;
            case 4:
                resultado=dia2<=30;
                break;
            case 5:
                resultado=dia2<=31;
                break;
            case 6:
                resultado=dia2<=30;
                break;
            case 7:
                resultado=dia2<=31;
                break;
            case 8:
                resultado=dia2<=31;
                break;
            case 9:
                resultado=dia2<=30;
                break;
            case 10:
                resultado=dia2<=31;
                break;
            case 11:
                resultado=dia2<=30;
                break;
            case 12:
                resultado=dia2<=31;
                break;
            default:
                resultado=false;
                break;
        }
        }
        if (dia<=0||mes<=0||año<0||dia2<=0||mes2<0||año2<0)
            resultado=false;
        if(resultado)
        {
        //Ordenar las fechas [año/mes/dia]es la menor
        if (año>año2)
        {
            temporal=año;
            año=año2;
            año2=temporal;
            temporal=mes;
            mes=mes2;
            mes2=temporal;
            temporal=dia;
            dia=dia2;
            dia2=temporal;
                    
        }
        else if(año==año2&&mes>mes2)
        {
            temporal=año;
            año=año2;
            año2=temporal;
            temporal=mes;
            mes=mes2;
            mes2=temporal;
            temporal=dia;
            dia=dia2;
            dia2=temporal; 
        }
        else if(mes==mes2&&dia>dia2)
        {
            temporal=año;
            año=año2;
            año2=temporal;
            temporal=mes;
            mes=mes2;
            mes2=temporal;
            temporal=dia;
            dia=dia2;
            dia2=temporal; 
        }
        System.out.print("Entre ["+dia+"/"+mes+"/"+año+"] y ["+dia2+"/"+mes2+"/"+año2+"] hay ");
        //Si las fechas son iguales no han pasado días entre ellas
        if (año==año2&&mes==mes2&&dia==dia2)
            contador=0;
        //Si el año y el mes son iguales contamos solo los días
        else if(año==año2&&mes==mes2)
            contador=dia2-dia;
        //Si solo los años son iguales
        else if(año==año2)
        {
          //contamos los días desde dia a fin de mes
            switch (mes)
        {
            case 1:
                temporal=31;
                break;
            case 2:
                if (año%100==0&&año%400==0)
                    temporal=29;
                else
                    temporal=28;
                break;
            case 3:
                temporal=31;
                break;
            case 4:
                temporal=30;
                break;
            case 5:
                temporal=31;
                break;
            case 6:
                temporal=30;
                break;
            case 7:
                temporal=31;
                break;
            case 8:
                temporal=31;
                break;
            case 9:
                temporal=30;
                break;
            case 10:
                temporal=31;
                break;
            case 11:
                temporal=30;
                break;
            case 12:
                temporal=31;
                break;
            default:
                break;
        }
        contador+=temporal-dia;
        //contamos dias entre meses
        for (int x=mes+1;x<mes2;x++)
        {
            switch (x)
        {
            case 1:
                contador+=31;
                break;
            case 2:
                
                if (año%100==0&&año%400==0)
                contador+=29;
                else
                contador+=28;
                break;
            case 3:
                contador+=31;
                break;
            case 4:
                contador+=30;
                break;
            case 5:
                contador+=31;
                break;
            case 6:
                contador+=30;
                break;
            case 7:
                contador+=31;
                break;
            case 8:
                contador+=31;
                break;
            case 9:
                contador+=30;
                break;
            case 10:
                contador+=31;
                break;
            case 11:
                contador+=30;
                break;
            case 12:
                contador+=31;
                break;
            default:
                break;
        }            
        }
        //contamos los días desde mes2 a dia2
        contador+=dia2;
        }
        else
        {//si los años no son iguales
           switch (mes)
        {//contamos los dias desde dia a fin de mes
            case 1:
                temporal=31;
                break;
            case 2:
                if (año%100==0&&año%400==0)
                    temporal=29;
                else
                    temporal=28;
                break;
            case 3:
                temporal=31;
                break;
            case 4:
                temporal=30;
                break;
            case 5:
                temporal=31;
                break;
            case 6:
                temporal=30;
                break;
            case 7:
                temporal=31;
                break;
            case 8:
                temporal=31;
                break;
            case 9:
                temporal=30;
                break;
            case 10:
                temporal=31;
                break;
            case 11:
                temporal=30;
                break;
            case 12:
                temporal=31;
                break;
            default:
                break;
        }
        contador+=temporal-dia;
        //contamos los dias desde mes a fin de año
        for (int x=mes+1;x<=12;x++)
        {
            switch (x)
        {
            case 1:
                contador+=31;
                break;
            case 2:
                if (año%100==0&&año%400==0)
                    contador+=29;
                else
                    contador+=28;
                break;
            case 3:
                contador+=31;
                break;
            case 4:
                contador+=30;
                break;
            case 5:
                contador+=31;
                break;
            case 6:
                contador+=30;
                break;
            case 7:
                contador+=31;
                break;
            case 8:
                contador+=31;
                break;
            case 9:
                contador+=30;
                break;
            case 10:
                contador+=31;
                break;
            case 11:
                contador+=30;
                break;
            case 12:
                contador+=31;
                break;
            default:
                break;
        }   
        }
        //contamos los días entre años
        for (int x=año+1;x<año2;x++)
        {
          if (x%100==0&&x%400==0)
              contador+=366;
          else
              contador+=365;
        }
        //contamos los dias de inicio de año2 a mes2
        for (int x=0;x<mes2;x++)
        {
            switch (x)
        {
            case 1:
                contador+=31;
                break;
            case 2:
                if (año2%100==0&&año%400==0)
                    contador+=29;
                else
                    contador+=28;
                break;
            case 3:
                contador+=31;
                break;
            case 4:
                contador+=30;
                break;
            case 5:
                contador+=31;
                break;
            case 6:
                contador+=30;
                break;
            case 7:
                contador+=31;
                break;
            case 8:
                contador+=31;
                break;
            case 9:
                contador+=30;
                break;
            case 10:
                contador+=31;
                break;
            case 11:
                contador+=30;
                break;
            case 12:
                contador+=31;
                break;
            default:
                break;
        }   
        }
        //contamos los dias desde inicio mes2 a dias 2
        contador+=dia2;
        }
        System.out.println(contador+ " dias");
        }
        else
        {
            System.out.println("Las fechas ["+dia+"/"+mes+"/"+año+"] y ["+dia2+"/"+mes2+"/"+año2+"] no son válidas ");
        }
    }
    
}
