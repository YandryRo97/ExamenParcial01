
package examenparcial01.modelo;

public class Asistente  {
    private Persona persona;
    private String cedula;

    public Asistente(Persona persona, String cedula) {
        this.persona = persona;
        this.cedula = cedula;
    }

    public Asistente(String c, String n, String fn, String ce) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        return "Asistente{" + "persona=" + persona + ", cedula=" + cedula + '}';
    }
    
}
