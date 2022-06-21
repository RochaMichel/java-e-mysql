/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;


import connection.ConnectionUtil;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.cliente;
import model.bean.treino;
/**
 *
 * @author miche
 */
public class clienteDAO {
     public List<cliente> read(){
        Connection con = ConnectionUtil.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs =null;
        
        List<cliente> clientes = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM cliente");
            rs = stmt.executeQuery();
            
            while (rs.next()){
                cliente c = new cliente();
                
               
                 c.setNome(rs.getString("nome") );
                  c.setUsuario(rs.getString("usuario") );
                   c.setIdade(rs.getInt("idade") );
                    c.setSenha(rs.getString("senha") );
                     c.setCPF(rs.getInt("CPF") );
                     c.setSexo(rs.getString("sexo") ); 
                
                clientes.add(c);
               }
            }
            
            
         catch (SQLException ex) {
            System.out.println("ERRO NO BANCO");
        }finally{
        ConnectionUtil.closeConnection(con, stmt, rs);
    }
        return clientes;
    }
    
    
    


    public void create(cliente c){
        Connection con = ConnectionUtil.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO cliente VALUES(?,?,?,?,?,?)");
           
             stmt.setString(1,c.getNome() );
              stmt.setString(2,c.getUsuario() );
               stmt.setInt(3,c.getIdade() );
                stmt.setString(4,c.getSenha() );
                 stmt.setDouble(5, c.getCPF());
                  stmt.setString(6,c.getSexo() );
                  
                  stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"salvo");    
        } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null,"erro" + ex);
        }
    }
    public void delete(cliente c){
        Connection con = ConnectionUtil.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("DELETE FROM cliente WHERE senha = ?");
            stmt.setString(1,c.getSenha());
                  stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"removido");    
        } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null,"erro" + ex);
        }
    }
    
    public void update(cliente c){
        Connection con = ConnectionUtil.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE cliente SET  nome = ? ,usuario =?, idade =?, senha =?, CPF = ?, sexo = ? WHERE senha = ?");
            
             stmt.setString(1,c.getNome() );
              stmt.setString(2,c.getUsuario() );
               stmt.setInt(3,c.getIdade() );
                stmt.setString(4,c.getSenha() );
                 stmt.setDouble(5, c.getCPF());
                  stmt.setString(6,c.getSexo() );
                  stmt.setString(7,c.getSenha() );
                    
                  
                  stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"salvo");    
        } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null,"erro" + ex);
        }
    }
    
 
    
    
}

