
package sistema_de_notas;

public class Alumno {
    private String rut;
    private String nombre;
    private int edad;
    private String fecha;
    private Asignatura asignatura;

    public Alumno(String rut, String nombre, int edad, String fecha) {
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

    public String getFecha() {
        return fecha;
    }

    public Asignatura getAsignatura() {
        return asignatura;
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

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }
}
