
package tienda;
import java.util.List;
import java.util.ArrayList;
public class Cliente {
    private String nombre;
    private String id;
    private List<Pedido> pedidosRealizados; 

    public Cliente() {
    }

    public Cliente(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
        this.pedidosRealizados = new ArrayList<>(); // Inicializar la lista
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public List<Pedido> getPedidosRealizados() {
        return pedidosRealizados;
    }
    
    public void setPedidosRealizados(List<Pedido> pedidosRealizados) {
        this.pedidosRealizados = pedidosRealizados;
    }    
    
    public void realizarPedido(Pedido nuevoPedido) {
        this.pedidosRealizados.add(nuevoPedido);
        System.out.println("El cliente " + this.nombre + " ha realizado un nuevo pedido.");
    }
    
    public void mostrarDatosCliente() {
        System.out.println("--- Datos del Cliente ---");
        System.out.println("ID: " + this.id);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Pedidos realizados: " + this.pedidosRealizados.size());
    }
}
