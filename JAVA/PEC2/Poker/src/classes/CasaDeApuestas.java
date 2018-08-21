package classes;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Iterator;
import screens.ErrorX;
import screens.Warnning;

/**
 *
 * @author mr.blissfulgrin
 */
public class CasaDeApuestas implements Serializable
{
    //Atributos
    private static HashMap<String,JugadorRegistrado> registro = new HashMap<>();
    private static long partidasTotales=0;
    private static double dineroTotal=0;
    private static double dineroRegistrado=0;
    private static double dineroOcasional=0;
    private static double beneficio=0;

    //Metodos
    /**
     * Get the value of dineroTotal
     *
     * @return the value of dineroTotal
     */
    public static double getDineroTotal() {
        return dineroTotal;
    }
    
    /**
     * Añade dinero a la cuenta total y la cuenta de registrado
     * 
     * @param dinero 
     */
    public static void addDinero(Double dinero)
    {
        dineroTotal+=dinero;
        dineroRegistrado+=dinero;
    }
    
    /**
     * Aumenta en 1 las partidas totales
     * 
     */
    public static void addPartida()
    {
        partidasTotales++;
    }
    
    /**
     * Añade dinero a la cuenta total y la cuenta ocasional
     * 
     * @param dinero 
     */
    public static void addDineroOcasional(Double dinero)
    {
        dineroTotal+=dinero;
        dineroOcasional+=dinero;
    }

    /**
     * Get the value of registro
     *
     * @return the value of registro
     */
    public static HashMap getRegistro() {
        return registro;
    }

    /**
     * Set the value of registro
     *
     * @param registro new value of registro
     */
    public static void setRegistro(HashMap registro) {
        CasaDeApuestas.registro = registro;
    }
    
    /**
     * Da de alta un jugador nuevo introduciéndolo en un hash map al que se accede por su NIF
     * 
     * @param jugador JugadorRegistrado
     */
    public static void altaJugador(JugadorRegistrado jugador)
    {   
        if(!(registro.containsKey(jugador.getNIF())))
        {
            dineroTotal+=jugador.getSaldo();
            dineroRegistrado+=jugador.getSaldo();
            registro.put(jugador.getNIF(), jugador);
        }
    }
    
    /**
     * Da de baja el jugador con el NIF introducido
     * 
     * @param NIF String
     */
    public static void bajaJugador(String NIF)
    {
        if(registro.containsKey(NIF))
        {
            JugadorRegistrado jugador;
            jugador = (JugadorRegistrado) registro.get(NIF);
            dineroTotal-=jugador.getSaldo();
            dineroRegistrado-=jugador.getSaldo();
            registro.remove(NIF);
        }
    }
    
    /**
     * Aumenta la cuenta dinero total y beneficio; se corresponde con un movimiento de un JugadorRegistrado durante el juego
     * 
     * @param dinero 
     */
    public static void dineroRegistrado(double dinero)
    {
        dineroTotal+=dinero;
        beneficio+=dinero;
    }
    
    /**
     * Aumenta la cuenta dinero total y beneficio reduciendo la de dinero Ocasional; se corresponde con un movimiento de un JugadorOcasional durante el juego
     * 
     * @param dinero 
     */
    public static void dineroOcasional(double dinero)
    {
        dineroTotal+=dinero;
        dineroOcasional-=dinero;
        beneficio+=dinero;
    }
    
    /**
     * Dice si la contraseña se corresponde o no con el NIF proporcionado
     * 
     * @param NIF
     * @param pass
     * @return boolean
     */
    public static boolean registrado(String NIF, String pass)
    {
        
        if (registro.containsKey(NIF))
            return registro.get(NIF).getContraseña().equals(pass);
        return false;
    }
    
    public static boolean esRegistrable(String NIF)
    {
        return registro.containsKey(NIF);
    }
    
    /**
     * Devuelve el jugador con el NIF proporcionado
     * 
     * @param NIF
     * @return JugadorRegistrado
     */
    public static JugadorRegistrado getregistrado(String NIF)
    {
            return registro.get(NIF);
    }
    
    /** Carga los datos del registro del fichero de seguridad */
    public static void cargarDatos() {
        try 
        {
            //Lectura del registro
            FileInputStream istreamRegistro = new FileInputStream("./src/Guardado/Registro.dat");
            ObjectInputStream oisRegistro = new ObjectInputStream(istreamRegistro);
            registro = (HashMap) oisRegistro.readObject();
            istreamRegistro.close();

            FileInputStream istreamDineroT = new FileInputStream("./src/Guardado/DineroTotal.dat");
            ObjectInputStream oisDineroT = new ObjectInputStream(istreamDineroT);
            dineroTotal = (Double) oisDineroT.readObject();
            istreamDineroT.close();
            
            FileInputStream istreamDineroR = new FileInputStream("./src/Guardado/DineroRegistrado.dat");
            ObjectInputStream oisDineroR = new ObjectInputStream(istreamDineroR);
            dineroRegistrado = (Double) oisDineroR.readObject();
            istreamDineroR.close();
            
            FileInputStream istreamDineroO = new FileInputStream("./src/Guardado/DineroOcasional.dat");
            ObjectInputStream oisDineroO = new ObjectInputStream(istreamDineroO);
            dineroOcasional = (Double) oisDineroO.readObject();
            istreamDineroO.close();
            
            FileInputStream istreamPartidas = new FileInputStream("./src/Guardado/Partidas.dat");
            ObjectInputStream oisPartidas = new ObjectInputStream(istreamPartidas);
            partidasTotales = (Long) oisPartidas.readObject();
            istreamPartidas.close();
            
            FileInputStream istreamBeneficio = new FileInputStream("./src/Guardado/Beneficio.dat");
            ObjectInputStream oisBeneficio = new ObjectInputStream(istreamBeneficio);
            beneficio = (Double) oisBeneficio.readObject();
            istreamBeneficio.close();
        } 
        catch (IOException ioe)
        {
            ErrorX x = new ErrorX();
            x.setTexto("Error de IO al cargar datos");
            x.setVisible(true);
        } 
        catch (ClassNotFoundException cnfe) 
        {
            ErrorX x = new ErrorX();
            x.setTexto("Error al cargar datos; clase no encontrada");
            x.setVisible(true);
        } 
        catch (Exception e) 
        {
            ErrorX x = new ErrorX();
            x.setTexto("Error al cargar datos");
            x.setVisible(true);
        }
    }

    /** Guarda los datos del registro en el fichero de seguridad */
    public static void guardarDatos() {
        try 
        {

            /****** Serialización de los objetos ******/
            //Serialización del registro
            FileOutputStream ostreamRegistro = new FileOutputStream("./src/Guardado/Registro.dat");
            ObjectOutputStream oosRegistro = new ObjectOutputStream(ostreamRegistro);
            oosRegistro.writeObject(registro);
            ostreamRegistro.close();

            FileOutputStream ostreamDineroT = new FileOutputStream("./src/Guardado/DineroTotal.dat");
            ObjectOutputStream oosDineroT = new ObjectOutputStream(ostreamDineroT);
            oosDineroT.writeObject(dineroTotal);
            ostreamDineroT.close();
            
            FileOutputStream ostreamDineroR = new FileOutputStream("./src/Guardado/DineroRegistrado.dat");
            ObjectOutputStream oosDineroR = new ObjectOutputStream(ostreamDineroR);
            oosDineroR.writeObject(dineroRegistrado);
            ostreamDineroR.close();
            
            FileOutputStream ostreamDineroO = new FileOutputStream("./src/Guardado/DineroOcasional.dat");
            ObjectOutputStream oosDineroO = new ObjectOutputStream(ostreamDineroO);
            oosDineroO.writeObject(dineroOcasional);
            ostreamDineroO.close();
            
            FileOutputStream ostreamPartidas = new FileOutputStream("./src/Guardado/Partidas.dat");
            ObjectOutputStream oosPartidas = new ObjectOutputStream(ostreamPartidas);
            oosPartidas.writeObject(partidasTotales);
            ostreamPartidas.close();
            
            FileOutputStream ostreamBeneficio = new FileOutputStream("./src/Guardado/Beneficio.dat");
            ObjectOutputStream oosBeneficio = new ObjectOutputStream(ostreamBeneficio);
            oosBeneficio.writeObject(beneficio);
            ostreamBeneficio.close();

        } 
        catch (IOException ioe) 
        {
            ErrorX x = new ErrorX();
            x.setTexto("Error de IO al guardar datos");
            x.setVisible(true);
        } 
        catch (Exception e) 
        {
            ErrorX x = new ErrorX();
            x.setTexto("Error al guardar datos");
            x.setVisible(true);
        }
    }
    
    /**
     * Almacena la información de un jugador en formato txt cuando se registra
     */
    public static void generarRegistro()
    {
        try (PrintWriter salida = new PrintWriter(new BufferedWriter(new FileWriter("./src/RegistroMaster/Registro.txt")))) {
            DateTimeFormatter formatoCorto = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            Iterator<JugadorRegistrado> i =registro.values().iterator();
            salida.println("------------------------------------ Casa de apuestas -----------------------------------\n");
            salida.println("Dinero Registrado: "+dineroRegistrado+"$");
            salida.println("Dinero Ocasional: "+dineroOcasional+"$");
            salida.println("Beneficio: "+beneficio+"$");
            salida.println("Dinero total: "+dineroTotal+"$");
            salida.println("Partidas totales: "+partidasTotales);
            salida.println("--------------------------------- Registro de Jugadores ---------------------------------\n");
            while(i.hasNext())
            {
                JugadorRegistrado j =i.next();
                String fechaNacimiento = j.getFecha().format(formatoCorto);
                String fechaRegistro = j.getFechaRegistro().format(formatoCorto);
                salida.println("Nombre: "+j.getNombre()+" "+j.getApellidos()+"\tDNI: "+j.getNIF());
                salida.println("Fecha de nacimiento: " + fechaNacimiento+"\tFecha de registro: "+fechaRegistro);
                salida.println("Cuenta bancaria: "+j.getInformacionBancaria()+"\tSaldo: "+j.getSaldo()+"$");
                salida.println("Partidas Jugadas: "+j.getPartidasJugadas());
                salida.println("---------------------------------------------------------------------------------------\n");
            }   
            salida.close();
        } 
        catch (IOException ex) 
        {
            Warnning w = new Warnning();
            w.setTextoW("Error al crear archivo de registro");
            w.setVisible(true);
        }
    }
}
