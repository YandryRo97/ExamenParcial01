/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenparcial01.modelo;

/**
 *
 * @author USUARIO
 */
public class Artista extends Persona{
    
    private String tipoMusica;

    public Artista(String tipoMusica, int codigo, String nombre, String fechaNacimiento) {
        super(codigo, nombre, fechaNacimiento);
        this.tipoMusica = tipoMusica;
    }

    public String getTipoMusica() {
        return tipoMusica;
    }

    public void setTipoMusica(String tipoMusica) {
        this.tipoMusica = tipoMusica;
    }

   
 
    
}
