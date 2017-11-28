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
    private JPanel panelPrincipal;
    private GestionDato gD;
    private Object[][] datos;
    private Object[] encabezado;
    private DefaultTableModel modeloTabla;
    private JTable tabla;
    private JScrollPane scroll;
    
    public VentanaAsistente(GestionDato gD) {
        super("Registrar Aspirante",true,true,true,true);
        this.gD = gD;
        this.setSize(500,650);
        this.iniciaComponentes();
    }
    
    public void iniciaComponentes(){
        this.etiList = new ArrayList<JLabel>();
         this.etiList.add(new JLabel("Codigo"));
        this.etiList.add(new JLabel("Nombre"));
        this.etiList.add(new JLabel("Fecha de nacimiento"));
        this.etiList.add(new JLabel("Cedula"));
        this.txtList = new ArrayList<JTextField>();
        this.txtList.add(new JTextField());
        this.txtList.add(new JTextField());
        this.txtList.add(new JTextField());
        this.txtList.add(new JTextField());
        this.boton = new JButton("Guardar");
        this.boton.addActionListener(new EventoAsistente(this));
        
        LayoutManager disenioPrincipal = new BorderLayout();
        this.panelPrincipal = new JPanel(disenioPrincipal);
        LayoutManager disenioSup = new GridLayout(4,2);
        JPanel panelSup = new JPanel(disenioSup);
        
        for(int i=0;i<4;i++){
            panelSup.add(this.etiList.get(i));
            panelSup.add(this.txtList.get(i));
        }
        this.panelPrincipal.add(panelSup,BorderLayout.NORTH);
        this.panelPrincipal.add(this.boton,BorderLayout.CENTER);
        
        //Tabla
        this.encabezado = new Object[4];
        this.encabezado[0]="Codigo";
        this.encabezado[1]="Nombre";
        this.encabezado[2]="Fecha de nacimiento";
        this.encabezado[3]="Cedula";
        
        this.datos = cargaDatosTabla(this.getgD().getAsistenteList().size(),4);
        this.modeloTabla = new DefaultTableModel(this.datos,this.encabezado);
        this.tabla = new JTable(modeloTabla);
        this.scroll = new JScrollPane(this.tabla);
        
        this.panelPrincipal.add(this.scroll,BorderLayout.SOUTH);
        
        this.add(this.panelPrincipal);
    }
    
    public Object[][] cargaDatosTabla(int h, int w)
    {
        Object[][] retorno= new Object[h][w];
        int i=0;
        for(Asistente a:this.gD.getAsistenteList())
        {
            retorno[i][0]=a.getPersona().getCodigo() + a.getPersona().getNombre()+ a.getPersona().getFechaNacimiento();
            retorno[i][3]=a.getCedula();
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

    public JPanel getPanelPrincipal() {
        return panelPrincipal;
    }

    public void setPanelPrincipal(JPanel panelPrincipal) {
        this.panelPrincipal = panelPrincipal;
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
    
    
}
