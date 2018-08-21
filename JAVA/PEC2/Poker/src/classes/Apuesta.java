/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author mr.blissfulgrin
 */
public class Apuesta 
{
    //Atributos
    private final Carta[][] cartas=new Carta[2][5];
    private final double apuesta;
    private final boolean registrado;
    private String texto="";
    
    /**
     * Permite calcular El premio a partir de las cartas del jugador, las de la máquina y 
     * la apuesta que haya sobre la mesa.
     * (En caso de premios idénticos se devolverá empate)
     * 
     * @return Double Premio
     */
    public Double verPremio()
    {
        
        int premio[]={0,0};
        int premiof;
        int contador =0;
        int control;
        
        for (Carta[] carta : cartas) 
        {
            if (esPoker(carta))
            {
                premio[contador]=6;
            }
            else if(esFull(carta))
            {
                premio[contador]=5;
            }
            else if(esColor(carta))
            {
                premio[contador]=4;
            }
            else if(esTrio(carta))
            {
                premio[contador]=3;
            }
            else if(esDoblePareja(carta))
            {
                premio[contador]=2;
            }
            else if(esPareja(carta))
            {
                premio[contador]=1;
            }
            contador++;
        }
        if (premio[1]>premio[0])
        {
            control=1;
            premiof=premio[1];
        }
        else if(premio[0]>premio[1])
        {
            control=2;
            premiof=premio[0];
        }
        else 
        {
            control=3;
            premiof=premio[0];
        }

        darTexto(premiof,control);
        
        if (registrado)
            premiof=convertirR(premiof);
        
        if (premio[0]==premio[1])
        {
            CasaDeApuestas.dineroRegistrado((Double)apuesta*premiof);
            premiof=1;
        }
               
        if (control!=1)
            return (Double)apuesta*premiof;
        else
            return (Double)apuesta*premiof*-1;
    }
    
    //Da texto al premio
    private void darTexto(int premio,int control)
    {
        switch (control) {
            case 2:
                texto="Ganaste con ";
                break;
            case 1:
                texto="Gana la máquina con ";
                break;
            case 3:
                texto="Empate con: ";
                break;
        }     
        
        switch(premio)
        {
            case 0:
                texto+="nada";
                break;
            case 1:
                texto+="una pareja";
                break;
            case 2:
                texto+="doble pareja";
                break;
            case 3:
                texto+="un trío";
                break;
            case 4:
                texto+="color";
                break;
            case 5:
                texto+="full";
                break;
            case 6:
                texto+="poker";
                break;
        }
    }
    
    /**
     * Devuelve un texto en el que se indica quién ha ganado y con qué
     * 
     * @return String TextoPremio
     */
    public String getTexto()
    {
        
        return texto;
    }
    
    
    //conversor Premio-->Factor de ajuste
    private int convertirR (int premio)
    {
        switch(premio)
        {
            case 3:
                premio = 4;
                break;
            case 4:
                premio = 6;
                break;
            case 5:
                premio = 8;
                break;
            case 6:
                premio = 10;
                break;
        }
        return premio;
    }
    
    /*****************************************************
        Metodos para comprobar cada uno de los premios
    *****************************************************/
    private static boolean esColor( Carta mano[])
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
    
    private static boolean esFull(Carta mano [])
    {
        boolean full;
        
        full=esTrio(mano)&&esPareja(mano);

        return full;
    }
        
    private static boolean esPoker(Carta mano [])
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
        
    private static boolean esTrio( Carta mano[])
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
    
    private static boolean esDoblePareja(Carta mano [])
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
    
    private static boolean esPareja(Carta mano [])
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
    
    public Apuesta (Carta[] manoJ, Carta[] manoM, double apuesta,boolean registrado)
    {
        cartas[0]=manoJ;
        cartas[1]=manoM;
        this.apuesta=apuesta;
        this.registrado=registrado;
    } 
}
