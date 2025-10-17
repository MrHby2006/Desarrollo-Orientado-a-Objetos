
package gestiondeempleados;

import java.util.Scanner;
public class GestionDeEmpleados {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Departamento depa = new Departamento("001", "TI");
        int opcion = 0;
        
        do{
            System.out.print("Menu de gestion de empleados\n");
            System.out.print("1.- Mostrar empleados\n");
            System.out.print("2.- Calcular costo del departamento\n");
            System.out.print("3.- Agregar nuevo empleado\n");
            System.out.print("4.- Simular bonus de empleado\n");
            System.out.print("5.- salir\n");
            System.out.print("Elija una opcion :");
            opcion = input.nextInt();
            
            if (opcion == 1){
                depa.mostrarTodosLosEmpleados();
            }else if (opcion == 2){
                System.out.print("Costo total departamento : $"+depa.calcularCostoTotalSalarios()+"\n");
            }else if (opcion == 3){
                System.out.print("Agregar empleados\n");
                System.out.print("Ingrese si es un empleado por hora(1) o si es un empleado asalariado(2): ");
                int tipoEmpleado = input.nextInt();
                
                if (tipoEmpleado == 1){
                   System.out.print("Empleado por hora\n");
                   System.out.print("Ingrese el nombre: ");
                   String nombre = input.next();
                   System.out.print("Ingrese el ID: ");
                   String id = input.next();
                   System.out.print("Ingrese la cantidad de horas: ");
                   double cantidadHoras = input.nextDouble();
                   System.out.print("Ingrese el valor de hora: ");
                   double valorHora = input.nextDouble();
                   EmpleadoPorHora emple = new EmpleadoPorHora(cantidadHoras, valorHora, id, nombre);
                   depa.agregarEmpleado(emple);
                   System.out.print("Empleado agregado con exito\n");
                }else if (tipoEmpleado == 2){
                   System.out.print("Empleado asalariado\n");
                   System.out.print("Ingrese el nombre: ");
                   String nombre = input.next();
                   System.out.print("Ingrese el ID: ");
                   String id = input.next();
                   System.out.print("Ingrese el sueldo base: ");
                   double sueldoBase = input.nextDouble();
                   EmpleadoAsalariado emple = new EmpleadoAsalariado(id, nombre, sueldoBase);
                   depa.agregarEmpleado(emple);
                   System.out.print("Empleado agregado con exito\n");
                }else{
                   System.out.print("Opcion no valida");
                }
            }else if (opcion == 4){
                System.out.print("Ingresa el id de un empleado: ");
                String id = input.next();
                depa.buscarPorIdParaSimularBonus(id);
            }else if (opcion == 5){
                System.out.print("saliendo del sistema");
            }else{
                System.out.print("Opcion no valida");
            }
        }while (opcion != 5);
    }
    
}
