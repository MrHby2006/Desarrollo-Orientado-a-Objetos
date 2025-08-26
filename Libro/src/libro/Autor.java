
package libro;

public class Autor {
    
    private String nombre;
    private String nacionalidad;
    
    public Autor(){
    }
    
    public Autor(String nombre, String nacionalidad){
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getNacionalidad() {
        return nacionalidad;
    }
    

}