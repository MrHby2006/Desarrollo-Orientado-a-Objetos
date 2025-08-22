package repaso;

public class Pelicula {

    private String titulo;
    private String duracion;
    private String fecha;

    public Pelicula(String titulo, String duracion, String fecha) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.fecha = fecha;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDuracion() {
        return duracion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

}
