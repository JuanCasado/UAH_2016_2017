/**
 * @author mr.blissfulgrin
 */
public class Lampara {
    
    //Atributos
    private int intensidad;
    private boolean encendida;
    
    //Metodos
    public int getIntensidad() {
        return intensidad;
    }

    public void setIntensidad(int intensidad) {
        if(intensidad>100)
            intensidad=100;
        else if (intensidad<0)
            intensidad=0;
        //Ajustamos el encendido
        if (intensidad>0)
            this.encendida=true;
        else
            this.encendida=false;
        
        this.intensidad = intensidad;
    }
    public void setIntesidad(double voltaje){
        if (voltaje<1.5){
            voltaje=1.5;
        }
        else if (voltaje>12.5)
            voltaje=12.5;
        //Ajustamos el encendido
        if(voltaje>1.5)
            this.encendida=true;
        else
            this.encendida=false;
        
        this.intensidad=(int) ((voltaje-1.5)*100/11);
    }
    
    public boolean isEncendida() {
        return encendida;
    }

    public void setEncendida(boolean encendida) {
        if(encendida&this.intensidad==0)
            this.intensidad=1;
        if (!encendida)
            this.intensidad=0;
        this.encendida = encendida;
    }

    @Override
    public String toString() {
        String estado;
        if (encendida)
            estado="ON";
        else
            estado="OFF";
        
        return "Luz: "+estado+" \t Intensidad: "+intensidad;
    }

    public Lampara() {
        this.intensidad = 0;
        this.encendida = false;
    }
    
    
}
