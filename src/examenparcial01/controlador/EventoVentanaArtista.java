/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenparcial01.controlador;

import examenparcial01.modelo.Artista;
import examenparcial01.modelo.Asistente;
import examenparcial01.vista.VentanaArtista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author PC-MATIC
 */
public class EventoVentanaArtista implements ActionListener {
    private VentanaArtista ventanaArtista;

    public EventoVentanaArtista(VentanaArtista ventanaArtista) {
        this.ventanaArtista = ventanaArtista;
    }

    public VentanaArtista getVentanaArtista() {
        return ventanaArtista;
    }

    public void setVentanaArtista(VentanaArtista ventanaArtista) {
        this.ventanaArtista = ventanaArtista;
    }
    @Override
   public void actionPerformed(ActionEvent e) 
   {
       if(e.getSource().equals(this.ventanaArtista.getBoton())){
           
       String tM= this.ventanaArtista.getTxtList().get(0).getText();
       int co=Integer.parseInt(this.ventanaArtista.getTxtList().get(1).getText());
       String no= this.ventanaArtista.getTxtList().get(2).getText();
       String fN= this.ventanaArtista.getTxtList().get(3).getText();
      
       Artista aR = new Artista(tM,co,no,fN);
       this.ventanaArtista.getgD().addArtista(aR);
       
       Object [][] datoAsistente=this.ventanaArtista.cargaDatosTabla(this.ventanaArtista.getgD().getArtistaList().size(),4);
       this.ventanaArtista.setDatos(datoAsistente);
       this.ventanaArtista.getModeloTabla().setDataVector(this.ventanaArtista.getDatos(), this.ventanaArtista.getEncabezado());
   
       }
       if(e.getActionCommand().equals("Limpiar")){
            this.ventanaArtista.getTxtList().get(0).setText("");
            this.ventanaArtista.getTxtList().get(1).setText("");
            this.ventanaArtista.getTxtList().get(2).setText("");
            this.ventanaArtista.getTxtList().get(3).setText("");
            
        }
       
   }
       
    
}
