
package View;

import ModelDAO.DAOMedicos;
import ModelConnection.connectionDB;
import ModelBeans.BeansMedicos;
import ModelBeans.ModeloTabela;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ListSelectionModel;



public class Med_FormMedicos extends javax.swing.JFrame {
     connectionDB conex = new connectionDB();
     DAOMedicos control = new DAOMedicos();
     BeansMedicos mod = new BeansMedicos();
     int flag = 0;
     String vazio = "<vazio>";
    
    public Med_FormMedicos() {
        initComponents();
        preencherTabela("select * from medicos order by id_medico;");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_nome_medico = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cb_especialidade = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txt_crm_medico = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_medicos = new javax.swing.JTable();
        btn_buscar = new javax.swing.JButton();
        txt_pesquisa_medico = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_id_medico = new javax.swing.JLabel();
        Pane_funcao = new javax.swing.JPanel();
        btn_novo = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();
        btn_salvar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        btn_excluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Médicos");

        jPanel2.setBackground(java.awt.Color.white);

        jPanel1.setBackground(java.awt.Color.white);
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Dados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        jLabel1.setText("Nome: ");

        txt_nome_medico.setEnabled(false);

        jLabel2.setText("Especialidade: ");

        cb_especialidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<vazio>", "Acupuntura", "Alergia e Imunologia", "Anestesiologia", "Angiologia", "Cancerologia", "Cardiologia", "Cirurgia Cardiovascular", "Cirurgia da Mão", "Cirurgia de Cabeça e Pescoço", "Cirurgia do Aparelho Digestivo", "Cirurgia Geral", "Cirurgia Pediátrica", "Cirurgia Plástica", "Cirurgia Torácica", "Cirurgia Vascular", "Clínica Médica", "Coloproctologia", "Dermatologia", "Endocrinologia e Metabologia", "Endoscopia", "Gastroenterologia", "Genética Médica", "Geriatria", "Ginecologia e Obstetrícia", "Hematologia e Hemoterapia", "Homeopatia", "Infectologia", "Mastologia", "Medicina de Família e Comunidade", "Medicina do Trabalho", "Medicina de Tráfego", "Medicina Esportiva", "Medicina Física e Reabilitação", "Medicina Intensiva", "Medicina Legal e Perícia Médica", "Medicina Nuclear", "Medicina Preventiva e Social", "Nefrologia", "Neurocirurgia", "Neurologia", "Nutrologia", "Oftalmologia", "Ortopedia e Traumatologia", "Otorrinolaringologia", "Patologia", "Patologia Clínica/Medicina Laboratorial", "Pediatria", "Pneumologia", "Psiquiatria", "Radiologia e Diagnóstico por Imagem", "Radioterapia", "Reumatologia", "Urologia", "Áreas de Atuação reconhecidas", "Administração em Saúde", "Alergia e Imunologia Pediátrica", "Angiorradiologia e Cirurgia Endovascular", "Atendimento ao queimado", "Cardiologia Pediátrica", "Cirurgia Crânio-Maxilo-Facial", "Cirurgia do Trauma", "Cirurgia Videolaparoscópica", "Citopatologia", "Densitometria Óssea", "Ecocardiografia", "Ecografia Vascular com Doppler", "Eletrofisiologia Clínica Invasiva", "Endocrinologia Pediátrica", "Endoscopia Digestiva", "Endoscopia Ginecológica", "Endoscopia Respiratória", "Ergometria", "Foniatria", "Gastroenterologia Pediátrica", "Hansenologia", "Hematologia e Hemoterapia Pediátrica", "Hemodinâmica e Cardiologia Intervencionista", "Hepatologia", "Infectologia Hospitalar", "Infectologia Pediátrica", "Mamografia", "Medicina de Urgência", "Medicina do Adolescente", "Medicina do Sono", "Medicina Fetal", "Medicina Intensiva Pediátrica", "Medicina Paliativa", "Medicina Tropical", "Nefrologia Pediátrica", "Neonatologia", "Neurofisiologia Clínica", "Neurologia Pediátrica", "Neurorradiologia", "Nutrição Parenteral e Enteral", "Nutrição Parenteral e Enteral Pediátrica", "Nutrologia Pediátrico", "Pneumologia Pediátrica", "Psicogeriatria", "Psicoterapia", "Psiquiatria da Infância e Adolescência", "Psiquiatria Forense", "Radiologia Intervencionista e Angiorradiologia", "Reumatologia Pediátrica", "Sexologia", "Transplante de Medula Óssea", "Ultrassonografia em Ginecologia e Obstetrícia" }));
        cb_especialidade.setEnabled(false);
        cb_especialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_especialidadeActionPerformed(evt);
            }
        });

        jLabel3.setText("  CRM: ");

        txt_crm_medico.setEnabled(false);

        table_medicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        table_medicos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_medicosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_medicos);

        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        txt_pesquisa_medico.setText("Pesquisar...");

        jLabel4.setText("Codigo -");

        txt_id_medico.setForeground(new java.awt.Color(2, 35, 229));
        txt_id_medico.setText("0000");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cb_especialidade, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_crm_medico))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_id_medico)
                                .addGap(85, 85, 85)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_nome_medico, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_pesquisa_medico)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1)
                    .addComponent(txt_nome_medico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_id_medico))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cb_especialidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txt_crm_medico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_buscar)
                    .addComponent(txt_pesquisa_medico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                .addContainerGap())
        );

        Pane_funcao.setBackground(java.awt.Color.white);
        Pane_funcao.setBorder(javax.swing.BorderFactory.createEtchedBorder());

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

        javax.swing.GroupLayout Pane_funcaoLayout = new javax.swing.GroupLayout(Pane_funcao);
        Pane_funcao.setLayout(Pane_funcaoLayout);
        Pane_funcaoLayout.setHorizontalGroup(
            Pane_funcaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pane_funcaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_cancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(334, Short.MAX_VALUE))
        );
        Pane_funcaoLayout.setVerticalGroup(
            Pane_funcaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pane_funcaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Pane_funcaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_novo)
                    .addComponent(btn_editar)
                    .addComponent(btn_salvar)
                    .addComponent(btn_cancelar)
                    .addComponent(btn_excluir))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Pane_funcao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Pane_funcao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(776, 463));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarActionPerformed
        if(txt_nome_medico.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Preencha o nome do Médico!");
            txt_nome_medico.requestFocus();
        }else if(txt_crm_medico.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Preencha o numero de CRM do Medico!");
            txt_crm_medico.requestFocus();
       //}else if(cb_especialidade.setSelectedItem(vazio)){
            
        }else
            
        if(flag == 1){
        mod.setNome(txt_nome_medico.getText());
        mod.setEspecialidade((String) cb_especialidade.getSelectedItem());
        mod.setCrm(Integer.parseInt(txt_crm_medico.getText()));
        control.salvar(mod);
        txt_nome_medico.setText("");
        txt_crm_medico.setText("");
        cb_especialidade.setSelectedItem("<vazio>");
        txt_nome_medico.setEnabled(false);
        txt_crm_medico.setEnabled(false);
        cb_especialidade.setEnabled(false);
        btn_salvar.setEnabled(false); 
        preencherTabela("select * from medicos order by id_medico;");
        }
        else{
            mod.setCodigo((Integer.parseInt(txt_id_medico.getText())));
            mod.setNome(txt_nome_medico.getText());
            mod.setEspecialidade((String)cb_especialidade.getSelectedItem());
            mod.setCrm(Integer.parseInt(txt_crm_medico.getText()));
            control.Editar(mod);
            txt_id_medico.setText("");
            txt_nome_medico.setText("");
            txt_crm_medico.setText("");
            txt_pesquisa_medico.setText("");
            cb_especialidade.setSelectedItem("<vazio>");
            txt_nome_medico.setEnabled(false);
            txt_crm_medico.setEnabled(false);
            cb_especialidade.setEnabled(false);
            btn_salvar.setEnabled(false);
            btn_novo.setEnabled(true);
            btn_cancelar.setEnabled(false);
            preencherTabela("select * from medicos order by id_medico;");
        }
    }//GEN-LAST:event_btn_salvarActionPerformed

    private void btn_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novoActionPerformed
        flag = 1; 
        txt_id_medico.setText("Novo");
        txt_nome_medico.setText("");
        txt_crm_medico.setText("");
        txt_pesquisa_medico.setText("");
        txt_nome_medico.setEnabled(true);
        txt_crm_medico.setEnabled(true);
        cb_especialidade.setEnabled(true);
        btn_salvar.setEnabled(true); 
        btn_cancelar.setEnabled(true); 
    }//GEN-LAST:event_btn_novoActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        mod.setPesquisa(txt_pesquisa_medico.getText());
        BeansMedicos model = control.buscaMedico(mod);
        txt_id_medico.setText(String.valueOf(model.getCodigo()));
        txt_nome_medico.setText(model.getNome());
        txt_crm_medico.setText(String.valueOf(model.getCrm()));
        cb_especialidade.setSelectedItem(model.getEspecialidade());
        btn_editar.setEnabled(true);
        btn_excluir.setEnabled(true);  
        preencherTabela("select * from medicos where nome like'%"+mod.getPesquisa()+"%'");
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        txt_nome_medico.setText("");
        txt_crm_medico.setText("");
        cb_especialidade.setSelectedItem("<vazio>");
        txt_nome_medico.setEnabled(!true);
        txt_crm_medico.setEnabled(!true);
        cb_especialidade.setEnabled(!true);
        btn_salvar.setEnabled(!true);
        btn_cancelar.setEnabled(!true);
        btn_novo.setEnabled(true);
        btn_editar.setEnabled(false);
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        flag = 2;
        txt_nome_medico.setEnabled(true);
        txt_crm_medico.setEnabled(true);
        cb_especialidade.setEnabled(true);
        btn_salvar.setEnabled(true);
        btn_cancelar.setEnabled(true);
        btn_editar.setEnabled(false);
        btn_novo.setEnabled(false);
        btn_excluir.setEnabled(false);
        preencherTabela("select * from medicos order by id_medico;");
    }//GEN-LAST:event_btn_editarActionPerformed

    private void btn_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluirActionPerformed
         int resposta = 0;
         resposta = JOptionPane.showConfirmDialog(rootPane,"Deseja Realmente Excluir este Cadastro?");
         if (resposta == JOptionPane.YES_NO_OPTION){
         mod.setCodigo((Integer.parseInt(txt_id_medico.getText())));
         control.Excluir(mod);
         txt_id_medico.setText("");
         txt_nome_medico.setText("");
         txt_crm_medico.setText("");
         txt_pesquisa_medico.setText("");
         cb_especialidade.setSelectedItem("<vazio>");
         btn_editar.setEnabled(false);
         btn_cancelar.setEnabled(false);
         btn_salvar.setEnabled(false);
         btn_excluir.setEnabled(false);
         btn_novo.setEnabled(true);
         btn_buscar.setEnabled(true);
         preencherTabela("select * from medicos order by id_medico;");
         } 
             
         
    }//GEN-LAST:event_btn_excluirActionPerformed

    private void table_medicosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_medicosMouseClicked
             String nome =""+table_medicos.getValueAt(table_medicos.getSelectedRow(), 1);
             conex.conexao();
             conex.executaSQL("select * from medicos where nome = '"+nome+"'");
            
           try {
             conex.rs.first();
             txt_id_medico.setText(String.valueOf(conex.rs.getInt("id_medico")));
             txt_nome_medico.setText(conex.rs.getString("nome"));
             cb_especialidade.setSelectedItem(conex.rs.getString("especialidade"));
             txt_crm_medico.setText(conex.rs.getString("crm"));
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(rootPane, "Erro ao acessar os dados!"+ex);
         }
         conex.desconecta();
         btn_editar.setEnabled(true);
         btn_excluir.setEnabled(true);
    }//GEN-LAST:event_table_medicosMouseClicked

    private void cb_especialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_especialidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_especialidadeActionPerformed
       public void preencherTabela(String Sql){
           ArrayList dados =  new ArrayList();
           String [] colunas =  new String []{"ID","Nome","Especialidade", "CRM"};
           conex.conexao();
           conex.executaSQL(Sql);
           
           try{
               conex.rs.first();
               do{
                   dados.add(new Object[]{conex.rs.getInt("id_medico"),conex.rs.getString("nome"),conex.rs.getString("especialidade"),conex.rs.getInt("crm")});
               }while(conex.rs.next());
           } catch(SQLException ex){
               JOptionPane.showMessageDialog(rootPane,"Cadastro não encontrado!");
           }
           ModeloTabela modelo = new ModeloTabela(dados, colunas);
           table_medicos.setModel(modelo);
           table_medicos.getColumnModel().getColumn(0).setPreferredWidth(80);
           table_medicos.getColumnModel().getColumn(0).setResizable(false);
           table_medicos.getColumnModel().getColumn(1).setPreferredWidth(235);
           table_medicos.getColumnModel().getColumn(1).setResizable(false);
           table_medicos.getColumnModel().getColumn(2).setPreferredWidth(200);
           table_medicos.getColumnModel().getColumn(2).setResizable(false);
           table_medicos.getColumnModel().getColumn(3).setPreferredWidth(200);
           table_medicos.getColumnModel().getColumn(3).setResizable(false);
           table_medicos.getTableHeader().setReorderingAllowed(false);
           table_medicos.setAutoResizeMode(table_medicos.AUTO_RESIZE_OFF);
           table_medicos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
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
            java.util.logging.Logger.getLogger(Med_FormMedicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Med_FormMedicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Med_FormMedicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Med_FormMedicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Med_FormMedicos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Pane_funcao;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_excluir;
    private javax.swing.JButton btn_novo;
    private javax.swing.JButton btn_salvar;
    private javax.swing.JComboBox<String> cb_especialidade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_medicos;
    private javax.swing.JTextField txt_crm_medico;
    private javax.swing.JLabel txt_id_medico;
    private javax.swing.JTextField txt_nome_medico;
    private javax.swing.JTextField txt_pesquisa_medico;
    // End of variables declaration//GEN-END:variables
}
