/**
 * @author Juan Casado Ballesrteros
 */
package PEC1;
import java.io.*;
import java.util.ArrayList;

public class Juego 
{
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException
    {      
        double enJuego; //Dinero que el usuario apuesta
        boolean partida=true,juego,jugada;  //Controlan que se coja una opción de las dadas en diferentes puntos del main
        int tipo,jugador,inicio;            //Almacenan las opciones hechas por el usuasio
        String intermedio;  //Usado para dejar a dos decimales
        
        //Jugadores predefinidos
        Jugador_Ocasional j1 = new Jugador_Ocasional("1241241AF","23452352V","Pepe Gonzalez");
        Jugador_Registrado j2 = new Jugador_Registrado("35345JE45","93422756A","Rosa Martinez");
        
        //Arrays para almacenar los jugadores sin límite
        ArrayList<Jugador_Ocasional> jugadores_Ocasionales = new ArrayList<>();
        jugadores_Ocasionales.add(j1);
        ArrayList<Jugador_Registrado> jugadores_Registrados = new ArrayList<>();
        jugadores_Registrados.add(j2);
        
        System.out.println("***********************************************************************");
        System.out.println("Bienvenido a POKER 18!!!");
        System.out.println("***********************************************************************");
        while(partida)
        {
            //Primer menú
            System.out.println("Qué desea hacer?");
            System.out.println("1. Registrarse");
            System.out.println("2. Jugar (Se ofrecen dos jugadores ya creados)");
            System.out.println("3. Reglas");
            System.out.println("4. Salir");
            System.out.print("Elija una opción: ");
            inicio=pedir_int("Elija una opción: ");
            System.out.println("***********************************************************************");
            switch(inicio)
            {
                case 1://Registra nuevos usuarios
                    registrar(jugadores_Ocasionales,jugadores_Registrados);
                break;
                case 2://Juego en si
                    juego=true;
                    while(juego)
                    {
                        System.out.println("Como quiere jugar?  (por defecto ocasional)");
                        System.out.println("1. Jugador Registrado");
                        System.out.println("2. Jugador Ocasional");
                        System.out.print("Elija una opción: ");
                        tipo=pedir_int("Elija una opción: ");
                        switch(tipo)
                        {
                        case 1://Jugador Registrado
                            juego=false;//Hace que vuelva a asairl el comentado como primer menú al terminar la partida
                            jugada=true;//Evita tomar opciones incorrectas
                            while(jugada)
                            {
                                System.out.println("***********************************************************************");
                                for (int x=0; x<jugadores_Registrados.size();x++)//Muestra todos los jugadores para elegir uno
                                {
                                    System.out.println(x+1+". "+jugadores_Registrados.get(x)); 
                                }
                                System.out.print("Elija una opción: ");
                                jugador=pedir_int("Elija una opción: ");
                                if (jugador>=1&&jugador<=jugadores_Registrados.size())//Comprueba que la opción sea correcta
                                {
                                    jugada=false;
                                    System.out.println("***********************************************************************");
                                    System.out.println("Con cuanto dinero quiere jugar?(Minimo 50)");
                                    System.out.print("Introduzca cantidad: ");
                                    enJuego=pedir_double("Introduzca cantidad: ");//Pide dinero a apostar minimo 50
                                    if (enJuego<50)
                                        enJuego=50;
                                    
                                    //Dejar en dos decimales
                                    intermedio=String.format("%.2f", enJuego);
                                    enJuego=Double.parseDouble(intermedio);
                                    
                                    jugadores_Registrados.get(jugador-1).setSaldo(enJuego);
                                    System.out.println("***********************************************************************");
                                    System.out.println("Extrayendo "+enJuego+"€ de la "+jugadores_Registrados.get(jugador-1).getInformacionBancaria());
                                    partida(jugadores_Registrados.get(jugador-1),enJuego);//Comienza el juego
                                }
                                else
                                {            
                                    System.out.println("***********************************************************************");
                                    System.out.println("Opción incorrecta");                                   
                                }
                            }
                        break;
                        case 2://Jugador Ocasional
                            juego=false;//Hace que vuelva a asairl el comentado como primer menú al terminar la partida
                            jugada=true;//Evita tomar opciones incorrectas
                            while(jugada)
                            {
                                System.out.println("***********************************************************************");
                                for (int x=0; x<jugadores_Ocasionales.size();x++)//Muestra todos los jugadores para elegir uno
                                {
                                    System.out.println(x+1+". "+jugadores_Ocasionales.get(x)); 
                                }
                                System.out.print("Elija una opción:");
                                jugador=pedir_int("Elija una opción:");
                                if (jugador>=1&&jugador<=jugadores_Ocasionales.size())//Comprueba que la opción sea correcta
                                {
                                    jugada=false; 
                                    System.out.println("***********************************************************************");
                                    System.out.println("Con cuanto dinero quiere jugar?(Minimo 50)");
                                    System.out.print("Introduzca cantidad: ");
                                    enJuego=pedir_double("Introduzca cantidad: ");//Pide dinero para apostar minimo 50
                                    if (enJuego<50)
                                        enJuego=50;
                                    
                                    //Dejar en dos decimales
                                    intermedio=String.format("%.2f", enJuego);
                                    enJuego=Double.parseDouble(intermedio);
                                    
                                    jugadores_Ocasionales.get(jugador-1).setSaldo(enJuego);
                                    System.out.println("***********************************************************************");
                                    System.out.println("Extrayendo "+enJuego+"€ de la "+jugadores_Ocasionales.get(jugador-1).getInformacionBancaria());
                                    partida(jugadores_Ocasionales.get(jugador-1),enJuego);//Comienza el juego
                                }
                                else
                                {    
                                    System.out.println("***********************************************************************");
                                    System.out.println("Opción incorrecta");                                    
                                }
                            }
                        break; 
                        default: 
                            System.out.println("***********************************************************************");
                            System.out.println("Opción incorrecta");
                            System.out.println("***********************************************************************");
                        break;
                        }  
                    }
                break; 
                case 3://Reglas de juego                    
                    System.out.println("Reglas de Poker 18:");
                    System.out.println("***********************************************************************");
                    System.out.println("Cada partida se jugará con 50€");
                    System.out.println("El objetivo es aguantar 18 apuestas seguidas sin perder todo el dinero\n"
                            + "para ello en cada ronda habrá una apuesta mínima de 5€ + el contador \n"
                            + "de apuesta en ese momento -10 a partir de la apuesta 10 multiplicado\n"
                            + "por el dinaro en juego entre 50 y en función de las cartas obtenidas\n"
                            + "aleatoriamente se deberá apostar para jugar el mayor posible,si no se\n"
                            + "ha perdido todo el dinero al llegar a la apuesta 18 tiempo se ganará el\n"
                            + "saldo que tenga el jugador en ese momento");
                    System.out.println("***********************************************************************");
                    System.out.print("(pulse intro para continuar)");
                    pedir_str();
                    System.out.println("***********************************************************************");
                break;
                case 4://Permite cerrar de forma segura
                    System.out.println("***********************************************************************");
                    System.out.println("Gracias por jugar; hasta pronto!!!!");
                    System.out.println("***********************************************************************");
                    System.out.print("(Pulse intro para salir)");
                    pedir_str();
                    partida=false;
                    System.out.println("***********************************************************************");
                break;
                default://Evita que se tomen opciones distintas a las dadas                                       
                    System.out.println("Opción incorrecta");
                    System.out.println("***********************************************************************");
                break;
            }
        }
    }
    
    private static void partida(Jugador_Ocasional jugador,double enJuego) throws IOException
    {   
        //Metodo sobrecargado Jugador Ocasional
        int contador=1;
        double apuesta,minimo=5*(enJuego/50);
        String intermedio;      //Usado para el ajuste a dos decimales
        //Dejar en dos decimales
        intermedio=String.format("%.2f", minimo);
        minimo=Double.parseDouble(intermedio);
        
        System.out.println(jugador.toString());
        System.out.println("***********************************************************************");
        
        while(jugador.getSaldo()>0&&contador<=18&&jugador.getSaldo()>minimo)
        {
            //Desarrollo de una partida
            Baraja baraja=new Baraja();
            Carta[] mano=baraja.crearMano();
            System.out.print("Apuesta Nº "+contador+" (apuesta mínima "+ minimo +"€"+"): ");
            apuesta=pedir_double("Apuesta Nº "+contador+" (apuesta mínima "+ minimo +"€"+"): ");
            Apuesta a1=new Apuesta(apuesta, jugador,mano,minimo);
            System.out.println("***********************************************************************");
            System.out.println(a1.verPremio(jugador));
            System.out.println("***********************************************************************");
            contador++;
            //Regula la apuesta minima
            if (contador<=10)
                minimo=5*(enJuego/50);
            else
                minimo=(5+contador-10)*(enJuego/50);
            //Dejar en dos decimales
            intermedio=String.format("%.2f", minimo);
            minimo=Double.parseDouble(intermedio);
        }
        //El juego ha terminado
        if (jugador.getSaldo()>enJuego)
        {
            //Si se ha ganado dinero
            double ganacia=jugador.getSaldo()-enJuego;
            System.out.println("Enhorabuena, has ganado: "+ganacia+"€"); 
            System.out.println("***********************************************************************");
            System.out.println("El juego ha terminado,.");
        }
        else
        {
            //Si se ha perdido
            double perdida=enJuego-jugador.getSaldo();
            System.out.println("El juego ha terminado,.");
            if(jugador.getSaldo()>0)
            {
                System.out.println("No puedes seguir apostando, tienes menos dinero que la apuest mínima");
                System.out.println("Se le devuelven: "+jugador.getSaldo()+"€");
            }  
            else
                System.out.println("Te has quedado sin dinero");
            System.out.println("Has perdido: "+ perdida+"€");            
        }
        System.out.println("Actualizando su información bancaria...\n");
        System.out.println("\t...cargo realizado en "+jugador.getInformacionBancaria());
        System.out.println("***********************************************************************");
    }
    
    private static void partida(Jugador_Registrado jugador,double enJuego) throws IOException 
    { 
        //Metodo sobrecargado Jugador Registrado
        int contador=1;
        double apuesta,minimo=5*(enJuego/50);
        String intermedio;      //Usado para el ajuste a dos decimales
        //Dejar en dos decimales
        intermedio=String.format("%.2f", minimo);
        minimo=Double.parseDouble(intermedio);
        
        System.out.println(jugador.toString());
        System.out.println("***********************************************************************");
        
        while(jugador.getSaldo()>0&&contador<=18&&jugador.getSaldo()>minimo)
        {
            //Desarroll de una partida
            Baraja baraja=new Baraja();
            Carta[] mano=baraja.crearMano(); 
            System.out.print("Apuesta Nº "+contador+" (apuesta mínima "+ minimo +"€"+"): ");
            apuesta=pedir_double("Apuesta Nº "+contador+" (apuesta mínima "+ minimo +"€"+"): ");
            Apuesta a1=new Apuesta(apuesta, jugador,mano,minimo);
            System.out.println("***********************************************************************");
            System.out.println(a1.verPremio(jugador)+"€");
            System.out.println("***********************************************************************");
            contador++;
            //Regula la apuesta minima
            if (contador<=10)
                minimo=5*(enJuego/50);
            else
                minimo=(5+contador-10)*(enJuego/50);
            //Dejar en dos decimales
            intermedio=String.format("%.2f", minimo);
            minimo=Double.parseDouble(intermedio);
        }
        //El juego ha terminado
        if (jugador.getSaldo()>enJuego)
        {
            //Si se ha ganado
            double ganacia=jugador.getSaldo()-enJuego;
            System.out.println("Enhorabuena, has ganado "+ganacia+"€");
            System.out.println("***********************************************************************");        
            System.out.println("El juego ha terminado.");
        }        
        if (jugador.getSaldo()<=enJuego)
        {
            //Si se ha perdido
            double perdida=enJuego-jugador.getSaldo();
            System.out.println("El juego ha terminado.");
            if(jugador.getSaldo()>0)
            {
                System.out.println("No puedes seguir apostando, tienes menos dinero que la apuesta mínima");
                System.out.println("Se le devuelven: "+jugador.getSaldo()+"€");
            }
            else
                System.out.println("Te has quedado sin dinero");
            System.out.println("Has perdido: "+ perdida+"€");            
        }
        System.out.println("Actualizando su información bancaria...\n");
        System.out.println("\t...cargo realizado en "+jugador.getInformacionBancaria());
        System.out.println("***********************************************************************");
    }
    
    private static void registrar(ArrayList<Jugador_Ocasional> jugadores_Ocasionales, ArrayList<Jugador_Registrado> jugadores_Registrados) throws IOException
    {
        //Permite añadir nuevos jugadores
        boolean registrar=true;//Evita tomar una apción incorrecta
        String informacion_bancaria, nombre, dni;
        int registro;
        
        while(registrar)
        {
            System.out.println("Cómo se desea participar?");
            System.out.println("1. Jugador Registrado");
            System.out.println("2. Jugador Ocasional");
            System.out.print("Elija una opción: ");
            registro=pedir_int("Elija una opción: ");
            System.out.println("***********************************************************************");
            switch(registro)
            {
              case 1://Jugadores registrados
                    registrar=false; 
                    System.out.print("Introduzca su nombre: ");
                    nombre=pedir_str();
                    System.out.print("Introduzca su DNI: ");
                    dni=pedir_str();
                    System.out.print("Introduzca su Cuenta Bancaria: ");
                    informacion_bancaria=pedir_str();
                    System.out.println("***********************************************************************");
                    Jugador_Registrado jugador_R = new Jugador_Registrado(informacion_bancaria,dni,nombre);
                    jugadores_Registrados.add(jugador_R);
              break;
              case 2://Jugadores ocasionales
                    registrar=false;
                    System.out.print("Introduzca su nombre: ");
                    nombre=pedir_str();
                    System.out.print("Introduzca su DNI: ");
                    dni=pedir_str();
                    System.out.print("Introduzca su Tarjeta de Crédito: ");
                    informacion_bancaria=pedir_str();
                    System.out.println("***********************************************************************");
                    Jugador_Ocasional jugador_O = new Jugador_Ocasional(informacion_bancaria,dni,nombre);
                    jugadores_Ocasionales.add(jugador_O);
              break;
              default://Evita tomar una apción incorrecta                    
                    System.out.println("Opción incorrecta");
                    System.out.println("***********************************************************************");
              break;
            }
        }
    }
  
    //Tratamiento de excepciones para evitar toma de datos de tipos no compatibles con el pedido
    
    private static double pedir_double(String texto)throws IOException
    {
        BufferedReader input =new BufferedReader(new InputStreamReader(System.in));
        double retorno=0;
        boolean control=true;
        while (control)
        {
            try
            {
               retorno=Double.parseDouble(input.readLine());
               control=false;
            }
            catch(java.lang.NumberFormatException e)
            {
                System.out.println("***********************************************************************");
                System.out.println("Error "+e.toString()+"\nIntroduzca un caracter válido...");
                System.out.println("***********************************************************************");
                System.out.print(texto);
            }
        }
        return retorno;
    }
    
    private static int pedir_int(String texto) throws IOException
    {
        BufferedReader input =new BufferedReader(new InputStreamReader(System.in));
        int retorno=0;
        boolean control=true;
        while (control)
        {
            try
            {
               retorno=Integer.parseInt(input.readLine());
               control=false;
            }
            catch(java.lang.NumberFormatException e)
            {
                System.out.println("***********************************************************************");
                System.out.println("Error "+e.toString()+"\nIntroduzca un caracter válido...");
                System.out.println("***********************************************************************");
                System.out.print(texto);
            }
        }
        return retorno;
    }
    
    private static String pedir_str()throws IOException
    {
        BufferedReader input =new BufferedReader(new InputStreamReader(System.in));
        String retorno;
        
        retorno=input.readLine();

        return retorno;
    }
}
