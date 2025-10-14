
package gestiondeempleados;

public class EmpleadoPorHora extends Empleado implements BonusCalculable{

    public EmpleadoPorHora(String idEmpleado, String nombre, double sueldoBase) {
        super(idEmpleado, nombre, sueldoBase);
    }
    
    @Override
    public double calcularSalario(){
    
    }
    
    @Override
    public double calcularBonus(){
    
    }
}
