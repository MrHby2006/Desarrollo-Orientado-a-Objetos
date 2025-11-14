
package crudvehiculos;
import modelo.VehiculoDAO;
import vista.VistaVehiculos;
import controlador.ControladorVehiculos;
public class CRUDVehiculos {

    public static void main(String[] args) {
        VehiculoDAO dao = new VehiculoDAO();
        VistaVehiculos vista = new VistaVehiculos();
        ControladorVehiculos controlador = new ControladorVehiculos(vista, dao);
        
        vista.setVisible(true);
    }
    
}
