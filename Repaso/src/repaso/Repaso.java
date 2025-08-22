
package repaso;

public class Repaso {

public static void main(String[] args) {
    
    Pelicula peli = new Pelicula();
        
    peli.setNombre(titulo: "Wall-e");
    peli.setDuracion(duracion: "2:14");
    peli.setFecha(fecha: "2004");
    
    System.out.print("El titulo es:" + peli.getTitulo());
    System.out.print("Dura:" +  peli.getDuracion());
    System.out.print("La fecha de lanzamiento fue: " + peli.getFecha());
}
    

}
