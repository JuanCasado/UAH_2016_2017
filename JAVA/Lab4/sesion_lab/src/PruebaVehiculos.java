/**
 * @author mr.blissfulgrin
 */
public class PruebaVehiculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo("1234 BCD", "Opel", "Astra", 0, false);
        Vehiculo v2 = new Vehiculo("2345 CDE", "BMW", "S1", 80, false);
        Vehiculo v3 = new Vehiculo("3456 DEF", "Audi", "A3", 100, true);
 
        v1.setVelocidad(50);
        v1.setLuces(true);
        System.out.println(v1.toString());
    }
    
}
