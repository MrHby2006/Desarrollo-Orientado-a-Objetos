
package sistema_de_notas;

public class Asignatura {
    private String codigo;
    private String nombre;
    private Docente docente;
    private double nota1;
    private double nota2;
    private double nota3;

    public Asignatura(String codigo, String nombre, Docente docente) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.docente = docente;
    }

    public double getPromedio(){
        double promedio = (nota1 + nota2 + nota3)/3;
        return promedio;
    }
    
    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
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

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

}
