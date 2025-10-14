
package gestiondeempleados;

public class EmpleadoAsalariado extends Empleado implements BonusCalculable{

    public EmpleadoAsalariado(String idEmpleado, String nombre, double sueldoBase) {
        super(idEmpleado, nombre, sueldoBase);
    }
    
    @Override
    public double calcularSalario(){
    
    }
    
    @Override
    public double calcularBonus(){
    
    }
}
