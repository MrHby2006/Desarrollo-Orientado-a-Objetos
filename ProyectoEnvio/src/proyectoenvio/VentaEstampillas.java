
package proyectoenvio;

public class VentaEstampillas implements IServicio{
    private double precioUnitario = 900;
    private double cantidad;

    public VentaEstampillas(double cantidad) {
        this.cantidad = cantidad;
    }
    
    @Override
    public double calcularTotalAPagar(){
        double totalAPagar =  (precioUnitario * cantidad) * 1.19;
        return totalAPagar;
    }
    
    @Override
    public void imprimirBoleta(){
        System.out.print("BOLETA\n");
        System.out.print("Venta de Estampillas\n");
        System.out.print("Precio Unitario: $"+precioUnitario+"\n");
        System.out.print("Cantidad: "+cantidad+"\n");
        System.out.print("Total: $"+calcularTotalAPagar()+"\n");
    }
}
