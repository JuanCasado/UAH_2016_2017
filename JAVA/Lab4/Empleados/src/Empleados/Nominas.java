package Empleados;
import java.time.LocalDate;
/**
 * @author mr.blissfulgrin
 */
public class Nominas {
  
    //Atributos
    private Empresa empresa;
    
    private Departamento departamento;

    private double salarioBruto;
    
    private double retencion;

    private double salarioNeto;

    private Empleado empleado;
    
    private LocalDate fecha;

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public double getSalarioNeto() {
        return salarioNeto;
    }

    public double getRetencion() {
        return retencion;
    }

    public void setRetencion(double retencion) {
        this.retencion = retencion;
        this.salarioNeto=this.salarioBruto-retencion;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
        this.salarioNeto=this.salarioBruto-retencion;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    
    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return "Nominas{" + "empresa=" + empresa + ", departamento=" + departamento + ", salarioBruto=" + salarioBruto + ", retencion=" + retencion + ", salarioNeto=" + salarioNeto + ", empleado=" + empleado + ", fecha=" + fecha + '}';
    }
    
    //Constructor

    public Nominas(double retencion, Empleado empleado) {
        this.empresa = empleado.getDepartamento().getEmpresa();
        this.departamento = empleado.getDepartamento();
        this.retencion = retencion;
        this.empleado = empleado;
        this.salarioBruto = empleado.getSueldo();
        LocalDate now = LocalDate.now();
        this.fecha=now;
        this.salarioNeto=this.salarioBruto-retencion;
    }
    
}
