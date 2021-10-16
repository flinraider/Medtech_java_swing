
package View;

import ModelBeans.BeansUsuarios;
import ModelBeans.ModeloTabela;
import ModelDAO.DAOUsuarios;
import javax.swing.JOptionPane;
import ModelConnection.connectionDB;
import java.util.ArrayList;
import java.sql.SQLException;
import javax.swing.ListSelectionModel;

public class Med_FormUsuarios extends javax.swing.JFrame {
     
    BeansUsuarios mod = new BeansUsuarios();
    DAOUsuarios control =  new DAOUsuarios();
    connectionDB conex = new connectionDB();
    int flag = 0;
    
    public Med_FormUsuarios() {
        initComponents();
        preencherTabela("select * from usuarios order by id_usuario");
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Panel_funcao = new javax.swing.JPanel();
        btn_novo = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();
        btn_salvar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        btn_excluir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_usuario = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pass_usuario = new javax.swing.JPasswordField();
        txt_nome = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        pass_conf_usuario = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        cb_perfil = new javax.swing.JComboBox<>();
        btn_pesquisar = new javax.swing.JButton();
        txt_buscar = new javax.swing.JTextField();
        label_id = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Usuários");

        jPanel1.setBackground(java.awt.Color.white);

        Panel_funcao.setBackground(java.awt.Color.white);
        Panel_funcao.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btn_novo.setText("Novo");
        btn_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novoActionPerformed(evt);
            }
        });

        btn_editar.setText("Editar");
        btn_editar.setEnabled(false);
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });

        btn_salvar.setText("Salvar");
        btn_salvar.setEnabled(false);
        btn_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarActionPerformed(evt);
            }
        });

        btn_cancelar.setText("Cancelar");
        btn_cancelar.setEnabled(false);
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        btn_excluir.setText("Excluir");
        btn_excluir.setEnabled(false);
        btn_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel_funcaoLayout = new javax.swing.GroupLayout(Panel_funcao);
        Panel_funcao.setLayout(Panel_funcaoLayout);
        Panel_funcaoLayout.setHorizontalGroup(
            Panel_funcaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_funcaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel_funcaoLayout.setVerticalGroup(
            Panel_funcaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_funcaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_funcaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_novo)
                    .addComponent(btn_editar)
                    .addComponent(btn_salvar)
                    .addComponent(btn_excluir)
                    .addComponent(btn_cancelar))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel2.setBackground(java.awt.Color.white);
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Dados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        table_usuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        table_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_usuarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_usuario);

        jLabel1.setText("Nome: ");

        jLabel4.setText("Senha: ");

        pass_usuario.setEnabled(false);

        txt_nome.setEnabled(false);

        jLabel5.setText("Confirmar Senha: ");

        pass_conf_usuario.setEnabled(false);

        jLabel2.setText("Perfil:");

        cb_perfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Master", "Administrador", "Gerente", "Atendente", "Médico", "Financeiro", "Caixa" }));
        cb_perfil.setEnabled(false);

        btn_pesquisar.setText("Pesquisar");
        btn_pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pesquisarActionPerformed(evt);
            }
        });

        label_id.setForeground(new java.awt.Color(3, 76, 236));
        label_id.setText("0000");

        jLabel3.setText("Codigo -");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pass_usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                            .addComponent(txt_nome))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cb_perfil, 0, 277, Short.MAX_VALUE)
                            .addComponent(pass_conf_usuario)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label_id)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                        .addComponent(btn_pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(label_id)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_pesquisar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(cb_perfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(pass_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(pass_conf_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Panel_funcao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel_funcao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(755, 515));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novoActionPerformed
        flag =1;
        label_id.setText("Novo");
        txt_nome.setText("");
        cb_perfil.setSelectedItem("");
        pass_usuario.setText("");
        pass_conf_usuario.setText("");
        txt_nome.setEnabled(true);
        cb_perfil.setEnabled(true);
        pass_usuario.setEnabled(true);
        pass_conf_usuario.setEnabled(true);
        btn_novo.setEnabled(false);
        btn_salvar.setEnabled(true);
        btn_cancelar.setEnabled(true);
        btn_editar.setEnabled(false);
        btn_excluir.setEnabled(false);
        
    }//GEN-LAST:event_btn_novoActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        txt_nome.setText("");
        cb_perfil.setSelectedItem("");
        pass_usuario.setText("");
        pass_conf_usuario.setText("");
        txt_nome.setEnabled(false);
        cb_perfil.setEnabled(false);
        pass_usuario.setEnabled(false);
        pass_conf_usuario.setEnabled(false);
        btn_salvar.setEnabled(false);
        btn_cancelar.setEnabled(false);
        btn_novo.setEnabled(true);
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarActionPerformed
       
        if(txt_nome.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Preencha o nome do Usuário!");
            txt_nome.requestFocus();
        }else if(pass_usuario.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Preencha o campo senha do usuário!");
            pass_usuario.requestFocus();
        }else if(pass_conf_usuario.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Repita a senha do usuário!");
            pass_conf_usuario.requestFocus();       
        }else 
            if(pass_usuario.getText().equals(pass_conf_usuario.getText())){
        
        if(flag == 1){
        mod.setUsNome(txt_nome.getText());
        mod.setUsPerfil((String) cb_perfil.getSelectedItem());
        mod.setUsSenha(pass_usuario.getText());
        mod.setUsSenha(pass_conf_usuario.getText());
        control.salvar(mod);
        txt_nome.setText("");
        cb_perfil.setSelectedItem("");
        pass_usuario.setText("");
        pass_conf_usuario.setText("");
        txt_nome.setEnabled(false);
        cb_perfil.setEnabled(false);
        pass_usuario.setEnabled(false);
        pass_conf_usuario.setEnabled(false);
        btn_novo.setEnabled(true);
        btn_salvar.setEnabled(false);
        btn_cancelar.setEnabled(false);
        btn_editar.setEnabled(false);
        btn_excluir.setEnabled(false);
        label_id.setText("Cadastrado");
        preencherTabela("select * from usuarios order by id_usuario");
        }else{
            mod.setUsID(Integer.parseInt(label_id.getText()));
            mod.setUsNome(txt_nome.getText());
            mod.setUsPerfil((String) cb_perfil.getSelectedItem());
            mod.setUsSenha(pass_usuario.getText());
            mod.setUsSenha(pass_conf_usuario.getText());
            control.Editar(mod);
            txt_nome.setText("");
            cb_perfil.setSelectedItem("");
            pass_usuario.setText("");
            pass_conf_usuario.setText("");
            txt_nome.setEnabled(false);
            cb_perfil.setEnabled(false);
            pass_usuario.setEnabled(false);
            pass_conf_usuario.setEnabled(false);
            btn_novo.setEnabled(true);
            btn_salvar.setEnabled(false);
            btn_cancelar.setEnabled(false);
            btn_editar.setEnabled(false);
            btn_excluir.setEnabled(false);
            label_id.setText("Alterado");
            preencherTabela("select * from usuarios order by id_usuario");
        }
        }else{
            JOptionPane.showMessageDialog(rootPane, "As senhas não são iguais!");
        }    
        
    }//GEN-LAST:event_btn_salvarActionPerformed

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        flag = 2;
        txt_nome.setEnabled(true);
        cb_perfil.setEnabled(true);
        pass_usuario.setEnabled(true);
        pass_conf_usuario.setEnabled(true);
        btn_cancelar.setEnabled(true);
        btn_novo.setEnabled(false);
        btn_editar.setEnabled(false);
        btn_excluir.setEnabled(false);
        btn_salvar.setEnabled(true);
        
        
    }//GEN-LAST:event_btn_editarActionPerformed

    private void btn_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluirActionPerformed
        int resposta = 0;
        resposta = JOptionPane.showConfirmDialog(rootPane,"Deseja Realmente Excluir este Usuário?");
        if (resposta == JOptionPane.YES_NO_OPTION){
        mod.setUsID((Integer.parseInt(label_id.getText())));
        control.Excluir(mod);
        txt_nome.setText("");
        cb_perfil.setSelectedItem("");
        pass_usuario.setText("");
        pass_conf_usuario.setText("");
        txt_nome.setEnabled(false);
        cb_perfil.setEnabled(false);
        pass_usuario.setEnabled(false);
        pass_conf_usuario.setEnabled(false);
        btn_novo.setEnabled(true);
        btn_salvar.setEnabled(false);
        btn_cancelar.setEnabled(false);
        btn_editar.setEnabled(false);
        btn_excluir.setEnabled(false); 
        label_id.setText("Excluido");
        preencherTabela("select * from usuarios order by id_usuario");
        } 
    }//GEN-LAST:event_btn_excluirActionPerformed

    private void btn_pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pesquisarActionPerformed
        btn_editar.setEnabled(true);
        btn_excluir.setEnabled(true);
        btn_cancelar.setEnabled(true);
        btn_novo.setEnabled(false);
        mod.setBusca(txt_buscar.getText());
        BeansUsuarios model = control.buscaUsuario(mod);
        label_id.setText(String.valueOf(model.getUsID()));
        txt_nome.setText(model.getUsNome());
        cb_perfil.setSelectedItem(model.getUsPerfil()); 
        preencherTabela("select * from usuarios where us_nome like'%"+mod.getBusca()+"%'");
        
    }//GEN-LAST:event_btn_pesquisarActionPerformed

    private void table_usuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_usuarioMouseClicked
       String nome =""+table_usuario.getValueAt(table_usuario.getSelectedRow(), 1);
             conex.conexao();
             conex.executaSQL("select * from usuarios where us_nome = '"+nome+"'");
            
           try {
             conex.rs.first();
             label_id.setText(String.valueOf(conex.rs.getInt("id_usuario")));
             txt_nome.setText(conex.rs.getString("us_nome"));
             cb_perfil.setSelectedItem(conex.rs.getString("perfil"));
             pass_usuario.setText(conex.rs.getString("us_senha"));
             pass_conf_usuario.setText(conex.rs.getString("us_senha"));
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(rootPane, "Erro ao acessar os dados!"+ex);
         }
         conex.desconecta();
         btn_editar.setEnabled(true);
         btn_excluir.setEnabled(true);
        
    }//GEN-LAST:event_table_usuarioMouseClicked
    public void preencherTabela(String Sql){
           ArrayList dados =  new ArrayList();
           String [] colunas =  new String []{"ID","Nome","Perfil"};
           conex.conexao();
           conex.executaSQL(Sql);
           
           try{
               conex.rs.first();
               do{
                   dados.add(new Object[]{conex.rs.getInt("id_usuario"),conex.rs.getString("us_nome"),conex.rs.getString("perfil")});
               }while(conex.rs.next());
           } catch(SQLException ex){
               JOptionPane.showMessageDialog(rootPane,"Usuário não encontrado!");
           }
           ModeloTabela modelo = new ModeloTabela(dados, colunas);
           table_usuario.setModel(modelo);
           table_usuario.getColumnModel().getColumn(0).setPreferredWidth(150);
           table_usuario.getColumnModel().getColumn(0).setResizable(false);
           table_usuario.getColumnModel().getColumn(1).setPreferredWidth(280);
           table_usuario.getColumnModel().getColumn(1).setResizable(false);
           table_usuario.getColumnModel().getColumn(2).setPreferredWidth(260);
           table_usuario.getColumnModel().getColumn(2).setResizable(false);
           table_usuario.getTableHeader().setReorderingAllowed(false);
           table_usuario.setAutoResizeMode(table_usuario.AUTO_RESIZE_OFF);
           table_usuario.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
           conex.desconecta();
       }
    
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
            java.util.logging.Logger.getLogger(Med_FormUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Med_FormUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Med_FormUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Med_FormUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Med_FormUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel_funcao;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_excluir;
    private javax.swing.JButton btn_novo;
    private javax.swing.JButton btn_pesquisar;
    private javax.swing.JButton btn_salvar;
    private javax.swing.JComboBox<String> cb_perfil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_id;
    private javax.swing.JPasswordField pass_conf_usuario;
    private javax.swing.JPasswordField pass_usuario;
    private javax.swing.JTable table_usuario;
    private javax.swing.JTextField txt_buscar;
    private javax.swing.JTextField txt_nome;
    // End of variables declaration//GEN-END:variables
}
