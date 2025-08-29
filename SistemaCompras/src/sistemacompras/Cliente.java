package sistemacompras;

public class Cliente {
    private String idCliente;
    private String nombre;
    private CarritoDeCompras carrito;
    
    public Cliente(String idCliente, String nombre){
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.carrito = new CarritoDeCompras();
    }
    
    public void agregarProducto(Producto producto){
        System.out.print("El cliente "+ nombre + "esta agregando un producto...");
        carrito.agregarProductos(producto);
    }
    
    public void verCarrito(){
        System.out.print("\nCarrito de " + nombre);
        carrito.mostrarCarrito();
    }
    
    public void finalizarCompra(){
        System.out.print("\n" + nombre + "esta finalizando la compra...");
        carrito.mostrarCarrito();
        System.out.print("Pago realizado con exito");
        carrito.vaciarCarrito();
    }
    
    public String getIdCliente() {
        return idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public CarritoDeCompras getCarrito() {
        return carrito;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCarrito(CarritoDeCompras carrito) {
        this.carrito = carrito;
    }
    
}
