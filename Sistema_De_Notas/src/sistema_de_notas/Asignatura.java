
package sistema_de_notas;

public class Asignatura {
    public Asignatura(int cuAsignatura, String nombre, Alumno alumno, Docente docente) {
        this.cuAsignatura = cuAsignatura;
        this.nombre = nombre;
        this.alumno = alumno;
        this.docente = docente;
        this.nota1 = 0;
        this.nota2 = 0;
        this.nota3 = 0;
    }
}
