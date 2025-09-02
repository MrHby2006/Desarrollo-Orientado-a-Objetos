
package sistema_de_notas;
import java.util.Date;
public class Alumno {
    private String rut;
    public String nombre;
    public int edad;
    public Date fecha;

    public String getRut() {
        return rut;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
}
