/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenparcial01.vista;

import examenparcial01.controlador.GestionDato;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author USUARIO
 */
public class VentanaArtista extends  JInternalFrame{
    
    private List<JLabel> etiquetaList;
    private List<JButton> botonList;
    private List<JTextField> txtList;
    private Object[][] datos;
    private Object[] encabezado;
    private DefaultTableModel modeloTabla;
    private JTable tabla;
    private JScrollPane scroll;
    private GestionDato gD;
    
    
    public VentanaArtista(GestionDato gD) {
        super("Inscribir Artista", true, true, true, true);
        this.setSize(500, 300);
        this.gD = gD;
        iniciaComponente();
    }
    
    public void iniciaComponente(){
        
        this.etiquetaList = new ArrayList<JLabel>();
        this.etiquetaList.add(new JLabel("Tipo de Musica "));
        
        
       
        
    }
    
    
    
    
    
}
