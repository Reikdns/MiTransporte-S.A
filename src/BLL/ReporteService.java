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
