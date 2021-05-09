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
    
    private final String remoteConection = "jdbc:sqlserver://mi-transporte-sa.database.windows.net:1433;database=MiTransporteSA;user=juancabolaños@mi-transporte-sa;password=Juanca123456;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;";
    private final String localConection = "jdbc:sqlserver://REINALDO-PC\\SQLEXPRESS;database=MiTransporteSA;user=SqlUser;password=123456";
    private final String cadenaDeConexion = localConection;
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
