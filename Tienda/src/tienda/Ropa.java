
package tienda;

public class Ropa extends Producto{
    private String talla;
    private String color;

    public Ropa() {
    }

    public Ropa(String talla, String color, String idProducto, String nombre, double precio) {
        super(idProducto, nombre, precio);
        this.talla = talla;
        this.color = color;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public void ajustarTalla(String tallaNueva){
        talla = tallaNueva;
    }
    
    @Override
    public double calcularEnvio(){
        return 1500;
    }
    
    @Override
    public void mostrarDatos(){
        System.out.print("Nombre: "+nombre);
        System.out.print("Id: "+idProducto);
        System.out.print("Talla: "+talla);
        System.out.print("Color: "+color);
        System.out.print("Precio : $"+precio+"\n");
    }
}
