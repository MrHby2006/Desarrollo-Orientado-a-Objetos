package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import modelo.Vehiculo;
import modelo.VehiculoDAO;
import vista.VistaVehiculos;

public class ControladorVehiculos implements ActionListener {
    private VistaVehiculos vista;
    private VehiculoDAO dao;

    public ControladorVehiculos(VistaVehiculos vista, VehiculoDAO dao) {
        this.vista = vista;
        this.dao = dao;
        
        this.vista.getBtnguardar().addActionListener(this);
        this.vista.getBtnactualizar().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == vista.getBtnguardar()){
            guardarVehiculo();
        }else if(evento.getSource() == vista.getBtnactualizar()){
            cargarTabla();
        }
    }
    
    private void cargarTabla(){
        DefaultTableModel modelo = vista.getModelotabla();
        modelo.setRowCount(0);
        
        List<Vehiculo> listaVehiculos = dao.llamarVehiculos();
        for(Vehiculo veh : listaVehiculos){
            modelo.addRow(new Object[]{
                veh.getPatente(),
                veh.getMarca(),
                veh.getModelo(),
                veh.getAnio(),
                veh.getKilometros(),
            });
        }
    }
    
    private void guardarVehiculo(){
        String patente = vista.getTxtpatente().getText();
        String marca =vista.getTxtmarca().getText();
        String modelo = vista.getTxtmodelo().getText();
        int anio = Integer.parseInt(vista.getTxtanio().getText());
        int kilometros = Integer.parseInt(vista.getTxtkilometros().getText());
        
        Vehiculo vehiculo = new Vehiculo(patente,marca,modelo,anio,kilometros);
        dao.insertar(vehiculo);
    }
    
    
}
