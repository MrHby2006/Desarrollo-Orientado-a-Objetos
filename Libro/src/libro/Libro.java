
package libro;
import java.util.Scanner;
public class Libro {

    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        int opcion;
        Libro libro = new Libro();
        do{
        
            System.out.print("Men de gestion de Libros");
            System.out.print("1.- Agregar nuevo Libro");
            System.out.print("2.- Mostrar Libro");
            System.out.print("3.- Salir");
            opcion = input.nextInt();
            
            if (opcion == 1){
                
                System.out.print("Ingrese el nombre del autor: ");
                String nombreAutor = input.next();
                
                System.out.print("Ingrese la nacionalidad del autor: ");
                String nacionalidadAutor = input.next();
                
                Autor autor = new Autor(nombreAutor, nacionalidadAutor);
                
                System.out.print("Ingrese el titulo del libro: ");
                String titulo = input.next();
                
                System.out.print("Ingrese el ISBN del libro: ");
                int isbn = input.nextInt();
                
                System.out.print("Ingrese el año del libro: ");
                int anio = input.nextInt();
                
                libro.setTitulo(titulo);
                libro.setISBN(isbn);
                libro.setAnio(anio);
                libro.setAutor(autor);
                libro.setNacionalidad(nacionalidad);
            
            }else if (opcion == 2){
                
                System.out.print("Titulo : "+ libro.getTitulo());
            }
            
        }while(opcion != 3);
        
        
        
    }
    
}
