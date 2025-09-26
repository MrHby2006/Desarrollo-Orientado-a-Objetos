package scootin;
import java.util.List;
import java.util.ArrayList;
public class Empresa {
    private List<Empleado> listaEmpleados;

    public Empresa() {
        this.listaEmpleados = new ArrayList<>();
    }

    public List<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(List<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }
    
    public void contratar(Empleado emple){
        listaEmpleados.add(emple);
        System.out.print("Empleado contratado con exito\n");
    }
    
    public void mostrarPlanilla(){
        for(Empleado emple : listaEmpleados){
            emple.mostrarDatos();
        }
    }
    
    public void buscarPorNombre(String nombre){
        for(Empleado emple : listaEmpleados){
            if (emple.getNombre().equals(nombre)){
                emple.mostrarDatos();
            }
        }
    }
    
    public void despedir(String rutDespedido){
        for(int i = 0; i < listaEmpleados.size(); i++){
            if (listaEmpleados.get(i).getRut().equals(rutDespedido)){
                listaEmpleados.remove(i);
                System.out.print("Empleado eliminado de la lista\n");
            }
        }
    }
}
