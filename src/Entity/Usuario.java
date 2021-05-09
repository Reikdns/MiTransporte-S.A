
//Clase que representa un usuario.

package Entity;

import BLL.ReporteService;
import java.util.ArrayList;

public class Usuario extends Persona implements IConsultableReport{
    
    private String direccion;
    private String ciudad;

    @Override 
    public ArrayList<Reporte> consultarReportes(String key){
        
        if(key.equals("")){
            return new ReporteService().consultarReportes();
        }
        
        ArrayList<Reporte> reportes = new ArrayList<>();
        
        for(Reporte reporte : new ReporteService().consultarReportes()){
            if(reporte.getIdentificacionUsuario().equals(key)){
                reportes.add(reporte);
            }
        }
        
        return reportes;
    }
    
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}
