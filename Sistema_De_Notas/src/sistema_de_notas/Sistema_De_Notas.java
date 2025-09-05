package sistema_de_notas;
import java.util.Scanner;
public class Sistema_De_Notas {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcion1;
        
        do{
            System.out.print("--Sistema de notas--");
            System.out.print("1.- Ingresar como alumno");
            System.out.print("2.- Ingresar como docente");
            System.out.print("3.- Salir");
            opcion1 = input.nextInt();
            
            if (opcion1 ==1){
                System.out.print("Ingrese su nombre: ");
                String nombre = input.next();
                
                System.out.print("Ingrese su rut: ");
                String rut = input.next();
                
                Alumno alumno = new Alumno(nombre, rut);
                
            }
        }while(opcion1 < 3);
        
    }
    
}
