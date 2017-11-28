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
   public void actionPerformed(ActionEvent e) {
       
            String c = this.ventanaAsistente.getTxtList().get(0).getText().toUpperCase();
            String n = this.ventanaAsistente.getTxtList().get(1).getText().toUpperCase();
            String fn = this.ventanaAsistente.getTxtList().get(2).getText().toUpperCase();
            String ce = this.ventanaAsistente.getTxtList().get(3).getText().toUpperCase();
            
        
            Asistente a = new Asistente(c,n,fn,ce);
            
            boolean bandera=false;
            for(Asistente as:this.ventanaAsistente.getgD().getAsistenteList()){
                if(a.getCedula().equals(as.getCedula())){
                    bandera = true;
                    break;
}
            Object [][] datoAsistente=this.ventanaAsistente.cargaDatosTabla(this.ventanaAsistente.getgD().getAsistenteList().size(),4);
            this.ventanaAsistente.setDatos(datoAsistente);
            this.ventanaAsistente.getModeloTabla().setDataVector(this.ventanaAsistente.getDatos(), this.ventanaAsistente.getEncabezado());
        
    }
   }
  }

