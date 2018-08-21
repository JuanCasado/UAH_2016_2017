/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5_8_2;

/**
 *
 * @author mr.blissfulgrin
 */
public class Ejercicio5_8_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long x=2;
        boolean resultado;
        while(true)
        {
            resultado=true;
            for(long y=2;y<x&&resultado;y++)
            {    
                if (x%y==0)
                    resultado=false;
            }
            if(resultado)
                System.out.println(x);
            x++;
        }
        
        
            
    }
    
}
