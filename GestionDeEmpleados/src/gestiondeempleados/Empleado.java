
package gestiondeempleados;

public abstract class Empleado {
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
    
    public abstract double calcularSalario();
}
