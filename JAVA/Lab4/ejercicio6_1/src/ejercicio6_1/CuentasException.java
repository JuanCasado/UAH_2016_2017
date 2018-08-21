/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6_1;

/**
 *
 * @author mr.blissfulgrin
 */
public class CuentasException extends Exception{
    public static String SALDO_INSUFICIENTE = "El saldo de su cuenta es menor que la cantidad que desea retirar.";
 
    public static String CANTIDAD_NEGATIVA = "La cantidad que desea ingresar no puede ser negativa.";
     
    public CuentasException() {
      super("Se ha producido una excepción en el banco.");
    }   
   
    public CuentasException(String txt) {
        super(txt);
    }
}
