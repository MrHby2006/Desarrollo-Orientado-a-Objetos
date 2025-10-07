
package proyectoenvio;

public abstract class Envio {
    private String codigo;
    double peso;
    double tarifaBase = 2000;

    public Envio() {
    }
    
    public Envio(String codigo, double peso) {
        this.codigo = codigo;
        this.peso = peso;
    }

    public abstract double calcularValorEnvio();
}
