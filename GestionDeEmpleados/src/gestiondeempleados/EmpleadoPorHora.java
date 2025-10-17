
package gestiondeempleados;

public class EmpleadoPorHora extends Empleado implements BonusCalculable{
    
    private double cantidadHoras;
    private double valorHora;

    public EmpleadoPorHora(double cantidadHoras, double valorHora, String idEmpleado, String nombre) {
        super(idEmpleado, nombre, 0);
        this.cantidadHoras = cantidadHoras;
        this.valorHora = valorHora;
    }
    
    @Override
    public double calcularSalario(){
        double sueldo = cantidadHoras * valorHora;
        return sueldo;
    }
    
    @Override
    public double calcularBonus(){
        if (cantidadHoras > 35){
            System.out.print("El empleado cumple con las horas minimas para el bono");
            return calcularSalario() * 1.07;
        }else{
            System.out.print("El empleado no cumple con el minimo de horas para el bono");
            return calcularSalario();
        }
    }
    
    @Override
    public void mostrarDatos(){
        System.out.print("\nNombre : "+nombre);
        System.out.print("Id : "+idEmpleado);
        System.out.print("Tipo de empleado : Por Hora");
        System.out.print("Cantidad de horas : "+cantidadHoras);
        System.out.print("Valor hora : "+valorHora);
        System.out.print("Sueldo : $"+calcularSalario()+"\n");
    }
}
