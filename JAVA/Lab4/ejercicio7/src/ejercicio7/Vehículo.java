package ejercicio7;
import java.util.ArrayList;
/**
 * @author mr.blissfulgrin
 */
public class Vehículo {
    
    private String matricula;

    private String marca;

    private String modelo;

    private ArrayList<Pieza> piezas;

    public ArrayList<Pieza> getPiezas() {
        return piezas;
    }

    public void setPiezas(ArrayList<Pieza> piezas) {
        this.piezas = piezas;
    }

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

    public Vehículo(String matricula, String marca, String modelo, ArrayList<Pieza> piezas) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.piezas = piezas;
    }
}
