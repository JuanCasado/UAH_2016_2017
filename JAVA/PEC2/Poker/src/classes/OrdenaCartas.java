package classes;

import java.util.Comparator;

/**
 *
 * @author mr.blissfulgrin
 */
public class OrdenaCartas implements Comparator
{
    @Override
    public int compare (Object alum1, Object alum2)
    {
      int alum1Nota = ((Carta)alum1).getOrden();    //Casting Object-->Carta
      int alum2Nota = ((Carta)alum2).getOrden();    //Casting Object-->Carta
      if(alum1Nota > alum2Nota)
      {  //Ordenar de menor a mayor (izquierda derecha)
         return 1;
      }
      else if(alum1Nota < alum2Nota){
         return -1;
      }
      else
         return 0;
   }
}

