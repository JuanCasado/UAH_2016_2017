/**
 * @author mr.blissfulgrin
 */
public class PruebaLampara {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lampara l1 =new Lampara();
        
        l1.setEncendida(false);
        l1.setIntensidad(50);
        System.out.println(l1.toString());
        l1.setEncendida(true);
        System.out.println(l1.toString());
        l1.setIntesidad(14);
        System.out.println(l1.toString());
        l1.setIntesidad(10);
        System.out.println(l1.toString());
        l1.setIntesidad(1);
        System.out.println(l1.toString());
    }
    
}
