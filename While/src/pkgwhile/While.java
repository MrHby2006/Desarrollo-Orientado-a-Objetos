
package pkgwhile;

import java.util.Scanner;

public class While {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;
        
        do{
            
            System.out.print("Ingrese un número positivo");
            numero = input.nextInt();
            
        }while(numero < 0);
    }
    
}
