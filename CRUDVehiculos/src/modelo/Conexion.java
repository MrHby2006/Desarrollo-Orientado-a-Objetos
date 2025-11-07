
package modelo;
import java.sql.DriverManager;
import java.sql.Connection;

public class Conexion {
    private String USER = "root";
    private String PASWORD = "";
    private String URL = "jdbc:mysql://localhost:3306/proyectovehiculodb";
    
    public Connection getConexion(){
        Connection conexion = null;
        try{
            conexion = DriverManager.getConnection(URL, USER, PASWORD);
        } catch(Exception error){
            System.out.print("No se pudo conectar"+error.getMessage());
        }
        return conexion;
    }
}
