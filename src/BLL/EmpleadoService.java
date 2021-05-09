
//Servicio para y consultar empleados.

package BLL;

import Entity.Empleado;
import DAL.EmpleadoRepository;
import java.util.ArrayList;

public class EmpleadoService {
    
    private EmpleadoRepository empleadoRepository;
    private ArrayList<Empleado> empleados;
    private DataBaseConection conection;

    public EmpleadoService() {
        conection = new DataBaseConection();
        empleados = new ArrayList<>();
        
        conection.establecerConexion();
        empleadoRepository = new EmpleadoRepository(conection.getConection());
    }
    
    public ArrayList<Empleado> consultarEmpleados(){
        conection.establecerConexion();
        empleados = empleadoRepository.consultarEmpleados();
        conection.cerrarConexion();
        return empleados;
    }
}
