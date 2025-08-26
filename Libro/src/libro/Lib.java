
package libro;

public class Lib {
    
    private String titulo;
    private int isbn;
    private int anio;
    private Autor autor;

    public Lib(String titulo, int isbn, int anio, Autor autor) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.anio = anio;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getIsbn() {
        return isbn;
    }

    public int getAnio() {
        return anio;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
}
