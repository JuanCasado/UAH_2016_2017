package ejercicio6_1;

/**
 *
 * @author mr.blissfulgrin
 */
public class Ejercicio6_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Titular t1 = new Titular("7986786","PEPE","870907","su casa");
        System.out.println(t1.getDireccion());
        Cuentas c1 = new Cuentas("768574",34567,t1);
        c1.retirarDinero(987654567);
        System.out.println(t1.getCuenta().toString());
    }
    
}
