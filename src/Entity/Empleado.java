
//Clase que representa un empleado, la cual hereda la clase Persona e implementa las interfaces IGestionUser,
//IConsultableReport e IRegistrableReport las cuales contienen los métodos abstractos que son implementados.

package Entity;

import BLL.ReporteService;
import BLL.UsuarioService;
import java.util.ArrayList;

public class Empleado extends Persona implements IGestionUser, IConsultableReport, IRegistrableReport {
    
    private String contraseña;
    private String rol;
    
    @Override
    public void registrarReporte(Reporte reporte){
        new ReporteService().registrarReporte(reporte);
    }
    
    @Override
    public ArrayList<Usuario> consultarUsuarios(){
        return new UsuarioService().consultarUsuarios();
    }
    
    @Override
    public void registrarUsuario(Usuario usuario){
        new UsuarioService().registrarUsuario(usuario);
    }
    
    @Override
    public void eliminarUsuario(String key){
        new UsuarioService().eliminarUsuario(key);
    }
    
    @Override
    public ArrayList<Reporte> consultarReportes(String key){
        return new ReporteService().consultarReportes();
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
    
}
