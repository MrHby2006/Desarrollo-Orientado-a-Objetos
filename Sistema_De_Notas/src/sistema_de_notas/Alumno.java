
package sistema_de_notas;
import java.util.Date;
public class Alumno {
    private String rut;
    private String nombre;
    private int edad;
    private Date fecha;
    
    public Alumno(String rut, String nombre, int edad, Date fecha){
        this.rut = rut;
        this.nombre = nombre;
        this.edad = edad;
        this.fecha = fecha;
    }

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
