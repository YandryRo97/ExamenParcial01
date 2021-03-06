package examenparcial01.vista;
import examenparcial01.controlador.EventoAsistente;
import examenparcial01.controlador.GestionDato;
import examenparcial01.modelo.Asistente;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JInternalFrame;

public class VentanaAsistente extends JInternalFrame {
    private List<JLabel> etiList;
    private List<JTextField> txtList;
    private JButton boton;
     private JButton boton2;
    private JPanel panelGuardar;
    private JPanel panelInicial;
    private JPanel panelVer;
    private GestionDato gD;
    private Object[][] datos;
    private Object[] encabezado;
    private DefaultTableModel modeloTabla;
    private JTable tabla;
    private JScrollPane scroll;
    
    public VentanaAsistente(GestionDato gD) {
        super("Registrar Asistente",true,true,true,true);
        this.gD = gD;
        this.setSize(400,300);
        this.iniciaComponentes();
    }
    
    public void iniciaComponentes(){
        this.etiList = new ArrayList<JLabel>();
        this.etiList.add(new JLabel("Cedula"));
        this.etiList.add(new JLabel("Codigo"));
        this.etiList.add(new JLabel("Nombre"));
        this.etiList.add(new JLabel("Fecha de nacimiento"));
        
        this.txtList = new ArrayList<JTextField>();
        this.txtList.add(new JTextField());
        this.txtList.add(new JTextField());
        this.txtList.add(new JTextField());
        this.txtList.add(new JTextField());
        
        this.boton = new JButton("Guardar");
        this.boton2 = new JButton("Limpiar");
        this.boton.addActionListener(new EventoAsistente(this));
        this.boton2.addActionListener(new EventoAsistente(this));
        
        this.encabezado = new Object[4];
        this.encabezado[0]="Cedula";
        this.encabezado[1]="Codigo";
        this.encabezado[2]="Nombre";
        this.encabezado[3]="Fecha de nacimiento";
        
        this.datos = cargaDatosTabla(this.getgD().getArtistaList().size(),4);
        
        this.modeloTabla = new DefaultTableModel(this.datos,this.encabezado);
        this.tabla = new JTable(modeloTabla);
        this.scroll = new JScrollPane(this.tabla);
        
        LayoutManager disenio = new GridLayout(6, 3);
        LayoutManager disenio2 = new GridLayout(3, 2);
	this.panelVer= new JPanel(new BorderLayout());
	this.panelGuardar = new JPanel(disenio);
	this.panelInicial = new JPanel(disenio2);
        
        for(int i=0;i<4;i++){
            this.panelGuardar.add(this.etiList.get(i));
	    this.panelGuardar.add(this.txtList.get(i));
        }
        
        this.panelVer.add(this.scroll, BorderLayout.CENTER);
	this.panelGuardar.add(this.boton);
	this.panelGuardar.add(this.boton2);
	this.panelInicial.add(this.panelGuardar);
	this.panelInicial.add(this.panelVer);
	this.add(this.panelInicial);
        
        
    }
    
    public Object[][] cargaDatosTabla(int h, int w)
    {
        Object[][] retorno= new Object[h][w];
        int i=0;
        for(Asistente a:this.gD.getAsistenteList())
        {
            retorno[i][0]=a.getCedula();
            retorno[i][1]=a.getCodigo();
            retorno[i][2]=a.getNombre();
            retorno[i][3]=a.getFechaNacimiento();
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

    public GestionDato getgD() {
        return gD;
    }

    public void setgD(GestionDato gD) {
        this.gD = gD;
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

    public JButton getBoton2() {
        return boton2;
    }

    public void setBoton2(JButton boton2) {
        this.boton2 = boton2;
    }

    public JPanel getPanelGuardar() {
        return panelGuardar;
    }

    public void setPanelGuardar(JPanel panelGuardar) {
        this.panelGuardar = panelGuardar;
    }

    public JPanel getPanelInicial() {
        return panelInicial;
    }

    public void setPanelInicial(JPanel panelInicial) {
        this.panelInicial = panelInicial;
    }

    public JPanel getPanelVer() {
        return panelVer;
    }

    public void setPanelVer(JPanel panelVer) {
        this.panelVer = panelVer;
    }
    
    
}
