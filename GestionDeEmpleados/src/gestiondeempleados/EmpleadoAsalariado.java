
package gestiondeempleados;

public class EmpleadoAsalariado extends Empleado implements BonusCalculable{

    public EmpleadoAsalariado(String idEmpleado, String nombre, double sueldoBase) {
        super(idEmpleado, nombre, sueldoBase);
    }
    
    @Override
    public double calcularSalario(){
        return sueldoBase;
    }
    
    @Override
    public double calcularBonus(){
        return sueldoBase * 1.12;
    }
    
    @Override
    public void mostrarDatos(){
        System.out.print("\nNombre : "+nombre);
        System.out.print("Id : "+idEmpleado);
        System.out.print("Tipo de empleado : Asalariado");
        System.out.print("Sueldo : $"+calcularSalario()+"\n");
    }
}
