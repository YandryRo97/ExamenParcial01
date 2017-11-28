
package examenparcial01.vista;


import examenparcial01.EventoFestival;
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
    private JPanel panelPrincipal;  //Dara el formato de la ventana
    private final GestionDato gD;
    private Object[][] datos;   //Matriz donde los datos seran mostrados
    private Object[] encabezado;    //Vector que dara a conocer el tipo de dato
    private DefaultTableModel modeloTabla;
    private JTable tabla;
    
    public VentanaFestival(GestionDato gD) {
        super("Ventana Festival");
        this.gD = gD;
        this.setSize(800, 600);
        this.iniciaComponentes();
        this.setDefaultCloseOperation(3);
        this.setVisible(true);
    }

    private void iniciaComponentes() {
         this.etiList = new ArrayList<JLabel>();     //Vector de etiquetas
        this.etiList.add(new JLabel("Nombre del Festival: "));
        this.txtList = new ArrayList<JTextField>();     //Vector de textos
        this.txtList.add(new JTextField());
        this.boton = new JButton("Guardar");        //Boton para el guardado de datos
        LayoutManager disenioPrincipal = new BorderLayout();    //Formato de la ventana
        this.panelPrincipal = new JPanel(disenioPrincipal);     //Formato de las etiquetas y textos de la ventana
        LayoutManager disenioSup = new GridLayout(2,2);
        JPanel panelSup = new JPanel(disenioSup);
        panelSup.add(this.etiList.get(0)); 
        panelSup.add(this.txtList.get(0));
        panelSup.add(this.boton);
        this.panelPrincipal.add(panelSup,BorderLayout.NORTH);
        this.encabezado = new Object[1];    //Dar valores al encabezado de la tabla
        this.encabezado[0]="Festival";
        this.datos = cargaDatosTabla(this.getgD().getFestivalList().size(),1);   //Tamaño de la tabla 
        this.modeloTabla = new DefaultTableModel(this.datos,this.encabezado);
        this.tabla = new JTable(modeloTabla);
        this.boton.addActionListener(new EventoFestival(this));   //Llamado al metodo
        this.add(this.panelPrincipal);
    }
    
    public Object[][] cargaDatosTabla(int h, int w){    //Metodo para el llenado de datos
        Object[][] retorno= new Object[h][w];
        int i=0;
        for(FestivalMusical f:this.gD.getFestivalList()){    //Recorrido por la matriz de datos
            retorno[i][0]=f.getNombre();
            i++;
        }        
        return retorno;
    }
}
