/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenparcial01;

import examenparcial01.controlador.GestionDato;
import examenparcial01.vista.Ventana;

/**
 *
 * @author Estudiante
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GestionDato gD = new GestionDato();
        
        Ventana v = new Ventana("Examen Parcial 01", gD);
    }
    
}
