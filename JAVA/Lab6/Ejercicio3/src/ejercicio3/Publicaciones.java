/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.Calendar;

/**
 *
 * @author mr.blissfulgrin
 */
public class Publicaciones {
    
    private String autor;

    private String titulo;

    private int fechaDePublicacion;

    public int getFechaDePublicacion() {
        return fechaDePublicacion;
    }

    public void setFechaDePublicacion(int fechaDePublicacion) {
        try 
        {
        if (fechaDePublicacion<0 || fechaDePublicacion>Calendar.YEAR)
            throw new FechaMal();
        this.fechaDePublicacion = fechaDePublicacion;
        }
        catch (FechaMal fm)
        {
            System.out.println(fm.getMessage());
        }
    }

    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Publicaciones(String autor, String titulo, int fechaDePublicacion) {
        this.autor = autor;
        this.titulo = titulo;
        try 
        {
        if (fechaDePublicacion<0 || fechaDePublicacion>Calendar.YEAR)
            throw new FechaMal();
        this.fechaDePublicacion = fechaDePublicacion;
        }
        catch (FechaMal fm)
        {
            System.out.println(fm.getMessage());
        }
    }

}
