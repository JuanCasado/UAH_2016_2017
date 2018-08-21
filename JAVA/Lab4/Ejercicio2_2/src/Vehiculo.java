/**
 * @author mr.blissfulgrin
 */
public class Vehiculo {
   
    //Atributos
    private String matricula;
    private String marca;
    private String modelo;
    private int velocidad;
    private boolean luces;
    private int marcha;

    
    //Métodos
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
     
    public boolean isLuces() {
        return luces;
    }

    public void setLuces(boolean luces) {
        this.luces = luces;
    }
    
    public int getMarcha() {
        return marcha;
    }

    public void setMarcha(int marcha) {
         
        if (marcha>5)
            this.marcha = 5;
        else if (marcha<0)
            this.marcha = 0;
        else
            this.marcha = marcha;
        
    }

    //Constructor
    public Vehiculo(String matricula, String marca, String modelo, int velocidad,boolean luces, int marcha) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
        this.luces = luces;
        this.setMarcha(marcha);
        
    }
    //Método toString
    @Override
    public String toString() {
       String lucestxt;
       
        if (this.luces) {
            lucestxt = "luces encendidas";
        } else {
            lucestxt = "luces apagadas";
        }
        
        return "Vehiculo{" + "matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo
         + ", velocidad=" + velocidad + ", luces=" + lucestxt +", marcha=" + marcha+ '}';
    }
 
    
}
