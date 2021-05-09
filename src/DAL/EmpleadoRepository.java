
//Clase con metodos para acceder a la base de datos y extraer y consultar registros de empleados.

package DAL;

import Entity.Empleado;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EmpleadoRepository {
    
    private Connection conection;

    public EmpleadoRepository(Connection conection) {
        this.conection = conection;
    }
    
    public ArrayList<Empleado> consultarEmpleados(){
        
        try {
            Statement statement = conection.createStatement();
            ResultSet result;
            result = statement.executeQuery("SELECT * FROM Empleados");
            
            return mapearEmpleados(result);
            
        } catch (SQLException ex) {
            System.out.println("Error al consultar los registros: " + ex.getMessage());
            return null;
        }
    }
    
    private ArrayList<Empleado> mapearEmpleados(ResultSet result){
        
        ArrayList<Empleado> empleados = new ArrayList<>();

        try {
            while(result.next()){
                
               Empleado empleado = new Empleado();
                
                empleado.setIdentificacion(result.getString("Identificacion"));
                empleado.setNombre(result.getString("Nombre"));
                empleado.setFechaDeNacimiento(result.getString("FechaDeNacimiento"));
                empleado.setTelefono(result.getString("Telefono"));
                empleado.setContraseña(result.getString("Contraseña"));
                empleado.setRol(result.getString("Rol"));
                
                empleados.add(empleado);
            }
            
            return empleados;
            
        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoRepository.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }  
    }
}
