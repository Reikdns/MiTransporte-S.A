
//Clase con metodos par acceder a la base de datos para extraer y consultar registros de reportes de envíos. 

package DAL;

import Entity.Reporte;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReporteRepository {
    
    private Connection conection;

    public ReporteRepository(Connection conection) {
        this.conection = conection;
    }
    
    public void registrarReporte(Reporte reporte){
        
        ArrayList<Reporte> reportes = consultarReportes();
        
        if(reportes.size()-1 != -1){
            
            Reporte reportePivot = reportes.get(reportes.size()-1);
            String newId = Integer.toString(Integer.parseInt(reportePivot.getId()) + 1);
            reporte.setId(newId);
        }
        else{
            reporte.setId("0");
        }
            
        try {
            PreparedStatement statement = conection.prepareStatement("INSERT INTO Reportes(Id, Fecha, CiudadOrigen, CiudadDestino, Observaciones, Fk_Usuarios_Identificacion) VALUES(?, ?, ?, ?, ?, ?)");
            statement.setString(1, reporte.getId());
            statement.setString(2, reporte.getFecha());
            statement.setString(3, reporte.getCiudadOrigen());
            statement.setString(4, reporte.getCiudadDestino());
            statement.setString(5, reporte.getObservaciones());
            statement.setString(6, reporte.getIdentificacionUsuario());
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ReporteRepository.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error al insertar reporte en la tabla: " + ex.getMessage());
        }    
    }
    
    public ArrayList<Reporte> consultarReportes(){
        
        try {
            Statement statement = conection.createStatement();
            ResultSet result;
            result = statement.executeQuery("SELECT * FROM Reportes");
            
            return mapearReportes(result);
            
        } catch (SQLException ex) {
            System.out.println("Error al consultar los reportes: " + ex.getMessage());
            return null;
        }
    }
    
    private ArrayList<Reporte> mapearReportes(ResultSet result){
        
        ArrayList<Reporte> reportes = new ArrayList<>();

        try {
            while(result.next()){
                
               Reporte reporte = new Reporte();
                
                reporte.setId(result.getString("Id"));
                reporte.setFecha(result.getString("Fecha"));
                reporte.setCiudadOrigen(result.getString("CiudadOrigen"));
                reporte.setCiudadDestino(result.getString("CiudadDestino"));
                reporte.setObservaciones(result.getString("Observaciones"));
                reporte.setIdentificacionUsuario(result.getString("Fk_Usuarios_Identificacion"));
                
                reportes.add(reporte);
            }
            
            return reportes;
            
        } catch (SQLException ex) {
            Logger.getLogger(ReporteRepository.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }  
    }
}
