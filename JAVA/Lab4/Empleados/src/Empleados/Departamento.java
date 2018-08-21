/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empleados;
import java.util.ArrayList;
/**
 *
 * @author mr.blissfulgrin
 */
public class Departamento {
    private String nombre;
    private String id;
    private String localizacion;
    private Empresa empresa;    //asociación
    private final ArrayList<Empleado> empleados; //estructura de datos dinámica para almacenar a los empleados del departamento
 
    //constructor
    public Departamento(String nombre, String id, String localizacion, Empresa empresa) {
        this.nombre = nombre;
        this.id = id;
        this.localizacion = localizacion;
        this.empresa = empresa;
        empleados = new ArrayList<>(); //array vacío para ir añadiendo los empleados
    }
    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }
 
    //alta de un empleado en el departamento
    public void altaEmpleado(Empleado emp) {
        if (!empleados.contains(emp)) {
            empleados.add(emp);
            emp.setDepartamento(this); //el empleado tiene que reflejar el alta
        }
    }
    //baja de un empleado del departamento
    public void bajaEmpleado(Empleado emp) {
        if (empleados.contains(emp)) {
            empleados.remove(emp);
            emp.setDepartamento(null); //el empleado tiene que reflejar la baja
        }
    }
 
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public Empresa getEmpresa() {
        return empresa;
    }
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    public String getLocalizacion() {
        return localizacion;
    }
    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }
    //información textual del departamento
   @Override
    public String toString() {
        return "Departamento{" + "nombre=" + nombre + ", id=" + id + ", localizacion=" + localizacion + '}';
    } 
}
