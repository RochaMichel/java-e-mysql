package connection;


import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;


public class ConnectionUtil {
    
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/acad";
    private static final String USER = "root";
    private static final String PASS = "";
    
    
    public static Connection getConnection(){
        try {
            Class.forName(DRIVER);        
            return (Connection) DriverManager.getConnection(URL, USER, PASS);
            
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro!");
            throw new RuntimeException("Erro na conexão", ex);
        }
    }
    public static void closeConnection(Connection con){
        if(con != null){
            
            try {
                con.close();
            } catch (SQLException ex) {
                System.err.println("error:" + ex);
            }
        }
    }
    public static void closeConnection(Connection con, PreparedStatement stmt){
        if(stmt != null){
            
            try {
                stmt.close();
            } catch (SQLException ex) {
                System.err.println("error:" + ex);
            }
        }
        
        closeConnection(con);
    }
    public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs){
        if(rs != null){
            
            try {
                rs.close();
            } catch (SQLException ex) {
                System.err.println("error:" + ex);
            }
        }
        
        closeConnection(con, stmt);
    }
  
}
