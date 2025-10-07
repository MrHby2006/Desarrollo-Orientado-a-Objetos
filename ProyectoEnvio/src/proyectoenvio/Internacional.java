
package proyectoenvio;

public class Internacional extends Envio{
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
}
