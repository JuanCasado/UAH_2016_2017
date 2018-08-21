/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaempleados;
import Empleados.Departamento;
import Empleados.Empleado;
import Empleados.Empresa;
/**
 *
 * @author mr.blissfulgrin
 */
public class PruebaEmpleados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //1 - creamos la empresa
        Empresa e1 = new Empresa("Indra", "1234567");
        //2 - creamos los departamentos
        Departamento d1 = new Departamento("Informática", "1", "Madrid", e1);
        Departamento d2 = new Departamento("Personal", "2", "Barcelona", e1);
        //3 - creamos los empleados que asignamos a los departamentos
        Empleado emp1 = new Empleado("1234", "Pepe", 25, "soltero", 1500, "programador", d1);
        Empleado emp2 = new Empleado("4567", "Laura", 35, "casada", 2000, "analista", d1);
        Empleado emp3 = new Empleado("5678", "Marta", 40, "casada", 2500, "gerente", d2);
        //modificamos los datos de los empleados
        emp1.cumpleaños();
        emp1.setSueldo(2000);
        System.out.println(emp1.toString());
        emp2.setCategoria("jefe proyecto");
        System.out.println(emp2.toString());
        System.out.println(emp3.toString());
        //imprimimos los elementos del ArrayList
        System.out.println("Empleados departamento: " + d1.getEmpleados().toString());  
        System.out.println("Empleados departamento: " + d2.getEmpleados().toString()); 
    }
    
}
