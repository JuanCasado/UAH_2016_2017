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
    private final int[] representante = new int[2];
    private Premio premiox;
    private boolean hasPremio = false;
    
    public boolean hasPremio()
    {
        return hasPremio;
    }
    
    public Premio getPremio()
    {
        return premiox;
    }
    
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
            premiof=premio[0];
            if(cartaMayor(premiof))
                control = 3;  
            else
                control = 4;
            if (representante[0]==representante[1])
                control = 5;
        }

        darTexto(premiof,control);
        
        if (registrado)
            premiof=convertirR(premiof);
        
        if (control==5)
            premiof=1;
               
        switch (control) {
            case 2:
            case 4:
                if(premio[0]-1>=0)
                {
                    premiox = new Premio(apuesta,false,(premio[0]-1));
                    hasPremio=true;
                }
                return (Double)apuesta*premiof;
            case 5:
                return (Double)apuesta*premiof;
            default:
                return (Double)apuesta*premiof*-1;
        }
        
    }
    
    //Dice si la maquina tiene o no la carta mayor
    private boolean cartaMayor(int premio)
    {
        //Buscamos representante
        switch(premio)
        {
            case 0:
                buscaCartaMayor();
                break;
            case 1:
                buscaParejaMayor();
                break;
            case 2:
                buscaDobleParejaMayor();
                break;
            case 3:
                buscaTrioMayor();
                break;
            case 4:
                representante[0]=representante[1]=0;
                break;
            case 5:
                buscaTrioMayor();
                break;
            case 6:
                buscaParejaMayor();
                break;
        }
        
        return representante[0] <= representante[1];
    }
    
    private void buscaCartaMayor()
    {
        for (int x = 0; x< representante.length; x++)
        {
            for (int y =0; y < cartas[x].length; y++)
            {
                if (y==0)
                    representante[x]=cartas[x][y].getPeso();
                else if (representante[x]<cartas[x][y].getPeso())
                    representante[x]=cartas[x][y].getPeso();
            }
        }
    }
    
    private void buscaParejaMayor()
    {
        int temporal = 0;
        for (int x = 0; x< representante.length; x++)
        {
            for (int j = 0; j < cartas[x].length; j++)
            {
                for (int y = j; y < cartas[x].length; y++)
                {
                    if (y==j)
                        temporal=cartas[x][y].getPeso();
                    else if (temporal == cartas[x][y].getPeso())
                        representante[x]=cartas[x][y].getPeso();
                }
            }
        }
        if(representante[0]==representante[1])
        {
            buscaCartaMayor();
        }
    }
    
    private void buscaDobleParejaMayor()
    {
        int temporal = 0;
        int contador =0;
        for (int x = 0; x< representante.length; x++)
        {
            for (int j = 0; j < cartas[x].length; j++)
            {
                for (int y = j; y < cartas[x].length; y++)
                {
                    if (y==j)
                        temporal=cartas[x][y].getPeso();
                    else if (temporal == cartas[x][y].getPeso())
                        if(contador==0)
                        {
                            representante[x]=cartas[x][y].getPeso();
                            contador++;   
                        }
                        else
                            if (temporal>representante[x])
                                representante[x]=cartas[x][y].getPeso();
                }
            }
        }
        if(representante[0]==representante[1])
        {
            buscaCartaMayor();
        }
    }
    
    private void buscaTrioMayor()
    {
        int registro [] = new int[12];
        for (int y = 0; y < 2; y++)
        {
            for (int x =0; x< 12; x++)
            {
                registro[x]=0;
            }
            for (int x = 0; x< 5; x++)
            {
                registro[cartas[y][x].getPeso()-1]++;
            }
            for (int x =0; x< 12; x++)
            {
                if(registro[x]==3)
                    representante[y]=x;
            } 
        }
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
                texto="Por carta mayor Gana la máquina con ";
                break;
            case 4:
                texto="Por carta mayor Ganaste con ";
                break;
            case 5:
                texto="Empate con ";
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
    private boolean esColor( Carta mano[])
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
    
    private boolean esFull(Carta mano [])
    {
        boolean full;
        
        full=esPareja(mano)&&esTrio(mano);
        
        return full;
    }
        
    private boolean esPoker(Carta mano [])
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
        
    private boolean esTrio( Carta mano[])
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
    
    private boolean esDoblePareja(Carta mano [])
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
    
    private boolean esPareja(Carta mano [])
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
