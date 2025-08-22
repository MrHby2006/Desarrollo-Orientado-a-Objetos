
package repaso2;

public class Repaso2 {

    public static void main(String[] args) {
        
        int edad = 18;
        if (edad > 17 && edad < 25) {
            System.out.print( "Eres un adulto joven"); // && significa and(y)
        }else if (edad > 25 && edad < 30){
            System.out.print( "Eres un poco mayor");
        }else {
            System.out.print( "Eres menor de edad");
        }
    } 
}
