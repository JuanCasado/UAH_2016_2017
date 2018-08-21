package ejercicio5_1;
import Empleados.*;
/**
 * @author mr.blissfulgrin
 */
public class Ejercicio5_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empresa em1 =new Empresa("Oscarboticas", "2412jasda");
        Departamento d1 =new Departamento("finanzas", "34124j", "Sevilla", em1);
        Empleado e1 = new Empleado("0234234F", "Pepe", 22, "casado", 2000, "director", d1);
        Nominas n1 = new Nominas(250,e1);
        System.out.println(n1.toString());
    }
}
