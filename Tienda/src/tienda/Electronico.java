
package tienda;

public class Electronico extends Producto {
    private String marca;
    private int garantiaMeses;

    public Electronico() {
    }
    
    public Electronico(String marca, int garantiaMeses, String idProducto, String nombre, double precio) {
        super(idProducto, nombre, precio);
        this.marca = marca;
        this.garantiaMeses = garantiaMeses;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getGarantiaMeses() {
        return garantiaMeses;
    }

    public void setGarantiaMeses(int garantiaMeses) {
        this.garantiaMeses = garantiaMeses;
    }
    
    public void extenderGarantia(int mesesExtra){
        garantiaMeses = garantiaMeses + mesesExtra;
    }
    
    @Override
        public double calcularEnvio(){
            double precioEnvio = precio * 0.08;
            return precioEnvio;
    }

    @Override
    public void mostrarDatos(){
        System.out.print("Nombre: "+nombre);
        System.out.print("Id: "+idProducto);
        System.out.print("Garantia: "+garantiaMeses);
        System.out.print("Marca: "+marca);
        System.out.print("Precio : $"+precio+"\n");
    }
}
