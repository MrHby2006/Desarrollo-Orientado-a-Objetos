
package proyectoenvio;

public class Nacional extends Envio implements IServicio{
    private String regionEnvio;

    public Nacional(String regionEnvio, String codigo, double peso) {
        super(codigo, peso);
        this.regionEnvio = regionEnvio;
    }
    
    @Override
    public double calcularValorEnvio(){
        double valorEnvio = tarifaBase + (peso * 500);
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
        System.out.print("Envio Nacional\n");
        System.out.print("Region de Destino: "+regionEnvio+"\n");
        System.out.print("Peso del Envio: "+peso+"\n");
        System.out.print("Codigo: "+codigo+"\n");
        System.out.print("Valor Envio: $"+calcularValorEnvio()+"\n");
        System.out.print("IVA: 19%\n");
        System.out.print("Total: $"+calcularTotalAPagar()+"\n");
    }
}
