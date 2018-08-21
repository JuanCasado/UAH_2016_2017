/**
 * @author Juan Casadpo Ballesteros
 */
package PEC1;
public class Apuesta
{
    //Atributos
    static Carta[] mano;
    static double apuesta;
    static Jugador jugador;
    
    //Métodos
    public String verPremio(Jugador_Registrado jugador)
    {
        //Metodo sobrecargado
        String premio=" Ninguno, ";
        String saldo;
        
        if (esColor())
        {
            premio="Color, multiplica la apuesta por 10\n";
            saldo=actualizarSaldo(10);
        }
        else if(esFull())
        {
            premio="Full, multiplica la apuesta por 8\n";
            saldo=actualizarSaldo(8);
        }
        else if(esPoker())
        {
            premio="Poker, multiplica la apuesta por 4\n";
            saldo=actualizarSaldo(4);
        }
        else if(esTrio())
        {
            premio="Trio, devuelve la apuesta\n";
            saldo=actualizarSaldo(1);
        }
        else if(esDoblePareja())
        {
            premio="Doble pareja, pierdes la mitad de la apuesta\n";
            saldo=actualizarSaldo(0.5);
        }
        else if(esPareja())
        {
            premio="Pareja, pierdes tres cuartos de la apuesta\n";
            saldo=actualizarSaldo(0.25);
        }
        else
            saldo=actualizarSaldo(0);
        
        return "Premio:"+premio+saldo;
    }
        
    public String verPremio(Jugador_Ocasional jugador)
    {   
        //Metodo sobrecargado
        String premio="Ninguno\n";
        String saldo;
        
        if (esColor())
        {
            premio="Color, multiplica la apuesta por 5\n";
            saldo=actualizarSaldo(5);
        }
        else if(esFull())
        {
            premio="Full, multiplica la apuesta por 4\n";
            saldo=actualizarSaldo(4);
        }
        else if(esPoker())
        {
            premio="Poker, multiplica la apuesta por 2\n";
            saldo=actualizarSaldo(2);
        }
        else if(esTrio())
        {
            premio="Trio, pierdes un cuarto de la apuesta\n";
            saldo=actualizarSaldo(0.75);
        }
        else if(esDoblePareja())
        {
            premio="Doble pareja, pierdes la mitad de la apuesta\n";
            saldo=actualizarSaldo(0.5);
        }
        else if(esPareja())
        {
            premio="Pareja, tres cuartos de la apuesta\n";
            saldo=actualizarSaldo(0.25);
        }
        else
            saldo=actualizarSaldo(0);
        
        return "Premio:"+premio+saldo+"€";
    }
    
    private String actualizarSaldo(double factor_ganancia)
    {
        //Es llamado por verPremio para realizar los cálculos sobre el saldo
        double ganancia,saldo_inicial=jugador.getSaldo();
        double saldo;
        String intermedio;  //Usado para el ajuste a dos decimales
        
        //Dejar en dos decimales
        intermedio=String.format("%.2f", apuesta);
        apuesta=Double.parseDouble(intermedio);
        
        ganancia=saldo_inicial-apuesta;
        if (factor_ganancia==0)
            saldo=ganancia;
        else
            saldo=ganancia+factor_ganancia*apuesta;
        
        //Dejar en dos decimales
        intermedio=String.format("%.2f", saldo);
        saldo=Double.parseDouble(intermedio);
        jugador.setSaldo(saldo);
        
        if (factor_ganancia==0)
            return "Saldo=("+saldo_inicial+"-"+apuesta+")="+saldo;
        else
            return "Saldo=("+saldo_inicial+"-"+apuesta+")"+"+("+factor_ganancia+"*"+apuesta+")="+saldo;
    }
    
    //Metodos para comprobar cada uno de los premios
    private static boolean esColor()
    {
        boolean color=false;
        
        int contador=0;
        for (int x=1;x<mano.length;x++)
        {
            if (mano[0].getPalo().equals(mano[x].getPalo()))
                contador++;
        }
        if (contador==5)
            
            color=true;
        
        return color;
    }
    
    private static boolean esFull()
    {
        boolean full;
        
        full=esTrio()&&esPareja();

        return full;
    }
        
    private static boolean esPoker()
    {
        boolean poker=false;
        int contador;
        for (Carta mano1 : mano) {
            contador=0;
            for (Carta mano2 : mano) {
                if (mano1.getFigura().equals(mano2.getFigura())) {
                    contador++;
                }
            }
            if (contador==4)
                poker=true;
        }
        return poker;
    }
        
    private static boolean esTrio()
    {
        boolean trio=false;
        int contador;
        for (Carta mano1 : mano) {
            contador=0;
            for (Carta mano2 : mano) {
                if (mano1.getFigura().equals(mano2.getFigura())) {
                    contador++;
                }
            }
            if (contador==3)
                trio=true;
        }
        return trio;
    }
    
    private static boolean esDoblePareja()
    {
        boolean doblePareja=false;
        int pareja=0;
        int contador;
        for (Carta mano1 : mano) {
            contador=0;
            for (Carta mano2 : mano) {
                if (mano1.getFigura().equals(mano2.getFigura())) {
                    contador++;
                }
            }
            if (contador==2)
                pareja++;
            if (pareja==4)
                doblePareja=true;
        }
        return doblePareja;
    }
    
    private static boolean esPareja()
    {
        boolean pareja=false;
        int contador;
        for (Carta mano1 : mano) {
            contador=0;
            for (Carta mano2 : mano) {
                if (mano1.getFigura().equals(mano2.getFigura())) {
                    contador++;
                }
            }
            if (contador==2)
                pareja=true;
        }
        return pareja;
    }
    
    //Constructor
    public Apuesta(double apuesta, Jugador jugador,Carta[] mano, double minimo) {
        //Comprobar que la apuesta está entre la apuest mínima y el saldo del jugador
        //Contador y enJuego se utilizan para calcular la apuesta mínima
        if(apuesta<minimo)
            apuesta=minimo;
        else if(apuesta>jugador.getSaldo())
            apuesta=jugador.getSaldo();
        
        Apuesta.apuesta = apuesta;
        Apuesta.jugador = jugador;
        Apuesta.mano=mano;
    } 
}