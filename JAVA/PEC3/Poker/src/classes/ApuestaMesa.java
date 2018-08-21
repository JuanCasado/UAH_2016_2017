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
public class ApuestaMesa 
{
    //Atributos
    private final Carta[][] cartas=new Carta[4][5];
    private final double apuesta;
    private final int[] representante = new int[4];
    private Premio premiox;
    private boolean hasPremio = false;
    private int ganador;
    private int premio[]={0,0,0,0};
    
    public int getGanador()
    {
        return ganador;
    }
    
    public boolean hasPremio()
    {
        return hasPremio;
    }
    
    public Premio getPremio()
    {
        return premiox;
    }
    
    public String getTexto()
    {
        String texto="Empate";
        switch (premio[ganador])
        {
            case 0:
                texto+="una pareja";
                break;
            case 1:
                texto+="doble pareja";
                break;
            case 2:
                texto+="un trío";
                break;
            case 3:
                texto+="color";
                break;
            case 4:
                texto+="full";
                break;
            case 5:
                texto+="poker";
                break;
        }
        
        return texto;
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
        

        int premiof=0;
        int contador =0;
        int control=0;
        int max=0;
        
        for (Carta[] carta : cartas) 
        {
            if (esPoker(carta))
            {
                premio[contador]=5;
                
            }
            else if(esFull(carta))
            {
                premio[contador]=4;
            }
            else if(esColor(carta))
            {
                premio[contador]=3;
            }
            else if(esTrio(carta))
            {
                premio[contador]=2;
            }
            else if(esDoblePareja(carta))
            {
                premio[contador]=1;
            }
            else if(esPareja(carta))
            {
                premio[contador]=0;
            }
            else
            {
                premio[contador]=-1;
            }
            contador++;
        }
        
        for (int x=0; x<4; x++)
        {
            if(x==0)
                premiof=premio[x];
            else
            {
                if (premio[x]>premiof)
                    premiof=premio[x];
            } 
        }
        if(premiof!=-1)
        {
            for (int x=0; x<4; x++)
            {
                if (premiof==premio[x])
                    control++;
            }

            if (control > 1)
            {
                for (int x=0; x< 4; x++)
                {
                    for(int y =0;y<5;y++)
                    {
                        representante[x]+=cartas[x][y].getPeso();
                    }
                    representante[x] = (representante[x]/5);
                }
                for (int x=0; x< 4; x++)
                {
                    if (x==0)
                        max=representante[x];
                    else
                    {
                        if(max<representante[x])
                        {
                            max=representante[x];
                            ganador=x;
                        }
                    }

                }
                hasPremio = true;
                premiox = new Premio(apuesta,false,(premio[ganador]));
            }
            else
            {
                for(int x=0; x<4; x++)
                {
                    if ((premiof==premio[x]))
                        ganador=x;
                }
                hasPremio = true;
                premiox = new Premio(apuesta,false,(premio[ganador]));
            }

            premiof=convertirR(premiof);
        }
        else
        {
            hasPremio=false;
            premiof=1;
        }
        return (Double)(premiof*apuesta);
        
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
    
    public ApuestaMesa (Carta[] j1, Carta[] j2, Carta[] j3, Carta[] j4, double apuesta)
    {
        cartas[0]=j1;
        cartas[1]=j2;
        cartas[2]=j2;
        cartas[3]=j4;
        this.apuesta=apuesta;
    } 
}
