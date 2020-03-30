package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ConexionBd {
    Connection cn;
    
    private static String url;
    Connection conexion;
    
    public Connection conectar(String usuario, String pass, boolean produccion){
        url = "jdbc:postgresql://localhost:5432/SAJORA";
        try {
            Class.forName("org.postgresql.Driver");
            conexion = DriverManager.getConnection(url, usuario, pass);
            return conexion;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    
}
