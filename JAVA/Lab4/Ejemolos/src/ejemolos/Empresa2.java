package ejemolos;

/**
 *
 * @author mr.blissfulgrin
 */
public class Empresa2 implements Trabajo{
    //Esta empresa paga a 15 euros la hora de trabajo
        @Override
        public double pagarSueldo(double horas) 	
        {
            return horas*15; 
        }
}
