
import javax.swing.JOptionPane;
import connection.ConnectionUtil;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.cliente;
import model.dao.clienteDAO;
import model.dao.instrutorDAO;
import model.dao.loginDAO;
import model.dao.recepDAO;


public class jojo extends javax.swing.JFrame {

    /**
     * Creates new form jojo
     */
    public jojo() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        cliente = new javax.swing.JRadioButton();
        recep = new javax.swing.JRadioButton();
        instrutor = new javax.swing.JRadioButton();
        login = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        butlog = new javax.swing.JButton();
        butcad = new javax.swing.JButton();
        butsair = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        senh = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonGroup1.add(cliente);
        cliente.setText("cliente");

        buttonGroup1.add(recep);
        recep.setText("recepcionista");

        buttonGroup1.add(instrutor);
        instrutor.setText("instrutor");

        jLabel1.setText("Login");

        jLabel2.setText("Senha");

        butlog.setText("Login");
        butlog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butlogActionPerformed(evt);
            }
        });

        butcad.setText("Cadastro");
        butcad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butcadActionPerformed(evt);
            }
        });

        butsair.setText("Sair");
        butsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butsairActionPerformed(evt);
            }
        });

        jLabel3.setText("op????o de entrada: ");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("BEM VINDO A ACADEMIA JOJOS");

        senh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(122, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(login, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                            .addComponent(senh))
                        .addGap(242, 242, 242))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(butlog)
                                .addGap(48, 48, 48)
                                .addComponent(butcad))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(cliente)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(recep)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(instrutor))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(butsair)))
                        .addGap(148, 148, 148))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(senh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cliente)
                    .addComponent(jLabel3)
                    .addComponent(recep)
                    .addComponent(instrutor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butlog)
                    .addComponent(butcad)
                    .addComponent(butsair))
                .addGap(111, 111, 111))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butlogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butlogActionPerformed

    
   loginDAO dao = new loginDAO();
   recepDAO Dao = new recepDAO();
   instrutorDAO DAO = new instrutorDAO();
   
   if(dao.checkLogin(login.getText(), senh.getText())
   && cliente.isSelected()){
       loginCliente lc = new loginCliente();
        lc.setVisible(true);
        setVisible(false);
       
   }else if(Dao.checkRecep(login.getText(),senh.getText())
           && recep.isSelected()){
       loginGerenciar lg = new loginGerenciar();
        lg.setVisible(true);
        setVisible(false);
       
   }else if(DAO.checkInst(login.getText(), senh.getText())
           && instrutor.isSelected()){
       logInstrutor li = new logInstrutor();
        li.setVisible(true);
        setVisible(false);
       
   }
   
   
   
   else{
       JOptionPane.showMessageDialog(null," login e senha incorreto"
       +" ou tipo de login invalido");
   }
       
   
   
    
        
 
//   if(cliente.isSelected()  ){
//   loginCliente lc = new loginCliente();
//   lc.setVisible(true);
//}
//else if(recep.isSelected()){
//    loginGerenciar lg = new loginGerenciar();
//    lg.setVisible(true);
//}
//else if(instrutor.isSelected()){
//    logInstrutor li = new logInstrutor();
//    li.setVisible(true);
//}
//else{
//    JOptionPane.showMessageDialog(null,"selecione uma forma de login");
//    
//}


        // TODO add your handling code here:
    }//GEN-LAST:event_butlogActionPerformed

    private void butcadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butcadActionPerformed
  
   
        
 TelaDeCadastro tc = new TelaDeCadastro();
   tc.setVisible(true);
   setVisible(false);


        // TODO add your handling code here:
    }//GEN-LAST:event_butcadActionPerformed

    private void butsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butsairActionPerformed
setVisible(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_butsairActionPerformed

    private void senhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senhActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(jojo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jojo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jojo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jojo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jojo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butcad;
    private javax.swing.JButton butlog;
    private javax.swing.JButton butsair;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton cliente;
    private javax.swing.JRadioButton instrutor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField login;
    private javax.swing.JRadioButton recep;
    private javax.swing.JPasswordField senh;
    // End of variables declaration//GEN-END:variables
}
