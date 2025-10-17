
package gestiondeempleados;

public abstract class Empleado implements BonusCalculable{
    protected String idEmpleado;
    protected String nombre;
    protected double sueldoBase;

    public Empleado() {
    }

    public Empleado(String idEmpleado, String nombre, double sueldoBase) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.sueldoBase = sueldoBase;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }
    
    public abstract double calcularSalario();
    
    public abstract void mostrarDatos();
}
