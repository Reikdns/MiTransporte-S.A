/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;
import BLL.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.util.ArrayList;
/**
 *
 * @author REINALDO
 */
public class UsuarioRepository {
    
    private Connection conection;

    public UsuarioRepository(Connection conection) {
        this.conection = conection;
    }
    
    public void registrarUsuario(Usuario usuario){
                 
        try {
         PreparedStatement statement = conection.prepareStatement("INSERT INTO Usuarios(Identificacion, Nombre, FechaDeNacimiento, Telefono, Direccion, Ciudad) VALUES(?, ?, ?, ?, ?, ?)");
         statement.setString(1, usuario.getIdentificacion());
         statement.setString(2, usuario.getNombre());
         statement.setString(3,  usuario.getFechaDeNacimiento());
         statement.setString(4, usuario.getDireccion());
         statement.setString(5, usuario.getDireccion());
         statement.setString(6, usuario.getCiudad());
         statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioRepository.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error al insertar registro en la tabla: " + ex.getMessage());
        }    
    }
     
    public ArrayList<Usuario> consultarUsuarios(){
        
        try {
            Statement statement = conection.createStatement();
            ResultSet result;
            result = statement.executeQuery("SELECT * FROM Usuarios");
            
            return mapearUsuarios(result);
            
        } catch (SQLException ex) {
            System.out.println("Error al consultar los registros: " + ex.getMessage());
            return null;
        }
    }
    
    public void eliminarUsuario(String identificacion){
        try {
            PreparedStatement statement = conection.prepareStatement("DELETE FROM Usuarios WHERE Identificacion = ?");
            statement.setString(1, identificacion);
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    private ArrayList<Usuario> mapearUsuarios(ResultSet result){
        
        ArrayList<Usuario> usuarios = new ArrayList<>();

        try {
            while(result.next()){
                
               Usuario usuario = new Usuario();
                
                usuario.setIdentificacion(result.getString("Identificacion"));
                usuario.setNombre(result.getString("Nombre"));
                usuario.setFechaDeNacimiento(result.getString("FechaDeNacimiento"));
                usuario.setTelefono(result.getString("Telefono"));
                usuario.setDireccion(result.getString("Direccion"));
                usuario.setCiudad(result.getString("Ciudad"));
                
                usuarios.add(usuario);
            }
            
            return usuarios;
            
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioRepository.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }  
    }

    public Connection getConection() {
        return conection;
    }

    public void setConection(Connection conection) {
        this.conection = conection;
    }
    
    
    
}
