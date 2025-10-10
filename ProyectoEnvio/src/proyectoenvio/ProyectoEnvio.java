
package proyectoenvio;
import java.util.Scanner;
public class ProyectoEnvio {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcion = 0;
        do{
            System.out.print("Menu de Envios\n");
            System.out.print("1. Calcular envio nacional\n");
            System.out.print("2. Calcular envio internacional\n");
            System.out.print("3. Venta de Estampillas\n");
            System.out.print("4. Salir\n");
            System.out.print("Ingrese una opcion: ");
            opcion = input.nextInt();
        
            if (opcion == 1){
                System.out.print("Envio nacional\n");
                System.out.print("Codigo: ");
                String codigo = input.next();
                System.out.print("Region de Destino: ");
                String region = input.next();
                System.out.print("Peso: ");
                double peso = input.nextDouble();
                
                Nacional envio = new Nacional(codigo, region, peso);
                envio.imprimirBoleta();
            }else if (opcion == 2){
                System.out.print("Envio internacional\n");
                System.out.print("Codigo: ");
                String codigo = input.next();
                System.out.print("Pais: ");
                String pais = input.next();
                System.out.print("Peso: ");
                double peso = input.nextDouble();
                System.out.print("Tasa IVA: ");
                double tasa = input.nextDouble();
                
                Internacional envio = new Internacional(pais, tasa, codigo, peso);
                envio.imprimirBoleta();
            }else if (opcion == 3){
                System.out.print("Venta de Estampillas");
                System.out.print("Ingrese la cantidad: ");
                double cantidad = input.nextDouble();
                
                VentaEstampillas venta = new VentaEstampillas(cantidad);
                venta.imprimirBoleta();
            }else if (opcion == 4){
                System.out.print("Saliendo del sistema");
            }else{
                System.out.print("Opcion no valida");
            }
        }while (opcion != 4);
    }
}
