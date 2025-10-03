
package tienda;

public abstract class Producto {
    String idProducto;
    String nombre;
    double precio;

    public Producto() {
    }

    public Producto(String idProducto, String nombre, double precio) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public double calcularDescuento(double descuento){
        return precio = (precio * descuento / 100);
    }
    
    public abstract double calcularEnvio();
    
    public abstract void mostrarDatos();
}
