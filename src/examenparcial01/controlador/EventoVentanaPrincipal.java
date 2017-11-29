/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenparcial01.controlador;

import examenparcial01.vista.VentanaArtista;
import examenparcial01.vista.VentanaAsistente;
import examenparcial01.vista.VentanaBoleto;
import examenparcial01.vista.VentanaFestival;
import examenparcial01.vista.VentanaOrden;
import examenparcial01.vista.VentanaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author USUARIO
 */
public class EventoVentanaPrincipal implements ActionListener{
    
     private VentanaPrincipal vPrincipal;

    public EventoVentanaPrincipal(VentanaPrincipal vPrincipal) {
        this.vPrincipal = vPrincipal;
    }

    public VentanaPrincipal getvPrincipal() {
        return vPrincipal;
    }

    public void setvPrincipal(VentanaPrincipal vPrincipal) {
        this.vPrincipal = vPrincipal;
    }
     

    @Override
    public void actionPerformed(ActionEvent e) 
    {
         if(e.getSource().equals(this.vPrincipal.getMenuItemList().get(0)))
        {
            VentanaArtista vAr= new VentanaArtista(this.vPrincipal.getgD());
            vAr.setVisible(true);
            this.vPrincipal.getEscritorio().add(vAr);
        }
         
         if(e.getSource().equals(this.vPrincipal.getMenuItemList().get(1)))
        {
            VentanaAsistente vA= new VentanaAsistente(this.vPrincipal.getgD());
            vA.setVisible(true);
            this.vPrincipal.getEscritorio().add(vA);
        }
         
         if(e.getSource().equals(this.vPrincipal.getMenuItemList().get(2)))
        {
            VentanaBoleto vB= new VentanaBoleto(this.vPrincipal.getgD());
            vB.setVisible(true);
            this.vPrincipal.getEscritorio().add(vB);
        }
         
          if(e.getSource().equals(this.vPrincipal.getMenuItemList().get(3)))
        {
            VentanaFestival vF= new VentanaFestival(this.vPrincipal.getgD());
            vF.setVisible(true);
            this.vPrincipal.getEscritorio().add(vF);
        }
          
          if(e.getSource().equals(this.vPrincipal.getMenuItemList().get(4)))
        {
            VentanaOrden vO= new VentanaOrden(this.vPrincipal.getgD());
            vO.setVisible(true);
            this.vPrincipal.getEscritorio().add(vO);
        }

        
    }
    
}
