package examenparcial01.modelo;
/**
 *
 * @author Estudiante
 */
public class Orden {
    private int orden;
    private Artista artista;
    private FestivalMusical festivalMusical;

    public Orden(int orden, Artista artista, FestivalMusical festivalMusical) {
        this.orden = orden;
        this.artista = artista;
        this.festivalMusical = festivalMusical;
    }

    public int getOrden() {
        return orden;
    }

    public void setOrden(int orden) {
        this.orden = orden;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public FestivalMusical getFestivalMusical() {
        return festivalMusical;
    }

    public void setFestivalMusical(FestivalMusical festivalMusical) {
        this.festivalMusical = festivalMusical;
    }
}
 
    



   