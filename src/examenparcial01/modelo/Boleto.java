
package examenparcial01.modelo;

public class Boleto 
{
    private Asistente asistente;
    private String asiento;
    private FestivalMusical festival;

    public Boleto(Asistente asistente, String asiento, FestivalMusical festival) {
        this.asistente = asistente;
        this.asiento = asiento;
        this.festival = festival;
    }

    public Asistente getAsistente() {
        return asistente;
    }

    public void setAsistente(Asistente asistente) {
        this.asistente = asistente;
    }

    public String getNumAsi() {
        return asiento;
    }

    public void setNumAsi(String asiento) {
        this.asiento = asiento;
    }

    public FestivalMusical getFestival() {
        return festival;
    }

    public void setFestival(FestivalMusical festival) {
        this.festival = festival;
    }

    @Override
    public String toString() {
        return "Boleto{" + "asistente=" + asistente + ", asiento=" + asiento + ", festival=" + festival + '}';
    }

   
    
}
