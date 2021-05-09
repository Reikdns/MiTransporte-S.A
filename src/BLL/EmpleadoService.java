/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import java.util.ArrayList;

/**
 *
 * @author REINALDO
 */
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
    
    public ArrayList<Empleado> consultarUsuarios(){
        conection.establecerConexion();
        empleados = empleadoRepository.consultarEmpleados();
        conection.cerrarConexion();
        return empleados;
    }
}
