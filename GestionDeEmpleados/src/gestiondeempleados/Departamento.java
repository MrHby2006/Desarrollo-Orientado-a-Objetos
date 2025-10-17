
package gestiondeempleados;
import java.util.List;
import java.util.ArrayList;
public class Departamento {
    protected String idDepartamento;
    protected String nombre;
    protected List<Empleado> empleados;

    public Departamento(String idDepartamento, String nombre) {
        this.idDepartamento = idDepartamento;
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }
    
    public void agregarEmpleado(Empleado emple){
        empleados.add(emple);
        System.out.print("Empleado agregado con exito");
    }
    
    public double calcularCostoTotalSalarios(){
        double total = 0;
        for (Empleado emple : empleados){
            total = total + emple.calcularSalario();
        }
        return total;
    }
    
    public void mostrarTodosLosEmpleados(){
        for (Empleado emple : empleados){
            emple.mostrarDatos();
        }
    }
    
    public void buscarPorIdParaSimularBonus(String idBuscado){
        for (Empleado emple : empleados){
            if (emple.getIdEmpleado().equals(idBuscado)){
                System.out.print("Empleado encontrado: ");
                System.out.print("$" + emple.calcularBonus());
            }
        }
    }
}
