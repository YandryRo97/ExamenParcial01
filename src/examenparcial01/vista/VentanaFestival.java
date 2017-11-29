
package examenparcial01.vista;



import examenparcial01.controlador.EventoVentanaFestival;
import examenparcial01.controlador.GestionDato;
import examenparcial01.modelo.FestivalMusical;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class VentanaFestival  extends JFrame{
    
    //Declaramos los atributos a utilzar
    private List<JLabel> etiList;   //Etiquetas o textos ya determinados
    private List<JTextField> txtList;   //Formato para el ingreso de datos por el usuario
    private JButton boton;      //Atributo que dara origen a un evento
    private JPanel panelInicial;  //Dara el formato de la ventana
    private JPanel panelGuardar;
    private JPanel panelVer;
    private GestionDato gestionDato;
    private Object[][] datos;   //Matriz donde los datos seran mostrados
    private Object[] encabezado;    //Vector que dara a conocer el tipo de dato
    private DefaultTableModel modeloTabla;
    private JTable tabla;
    private JScrollPane scroll;
    private JComboBox combo;
    
    public VentanaFestival(GestionDato gD) {
        super("Registrar Festival Musical");
        this.setSize(400, 300);
        this.gestionDato = gD;
        this.iniciaComponentes();
    }

    private void iniciaComponentes() {
        
        this.etiList = new ArrayList<JLabel>();     //Vector de etiquetas
        this.etiList.add(new JLabel("Nombre del Festival: "));
        
        this.txtList = new ArrayList<JTextField>();     //Vector de textos
        this.txtList.add(new JTextField());
        
        this.boton = new JButton("Guardar"); //Boton para el guardado de datos
        this.boton.addActionListener(new EventoVentanaFestival(this));   //Llamado al metodo
        
        this.encabezado = new Object[1];    //Dar valores al encabezado de la tabla
        this.encabezado[0]="Festival";
        
        this.datos = cargaDatosTabla(this.gestionDato.getFestivalMusicalList().size(), 1);//Tamaño de la tabla 
         
        this.modeloTabla = new DefaultTableModel(this.datos,this.encabezado);
        this.tabla = new JTable(modeloTabla);
        this.scroll = new JScrollPane(this.tabla);
        
        LayoutManager disenio = new GridLayout(3, 2);
        LayoutManager disenio2 = new GridLayout(2, 1);
	this.panelVer= new JPanel(new BorderLayout());
	this.panelGuardar = new JPanel(disenio);
	this.panelInicial = new JPanel(disenio2);
        
        this.panelGuardar.add(this.etiList.get(0));
        this.panelGuardar.add(this.txtList.get(0));
        
        this.panelVer.add(this.scroll, BorderLayout.CENTER);
	this.panelGuardar.add(this.boton);
	this.panelInicial.add(this.panelGuardar);
	this.panelInicial.add(this.panelVer);
	this.add(this.panelInicial);
    }
    
    public Object[][] cargaDatosTabla(int h, int w){    //Metodo para el llenado de datos
        Object[][] retorno= new Object[h][w];
        int i=0;
        for(FestivalMusical f:this.gestionDato.getFestivalMusicalList()){    //Recorrido por la matriz de datos
            retorno[i][0]=f.getNombre();
            i++;
        }        
        return retorno;
    }

    public List<JLabel> getEtiList() {
        return etiList;
    }

    public void setEtiList(List<JLabel> etiList) {
        this.etiList = etiList;
    }

    public List<JTextField> getTxtList() {
        return txtList;
    }

    public void setTxtList(List<JTextField> txtList) {
        this.txtList = txtList;
    }

    public JButton getBoton() {
        return boton;
    }

    public void setBoton(JButton boton) {
        this.boton = boton;
    }

    public JComboBox getCombo() {
        return combo;
    }

    public void setCombo(JComboBox combo) {
        this.combo = combo;
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

    public JScrollPane getScroll() {
        return scroll;
    }

    public void setScroll(JScrollPane scroll) {
        this.scroll = scroll;
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
    
}
