
package sistema_de_notas;
import java.util.Date;
public class Docente {
    private String rut;
    private int nroDocente;
    public String nombre;
    public Date fechaIngreso;
    public String sede;

    public void ponerNotas(){
        
    }
    
    public String getRut() {
        return rut;
    }

    public int getNroDocente() {
        return nroDocente;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public String getSede() {
        return sede;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public void setNroDocente(int nroDocente) {
        this.nroDocente = nroDocente;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }
    
}
