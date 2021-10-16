package View;

import ModelBeans.BeansAgenda;
import ModelBeans.ModeloTabela;
import ModelConnection.connectionDB;
import ModelDAO.DAOAgenda;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;


public class Med_Agendamento extends javax.swing.JFrame {
     connectionDB conex = new connectionDB();
     BeansAgenda agenda = new BeansAgenda();
   
    public Med_Agendamento() {
        initComponents();
        preencherMedicos();
    }
    public void preencherMedicos(){
              conex.conexao();
              conex.executaSQL("select * from medicos  order by nome");
              try {
              conex.rs.first();
              cb_busca_med.removeAllItems();
              do{
                  cb_busca_med.addItem(conex.rs.getString("nome"));
               }while(conex.rs.next());
               
                   }catch (SQLException ex){
                     JOptionPane.showMessageDialog(rootPane, "Erro ao preencher registro");
                   }
                    conex.desconecta();

           }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pro_agenda = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_busca_pc = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cb_hora = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cb_busca_med = new javax.swing.JComboBox<>();
        btn_confirma = new javax.swing.JButton();
        btn_cancela = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        table_pacientes = new javax.swing.JTable();
        data_agenda = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        motivo_consulta = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agendamentos");

        jPanel1.setBackground(java.awt.Color.white);

        jPanel2.setBackground(java.awt.Color.white);
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Protocolo de Agendamento - ");

        pro_agenda.setForeground(new java.awt.Color(62, 83, 254));
        pro_agenda.setText("00000");

        jLabel2.setText("Paciente: ");

        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        jLabel4.setText("Hora: ");

        cb_hora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "05:00", "05:30", "06:00", "06:30", "07:00", "07:30", "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00", "22:30", "23:00", "23:30", "00:00", "00:30", "01:00", "01:30", "02:00", "02:30", "03:00", "03:30", "04:00", "04:30", " " }));
        cb_hora.setEnabled(false);

        jLabel5.setText("Médico: ");

        jLabel6.setText("Dia: ");

        cb_busca_med.setEnabled(false);

        btn_confirma.setText("Confirmar Agendamento");
        btn_confirma.setEnabled(false);
        btn_confirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_confirmaActionPerformed(evt);
            }
        });

        btn_cancela.setText("Cancelar Agendamento");
        btn_cancela.setEnabled(false);
        btn_cancela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelaActionPerformed(evt);
            }
        });

        jLabel8.setText("Paciente: ");

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
        jScrollPane3.setViewportView(table_pacientes);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pro_agenda))
                            .addComponent(cb_busca_med, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txt_busca_pc, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_buscar)))
                        .addGap(51, 51, 51)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_confirma, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
                            .addComponent(btn_cancela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(55, 55, 55)
                                        .addComponent(jLabel6))
                                    .addComponent(cb_hora, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(data_agenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(pro_agenda))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_busca_pc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_buscar)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cb_hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(23, 23, 23)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(data_agenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_confirma)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cancela)
                    .addComponent(cb_busca_med, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );

        motivo_consulta.setColumns(20);
        motivo_consulta.setRows(5);
        jScrollPane2.setViewportView(motivo_consulta);

        jLabel7.setText("Motivo: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
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

        setSize(new java.awt.Dimension(826, 571));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void table_pacientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_pacientesMouseClicked
             String nome_paciente =""+table_pacientes.getValueAt(table_pacientes.getSelectedRow(), 1);
             conex.conexao();
             conex.executaSQL("select * from pacientes where pc_nome = '"+nome_paciente+"'");
            
           try {
             conex.rs.first();
             
             txt_busca_pc.setText(conex.rs.getString("pc_nome"));
             
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(rootPane, "Erro ao acessar os dados!"+ex);
         }
         conex.desconecta();
         cb_busca_med.setEnabled(true);
         btn_confirma.setEnabled(true);
         btn_cancela.setEnabled(true);
         cb_hora.setEnabled(true);
         data_agenda.setEnabled(true);
    }//GEN-LAST:event_table_pacientesMouseClicked

    private void btn_cancelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelaActionPerformed
                     txt_busca_pc.setText("");
                     cb_busca_med.setSelectedItem("Rubens");
                     cb_hora.setSelectedItem("05:00");
                     data_agenda.setDate(null);
                     cb_busca_med.setEnabled(!true);
                     btn_confirma.setEnabled(!true);
                     btn_cancela.setEnabled(!true);
                     cb_hora.setEnabled(!true);
                     data_agenda.setEnabled(!true);
    }//GEN-LAST:event_btn_cancelaActionPerformed

    private void btn_confirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_confirmaActionPerformed
              
                     agenda.setNomePac(txt_busca_pc.getText());
                     agenda.setNomeMed((String)cb_busca_med.getSelectedItem());
                     agenda.setHora((String)cb_hora.getSelectedItem());
                     agenda.setMotivo(motivo_consulta.getText());
                     agenda.setData(data_agenda.getDate());
                     agenda.setStatus("aberto");
                     DAOAgenda dao = new DAOAgenda();
                     dao.Salvar(agenda);
                     conex.desconecta();
                     txt_busca_pc.setText("");
                     cb_busca_med.setSelectedItem("Rubens");
                     cb_hora.setSelectedItem("05:00");
                     data_agenda.setDate(null);
                     cb_busca_med.setEnabled(!true);
                     btn_confirma.setEnabled(!true);
                     btn_cancela.setEnabled(!true);
                     cb_hora.setEnabled(!true);
                     data_agenda.setEnabled(!true);   
                     motivo_consulta.setText("");
                 //    dispose();  esta função para fechar atela após agendamento!
    }//GEN-LAST:event_btn_confirmaActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        preencherTabela("select id_paciente, pc_nome, pc_sobrenome, pc_rg, pc_contato from pacientes where pc_nome like'%"+txt_busca_pc.getText()+"%'");
    }//GEN-LAST:event_btn_buscarActionPerformed

    public void preencherTabela(String Sql){
           ArrayList dados =  new ArrayList();
           String [] colunas =  new String []{"Codigo","Nome","Sobrenome", "RG", "Contato"};
           conex.conexao();
           conex.executaSQL(Sql);
           
           try{
               conex.rs.first();
               do{
                   dados.add(new Object[]{conex.rs.getInt("id_paciente"),conex.rs.getString("pc_nome"),conex.rs.getString("pc_sobrenome"), conex.rs.getString("pc_rg"), conex.rs.getString("pc_contato")});
               }while(conex.rs.next());
           } catch(SQLException ex){
               JOptionPane.showMessageDialog(rootPane,"Paciente não encontrado!");
           }
           ModeloTabela modelo = new ModeloTabela(dados, colunas);
           table_pacientes.setModel(modelo);
           table_pacientes.getColumnModel().getColumn(0).setPreferredWidth(120);  //id
           table_pacientes.getColumnModel().getColumn(0).setResizable(false);
           table_pacientes.getColumnModel().getColumn(1).setPreferredWidth(170); //nome
           table_pacientes.getColumnModel().getColumn(1).setResizable(false);
           table_pacientes.getColumnModel().getColumn(2).setPreferredWidth(170); //sobrenome
           table_pacientes.getColumnModel().getColumn(2).setResizable(false);    
           table_pacientes.getColumnModel().getColumn(3).setPreferredWidth(170); // RG
           table_pacientes.getColumnModel().getColumn(3).setResizable(false);
           table_pacientes.getColumnModel().getColumn(4).setPreferredWidth(170); // contato
           table_pacientes.getColumnModel().getColumn(4).setResizable(false);
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
            java.util.logging.Logger.getLogger(Med_Agendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Med_Agendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Med_Agendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Med_Agendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Med_Agendamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_cancela;
    private javax.swing.JButton btn_confirma;
    private javax.swing.JComboBox<String> cb_busca_med;
    private javax.swing.JComboBox<String> cb_hora;
    private com.toedter.calendar.JDateChooser data_agenda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea motivo_consulta;
    private javax.swing.JLabel pro_agenda;
    private javax.swing.JTable table_pacientes;
    private javax.swing.JTextField txt_busca_pc;
    // End of variables declaration//GEN-END:variables
}
