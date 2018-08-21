package ejercicio7;
import java.util.ArrayList;
/**
 * @author mr.blissfulgrin
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Pieza> piezas1 = new ArrayList<>();        
        ArrayList<Pieza> piezas2 = new ArrayList<>();
        ArrayList<Pieza> piezas3 = new ArrayList<>();
        Pieza p1=new Pieza("Rueda",100);
        Pieza p2=new Pieza("Motor",1000);
        Pieza p3=new Pieza("Frenos",500);
        Pieza p4=new Pieza("Cristal",200);
        Pieza p5=new Pieza("Asiento",300);
        piezas1.add(p1);
        piezas1.add(p2);
        piezas1.add(p5);
        piezas2.add(p3);
        piezas2.add(p4);
        piezas2.add(p5);
        piezas3.add(p3);
        piezas3.add(p4);
        Vehículo v1=new Vehículo("124121HJ","Audi","A1",piezas1);
        Vehículo v2=new Vehículo("678996PH","Mercedes","M5",piezas2);
        Vehículo v3=new Vehículo("732422KI","Porche","P3",piezas3);
        Taller t1=new Taller("Paca","732735972",60);
        Taller t2=new Taller("JKSJNAO","3535972",57);
        System.out.println("Tallerr 1, coche 3: "+t1.repararVehiculo(v3, 5)+"€");
        System.out.println("Taller 2, coche 1: "+t2.repararVehiculo(v1, 4)+"€");
        System.out.println("Taller 2, coche 2:"+t2.repararVehiculo(v2, 5)+"€");
    }
    
}
