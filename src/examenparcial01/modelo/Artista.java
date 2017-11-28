
package examenparcial01.modelo;

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
