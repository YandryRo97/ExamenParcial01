/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenparcial01.controlador;

import examenparcial01.vista.VentanaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author USUARIO
 */
public class EventoVentanaPrincipal implements ActionListener{
    
     private VentanaPrincipal vPrincipal;
     private GestionDato gD;

    public EventoVentanaPrincipal(VentanaPrincipal vPrincipal, GestionDato gD) {
        this.vPrincipal = vPrincipal;
        this.gD = gD;
    }

    public VentanaPrincipal getvPrincipal() {
        return vPrincipal;
    }

    public void setvPrincipal(VentanaPrincipal vPrincipal) {
        this.vPrincipal = vPrincipal;
    }

    public GestionDato getgD() {
        return gD;
    }

    public void setgD(GestionDato gD) {
        this.gD = gD;
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
       /*
         if (e.getSource().equals(this.vPrincipal.getMenuItemList().get(2))) {
            VentanaInscripcion vA = new VentanaInscripcion(this.vPrincipal.getgD());
            vA.setVisible(true);
            this.vPrincipal.getEscritorio().add(vA);
        }

        if (e.getSource().equals(this.vPrincipal.getMenuItemList().get(0))) {
            Ventana vU = new Ventana(this.vPrincipal.getgD());
            vU.setVisible(true);
            this.vPrincipal.getEscritorio().add(vU);
        }

        if (e.getSource().equals(this.vPrincipal.getMenuItemList().get(1))) {
            VentanaCarrera vC = new VentanaCarrera(this.vPrincipal.getgD());
            vC.setVisible(true);
            this.vPrincipal.getEscritorio().add(vC);
        }

        if (e.getSource().equals(this.vPrincipal.getMenuItemList().get(3))) {
            VentanaConsultarCarrera vCon = new VentanaConsultarCarrera(this.vPrincipal.getgD());
            vCon.setVisible(true);
            this.vPrincipal.getEscritorio().add(vCon);
        }

        if (e.getSource().equals(this.vPrincipal.getMenuItemList().get(4))) {
            VentanaConsultaAspirantes vConA = new VentanaConsultaAspirantes(this.vPrincipal.getgD());
            vConA.setVisible(true);
            this.vPrincipal.getEscritorio().add(vConA);
        }*/
    }
    
}
