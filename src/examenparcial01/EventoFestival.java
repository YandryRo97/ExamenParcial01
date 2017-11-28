
package examenparcial01;

import examenparcial01.modelo.FestivalMusical;
import examenparcial01.vista.VentanaFestival;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventoFestival implements ActionListener {
    private VentanaFestival ventana;

    public EventoFestival(VentanaFestival ventana) {
        this.ventana = ventana;
    }

    public VentanaFestival getVentana() {
        return ventana;
    }

    public void setVentana(VentanaFestival ventana) {
        this.ventana = ventana;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String n = this.ventana.getTxtList().get(0).getText();
        FestivalMusical f = new FestivalMusical(n);
        this.ventana.getgD().addFestivalMusical(f);
        
    }
    
}
