package View;

import ModelBeans.BeansAgenda;
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


public class Med_FormAgenda extends javax.swing.JFrame {
    connectionDB conex = new connectionDB();
    BeansAgenda agenda = new BeansAgenda();
    BeansAgenda agen = new BeansAgenda();
    DAOAgenda daoAgenda = new DAOAgenda();
    
    String dtHoje;
    String status;

 
    public Med_FormAgenda() {
        initComponents();
        
        Calendar data = Calendar.getInstance();
        Date d = data.getTime();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd"); 
        dateFormat.format(d);
     
        
        dtHoje = dateFormat.format(d);
        status = "aberto";
        
        //JOptionPane.showMessageDialog(rootPane, dtHoje);
        
          preencherTabela("select id_agenda, nome, pc_nome, agenda_data, agenda_hora, agenda_status, agenda_motivo from agenda inner join pacientes on ag_id_paciente = id_paciente inner join medicos on ag_id_medico = id_medico where agenda_data ='"+dtHoje+"' and agenda_status='"+status+"';");  
    
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
           agenda_dia.setModel(modelo);
           agenda_dia.getColumnModel().getColumn(0).setPreferredWidth(50);  //id_agenda
           agenda_dia.getColumnModel().getColumn(0).setResizable(false);
           agenda_dia.getColumnModel().getColumn(1).setPreferredWidth(140); //nome Medico
           agenda_dia.getColumnModel().getColumn(1).setResizable(false);
           agenda_dia.getColumnModel().getColumn(2).setPreferredWidth(140);  //nome Paciente
           agenda_dia.getColumnModel().getColumn(2).setResizable(false);
           agenda_dia.getColumnModel().getColumn(3).setPreferredWidth(100);   // agenda_data
           agenda_dia.getColumnModel().getColumn(3).setResizable(false);
           agenda_dia.getColumnModel().getColumn(4).setPreferredWidth(90);   // agenda_hora
           agenda_dia.getColumnModel().getColumn(4).setResizable(false);
           agenda_dia.getColumnModel().getColumn(5).setPreferredWidth(90);   // agenda_status
           agenda_dia.getColumnModel().getColumn(5).setResizable(false);
           agenda_dia.getColumnModel().getColumn(6).setPreferredWidth(500);  // agenda_motivo
           agenda_dia.getColumnModel().getColumn(6).setResizable(false);
           agenda_dia.getTableHeader().setReorderingAllowed(false);
           agenda_dia.setAutoResizeMode(agenda_dia.AUTO_RESIZE_OFF);
           agenda_dia.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
           conex.desconecta();
       }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btn_atender = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btn_buscar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        agenda_dia = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agenda ");

        jPanel1.setBackground(java.awt.Color.white);

        jPanel2.setBackground(java.awt.Color.white);
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btn_atender.setText("Atender");
        btn_atender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atenderActionPerformed(evt);
            }
        });

        jButton2.setText("Remarcar");

        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        jButton4.setText("Cancelar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_atender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_atender)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_buscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        agenda_dia.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        agenda_dia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        agenda_dia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agenda_diaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(agenda_dia);

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel1.setText("Agendamentos do Dia: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 647, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE))
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

        setSize(new java.awt.Dimension(789, 545));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void agenda_diaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agenda_diaMouseClicked
        String id_agenda =""+agenda_dia.getValueAt(agenda_dia.getSelectedRow(), 0);
             conex.conexao();
             conex.executaSQL("select agenda_status, id_agenda from agenda where id_agenda = '"+id_agenda+"'");
            
           try {
             conex.rs.first();
             agen.setStatus("Atendimento");
             agen.setIdAgenda(conex.rs.getInt("id_agenda"));
             //JOptionPane.showMessageDialog(rootPane, conex.rs.getInt("id_agenda"));
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(rootPane, "Erro ao acessar os dados!"+ex);
         }
         conex.desconecta();
         
    }//GEN-LAST:event_agenda_diaMouseClicked

    private void btn_atenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atenderActionPerformed
        daoAgenda.Alterar(agen);
        preencherTabela("select id_agenda, nome, pc_nome, agenda_data, agenda_hora, agenda_status, agenda_motivo from agenda inner join pacientes on ag_id_paciente = id_paciente inner join medicos on ag_id_medico = id_medico where agenda_data ='"+dtHoje+"' and agenda_status='"+status+"';");
    }//GEN-LAST:event_btn_atenderActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
       preencherTabela("select id_agenda, nome, pc_nome, agenda_data, agenda_hora, agenda_status, agenda_motivo from agenda inner join pacientes on ag_id_paciente = id_paciente inner join medicos on ag_id_medico = id_medico where agenda_data ='"+dtHoje+"' and agenda_status='"+status+"';");  
    }//GEN-LAST:event_btn_buscarActionPerformed

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
            java.util.logging.Logger.getLogger(Med_FormAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Med_FormAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Med_FormAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Med_FormAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Med_FormAgenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable agenda_dia;
    private javax.swing.JButton btn_atender;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
