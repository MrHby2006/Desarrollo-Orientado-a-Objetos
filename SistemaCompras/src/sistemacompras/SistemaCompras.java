package sistemacompras;
import java.util.Scanner;
public class SistemaCompras {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Producto producto1 = new Producto(1, "Coca Cola 2L", 2000);
        Producto producto2 = new Producto(2, "Papas Lays", 3600);
        Producto producto3 = new Producto(3, "Monster Ultra White", 1600);
        Producto producto4 = new Producto(4, "Gomitas acidas Loops", 700);
        int opcion1, opcion2, opcion3;
        
        do{
            System.out.print("--BIENVENIDO A LA BOTILLERIA--");
            System.out.print("1.- Ingresar Cliente");
            System.out.print("2.- Salir");
            opcion1 = input.nextInt();
            
            if (opcion1 == 1){
                System.out.print("Ingrese el id del Cliente");
                String id = input.next();
                
                System.out.print("Ingrese el nombre del Cliente");
                String nombre = input.next();
                
                Cliente cliente = new Cliente(id, nombre);
                
                do{
                    System.out.print("MENU:");
                    System.out.print("1.- Ver productos"); //Ver carrito
                    System.out.print("2.- Ver carrito");
                    System.out.print("3.- Finalizar compra");
                    System.out.print("4.- Salir");
                    opcion2 = input.nextInt();
                    
                    if (opcion2 == 1){
                        do{
                            System.out.print("\nPRODUCTOS DISPONIBLES");
                            producto1.mostrarPorducto();
                            producto2.mostrarPorducto();
                            producto3.mostrarPorducto();
                            producto4.mostrarPorducto();
                            System.out.print("5.- Salir");
                            System.out.print("Seleccione los producots para agregar al carrito");
                            opcion3 = input.nextInt();
                            
                            if (opcion3 == 1){
                                cliente.agregarProducto(producto1);
                            }else if (opcion3 == 2){
                                cliente.agregarProducto(producto2);
                            }else if (opcion3 == 3){
                                cliente.agregarProducto(producto3);
                            }else if (opcion3 == 4){
                                cliente.agregarProducto(producto4);
                            }else if (opcion3 == 5){
                                System.out.print("Saliendo");
                            }else{
                                System.out.print("Opcion no valida");
                            }
                        }while(opcion3 != 5);//If producto
                    }else if (opcion2 == 2){
                        cliente.verCarrito();
                    }else if (opcion2 == 3){
                        cliente.finalizarCompra();
                    }else if (opcion2 == 4){
                        System.out.print("Saliendo");
                    }else{
                        System.out.print("Opcion no valida");
                    }
                }while(opcion2 != 4);//menu compra
            }
            
        }while(opcion1 != 2); //metodo while
    }//metodo main
    
}//metodo class
