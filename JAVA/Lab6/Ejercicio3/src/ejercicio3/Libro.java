/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author mr.blissfulgrin
 */
public class Libro extends Publicaciones{

    private String editorial;

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    
    public Libro(String autor, String titulo, int fechaDePublicacion, String editorial) {
        super(autor, titulo, fechaDePublicacion);
        
        this.editorial = editorial;
    }
}
