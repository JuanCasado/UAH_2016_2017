package classes;

import java.util.Comparator;

public class OrdenaCartas implements Comparator
{
    @Override
    public int compare (Object carta1, Object carta2)
    {
      int peso1 = ((Carta)carta1).getOrden();    //Casting Object-->Carta
      int peso2 = ((Carta)carta2).getOrden();    //Casting Object-->Carta
      if(peso1 > peso2)
      {  //Ordenar de menor a mayor (izquierda derecha)
         return 1;
      }
      else if(peso1 < peso2){
         return -1;
      }
      else
         return 0;
   }
}

