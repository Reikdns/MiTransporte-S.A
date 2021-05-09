
//Interface que contiene el método necesario para consultar reportes.

package Entity;

import java.util.ArrayList;

public interface IConsultableReport {
    
    public ArrayList<Reporte> consultarReportes(String key); 
}
