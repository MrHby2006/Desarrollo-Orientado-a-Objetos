
package scootin;

public class Scootin {

    public static void main(String[] args) {
        Empleado emp = new Empleado();
        
        emp.setNombre("Juan");
        emp.setEdad(23);
        emp.getPuesto().setNombre("Lider TI");
    }
}
