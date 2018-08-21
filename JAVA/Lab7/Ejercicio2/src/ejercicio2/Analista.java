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
public class Analista extends InformaticoAbs{
    private String especialidad;
 
    public Analista(String empresa, String especialidad) {
        super(empresa);
        this.especialidad = especialidad;
    }
 
    public String getEspecialidad() {
        return especialidad;
    }
 
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
   
    @Override
    public double pagarSueldo(int horas) {
        return (double) horas * 12;
    }
}
