package View;

import ModelBeans.ModeloTabela;
import ModelConnection.connectionDB;
import ModelDAO.DAOAgenda;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;


public class Med_FormAgendaMedicos extends javax.swing.JFrame {
    connectionDB conex = new connectionDB();
    DAOAgenda daoAgenda = new DAOAgenda();
   
    
    String dtHoje;
    String status;
    String cod_ag;
    
    
    public Med_FormAgendaMedicos() {
        initComponents();
        
        Calendar data = Calendar.getInstance();
        Date d = data.getTime();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd"); 
        dateFormat.format(d);
     
        
        dtHoje = dateFormat.format(d);
        status = "Atendimento";
        
        preencherMedicos();
        
    }
    
     public void preencherMedicos(){
              conex.conexao();
              conex.executaSQL("select * from medicos  order by nome");
              try {
              conex.rs.first();
              cb_medicos.removeAllItems();
              do{
                  cb_medicos.addItem(conex.rs.getString("nome"));
               }while(conex.rs.next());
               
               }catch (SQLException ex){
                   JOptionPane.showMessageDialog(rootPane, "Erro ao preencher registro");
              }
              conex.desconecta();
     } 
     
     public void preencherTabela(String Sql){
        
           ArrayList dados =  new ArrayList();
           String [] colunas =  new String []{"ID","Nome Medico","Paciente", "Data","Hora","Status", "Motivo"};
           conex.conexao();
           conex.executaSQL(Sql);
           
           try{
               conex.rs.first();
               do{
                   dados.add(new Object[]{conex.rs.getInt("id_agenda"),conex.rs.getString("nome"),conex.rs.getString("pc_nome"),conex.rs.getString("agenda_data"),conex.rs.getString("agenda_hora"),conex.rs.getString("agenda_Status"),conex.rs.getString("agenda_motivo")});
               }while(conex.rs.next());
           } catch(SQLException ex){
               JOptionPane.showMessageDialog(rootPane,"Cadastro não encontrado!");
           }
           ModeloTabela modelo = new ModeloTabela(dados, colunas);
           table_agenda_medicos.setModel(modelo);
           table_agenda_medicos.getColumnModel().getColumn(0).setPreferredWidth(50);  //id_agenda
           table_agenda_medicos.getColumnModel().getColumn(0).setResizable(false);
           table_agenda_medicos.getColumnModel().getColumn(1).setPreferredWidth(140); //nome Medico
           table_agenda_medicos.getColumnModel().getColumn(1).setResizable(false);
           table_agenda_medicos.getColumnModel().getColumn(2).setPreferredWidth(140);  //nome Paciente
           table_agenda_medicos.getColumnModel().getColumn(2).setResizable(false);
           table_agenda_medicos.getColumnModel().getColumn(3).setPreferredWidth(100);   // agenda_data
           table_agenda_medicos.getColumnModel().getColumn(3).setResizable(false);
           table_agenda_medicos.getColumnModel().getColumn(4).setPreferredWidth(90);   // agenda_hora
           table_agenda_medicos.getColumnModel().getColumn(4).setResizable(false);
           table_agenda_medicos.getColumnModel().getColumn(5).setPreferredWidth(90);   // agenda_status
           table_agenda_medicos.getColumnModel().getColumn(5).setResizable(false);
           table_agenda_medicos.getColumnModel().getColumn(6).setPreferredWidth(500);  // agenda_motivo
           table_agenda_medicos.getColumnModel().getColumn(6).setResizable(false);
           table_agenda_medicos.getTableHeader().setReorderingAllowed(false);
           table_agenda_medicos.setAutoResizeMode(table_agenda_medicos.AUTO_RESIZE_OFF);
           table_agenda_medicos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
           conex.desconecta();
       }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_agenda_medicos = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        cb_medicos = new javax.swing.JComboBox<>();
        btn_atender = new javax.swing.JButton();
        btn_buscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agenda Médico");
        setResizable(false);

        jPanel2.setBackground(java.awt.Color.white);

        jLabel2.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel2.setText("Pacientes Agendados");

        table_agenda_medicos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        table_agenda_medicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        table_agenda_medicos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_agenda_medicosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_agenda_medicos);

        jPanel1.setBackground(java.awt.Color.white);
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btn_atender.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        btn_atender.setText("Atender");
        btn_atender.setEnabled(false);
        btn_atender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atenderActionPerformed(evt);
            }
        });

        btn_buscar.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_medicos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_atender, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                    .addComponent(btn_buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cb_medicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_atender)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_buscar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(819, 550));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void table_agenda_medicosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_agenda_medicosMouseClicked
           cod_ag ="" +table_agenda_medicos.getValueAt(table_agenda_medicos.getSelectedRow(), 0);
           
    }//GEN-LAST:event_table_agenda_medicosMouseClicked

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
          btn_atender.setEnabled(true);
          int cod = daoAgenda.BuscaCodMedico((String) cb_medicos.getSelectedItem());
          String codigo =  String.valueOf(cod);
         
         preencherTabela("select id_agenda, nome, pc_nome, agenda_data, agenda_hora, agenda_status, agenda_motivo from agenda inner join pacientes on ag_id_paciente = id_paciente inner join medicos on ag_id_medico = id_medico where ag_id_medico ='"+codigo+"'and agenda_data ='"+dtHoje+"' and agenda_status='"+status+"';");
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_atenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atenderActionPerformed
         Med_FormConsulta tela = new Med_FormConsulta(cod_ag);
         tela.setVisible(true);
         dispose();
    }//GEN-LAST:event_btn_atenderActionPerformed

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
            java.util.logging.Logger.getLogger(Med_FormAgendaMedicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Med_FormAgendaMedicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Med_FormAgendaMedicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Med_FormAgendaMedicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Med_FormAgendaMedicos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_atender;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JComboBox<String> cb_medicos;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_agenda_medicos;
    // End of variables declaration//GEN-END:variables
}
