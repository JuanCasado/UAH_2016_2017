package classes;

/**
 * @author mr.blissfulgrin
 */
public class Ex extends Exception
{
    
    public static final String BANCO="Campo cuenta bancaria sin rellenar";
    public static final String NIF="Campo NIF sin rellenar";
    public static final String NOMBRE="Campo nombre sin rellenar";
    public static final String APELLIDOS="Campo apellidos sin rellenar";
    public static final String SALDO="Campo saldo sin rellenar";
    public static final String SALDO_INICIAL="El saldo inicial debe ser mayor que 0";
    public static final String DIA="Campo día sin rellenar";
    public static final String MES="Campo mes sin rellenar";
    public static final String ANNO="Campo año sin rellenar";
    public static final String FUTURO="Naciste en el futuro?";
    public static final String MINIMO="Minimo 20$ para jugar";
    public static final String EDAD="Tienes que ser mayor de edad para registrarte";
    public static final String CONTRASENNA="Campo contraseña sin rellenar";
    public static final String CONTRASENNA_REPETIDA="Campo repetir contraseña sin rellenar";
    public static final String CONTRASENNA_DISTINTA="Contraseñas distintas";
    public static final String CONTRASENNA_INSEGURA="Contraseña insegura, demasido corta";
    public static final String NO_REGISTRABLE="NIF ya existente, elija otro";
    /**
     * Error desconocido
     */
    public Ex() 
    {
        super("Error");
    }

    /**
     * Error con mensaje
     * 
     * @param message 
     */
    public Ex(String message) {
        super("Error: "+message);
    }    
}
