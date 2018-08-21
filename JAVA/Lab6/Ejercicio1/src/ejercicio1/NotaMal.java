/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author mr.blissfulgrin
 */
public class NotaMal extends Exception {

        public NotaMal() {
        super("NOTA INCORRECTA.");
    }
 
    public NotaMal(String msg) {
        super("NOTA INCORRECTA: " + msg);
    }
    
}
