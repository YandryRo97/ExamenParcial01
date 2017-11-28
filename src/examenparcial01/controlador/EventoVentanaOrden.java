/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenparcial01.controlador;

import examenparcial01.modelo.Orden;
import examenparcial01.vista.VentanaOrden;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author USUARIO
 */
public class EventoVentanaOrden implements ActionListener{
    
        private VentanaOrden ventana;
        private GestionDato gD;

    public EventoVentanaOrden(VentanaOrden ventana) {
        this.ventana = ventana;
    }

    

    public VentanaOrden getVentana() {
        return ventana;
    }

    public void setVentana(VentanaOrden ventana) {
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
           
        int ord = Integer.parseInt(this.ventana.getTextoList().get(0).getText());
        String f= this.ventana.getCombo().get(2).getSelectedItem().toString();
        String ar=this.ventana.getCombo().get(1).getSelectedItem().toString();
        
        
        Orden or = new Orden(ord,this.ventana.getGestionDato().buscarFestival(f),this.ventana.getGestionDato().buscarArtista(ar));
        this.ventana.getGestionDato().addOrden(or);
        
        Object [][] datoOrden=this.ventana.cargaDatosTabla(this.ventana.getGestionDato().getOrdenList().size(),3);
	this.ventana.setDatos(datoOrden);
        this.ventana.getModeloTabla().setDataVector(this.ventana.getDatos(), this.ventana.getEncabezado());
            
        }
         
    }
    
}
