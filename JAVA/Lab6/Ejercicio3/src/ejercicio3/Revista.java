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
public class Revista extends Publicaciones{
    
    private int numero;

    private int volumen;

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Revista(int numero, int volumen, String autor, String titulo, int fechaDePublicacion) {
        super(autor, titulo, fechaDePublicacion);
        this.numero = numero;
        this.volumen = volumen;
    }

}
