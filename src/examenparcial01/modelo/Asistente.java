
package examenparcial01.modelo;

public class Asistente extends Persona  {
    private String cedula;

    public Asistente(String cedula, int codigo, String nombre, String fechaNacimiento) {
        super(codigo, nombre, fechaNacimiento);
        this.cedula = cedula;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    

    

  

   
    
}
