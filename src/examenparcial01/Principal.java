/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenparcial01;

import examenparcial01.controlador.GestionDato;
import examenparcial01.modelo.Artista;
import examenparcial01.modelo.Asistente;
import examenparcial01.modelo.Boleto;
import examenparcial01.modelo.FestivalMusical;
import examenparcial01.modelo.Orden;
import examenparcial01.vista.VentanaPrincipal;
import java.util.ArrayList;
import java.util.List;

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
        List<FestivalMusical> fM=new ArrayList<FestivalMusical>();
        List<Boleto> bL=new ArrayList<Boleto>();
        List<Artista> aL=new ArrayList<Artista>();
        List<Asistente> asL=new ArrayList<Asistente>();
        List<Orden> oL=new ArrayList<Orden>();
        
        GestionDato gD = new GestionDato(fM,bL,aL,asL,oL);
        
        VentanaPrincipal v = new VentanaPrincipal("Examen Parcial 01", gD);
        v.setVisible(true);
    }
    
}
