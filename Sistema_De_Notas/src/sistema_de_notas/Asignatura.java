
package sistema_de_notas;

public class Asignatura {
    private int cuAsignatura;
    public String nombre;
    public Alumno alumno;
    public Docente docente;
    private double nota1;
    private double nota2;
    private double nota3;
    private double promedio;

    public void setPromedio(double promedio) {
        this.promedio = 0;
    }

    public double getPromedio() {
        return promedio;
    }

    public void mostrarNotas(){
        promedio = (nota1 + nota2 + nota3)/3;
    }
    
    public int getCuAsignatura() {
        return cuAsignatura;
    }

    public String getNombre() {
        return nombre;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public Docente getDocente() {
        return docente;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setCuAsignatura(int cuAsignatura) {
        this.cuAsignatura = cuAsignatura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public void setNota1(double nota1) {
        this.nota1 = 0;
    }

    public void setNota2(double nota2) {
        this.nota2 = 0;
    }

    public void setNota3(double nota3) {
        this.nota3 = 0;
    }
    
}
