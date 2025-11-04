
package modelo;
import java.util.ArrayList;
public class Curso {
    private ArrayList<Alumno> listaAlumnos;

    public Curso() {
        listaAlumnos = new ArrayList<>();
    }
    
    public void agregarAlumno(Alumno alumno){
        listaAlumnos.add(alumno);
    }

    public ArrayList<Alumno> getListaAlumnos() {
        return listaAlumnos;
    }
}
