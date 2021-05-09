
//Servicio para registrar y consultar usuarios.

package BLL;
import Entity.Usuario;
import DAL.UsuarioRepository;
import java.util.ArrayList;
/**
 *
 * @author REINALDO
 */
public class UsuarioService {
    
    private UsuarioRepository usuarioRepository;
    private ArrayList<Usuario> usuarios;
    private DataBaseConection conection;

    public UsuarioService() {
        conection = new DataBaseConection();
        usuarios = new ArrayList<>();
        
        conection.establecerConexion();
        usuarioRepository = new UsuarioRepository(conection.getConection());
    }
    
    public String registrarUsuario(Usuario usuario)
    {
        conection.establecerConexion();
        usuarioRepository.registrarUsuario(usuario);
        conection.cerrarConexion();
        System.out.println("El usuario " + usuario.getNombre() + " ha sido registrado con exito.");
        return "El usuario " + usuario.getNombre() + " ha sido registrado con exito.";
    }
    
    public ArrayList<Usuario> consultarUsuarios(){
        conection.establecerConexion();
        usuarios = usuarioRepository.consultarUsuarios();
        conection.cerrarConexion();
        return usuarios;
    }
    
    public void eliminarUsuario(String identificacion){
        conection.establecerConexion();
        usuarioRepository.eliminarUsuario(identificacion);
        conection.cerrarConexion();
    }

    public UsuarioRepository getUsuarioRepository() {
        return usuarioRepository;
    }

    public void setUsuarioRepository(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public DataBaseConection getConection() {
        return conection;
    }

    public void setConection(DataBaseConection conection) {
        this.conection = conection;
    }
    
    

    
    
}
