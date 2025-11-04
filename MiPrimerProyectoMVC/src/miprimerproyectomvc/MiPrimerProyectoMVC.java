
package miprimerproyectomvc;
import vista.VistaAlumno;
import modelo.Curso;
import controlador.ControladorAlumno;
public class MiPrimerProyectoMVC {

    public static void main(String[] args) {
        VistaAlumno vista = new VistaAlumno();
        Curso curso = new Curso();
        
        ControladorAlumno controlador = new ControladorAlumno(curso, vista);
        
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }
    
}
