package ejemolos;
import java.io.*;
/**
 * @author mr.blissfulgrin
 */
public class Ejemolos {
    public static void main(String[] args) throws IOException
    {
        Empresa2 emp2=new Empresa2();
        double pago2=emp2.pagarSueldo(24);
        
        Empresa1 emp1=new Empresa1();
        double pago1 = emp1.pagarSueldo(24);
        
        
        System.out.println("Empresa1 "+pago1+" Empresa2: "+ pago2);
    }
    
}

    

