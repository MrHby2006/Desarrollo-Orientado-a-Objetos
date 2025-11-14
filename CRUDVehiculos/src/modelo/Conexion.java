
package modelo;

import java.sql.DriverManager;
import java.sql.Connection;

public class Conexion {
    private String USER="root";
    private String PASSWORD="";
    private String URL= "jdbc:mysql://localhost:3306/proyectovehiculosdb";
    
    public Connection getConnection(){
        Connection conexion = null;
        try{
        conexion = DriverManager.getConnection(URL,USER, PASSWORD);
        }catch(Exception error){
            System.out.println("No se pudo conectar "+error.getMessage());
        }
        return conexion;
    }  
}
