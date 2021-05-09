
//Interface con los metodos necesarios para registrar, consultar y eliminar usuarios.

package Entity;

import java.util.ArrayList;

public interface IGestionUser {
    
    public ArrayList<Usuario> consultarUsuarios();
    
    public void registrarUsuario(Usuario usuario);
    
    public void eliminarUsuario(String key);
}
