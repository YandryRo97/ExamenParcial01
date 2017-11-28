/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenparcial01.controlador;

import examenparcial01.modelo.Boleto;
import examenparcial01.vista.VentanaBoleto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author PC-MATIC
 */
public class EventoVentanaBoleto implements ActionListener
{
    private VentanaBoleto ventanaBoleto;

    public EventoVentanaBoleto(VentanaBoleto ventanaBoleto) {
        this.ventanaBoleto = ventanaBoleto;
    }

    public VentanaBoleto getVentanaBoleto() {
        return ventanaBoleto;
    }

    public void setVentanaBoleto(VentanaBoleto ventanaBoleto) {
        this.ventanaBoleto = ventanaBoleto;
    }
    
     @Override
    public void actionPerformed(ActionEvent e) {
        String a=this.ventanaBoleto.getCombo().getSelectedItem().toString();
        String n=this.ventanaBoleto.getTextoList().get(0).getText();
        String f=this.ventanaBoleto.getTextoList().get(1).getText();
        
        Boleto b = new Boleto(this.ventanaBoleto.getGestionDato().bucarAsistente(a),n,f);
        this.ventanaBoleto.getGestionDato().addBoleto(b);
        Object [][] datoUniversidad=this.ventanaBoleto.cargaDatosTabla(this.ventanaBoleto.getGestionDato().getBoletoList().size(),3);
	this.ventanaBoleto.setDatos(datoUniversidad);
        this.ventanaBoleto.getModeloTabla().setDataVector(this.ventanaBoleto.getDatos(), this.ventanaBoleto.getEncabezado());
    }
    
}
