/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author mr.blissfulgrin
 */
public class Programador extends InformaticoAbs{
    private String lenguaje;
 
    public Programador(String empresa, String lenguaje) {
        super(empresa);
        this.lenguaje = lenguaje;
    }
 
    public String getLenguaje() {
        return lenguaje;
    }
 
    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }
 
    @Override
    public double pagarSueldo(int horas) {
        return (double) horas * 6;
    }
}
