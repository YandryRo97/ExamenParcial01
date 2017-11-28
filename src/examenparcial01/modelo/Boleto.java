
package examenparcial01.modelo;

public class Boleto 
{
    private Asistente asistente;
    private String asiento;
    private String festivalMusical;

    public Boleto(Asistente asistente, String asiento, String festivalMusical) {
        this.asistente = asistente;
        this.asiento = asiento;
        this.festivalMusical = festivalMusical;
    }

    public Asistente getAsistente() {
        return asistente;
    }

    public void setAsistente(Asistente asistente) {
        this.asistente = asistente;
    }

    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }

    public String getFestivalMusical() {
        return festivalMusical;
    }

    public void setFestivalMusical(String festivalMusical) {
        this.festivalMusical = festivalMusical;
    }

    

   

   
    
}
