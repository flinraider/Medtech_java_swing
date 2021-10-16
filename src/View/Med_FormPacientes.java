package View;
import ModelBeans.BeansPacientes;
import ModelBeans.ModeloTabela;
import ModelDAO.DAOPacientes;
import javax.swing.JOptionPane;
import ModelConnection.connectionDB;
import java.util.ArrayList;
import java.sql.SQLException;
import javax.swing.ListSelectionModel;


public class Med_FormPacientes extends javax.swing.JFrame {
    
    connectionDB conex = new connectionDB();
    BeansPacientes mod = new BeansPacientes();
    DAOPacientes controle = new DAOPacientes();
    int flag = 0;
   
    public Med_FormPacientes() {
        initComponents();
        preencherTabela("select * from pacientes order by id_paciente");
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btn_novo = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();
        btn_salvar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        btn_excluir = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txt_endereco = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_complemento = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_cidade = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cb_estado = new javax.swing.JComboBox<>();
        txt_cep = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_nome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_sobrenome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_nascimento = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_rg = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_contato = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        id_paciente = new javax.swing.JLabel();
        txt_pesquisa = new javax.swing.JTextField();
        btn_pesquisa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_pacientes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Pacientes");

        jPanel1.setBackground(java.awt.Color.white);

        jPanel2.setBackground(java.awt.Color.white);
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_cancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_novo)
                    .addComponent(btn_editar)
                    .addComponent(btn_salvar)
                    .addComponent(btn_cancelar)
                    .addComponent(btn_excluir))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel3.setBackground(java.awt.Color.white);
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Endereço", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        jLabel8.setText("Rua: ");

        txt_endereco.setEnabled(false);

        jLabel9.setText("Complemento: ");

        txt_complemento.setEnabled(false);

        jLabel10.setText("CEP: ");

        txt_cidade.setEnabled(false);

        jLabel11.setText("Cidade: ");

        jLabel12.setText("Estado: ");

        cb_estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO", "DF" }));
        cb_estado.setEnabled(false);

        txt_cep.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txt_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addComponent(jLabel12))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(txt_endereco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_complemento)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(cb_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_cep, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txt_complemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txt_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(cb_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txt_cep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );

        jPanel4.setBackground(java.awt.Color.white);
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Dados Pessoais", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        jLabel1.setText("Nome: ");

        txt_nome.setEnabled(false);

        jLabel2.setText("Sobrenome: ");

        txt_sobrenome.setEnabled(false);

        jLabel3.setText("Data de Nascimento");

        txt_nascimento.setEnabled(false);

        jLabel4.setText("RG: ");

        txt_rg.setEnabled(false);

        jLabel5.setText("Contato: ");

        txt_contato.setEnabled(false);

        jLabel6.setText("Codigo -");

        id_paciente.setForeground(new java.awt.Color(1, 76, 241));
        id_paciente.setText("0000");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_nascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_rg, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_contato))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(id_paciente)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_sobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txt_sobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(id_paciente))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_nascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txt_rg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txt_contato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_pesquisa.setText("Pesquisar");
        btn_pesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pesquisaActionPerformed(evt);
            }
        });

        table_pacientes.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        table_pacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        table_pacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_pacientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_pacientes);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_pesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_pesquisa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(769, 581));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novoActionPerformed
        flag = 1; 
        id_paciente.setText("Novo");
        txt_nome.setText("");
        txt_sobrenome.setText("");
        txt_nascimento.setText("");
        txt_rg.setText("");
        txt_contato.setText("");
        txt_endereco.setText("");
        txt_complemento.setText("");
        txt_cidade.setText("");
        cb_estado.setSelectedItem("sp");
        txt_cep.setText("");
        txt_nome.setEnabled(true);
        txt_sobrenome.setEnabled(true);
        txt_nascimento.setEnabled(true);
        txt_rg.setEnabled(true);
        txt_contato.setEnabled(true);
        txt_endereco.setEnabled(true);
        txt_complemento.setEnabled(true);
        txt_cidade.setEnabled(true);
        cb_estado.setEnabled(true);
        txt_cep.setEnabled(true);
        btn_novo.setEnabled(false);
        btn_editar.setEnabled(false);
        btn_excluir.setEnabled(false);
        btn_salvar.setEnabled(true); 
        btn_cancelar.setEnabled(true);
    }//GEN-LAST:event_btn_novoActionPerformed

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        flag = 2;
        txt_nome.setEnabled(true);
        txt_sobrenome.setEnabled(true);
        txt_nascimento.setEnabled(true);
        txt_rg.setEnabled(true);
        txt_contato.setEnabled(true);
        txt_endereco.setEnabled(true);
        txt_complemento.setEnabled(true);
        txt_cidade.setEnabled(true);
        cb_estado.setEnabled(true);
        txt_cep.setEnabled(true);
        btn_salvar.setEnabled(true);
        btn_cancelar.setEnabled(true);
        btn_editar.setEnabled(false);
        btn_novo.setEnabled(false);
        btn_excluir.setEnabled(false);
        preencherTabela("select * from pacientes order by id_paciente");
    }//GEN-LAST:event_btn_editarActionPerformed

    private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarActionPerformed
        if(txt_nome.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Preencha o nome do Paciente!");
            txt_nome.requestFocus();
        }else if(txt_rg.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Preencha o numero do RG do Paciente!");
            txt_rg.requestFocus();  
        }else
            
        if(flag == 1){
        mod.setPcNome(txt_nome.getText());
        mod.setPcSobrenome(txt_sobrenome.getText());
        mod.setPcRg(txt_rg.getText());
        mod.setPcData(txt_nascimento.getText());
        mod.setPcContato(txt_contato.getText());
        mod.setPcEndereco(txt_endereco.getText());
        mod.setPcComp(txt_complemento.getText());
        mod.setPcCid(txt_cidade.getText());
        mod.setPcUF((String)cb_estado.getSelectedItem());
        mod.setPcCep(txt_cep.getText());
        controle.salvar(mod);
        txt_nome.setText("");
        txt_sobrenome.setText("");
        txt_rg.setText("");
        txt_nascimento.setText("");
        txt_contato.setText("");
        txt_endereco.setText("");
        txt_complemento.setText("");
        txt_cidade.setText("");
        cb_estado.setSelectedItem("AC");
        txt_cep.setText("");
        txt_nome.setEnabled(false);
        txt_sobrenome.setEnabled(false);
        txt_rg.setEnabled(false);
        txt_nascimento.setEnabled(false);
        txt_contato.setEnabled(false);
        txt_endereco.setEnabled(false);
        txt_complemento.setEnabled(false);
        txt_cidade.setEnabled(false);
        cb_estado.setEnabled(false);
        txt_cep.setEnabled(false);
        btn_salvar.setEnabled(false); 
        btn_novo.setEnabled(true);
        preencherTabela("select * from pacientes order by id_paciente;");
        }
        else{
            mod.setPcID((Integer.parseInt(id_paciente.getText())));
            mod.setPcNome(txt_nome.getText());
            mod.setPcSobrenome(txt_sobrenome.getText());
            mod.setPcRg(txt_rg.getText());
            mod.setPcData(txt_nascimento.getText());
            mod.setPcContato(txt_contato.getText());
            mod.setPcEndereco(txt_endereco.getText());
            mod.setPcComp(txt_complemento.getText());
            mod.setPcCid(txt_cidade.getText());
            mod.setPcUF((String)cb_estado.getSelectedItem());
            mod.setPcCep(txt_cep.getText());
            controle.Editar(mod);
            txt_nome.setText("");
            txt_sobrenome.setText("");
            txt_rg.setText("");
            txt_nascimento.setText("");
            txt_contato.setText("");
            txt_endereco.setText("");
            txt_complemento.setText("");
            txt_cidade.setText("");
            cb_estado.setSelectedItem("AC");
            txt_cep.setText("");
            txt_nome.setEnabled(false);
            txt_sobrenome.setEnabled(false);
            txt_rg.setEnabled(false);
            txt_nascimento.setEnabled(false);
            txt_contato.setEnabled(false);
            txt_endereco.setEnabled(false);
            txt_complemento.setEnabled(false);
            txt_cidade.setEnabled(false);
            cb_estado.setEnabled(false);
            txt_cep.setEnabled(false);
            btn_salvar.setEnabled(false);
            btn_novo.setEnabled(true);
            btn_cancelar.setEnabled(false);
            preencherTabela("select * from pacientes order by id_paciente;");
        }
    }//GEN-LAST:event_btn_salvarActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        id_paciente.setText("Novo");
        txt_nome.setText("");
        txt_sobrenome.setText("");
        txt_nascimento.setText("");
        txt_rg.setText("");
        txt_contato.setText("");
        txt_endereco.setText("");
        txt_complemento.setText("");
        txt_cidade.setText("");
        cb_estado.setSelectedItem("sp");
        txt_cep.setText("");
        txt_nome.setEnabled(!true);
        txt_sobrenome.setEnabled(!true);
        txt_nascimento.setEnabled(!true);
        txt_rg.setEnabled(!true);
        txt_contato.setEnabled(!true);
        txt_endereco.setEnabled(!true);
        txt_complemento.setEnabled(!true);
        txt_cidade.setEnabled(!true);
        cb_estado.setEnabled(!true);
        txt_cep.setEnabled(!true);
        btn_salvar.setEnabled(!true);
        btn_cancelar.setEnabled(!true);
        btn_novo.setEnabled(true);
        btn_editar.setEnabled(false);
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluirActionPerformed
         int resposta = 0;
         resposta = JOptionPane.showConfirmDialog(rootPane,"Deseja Realmente Excluir este Cadastro?");
         if (resposta == JOptionPane.YES_NO_OPTION){
         mod.setPcID((Integer.parseInt(id_paciente.getText())));
         controle.Excluir(mod);
         id_paciente.setText("Excluido");
         txt_nome.setText("");
         txt_sobrenome.setText("");
         txt_nascimento.setText("");
         txt_rg.setText("");
         txt_contato.setText("");
         txt_endereco.setText("");
         txt_complemento.setText("");
         txt_cidade.setText("");
         cb_estado.setSelectedItem("sp");
         txt_cep.setText("");
         btn_editar.setEnabled(false);
         btn_cancelar.setEnabled(false);
         btn_salvar.setEnabled(false);
         btn_excluir.setEnabled(false);
         btn_novo.setEnabled(true);
         preencherTabela("select * from pacientes order by id_paciente");
         }
    }//GEN-LAST:event_btn_excluirActionPerformed

    private void btn_pesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pesquisaActionPerformed
        mod.setBusca(txt_pesquisa.getText());
        BeansPacientes model = controle.buscaPaciente(mod);
        id_paciente.setText(String.valueOf(model.getPcID()));
        txt_nome.setText(model.getPcNome());
        txt_sobrenome.setText(model.getPcSobrenome());
        txt_nascimento.setText(model.getPcData());
        txt_rg.setText(model.getPcRg());
        txt_contato.setText(model.getPcContato());
        txt_endereco.setText(model.getPcEndereco());
        txt_complemento.setText(model.getPcComp());
        txt_cidade.setText(model.getPcCid());
        cb_estado.setSelectedItem(model.getPcUF());
        txt_cep.setText(model.getPcCep());
        txt_nome.setEnabled(!true);
        txt_sobrenome.setEnabled(!true);
        txt_nascimento.setEnabled(!true);
        txt_rg.setEnabled(!true);
        txt_contato.setEnabled(!true);
        txt_endereco.setEnabled(!true);
        txt_complemento.setEnabled(!true);
        txt_cidade.setEnabled(!true);
        cb_estado.setEnabled(!true);
        txt_cep.setEnabled(!true);
        btn_editar.setEnabled(true);
        btn_excluir.setEnabled(true); 
        preencherTabela("select * from pacientes where pc_nome like'%"+mod.getBusca()+"%'");
    }//GEN-LAST:event_btn_pesquisaActionPerformed

    private void table_pacientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_pacientesMouseClicked
        String nome_paciente =""+table_pacientes.getValueAt(table_pacientes.getSelectedRow(), 1);
             conex.conexao();
             conex.executaSQL("select * from pacientes where pc_nome = '"+nome_paciente+"'");
            
           try {
             conex.rs.first();
             id_paciente.setText(String.valueOf(conex.rs.getInt("id_paciente")));
             txt_nome.setText(conex.rs.getString("pc_nome"));
             txt_sobrenome.setText(conex.rs.getString("pc_sobrenome"));
             txt_nascimento.setText(conex.rs.getString("pc_data_nascimento"));
             txt_rg.setText(conex.rs.getString("pc_rg"));
             txt_contato.setText(conex.rs.getString("pc_contato"));
             txt_endereco.setText(conex.rs.getString("pc_endereco"));
             txt_complemento.setText(conex.rs.getString("pc_complemento"));
             txt_cidade.setText(conex.rs.getString("pc_cidade"));
             cb_estado.setSelectedItem(conex.rs.getString("pc_estado"));
             txt_cep.setText(conex.rs.getString("pc_cep"));
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(rootPane, "Erro ao acessar os dados!"+ex);
         }
         conex.desconecta();
         btn_editar.setEnabled(true);
         btn_excluir.setEnabled(true);
    }//GEN-LAST:event_table_pacientesMouseClicked
     public void preencherTabela(String Sql){
           ArrayList dados =  new ArrayList();
           String [] colunas =  new String []{"ID","Nome","Sobrenome", "Nascimento", "RG", "Contato", "Endereço", "Complemento", "Cidade", "UF", "cep"};
           conex.conexao();
           conex.executaSQL(Sql);
           
           try{
               conex.rs.first();
               do{
                   dados.add(new Object[]{conex.rs.getInt("id_paciente"),conex.rs.getString("pc_nome"),conex.rs.getString("pc_sobrenome"), conex.rs.getString("pc_data_nascimento"), conex.rs.getString("pc_rg"), conex.rs.getString("pc_contato"), conex.rs.getString("pc_endereco"), conex.rs.getString("pc_complemento"), conex.rs.getString("pc_cidade"), conex.rs.getString("pc_estado"), conex.rs.getString("pc_cep")});
               }while(conex.rs.next());
           } catch(SQLException ex){
               JOptionPane.showMessageDialog(rootPane,"Paciente não encontrado!");
           }
           ModeloTabela modelo = new ModeloTabela(dados, colunas);
           table_pacientes.setModel(modelo);
           table_pacientes.getColumnModel().getColumn(0).setPreferredWidth(80);  //id
           table_pacientes.getColumnModel().getColumn(0).setResizable(false);
           table_pacientes.getColumnModel().getColumn(1).setPreferredWidth(100); //nome
           table_pacientes.getColumnModel().getColumn(1).setResizable(false);
           table_pacientes.getColumnModel().getColumn(2).setPreferredWidth(100); //sobrenome
           table_pacientes.getColumnModel().getColumn(2).setResizable(false);
           table_pacientes.getColumnModel().getColumn(3).setPreferredWidth(100); // nascimento
           table_pacientes.getColumnModel().getColumn(3).setResizable(false);
           table_pacientes.getColumnModel().getColumn(4).setPreferredWidth(100); // RG
           table_pacientes.getColumnModel().getColumn(4).setResizable(false);
           table_pacientes.getColumnModel().getColumn(5).setPreferredWidth(100); // contato
           table_pacientes.getColumnModel().getColumn(5).setResizable(false);
           table_pacientes.getColumnModel().getColumn(6).setPreferredWidth(200); // endereço
           table_pacientes.getColumnModel().getColumn(6).setResizable(false);
           table_pacientes.getColumnModel().getColumn(7).setPreferredWidth(150); // complemento
           table_pacientes.getColumnModel().getColumn(7).setResizable(false);
           table_pacientes.getColumnModel().getColumn(8).setPreferredWidth(120); // cidade
           table_pacientes.getColumnModel().getColumn(8).setResizable(false);
           table_pacientes.getColumnModel().getColumn(9).setPreferredWidth(50); // estado
           table_pacientes.getColumnModel().getColumn(9).setResizable(false);
           table_pacientes.getColumnModel().getColumn(10).setPreferredWidth(80); // cep
           table_pacientes.getColumnModel().getColumn(10).setResizable(false);
           
           // div da tabela//
           table_pacientes.getTableHeader().setReorderingAllowed(false);
           table_pacientes.setAutoResizeMode(table_pacientes.AUTO_RESIZE_OFF);
           table_pacientes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
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
            java.util.logging.Logger.getLogger(Med_FormPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Med_FormPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Med_FormPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Med_FormPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Med_FormPacientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_excluir;
    private javax.swing.JButton btn_novo;
    private javax.swing.JButton btn_pesquisa;
    private javax.swing.JButton btn_salvar;
    private javax.swing.JComboBox<String> cb_estado;
    private javax.swing.JLabel id_paciente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_pacientes;
    private javax.swing.JTextField txt_cep;
    private javax.swing.JTextField txt_cidade;
    private javax.swing.JTextField txt_complemento;
    private javax.swing.JTextField txt_contato;
    private javax.swing.JTextField txt_endereco;
    private javax.swing.JTextField txt_nascimento;
    private javax.swing.JTextField txt_nome;
    private javax.swing.JTextField txt_pesquisa;
    private javax.swing.JTextField txt_rg;
    private javax.swing.JTextField txt_sobrenome;
    // End of variables declaration//GEN-END:variables

}
