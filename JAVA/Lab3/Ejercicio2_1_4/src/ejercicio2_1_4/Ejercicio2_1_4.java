/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2_1_4;
import java.util.Random;
import java.text.DecimalFormat;
/**
 *
 * @author mr.blissfulgrin
 */
public class Ejercicio2_1_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int empleados=20;
        double [][]contabilidad =new double[3][empleados];
        
        calcularSueldoBruto(contabilidad);
        calcularRetencion(contabilidad);
        calcularSalarioNeto(contabilidad);
        mostrar(contabilidad);
    }
    public static void calcularSueldoBruto(double[][]contabilidad)
    {
        Random rand=new Random();
        for (int x=0;x<contabilidad[0].length;x++)
            contabilidad[0][x]=(double)rand.nextInt(300000);
    }
    public static void calcularRetencion(double [][]contabilidad)
    {
        for (int x=0;x<contabilidad[0].length;x++)
        {
            if (contabilidad[0][x]<17707)
                contabilidad[1][x]=contabilidad[0][x]*0.24;
            else if (17708<contabilidad[0][x]&&contabilidad[0][x]<33007)
                contabilidad[1][x]=contabilidad[0][x]*0.3;
            else if (33008<contabilidad[0][x]&&contabilidad[0][x]<53407)
                contabilidad[1][x]=contabilidad[0][x]*0.4;
            else if (53408<contabilidad[0][x]&&contabilidad[0][x]<120000)
                contabilidad[1][x]=contabilidad[0][x]*0.47;
            else if (120001<contabilidad[0][x]&&contabilidad[0][x]<175000)
                contabilidad[1][x]=contabilidad[0][x]*0.49;
            else
                contabilidad[1][x]=contabilidad[0][x]*0.51;            
        }
    }
    public static void calcularSalarioNeto(double[][] contabilidad)
    {
        for (int x=0;x<contabilidad[0].length;x++)        
            contabilidad[2][x]=contabilidad[0][x]-contabilidad[1][x];        
    }
    public static void mostrar(double[][]contabilidad)
    {
        for (int x=0;x<contabilidad[0].length;x++)  
        {
            
            System.out.print("Empleado "+x+":\t Sueldo Bruto "+transformar(contabilidad[0][x]));
            System.out.println("\t-   Retencion: "+ transformar(contabilidad[1][x])+"   \t-   Sueldo Neto: "+transformar(contabilidad[2][x]));
        }
    }
    public static String transformar(double numero)
    {
        DecimalFormat formateador = new DecimalFormat("###,###.##");
     
        return formateador.format (numero);
      
    }
}
