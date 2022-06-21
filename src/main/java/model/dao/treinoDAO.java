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
import model.bean.treino;
/**
 *
 * @author miche
 */
public class treinoDAO {
  
    /**
     *
     * @return
     */
    public List<treino> read(){
        Connection con = ConnectionUtil.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs =null;
        
        List<treino> treinos = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM treino");
            rs = stmt.executeQuery();
            
            while (rs.next()){
                treino t = new treino();
               
                t.setExercicio(rs.getString("exercicio"));
                t.setRepeticao(rs.getInt("repeticao"));
                t.setSerie(rs.getInt("serie"));
                t.setDescanso(rs.getString("descanso"));
                t.setId(rs.getInt("id"));
                
                treinos.add(t);
               }
            }
            
            
         catch (SQLException ex) {
            System.out.println("ERRO NO BANCO");
        }finally{
        ConnectionUtil.closeConnection(con, stmt, rs);
    }
        return treinos;
    }
    
     public void create(treino t){
        Connection con = ConnectionUtil.getConnection();
        PreparedStatement stmt = null;
        
        try {
           stmt = con.prepareStatement("INSERT INTO treino VALUES (?,?,?,?,?)");
                     
                  stmt.setString(1,t.getExercicio() );
                  stmt.setInt(2,t.getRepeticao() );
                  stmt.setInt(3,t.getSerie() );
                  stmt.setString(4,t.getDescanso() );
                  stmt.setInt(5,t.getId());
                  
                  stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"salvo");    
        } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null,"erro" + ex);
        }
    }
    
   
    
}
