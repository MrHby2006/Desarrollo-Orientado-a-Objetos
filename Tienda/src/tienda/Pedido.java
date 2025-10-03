
package tienda;
import java.util.List;
import java.util.ArrayList;
public class Pedido {
    private double total;

    public Pedido(double total) {
        this.total = total;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
    
    List <Producto> productos = new ArrayList<>();
    
    public double calcularTotal(){
        for (Producto producto : productos){
        total = total + producto.getPrecio();
        return total;
    }
}