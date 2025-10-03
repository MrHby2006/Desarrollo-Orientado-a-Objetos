
package tienda;

public class Libro extends Producto{
    private String autor;
    private int canPaginas;

    public Libro() {
    }

    public Libro(String autor, int canPaginas, String idProducto, String nombre, double precio) {
        super(idProducto, nombre, precio);
        this.autor = autor;
        this.canPaginas = canPaginas;
    }
    
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getCanPaginas() {
        return canPaginas;
    }

    public void setCanPaginas(int canPaginas) {
        this.canPaginas = canPaginas;
    }
    
    public boolean lecturaLiviana(){
        if (canPaginas < 300){
            return true;
        }else{
            return false;
        }
    }
    
    @Override
    public double calcularEnvio(){
        if (lecturaLiviana()){
            return precio * 0.02;
        }else{
            return 700;
        }
    }
    
    @Override
    public void mostrarDatos(){
        System.out.print("Nombre: "+nombre);
        System.out.print("Id: "+idProducto);
        System.out.print("Autor: "+autor);
        System.out.print("Numero de Paginas: "+canPaginas);
        System.out.print("Precio : $"+precio+"\n");
    }
}
