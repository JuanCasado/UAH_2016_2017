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
public class Empresa {
    private String nombre;
    private String cif;
 
    //constructor
    public Empresa(String nombre, String cif) {
        this.nombre = nombre;
        this.cif = cif;
    }
    public String getCif() {
        return cif;
    }
    public void setCif(String cif) {
        this.cif = cif;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //información textual de la empresa
    @Override
    public String toString() {
        return "Empresa{" + "nombre=" + nombre + ", cif=" + cif + '}';
    } 
}
