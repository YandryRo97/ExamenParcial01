package examenparcial01.controlador;
import examenparcial01.modelo.Asistente;
import examenparcial01.vista.VentanaAsistente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author Estudiante
 */
public class EventoAsistente implements ActionListener {
    private GestionDato gD;
    private VentanaAsistente ventanaAsistente;

    public EventoAsistente(VentanaAsistente ventanaAsistente) {
        this.ventanaAsistente = ventanaAsistente;
    }

    public VentanaAsistente getVentanaAsistente() {
        return ventanaAsistente;
    }

    public void setVentanaAsistente(VentanaAsistente ventanaAsistente) {
        this.ventanaAsistente = ventanaAsistente;
    }

    @Override
   public void actionPerformed(ActionEvent e) 
   {
       if(e.getSource().equals(this.ventanaAsistente.getBoton())){
           
       String ce= this.ventanaAsistente.getTxtList().get(0).getText();
       int co=Integer.parseInt(this.ventanaAsistente.getTxtList().get(1).getText());
       String no= this.ventanaAsistente.getTxtList().get(2).getText();
       String fN= this.ventanaAsistente.getTxtList().get(3).getText();
      
       Asistente a = new Asistente(ce,co,no,fN);
       this.ventanaAsistente.getgD().addAsistente(a);
       
       Object [][] datoAsistente=this.ventanaAsistente.cargaDatosTabla(this.ventanaAsistente.getgD().getAsistenteList().size(),4);
       this.ventanaAsistente.setDatos(datoAsistente);
       this.ventanaAsistente.getModeloTabla().setDataVector(this.ventanaAsistente.getDatos(), this.ventanaAsistente.getEncabezado());
   
       }
       if(e.getActionCommand().equals("Limpiar")){
            this.ventanaAsistente.getTxtList().get(0).setText("");
            this.ventanaAsistente.getTxtList().get(1).setText("");
            this.ventanaAsistente.getTxtList().get(2).setText("");
            this.ventanaAsistente.getTxtList().get(3).setText("");
            
        }
       
       
   }
    
          
        
    
  }

