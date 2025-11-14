
package modelo;

import java.util.List;
import java.sql.*;
import java.util.ArrayList;

public class VehiculoDAO {
    private Conexion conexion = new Conexion();
    
    public void insertar(Vehiculo vehiculo){
        String sql = "INSERT INTO vehiculos VALUES(?, ?, ?, ?, ?)";
        try{
            Connection con= conexion.getConnection();
            PreparedStatement declaracion = con.prepareStatement(sql);
            declaracion.setString(1, vehiculo.getPatente());
            declaracion.setString(2, vehiculo.getMarca());
            declaracion.setString(3, vehiculo.getModelo());
            declaracion.setInt(4, vehiculo.getAnio());
            declaracion.setInt(5, vehiculo.getKilometros());
         
            declaracion.executeUpdate();
                 
        }catch(Exception error){
            System.out.println("no se pudo insertar "+error.getMessage());
        }
    }
    
    
    
    public List<Vehiculo> llamarVehiculos(){
        List<Vehiculo> listavehiculos = new ArrayList<>();
        String sql = "SELECT * FROM vehiculos";
        try{
            Connection con = conexion.getConnection();
            Statement declaracion = con.createStatement();
            ResultSet resultado = declaracion.executeQuery(sql);
            
            while(resultado.next()){
                String patente = resultado.getString("patente");
                String marca = resultado.getString("marca");
                String modelo = resultado.getString("modelo");
                int anio = resultado.getInt("anio");
                int kilometros = resultado.getInt("kilometros");
                
                Vehiculo vehiculo = new Vehiculo(patente,marca,modelo,anio,kilometros);
                listavehiculos.add(vehiculo);
            }
            
        }catch(Exception error){
            System.out.println("Error al consultar los vehiculos de la base de datos");
            System.out.println(error.getMessage());
        }
        return listavehiculos;
}
}
