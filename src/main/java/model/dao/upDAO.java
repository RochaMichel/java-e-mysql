/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import connection.ConnectionUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.bean.treino;

/**
 *
 * @author miche
 */
public class upDAO {
     public void update(treino t){
        Connection con = ConnectionUtil.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE treino SET exercicio = ? WHERE id = ?");
            
                  stmt.setString(1,t.getExercicio() );
                  stmt.setInt(2,t.getId() );
                  
                  stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"atualizado");    
        } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null,"erro" + ex);
        }
    }
    
    
    
}
