/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3_6_1;
/**
 *
 * @author mr.blissfulgrin
 */
public class Ejercicio3_6_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String meses[]={"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
        double contabilidad [][]=new double[2][12];
        double ganancia=0;
        for (int x=0;x<contabilidad.length;x++)
        {
            for(int y =0;y<contabilidad[0].length;y++)
            {
                if (x==0)                
                    contabilidad[x][y]=(int)(Math.random()*1500)+1000;                
                else
                    contabilidad[x][y]=(Math.random()*1.5)+0.5;                
            }
        }
        for (int x=0;x<contabilidad[0].length;x++)
        {
            System.out.println(meses[x]+":    \t"+contabilidad[0][x]+" l\t*\t"+contabilidad[1][x]+" €/l\t=\t"+contabilidad[0][x]*contabilidad[1][x]+" €");
            ganancia+=contabilidad[0][x]*contabilidad[1][x]; 
        }
        System.out.println("\n\tGanancias totales= "+ganancia+" €");  
    }
    
}
