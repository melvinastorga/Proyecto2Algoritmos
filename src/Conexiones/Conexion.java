package Conexiones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {

    static Connection contacto = null;
    public static Connection getConexion() 
        {
            String url = "jdbc:sqlserver://163.178.107.130:1433;databaseName=Proyecto_2_Algoritmos";
            try 
                {
                    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                } catch (ClassNotFoundException e) 
                    {
                        JOptionPane.showMessageDialog(null, "No se pudo establecer la conexion... revisar el Driver" + e.getMessage(),"Error de Conexion", JOptionPane.ERROR_MESSAGE);
                    }
                    try 
                        {
                            contacto = DriverManager.getConnection(url, "sqlserver", "Saucr.118");
                        } catch (SQLException e) 
                            {
                                JOptionPane.showMessageDialog(null, "Error:" + e.getMessage(), "Error de Conexion",JOptionPane.ERROR_MESSAGE);
                            }
            return contacto;
        }

    public static ResultSet Consulta(String consulta) {
        Connection con = getConexion();
        Statement declara;
        try {
            declara = con.createStatement();
            ResultSet respuesta = declara.executeQuery(consulta);
            return respuesta;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error:" + e.getMessage(), "Error de Conexion",
                    JOptionPane.ERROR_MESSAGE);
            return null;
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
