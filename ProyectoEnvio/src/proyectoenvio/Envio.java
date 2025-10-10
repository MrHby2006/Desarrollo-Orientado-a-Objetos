
package proyectoenvio;

public abstract class Envio {
    protected String codigo;
    protected double peso;
    protected final double tarifaBase = 2000;

    public Envio() {
    }
    
    public Envio(String codigo, double peso) {
        this.codigo = codigo;
        this.peso = peso;
    }

    public abstract double calcularValorEnvio();
}
