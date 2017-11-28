/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenparcial01.controlador;

import examenparcial01.vista.VentanaAsistente;
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
         if(e.getSource().equals(this.vPrincipal.getMenuItemList().get(1)))
        {
            VentanaAsistente vA= new VentanaAsistente(this.vPrincipal.getgD());
            vA.setVisible(true);
            this.vPrincipal.getEscritorio().add(vA);
        }

        
    }
    
}
