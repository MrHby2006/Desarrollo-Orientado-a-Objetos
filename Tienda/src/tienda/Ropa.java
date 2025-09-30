
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
}
