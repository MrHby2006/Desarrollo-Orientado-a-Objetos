
package sistema_de_notas;

public class Docente {
    private String rut;
    private int nroDocente;
    private String nombre;
    private String fechaIngreso;
    private String sede;
    private Asignatura asignatura;

    public Docente(String rut, int nroDocente, String nombre, String fechaIngreso, String sede, Asignatura asignatura) {
        this.rut = rut;
        this.nroDocente = nroDocente;
        this.nombre = nombre;
        this.fechaIngreso = fechaIngreso;
        this.sede = sede;
        this.asignatura = asignatura;
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

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public String getSede() {
        return sede;
    }

    public Asignatura getAsignatura() {
        return asignatura;
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

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }


}