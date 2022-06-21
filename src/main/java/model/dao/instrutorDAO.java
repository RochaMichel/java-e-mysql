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
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.bean.cliente;
import model.bean.instrutor;
import model.bean.suplementos;

/**
 *
 * @author miche
 */
public class instrutorDAO {
     public List<instrutor> read(){
        Connection con = ConnectionUtil.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs =null;
        
        List<instrutor> instrutor = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM instrutor");
            rs = stmt.executeQuery();
            
            while (rs.next()){
                instrutor i = new instrutor();
                
                i.setNome(rs.getString("nome"));
                i.setLogin(rs.getString("login"));
                i.setSenha(rs.getString("senha"));
                
                
                instrutor.add(i);
               }
            }
            
            
         catch (SQLException ex) {
            System.out.println("ERRO NO BANCO");
        }finally{
        ConnectionUtil.closeConnection(con, stmt, rs);
    }
        return instrutor;
    }
     public void delete(instrutor i){
        Connection con = ConnectionUtil.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("DELETE FROM instrutor WHERE login = ?");
            stmt.setString(1,i.getLogin() );
          
                  
                  stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"removido");    
        } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null,"erro" + ex);
        }
    }
      public boolean checkInst(String login, String senha){
        Connection con = ConnectionUtil.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs =null;
        
        boolean check = false;
        
      
        
        try {
            stmt = con.prepareStatement("SELECT * FROM instrutor WHERE login = ? and senha = ?");
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
