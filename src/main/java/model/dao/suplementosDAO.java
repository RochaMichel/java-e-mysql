/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import connection.ConnectionUtil;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.cliente;
import model.bean.suplementos;
import model.bean.treino;
/**
 *
 * @author miche
 */
public class suplementosDAO {
  
    /**
     *
     * @return
     */
    public List<suplementos> read(){
        Connection con = ConnectionUtil.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs =null;
        
        List<suplementos> suplemento = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM suplementos");
            rs = stmt.executeQuery();
            
            while (rs.next()){
                suplementos s = new suplementos();
                
                s.setNome(rs.getString("nome"));
                s.setQuantidade(rs.getString("quantidade"));
                s.setValor(rs.getString("valor"));
                
                
                suplemento.add(s);
               }
            }
            
            
         catch (SQLException ex) {
            System.out.println("ERRO NO BANCO");
        }finally{
        ConnectionUtil.closeConnection(con, stmt, rs);
    }
        return suplemento;
    }
    
}
    
