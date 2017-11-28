package examenparcial01.modelo;
/**
 *
 * @author Estudiante
 */
public class Orden {
    private int orden;
    private FestivalMusical festivalMusical;
    private Artista artista;

    public Orden(int orden, FestivalMusical festivalMusical, Artista artista) {
        this.orden = orden;
        this.festivalMusical = festivalMusical;
        this.artista = artista;
    }

    public int getOrden() {
        return orden;
    }

    public void setOrden(int orden) {
        this.orden = orden;
    }

    public FestivalMusical getFestivalMusical() {
        return festivalMusical;
    }

    public void setFestivalMusical(FestivalMusical festivalMusical) {
        this.festivalMusical = festivalMusical;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }


}
 
   


   