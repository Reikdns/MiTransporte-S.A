
//Servicio para registrar y consultar reportes de envíos.

package BLL;

import Entity.Reporte;
import DAL.ReporteRepository;
import java.util.ArrayList;

public class ReporteService {
    
    private ReporteRepository reporteRepository;
    private ArrayList<Reporte> reportes;
    private DataBaseConection conection;
    
    public ReporteService() {
        conection = new DataBaseConection();
        reportes = new ArrayList<>();
        
        conection.establecerConexion();
        reporteRepository = new ReporteRepository(conection.getConection());
    }
    
    public String registrarReporte(Reporte reporte)
    {
        conection.establecerConexion();
        reporteRepository.registrarReporte(reporte);
        conection.cerrarConexion();
        System.out.println("El reporte #" + reporte.getId() + " ha sido registrado con exito.");
        return "El reporte " + reporte.getId() + " ha sido registrado con exito.";
    }
    
    public ArrayList<Reporte> consultarReportes(){
        conection.establecerConexion();
        reportes = reporteRepository.consultarReportes();
        conection.cerrarConexion();
        return reportes;
    }
}
