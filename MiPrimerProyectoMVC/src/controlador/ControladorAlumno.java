package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Curso;
import vista.VistaAlumno;
import modelo.Alumno;
public class ControladorAlumno implements ActionListener{
    private Curso curso;
    private VistaAlumno vista;

    public ControladorAlumno(Curso curso, VistaAlumno vista) {
        this.curso = curso;
        this.vista = vista;
        this.vista.getBtnGuardar().addActionListener(this);
        this.vista.getBtnActualizar().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == vista.getBtnGuardar()){
            String nombre = vista.getTxtNombre().getText();
            String carrera = vista.getTxtCarrera().getText();
            int edad = Integer.parseInt(vista.getTxtEdad().getText());
            Alumno alumno = new Alumno(nombre, edad, carrera);
            curso.agregarAlumno(alumno);
        }else if (evento.getSource() == vista.getBtnActualizar()){
            for (Alumno alumno : curso.getListaAlumnos()){
                vista.getModeloTabla().addRow(new Object []{alumno.getNombre(), alumno.getEdad(), alumno.getCarrera()});
            }
        }
    }
}
