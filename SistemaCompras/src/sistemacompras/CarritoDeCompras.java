package sistemacompras;

public class CarritoDeCompras {
    
    private String productos;
    private double total;

    public CarritoDeCompras(){
        this.productos = "";
        this.total = 0;
    }

    public void agregarProductos(Producto producto){
        productos = productos + " " + producto.getNombre();
        total = total + producto.getPrecio();
        System.out.print("\nProducto agregado con exito");
    }
    
    public void vaciarCarrito(){
        productos = "";
        total = 0;
        System.out.print("\nCarrito vaciado :)");
    }
    
    public void mostrarCarrito(){
        System.out.print("--CARRITO DE COMPRAS--");
        System.out.print("Productos :"+ productos);
        System.out.print("Total : $"+ total);
    }
    
    public void setProductos(String productos) {
        this.productos = productos;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
}
