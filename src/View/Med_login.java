
package View;

import ModelConnection.connectionDB;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Leonardo Teixeira
 * Consoletech 03/03/2021.
 */
public class Med_login extends javax.swing.JFrame {

    connectionDB con = new connectionDB();
    
    public Med_login() {
        initComponents();
        con.conexao();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        tuser = new javax.swing.JTextField();
        btn_entrar = new javax.swing.JButton();
        btn_sair = new javax.swing.JButton();
        tpass = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        copy = new javax.swing.JLabel();
        consoletech = new javax.swing.JLabel();
        fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setResizable(false);
        getContentPane().setLayout(null);

        label1.setText("Usúario:");
        getContentPane().add(label1);
        label1.setBounds(110, 160, 60, 15);

        label2.setText("  Senha:");
        getContentPane().add(label2);
        label2.setBounds(110, 200, 60, 15);
        getContentPane().add(tuser);
        tuser.setBounds(170, 150, 260, 30);

        btn_entrar.setText("Entrar");
        btn_entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_entrarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_entrar);
        btn_entrar.setBounds(220, 230, 67, 29);

        btn_sair.setText("Sair");
        btn_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sairActionPerformed(evt);
            }
        });
        getContentPane().add(btn_sair);
        btn_sair.setBounds(310, 230, 67, 29);
        getContentPane().add(tpass);
        tpass.setBounds(170, 190, 260, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(200, 30, 200, 110);

        copy.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        copy.setForeground(new java.awt.Color(17, 129, 242));
        copy.setText("<html>&copy</html>");
        getContentPane().add(copy);
        copy.setBounds(40, 310, 20, 22);

        consoletech.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        consoletech.setForeground(new java.awt.Color(17, 129, 242));
        consoletech.setText("Console-Tech todos os direitos reservados desde 2021.");
        getContentPane().add(consoletech);
        consoletech.setBounds(60, 310, 490, 22);

        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fundo.jpg"))); // NOI18N
        fundo.setText("jLabel1");
        getContentPane().add(fundo);
        fundo.setBounds(0, 0, 600, 360);

        setSize(new java.awt.Dimension(587, 372));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_entrarActionPerformed
       
        try {
            con.executaSQL("select * from usuarios where us_nome ='"+tuser.getText()+"'");  // encontrou usuario //
            con.rs.first();  // o sistema ira armazenar a informação do nome do usuario em rs
            if(con.rs.getString("us_senha").equals(tpass.getText())){  // se ele entrou nesta condição e porque achou usuario  
            Med_Principal tela = new Med_Principal(tuser.getText()); // criando metodo para tela principal receber o usuario.
            tela.setVisible(true);
            dispose();
            }else{
               JOptionPane.showMessageDialog(null, "Senha Invalida! ");   // aqui achou o usuario porem a senha não confere
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Usuário não cadastrado! "); // aqui ele não achou usuario e nem senha
        }
    }//GEN-LAST:event_btn_entrarActionPerformed

    private void btn_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btn_sairActionPerformed

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
            java.util.logging.Logger.getLogger(Med_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Med_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Med_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Med_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Med_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_entrar;
    private javax.swing.JButton btn_sair;
    private javax.swing.JLabel consoletech;
    private javax.swing.JLabel copy;
    private javax.swing.JLabel fundo;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JPasswordField tpass;
    private javax.swing.JTextField tuser;
    // End of variables declaration//GEN-END:variables
}
