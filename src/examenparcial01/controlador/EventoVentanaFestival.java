/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenparcial01.controlador;

import examenparcial01.modelo.FestivalMusical;
import examenparcial01.vista.VentanaFestival;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author USUARIO
 */
public class EventoVentanaFestival implements ActionListener{
        
    private VentanaFestival ventana;
    private GestionDato gD;

    public EventoVentanaFestival(VentanaFestival ventana) {
        this.ventana = ventana;
    }

    public VentanaFestival getVentana() {
        return ventana;
    }

    public void setVentana(VentanaFestival ventana) {
        this.ventana = ventana;
    }

    public GestionDato getgD() {
        return gD;
    }

    public void setgD(GestionDato gD) {
        this.gD = gD;
    }
         
         

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(this.ventana.getBoton())){
            
        String n = this.ventana.getTxtList().get(0).getText();
        FestivalMusical f = new FestivalMusical(n);
        this.ventana.getGestionDato().addFestivalMusical(f);
        
        Object [][] dato=this.ventana.cargaDatosTabla(this.ventana.getGestionDato().getFestivalMusicalList().size(),1);
        this.ventana.setDatos(dato);
        this.ventana.getModeloTabla().setDataVector(this.ventana.getDatos(), this.ventana.getEncabezado());
        this.ventana.getTxtList().get(0).setText("");
        }
    }
    
}
