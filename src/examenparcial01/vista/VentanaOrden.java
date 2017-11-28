/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenparcial01.vista;

import examenparcial01.controlador.EventoVentanaOrden;
import examenparcial01.controlador.GestionDato;
import examenparcial01.modelo.Artista;
import examenparcial01.modelo.FestivalMusical;
import examenparcial01.modelo.Orden;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionListener;
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
public class VentanaOrden extends JInternalFrame{
    
   private List<JLabel> etiquetaList;
   private List<JTextField> textoList;
   private JButton boton;
   private JPanel panelInicial;
   private JPanel panelGuardar;
   private JPanel panelVer;
   private GestionDato gestionDato;
   private Object[][] datos;
   private Object [] encabezado;
   private DefaultTableModel modeloTabla;
   private JTable tabla;
   private JScrollPane scroll;
   private List<JComboBox> combo; 
   
   public VentanaOrden(GestionDato gestionDato) 
    {
        super("Registrar Orden",true,true,true,true);
        this.setSize(400, 300);
        this.gestionDato = gestionDato;
        this.iniciaComponente();
    }
   
   public void iniciaComponente(){
       
       this.etiquetaList= new ArrayList<JLabel>();
       this.etiquetaList.add(new JLabel("Orden"));
       this.etiquetaList.add(new JLabel("Artista"));
       this.etiquetaList.add(new JLabel("Festival Musical"));
      
       this.textoList= new ArrayList<JTextField>();
       this.textoList.add(new JTextField(15));
       
       this.boton=new JButton("Guardar");
       this.boton.addActionListener(new EventoVentanaOrden(this));
       
       this.encabezado = new Object[3];
       this.encabezado[0] = "Orden";
       this.encabezado[1] = "Artista";
       this.encabezado[2] = "Festival Musical";
       
       this.datos = cargaDatosTabla(this.gestionDato.getBoletoList().size(), 3);
       
       this.combo = new ArrayList<JComboBox>();
       this.combo.add(new JComboBox(this.gestionDato.comboBox2()));
       this.combo.add(new JComboBox(this.gestionDato.comboBox()));

       this.modeloTabla = new DefaultTableModel(this.datos, this.encabezado);
       this.tabla = new JTable(this.modeloTabla);
       this.scroll = new JScrollPane(this.tabla);
        
        LayoutManager disenio = new GridLayout(5, 3);
	LayoutManager disenio2 = new GridLayout(2, 1);
	this.panelVer= new JPanel(new BorderLayout());
	this.panelGuardar = new JPanel(disenio);
	this.panelInicial = new JPanel(disenio2);
        
        this.panelGuardar.add(this.etiquetaList.get(0));
        this.panelGuardar.add(this.textoList.get(0));
        this.panelGuardar.add(this.etiquetaList.get(1));
	this.panelGuardar.add(this.combo.get(1));
        this.panelGuardar.add(this.etiquetaList.get(2));
	this.panelGuardar.add(this.combo.get(0));

        this.panelVer.add(this.scroll, BorderLayout.CENTER);
	this.panelGuardar.add(this.boton);
	this.panelInicial.add(this.panelGuardar);
	this.panelInicial.add(this.panelVer);
	this.add(this.panelInicial);
         
   }
   
   public Object[][] cargaDatosTabla(int h, int w) 
    {
	Object[][] retorno = new Object[h][w];
	int i = 0;
	for (Orden o : this.gestionDato.getOrdenList()) 
        {
            retorno[i][0] = o.getOrden();
            retorno[i][1] = o.getArtista().getNombre();
            retorno[i][2] = o.getFestivalMusical().getNombre();
            i++;
        }
        return retorno;
    }
    
   

    public List<JLabel> getEtiquetaList() {
        return etiquetaList;
    }

    public void setEtiquetaList(List<JLabel> etiquetaList) {
        this.etiquetaList = etiquetaList;
    }

    public List<JTextField> getTextoList() {
        return textoList;
    }

    public void setTextoList(List<JTextField> textoList) {
        this.textoList = textoList;
    }

    public JButton getBoton() {
        return boton;
    }

    public void setBoton(JButton boton) {
        this.boton = boton;
    }

    public JPanel getPanelInicial() {
        return panelInicial;
    }

    public void setPanelInicial(JPanel panelInicial) {
        this.panelInicial = panelInicial;
    }

    public JPanel getPanelGuardar() {
        return panelGuardar;
    }

    public void setPanelGuardar(JPanel panelGuardar) {
        this.panelGuardar = panelGuardar;
    }

    public JPanel getPanelVer() {
        return panelVer;
    }

    public void setPanelVer(JPanel panelVer) {
        this.panelVer = panelVer;
    }

    public GestionDato getGestionDato() {
        return gestionDato;
    }

    public void setGestionDato(GestionDato gestionDato) {
        this.gestionDato = gestionDato;
    }

    public Object[][] getDatos() {
        return datos;
    }

    public void setDatos(Object[][] datos) {
        this.datos = datos;
    }

    public Object[] getEncabezado() {
        return encabezado;
    }

    public void setEncabezado(Object[] encabezado) {
        this.encabezado = encabezado;
    }

    public DefaultTableModel getModeloTabla() {
        return modeloTabla;
    }

    public void setModeloTabla(DefaultTableModel modeloTabla) {
        this.modeloTabla = modeloTabla;
    }

    public JTable getTabla() {
        return tabla;
    }

    public void setTabla(JTable tabla) {
        this.tabla = tabla;
    }

    public JScrollPane getScroll() {
        return scroll;
    }

    public void setScroll(JScrollPane scroll) {
        this.scroll = scroll;
    }

    public List<JComboBox> getCombo() {
        return combo;
    }

    public void setCombo(List<JComboBox> combo) {
        this.combo = combo;
    }

    
   
}
