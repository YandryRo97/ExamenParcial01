
package examenparcial01.modelo;

public class Boleto 
{
    private Asistente asistente;
    private String numAsi;
    private FestivalMusical festival;

    public Boleto(Asistente asistente, String numAsi, FestivalMusical festival) {
        this.asistente = asistente;
        this.numAsi = numAsi;
        this.festival = festival;
    }

    public Asistente getAsistente() {
        return asistente;
    }

    public void setAsistente(Asistente asistente) {
        this.asistente = asistente;
    }

    public String getNumAsi() {
        return numAsi;
    }

    public void setNumAsi(String numAsi) {
        this.numAsi = numAsi;
    }

    public FestivalMusical getFestival() {
        return festival;
    }

    public void setFestival(FestivalMusical festival) {
        this.festival = festival;
    }

    @Override
    public String toString() {
        return "Boleto{" + "asistente=" + asistente + ", numAsi=" + numAsi + ", festival=" + festival + '}';
    }
    
}
