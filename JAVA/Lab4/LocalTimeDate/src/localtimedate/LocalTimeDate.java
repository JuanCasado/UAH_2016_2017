/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package localtimedate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author mr.blissfulgrin
 */
public class LocalTimeDate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LocalDateTime hoy = LocalDateTime.now();
        System.out.println("La fecha de hoy completa es: " + hoy);
        // Cambiamos el formato
        DateTimeFormatter formatoCorto = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");  
        System.out.println("Hoy es (formato corto)" + hoy.format(formatoCorto));
        //Establecemos una fecha
        LocalDateTime diaHora = LocalDateTime.of(2010, Month.JUNE, 25, 10, 59, 59);       
        System.out.println("La fecha establecida: " + diaHora);
        diaHora = diaHora.plusMonths(1).minusDays(5).minusHours(3);       
        System.out.println("La fecha modificada: " + diaHora);
    }
    
}
