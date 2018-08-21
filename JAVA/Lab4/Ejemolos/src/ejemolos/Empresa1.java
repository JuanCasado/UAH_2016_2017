package ejemolos;

/**
 *
 * @author mr.blissfulgrin
 */
public class Empresa1 implements Trabajo {
    //Esta empresa paga a 12 euros la hora de trabajo
        @Override
        public double pagarSueldo(double horas) 	
        {
            return horas*12;
        }
}
