
package proyectoenvio;

public class Internacional extends Envio implements IServicio{
    private String paisDestino;
    private double tasaIVA;

    public Internacional(String paisDestino, double tasaIVA, String codigo, double peso) {
        super(codigo, peso);
        this.paisDestino = paisDestino;
        this.tasaIVA = tasaIVA;
    }

    @Override
    public double calcularValorEnvio(){
        double valorEnvio = tarifaBase + (peso * 1500);
        double impuesto = valorEnvio * tasaIVA / 100;
        valorEnvio = valorEnvio + impuesto;
        return valorEnvio;
    }
    
    @Override
    public double calcularTotalAPagar(){
        double totalAPagar =  calcularValorEnvio() * 1.19;
        return totalAPagar;
    }
    
    @Override
    public void imprimirBoleta(){
        System.out.print("BOLETA\n");
        System.out.print("Envio Internacional\n");
        System.out.print("Pais: "+paisDestino+"\n");
        System.out.print("Tasa de Impuesto del Pais: "+tasaIVA+"\n");
        System.out.print("Peso del Envio: "+peso+"\n");
        System.out.print("Codigo: "+codigo+"\n");
        System.out.print("Valor Envio: $"+calcularValorEnvio()+"\n");
        System.out.print("IVA: 19%\n");
        System.out.print("Total: $"+calcularTotalAPagar()+"\n");
    }
}
