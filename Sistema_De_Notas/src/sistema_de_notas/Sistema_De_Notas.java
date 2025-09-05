package sistema_de_notas;

public class Sistema_De_Notas {

    public static void main(String[] args) {

        Docente docente = new Docente("22345666-1", 45, "Bastian", "14/09/22", "Plaza Norte", asignatura);
        
        Asignatura asignatura = new Asignatura("MDY3131", "POO", docente);
        
        Alumno alumno = new Alumno("22213898-1", "Juan Carlos", 22, "02/02/22");
        
        System.out.print("El ptrofesor de"+ alumno.getNombre());
        System.out.print("es: "+alumno.getAsignatura().getDocente().getNombre());
        System.out.print("El promedio de notas del alumno es "+alumno.getAsignatura().getPromedio());
    }
    
}