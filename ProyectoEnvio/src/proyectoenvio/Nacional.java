
package proyectoenvio;

public class Nacional extends Envio{
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
}
