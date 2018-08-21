/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3_5_2;

/**
 *
 * @author mr.blissfulgrin
 */
public class Ejercicio3_5_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int x=1;x<=9;x++)
        {
            for(int y=1;y<=9;y++)
            {
                System.out.print(y+"*"+x+"= "+x*y+"\t");
            }
            System.out.println();
        }
    }
    
}
