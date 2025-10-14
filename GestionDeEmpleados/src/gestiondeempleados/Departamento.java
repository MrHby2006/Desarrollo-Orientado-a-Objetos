
package gestiondeempleados;
import java.util.List;
import java.util.ArrayList;
public class Departamento {
    private String idDepartamento;
    private String nombre;
    private List<Empleado> empleados;

    public Departamento(String idDepartamento, String nombre) {
        this.idDepartamento = idDepartamento;
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }
    
    public void agregarEmpleado(Empleado emple){
        empleados.add(emple);
        System.out.print("Empleado agregado con exito");
    }
    
    public double calcularCostoTotalSlarios(){
        double total = 0;
        for (Empleado emple : empleados){
            total = total + emple.calcularSalario();
        }
        return total;
    }
}
