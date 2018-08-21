/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;
import java.io.*;
/**
 *
 * @author mr.blissfulgrin
 */
public class Ejercicio2 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        String operacion;
        String [] arg = new String[3];
        int op1,op2;
        double answ;
        
        while (true)
        {
            System.out.print("$ ");
            
            try
            {
                operacion = input.readLine();
                 
                arg = operacion.split("");
                
                op1=Integer.parseInt(arg[0]);
                op2=Integer.parseInt(arg[2]);
                
                switch (arg[1])
                {
                    case "+":
                        answ=op1+op2;
                        break;
                    case "-":
                        answ=op1-op2;
                        break;
                    case "*":
                        answ=op1*op2;
                        break;
                    case "/":
                        answ=op1/op2;
                        break;
                    default:
                        throw new CalcException();               
                }
                System.out.println("\t="+answ);
            }
            catch (IOException io)
            {
                System.out.println("ERROR EN IO\n"+io.toString());
            }
            catch (ArrayIndexOutOfBoundsException aio)
            {
                System.out.println("INTRODUZCA UNA UNICA OPERACIÓN\n"+aio.toString());
            }
            catch (NumberFormatException nf)
            {
                System.out.println("NO ESCRIBA ESPACIOS ENTRE LOS OPERANDOS\n"+nf.toString());
            }
            catch(CalcException c)
            {
                System.out.println("EXCEPCION-->"+c.getMessage());
            }
            catch (Exception e)
            {
                System.out.println("EXCEPCION\n"+e.toString());
            }
        }
    }    
}
