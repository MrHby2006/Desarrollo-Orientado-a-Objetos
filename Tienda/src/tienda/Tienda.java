
package tienda;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Tienda {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcion;
        Electronico elec1 = new Electronico("Samsung", 30, "001", "Celular A20", 700000);
        Electronico elec2 = new Electronico("LG", 24, "002", "Microondas", 600000);
        Ropa prenda1 = new Ropa("M", "Roja", "003", "Camiseta Chile", 54990);
        Ropa prenda2 = new Ropa("L", "Azul", "004", "Camiseta Barcelona", 60990);
        Libro libro1 = new Libro("Toltoi", 600, "005", "Ana Karenina", 26990);
        Libro libro2 = new Libro("Marcela Paz", 90, "006", "Papelucho", 17990);
        
        List<Producto> productosDisponibles = new ArrayList<>();
        
        productosDisponibles.add(elec1);
        productosDisponibles.add(elec2);
        productosDisponibles.add(prenda1);
        productosDisponibles.add(prenda2);
        productosDisponibles.add(libro1);
        productosDisponibles.add(libro2);
        
        do{
            System.out.print("--Menu de la Tienda--\n");
            System.out.print("1.- Mostrar Productos\n");
            System.out.print("2.- Comprar\n");
            System.out.print("3.- ver pedidos Cliente\n");
            System.out.print("4.- Salir\n");
            System.out.print("Ingrese una opcion: ");
            opcion = input.nextInt();
            
            if (opcion == 1){
                for(Producto producto : productosDisponibles){
                    productosDisponibles.mostrarDatos();
                }
            }else if (opcion == 2){
            
            }else if (opcion == 3){
            
            }else{
                System.out.print("Opcion no valida, intentelo nuevamente");
            }
        }while(opcion < 4);
        
        System.out.print("Saliendo...");
    }
    
}
