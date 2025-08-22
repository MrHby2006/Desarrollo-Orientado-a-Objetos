
package pkgfor;

import java.util.Scanner;

public class For {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(source: System.in);
        
        System.out.print("Ingrese un número");
        int numero = input.nextInt();
        
        System.out.print("Esta es la tabla del "+ numero);
        for (int i = 0; i < 10; i++){
            System.out.print( numero +" X "+ i + " = "+ numero*i );
        }
    }
    
}
