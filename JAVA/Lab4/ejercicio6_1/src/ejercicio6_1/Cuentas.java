package ejercicio6_1;
import java.time.LocalDate;
import java.util.ArrayList;
/**
 *
 * @author mr.blissfulgrin
 */
public final class Cuentas {
    
    private final String numeroDeCuenta;

    private int saldo;

    private final LocalDate fechaDeApertura;

    private ArrayList<Titular> titulares = new ArrayList<>();

    public ArrayList getTitulares() {
        return titulares;
    }

    public void setTitulares(ArrayList titulares) {
        this.titulares = titulares;
    }

    public void añadirTitulares(Titular titular){
        if (!titulares.contains(titular))
        {        
            this.titulares.add(titular);
            titular.setCuenta(this);
        }
    }
    
    public void eliminarTitular(Titular titular){
        if (titulares.contains(titular))
        {        
            this.titulares.remove(titular);
            titular.setCuenta(null);
        }
    }
    
    public LocalDate getFechaDeApertura() {
        return fechaDeApertura;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    public void retirarDinero(int dinero){
        try
        {
            if(dinero>this.saldo)
                throw new CuentasException(CuentasException.SALDO_INSUFICIENTE);
            this.saldo=this.getSaldo()-dinero;
        }
        catch(CuentasException m)
        {
            System.out.println(m.toString());
        }
    }
    
    public void ingresarDinero(int dinero){
        try
        {
            if(dinero<0)
                throw new CuentasException(CuentasException.CANTIDAD_NEGATIVA);
            this.saldo=this.getSaldo()+dinero;
        }
        catch(CuentasException m)
        {
            System.out.println(m.toString());
        }
    }
    
    public String getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    @Override
    public String toString() {
        return "Cuentas{" + "numeroDeCuenta=" + numeroDeCuenta + ", saldo=" + saldo + ", fechaDeApertura=" + fechaDeApertura + ", titulares=" + titulares + '}';
    }
    
    public Cuentas(String numeroDeCuenta, int saldo, Titular titular) {
        LocalDate now = LocalDate.now();
        this.titulares.add(titular);
        this.numeroDeCuenta = numeroDeCuenta;
        this.saldo = saldo;
        this.fechaDeApertura = now;
        titular.setCuenta(this);
    }

}
