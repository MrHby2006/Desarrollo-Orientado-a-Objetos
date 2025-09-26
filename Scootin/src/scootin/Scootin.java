
package scootin;
import java.util.Scanner;
public class Scootin {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Empresa empre = new Empresa();
        int opcion;
        
        do{
            System.out.print("Menu\n");
            System.out.print("1.- Contratar empleado\n");
            System.out.print("2.- Mostrar planilla empleados\n");
            System.out.print("3.- Buscar empleado por nombre\n");
            System.out.print("4.- Despedir empleado\n");
            System.out.print("5.- salir\n");
            System.out.print("Elija una opcion: ");
            opcion = input.nextInt();
            
            if (opcion == 1){
                System.out.print("Contratar empleado\n");
                System.out.print("Ingrese el rut del empleado: ");
                String rut = input.next();
                System.out.print("Ingrese el nombre del empleado: ");
                String nombre = input.next();
                System.out.print("Ingrese el genero del empleado: ");
                String genero = input.next();
                System.out.print("Ingrese los años de servicio del empleado: ");
                int anioServicio = input.nextInt();
                System.out.print("Ingrese la edad del empleado: ");
                int edad = input.nextInt();
                System.out.print("Ingrese el codigo de puesto del empleado: ");
                String codigo = input.next();
                System.out.print("Ingrese el nombre del pueso del empleado: ");
                String nombrePuesto = input.next();
                Puesto puesto = new Puesto(codigo, nombrePuesto);
                
                Empleado emple = new Empleado(rut, nombre, genero, anioServicio, edad, puesto);
                
                empre.contratar(emple);
                
            }else if (opcion == 2){
                System.out.print("Planilla de empleados\n");
                empre.mostrarPlanilla();
            }else if (opcion == 3){
                System.out.print("Ingrese el nombre del empleado: ");
                String nombre = input.next();
                empre.buscarPorNombre(nombre);
            }else if (opcion == 4){
                System.out.print("Ingrese el rut del empleado a despedir: ");
                String rut = input.next();
                empre.despedir(rut);
            }else if (opcion == 5){
                System.out.print("saliendo del sistema\n");
            }else{
                System.out.print("Ingrese una opcion valida\n");
            }
            
        }while (opcion != 5);
    }
}
