
package proyectoenvio;
import java.util.Scanner;
public class ProyectoEnvio {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcion = 0;
        do{
            System.out.print("1. Calcular envio nacional\n");
            System.out.print("2. Calcular envio internacional\n");
            System.out.print("3. Salir\n");
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
                System.out.print("El valor del envio es de: $"+ envio.calcularValorEnvio());
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
                System.out.print("El valor del envio es de: $"+ envio.calcularValorEnvio());
            }else if (opcion == 3){
                System.out.print("Saliendo del sistema");
            }else{
                System.out.print("Opcion no valida");
            }
        
        }while (opcion != 3);
    }
}
