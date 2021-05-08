/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author REINALDO
 */
public class DataBaseConection {
    
    private final String cadenaDeConexion = "jdbc:sqlserver://REINALDO-PC\\SQLEXPRESS;database=MiTransporteSA;user=SqlUser;password=123456";
    private Connection conection;
    
    public String establecerConexion(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conection = DriverManager.getConnection(cadenaDeConexion);
            return "Conexión establecida.";
        } 
        catch (SQLException ex) {
            return String.format("Error al establecer conexión con la base de datos: {0}", ex.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DataBaseConection.class.getName()).log(Level.SEVERE, null, ex);
            return String.format("Error al establecer conexión con la base de datos: {0}", ex.getMessage());
        }
    }
    
    public String cerrarConexion(){
        try {
            conection.close();
            return "Conexión cerrada.";
        } 
        catch (SQLException ex) {
            return String.format("Error al cerrar la conexión con la base de datos: {0}", ex.getMessage());
        }
    }

    public Connection getConection() {
        return conection;
    }

    public void setConection(Connection conection) {
        this.conection = conection;
    }
    
    
    
}
