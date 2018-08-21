/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empleados;

/**
 *
 * @author mr.blissfulgrin
 */
public class Persona {
    private final String nif;
    private final String nombre;
    private int edad;
    private String estado;
 
    //constructor
    public Persona(String nif, String nombre, int edad, String estado) {
        this.nif = nif;
        this.nombre = nombre;
        this.edad = edad;
        this.estado = estado;
    }
    public void cumpleaños() {
        edad++;
    }
    public String getNif() {
        return nif;
    }
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    //información textual de la persona
    @Override
    public String toString() {
        return "Persona{" + "nif=" + nif + ", nombre=" + nombre + ", edad=" + edad + ", estado=" + estado + '}';
    }
}
