
package pkgswitch;

public class Switch {

public static void main(String[] args) {
    int curso = 1;

            switch (curso){ //switch analiza una variable
                case 1 :
                    System.out.print("Primero basico");
                    break;
                case 2 :
                    System.out.print("Segundo basico");
                    break;
                case 3 :
                    System.out.print("Tercero basico");
                    break;
                default:
                    System.out.print("Otro curso");
                    break;
        }
    }
}
