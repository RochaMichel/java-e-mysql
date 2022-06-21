/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import connection.ConnectionUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author miche
 */
public class recepDAO {
     public boolean checkRecep(String login, String senha){
        Connection con = ConnectionUtil.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs =null;
        
        boolean check = false;
        
      
        
        try {
            stmt = con.prepareStatement("SELECT * FROM recepcionista WHERE Login = ? and Senha = ?");
            stmt.setString(1, login);
            stmt.setString(2, senha);
            rs = stmt.executeQuery();
            
            if (rs.next()){
               
                check = true;
               
               }
            }
            
            
         catch (SQLException ex) {
            System.out.println("ERRO NO BANCO");
        }finally{
        ConnectionUtil.closeConnection(con, stmt, rs);
    }
        return check;
    }
    
    
}
