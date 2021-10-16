package View;

import ModelConnection.connectionDB;  //aqui importamos a classe//
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * @author Leonardo Teixeira
 * Console-Tech 03/03/2020.
 */
public class Med_Principal extends javax.swing.JFrame {

     connectionDB conecta = new connectionDB();  // aqui instanciamos para poder chamar a conexão ou desconecta// 
     // aqui estou chamando a classe de conecta//
    // Med_FormAgenda age_tela =new Med_FormAgenda();
     Med_Agendamento ag_tela =new Med_Agendamento();
     Med_FormMedicos me_tela = new Med_FormMedicos();
     Med_FormUsuarios us_tela = new Med_FormUsuarios();
     Med_FormPacientes pc_tela = new Med_FormPacientes();
     Med_FormEnfermeiras en_tela = new Med_FormEnfermeiras();  
    
    public Med_Principal(String usuario) {  // colocar dentro do parenteses String usuario para tela receber o usuario
        initComponents();
        nome_usuario.setText(usuario);  // aqui recebe o nome do usario logado
        conecta.conexao();  // aqui estamos solicitando para o java ao carregar o frame trazer junto a conexão com o DB//
        lbl_agenda.setVisible(false);
        btn_fechar_internalframe.setVisible(false);
    }

    private Med_Principal() {  // metodo construtor para validar o usuario
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        nome_usuario = new javax.swing.JLabel();
        panel_abas = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lbl_agenda = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        bem_vindo = new javax.swing.JInternalFrame();
        jpane_bemvindo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btn_cad_medicos = new javax.swing.JButton();
        btn_cad_enfermeiras = new javax.swing.JButton();
        btn_cad_pacientes = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btn_cad_agenda = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn_fechar_internalframe = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        internalframe = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu_cadastros = new javax.swing.JMenu();
        menu_medicos = new javax.swing.JMenuItem();
        menu_enfermeiras = new javax.swing.JMenuItem();
        menu_pacientes = new javax.swing.JMenuItem();
        menu_agendamentos = new javax.swing.JMenuItem();
        menu_agenda_dia = new javax.swing.JMenuItem();
        menu_agenda_medicos = new javax.swing.JMenuItem();
        menu_usuarios = new javax.swing.JMenuItem();
        menu_logout = new javax.swing.JMenuItem();
        menu_exit = new javax.swing.JMenuItem();
        menu_relatorios = new javax.swing.JMenu();
        menu_ferramentas = new javax.swing.JMenu();
        menu_telaBemVindo = new javax.swing.JMenuItem();
        menu_Config = new javax.swing.JMenu();

        jMenu1.setText("File");
        jMenuBar2.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar2.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Principal");
        setExtendedState(6);
        setResizable(false);

        jPanel2.setBackground(java.awt.Color.white);
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel1.setBackground(java.awt.Color.white);
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, null));

        jLabel4.setText("Usuário: ");

        nome_usuario.setText("00000");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nome_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1085, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(nome_usuario))
                .addContainerGap())
        );

        panel_abas.setBackground(java.awt.Color.white);
        panel_abas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panel_abas.setForeground(new java.awt.Color(143, 196, 253));

        lbl_agenda.setText("Agenda");
        lbl_agenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_agendaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_agenda)
                .addContainerGap(129, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_agenda)
                .addContainerGap(569, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel_abasLayout = new javax.swing.GroupLayout(panel_abas);
        panel_abas.setLayout(panel_abasLayout);
        panel_abasLayout.setHorizontalGroup(
            panel_abasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel_abasLayout.setVerticalGroup(
            panel_abasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(178, 210, 244));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setForeground(new java.awt.Color(77, 156, 240));
        jPanel4.setLayout(null);

        bem_vindo.setTitle("Bem vindo");
        bem_vindo.setToolTipText("");
        bem_vindo.setVisible(true);
        bem_vindo.getContentPane().setLayout(null);

        jpane_bemvindo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jpane_bemvindo.setLayout(null);

        jLabel2.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        jLabel2.setText("Cadastros -");
        jpane_bemvindo.add(jLabel2);
        jLabel2.setBounds(60, 40, 100, 20);

        btn_cad_medicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CadMedicos.png"))); // NOI18N
        btn_cad_medicos.setToolTipText("Cadastro de Médicos");
        btn_cad_medicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cad_medicosActionPerformed(evt);
            }
        });
        jpane_bemvindo.add(btn_cad_medicos);
        btn_cad_medicos.setBounds(50, 80, 140, 140);

        btn_cad_enfermeiras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon-infermeira.png"))); // NOI18N
        btn_cad_enfermeiras.setToolTipText("Cadastro de Enfermeiras");
        btn_cad_enfermeiras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cad_enfermeirasActionPerformed(evt);
            }
        });
        jpane_bemvindo.add(btn_cad_enfermeiras);
        btn_cad_enfermeiras.setBounds(190, 80, 140, 140);

        btn_cad_pacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cadPacientes.png"))); // NOI18N
        btn_cad_pacientes.setToolTipText("Cadastro de Pacientes");
        btn_cad_pacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cad_pacientesActionPerformed(evt);
            }
        });
        jpane_bemvindo.add(btn_cad_pacientes);
        btn_cad_pacientes.setBounds(330, 80, 130, 140);

        jLabel3.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        jLabel3.setText("Agenda do Dia");
        jpane_bemvindo.add(jLabel3);
        jLabel3.setBounds(60, 270, 120, 15);

        btn_cad_agenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agenda1.png"))); // NOI18N
        btn_cad_agenda.setToolTipText("Cadastro de Agenda");
        btn_cad_agenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cad_agendaActionPerformed(evt);
            }
        });
        jpane_bemvindo.add(btn_cad_agenda);
        btn_cad_agenda.setBounds(460, 80, 140, 140);

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jLabel1.setForeground(java.awt.Color.darkGray);
        jLabel1.setText("Sistema de Gerenciamento");
        jpane_bemvindo.add(jLabel1);
        jLabel1.setBounds(380, 0, 260, 22);

        btn_fechar_internalframe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exit.png"))); // NOI18N
        btn_fechar_internalframe.setToolTipText("fechar tela ");
        btn_fechar_internalframe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_fechar_internalframeActionPerformed(evt);
            }
        });
        jpane_bemvindo.add(btn_fechar_internalframe);
        btn_fechar_internalframe.setBounds(940, 10, 40, 40);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Agenda.png"))); // NOI18N
        jButton1.setToolTipText("Agenda do dia");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jpane_bemvindo.add(jButton1);
        jButton1.setBounds(50, 290, 140, 160);

        internalframe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fundoMedTech.jpg"))); // NOI18N
        jpane_bemvindo.add(internalframe);
        internalframe.setBounds(10, 0, 1000, 550);

        bem_vindo.getContentPane().add(jpane_bemvindo);
        jpane_bemvindo.setBounds(0, 0, 1060, 550);

        jPanel4.add(bem_vindo);
        bem_vindo.setBounds(50, 10, 1010, 580);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(panel_abas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_abas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        menu_cadastros.setText("Menu");

        menu_medicos.setText("Médicos");
        menu_medicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_medicosActionPerformed(evt);
            }
        });
        menu_cadastros.add(menu_medicos);

        menu_enfermeiras.setText("Enfermeiras");
        menu_enfermeiras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_enfermeirasActionPerformed(evt);
            }
        });
        menu_cadastros.add(menu_enfermeiras);

        menu_pacientes.setText("Pacientes");
        menu_pacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_pacientesActionPerformed(evt);
            }
        });
        menu_cadastros.add(menu_pacientes);

        menu_agendamentos.setText("Agendamentos");
        menu_agendamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_agendamentosActionPerformed(evt);
            }
        });
        menu_cadastros.add(menu_agendamentos);

        menu_agenda_dia.setText("Agenda");
        menu_agenda_dia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_agenda_diaActionPerformed(evt);
            }
        });
        menu_cadastros.add(menu_agenda_dia);

        menu_agenda_medicos.setText("Agenda Medicos");
        menu_agenda_medicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_agenda_medicosActionPerformed(evt);
            }
        });
        menu_cadastros.add(menu_agenda_medicos);

        menu_usuarios.setText("Usuários");
        menu_usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_usuariosActionPerformed(evt);
            }
        });
        menu_cadastros.add(menu_usuarios);

        menu_logout.setText("Logout");
        menu_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_logoutActionPerformed(evt);
            }
        });
        menu_cadastros.add(menu_logout);

        menu_exit.setText("Sair");
        menu_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_exitActionPerformed(evt);
            }
        });
        menu_cadastros.add(menu_exit);

        jMenuBar1.add(menu_cadastros);

        menu_relatorios.setText("Relatórios");
        jMenuBar1.add(menu_relatorios);

        menu_ferramentas.setText("Ferramentas");

        menu_telaBemVindo.setText("Tela Bem-vindo");
        menu_telaBemVindo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_telaBemVindoActionPerformed(evt);
            }
        });
        menu_ferramentas.add(menu_telaBemVindo);

        jMenuBar1.add(menu_ferramentas);

        menu_Config.setText("Configuração");
        jMenuBar1.add(menu_Config);

        setJMenuBar(jMenuBar1);

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

        setSize(new java.awt.Dimension(1302, 707));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menu_telaBemVindoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_telaBemVindoActionPerformed
      bem_vindo.setVisible(true);
    }//GEN-LAST:event_menu_telaBemVindoActionPerformed

    private void menu_medicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_medicosActionPerformed
         try {
             conecta.executaSQL("select * from usuarios where us_nome='"+nome_usuario.getText()+"'");
             conecta.rs.first();
             if(conecta.rs.getString("perfil").equals("Administrador")||conecta.rs.getString("perfil").equals("Master")){
               if(me_tela == null){
                   me_tela = new Med_FormMedicos();
                   me_tela.setVisible(true);
                   me_tela.setResizable(false);
               }else{
                   me_tela.setVisible(true);
                   me_tela.setResizable(false);
               }
                 
             }else {
                 JOptionPane.showMessageDialog(rootPane, "Você não tem permissão de acesso! ");
             }
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(rootPane, "erro ao carregar usuario!");
         }
        
    }//GEN-LAST:event_menu_medicosActionPerformed

    private void menu_usuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_usuariosActionPerformed
        try {
             conecta.executaSQL("select * from usuarios where us_nome='"+nome_usuario.getText()+"'");
             conecta.rs.first();
             if(conecta.rs.getString("perfil").equals("Master")){
                  if(me_tela == null){
                   us_tela = new Med_FormUsuarios();
                   us_tela.setVisible(true);
                   us_tela.setResizable(false);
               }else{
                   us_tela.setVisible(true);
                   us_tela.setResizable(false);
               }
                 
             }else {
                 JOptionPane.showMessageDialog(rootPane, "Você não tem permissão de acesso! ");
             }
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(rootPane, "erro ao carregar usuario!");
         }
       
    }//GEN-LAST:event_menu_usuariosActionPerformed

    private void menu_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_exitActionPerformed
        conecta.desconecta();
        System.exit(0);
    }//GEN-LAST:event_menu_exitActionPerformed

    private void menu_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_logoutActionPerformed
        Med_login login = new Med_login();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_menu_logoutActionPerformed

    private void menu_pacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_pacientesActionPerformed
          try {
             conecta.executaSQL("select * from usuarios where us_nome='"+nome_usuario.getText()+"'");
             conecta.rs.first();
             if(conecta.rs.getString("perfil").equals("Master") || conecta.rs.getString("perfil").equals("Administrador") ){
                  if(me_tela == null){
                   pc_tela = new Med_FormPacientes();
                   pc_tela.setVisible(true);
                   pc_tela.setResizable(false);
               }else{
                   pc_tela.setVisible(true);
                   pc_tela.setResizable(false);
               }
                 
             }else {
                 JOptionPane.showMessageDialog(rootPane, "Você não tem permissão de acesso! ");
             }
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(rootPane, "erro ao carregar usuario!");
         }
    }//GEN-LAST:event_menu_pacientesActionPerformed

    private void menu_enfermeirasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_enfermeirasActionPerformed
        try {
             conecta.executaSQL("select * from usuarios where us_nome='"+nome_usuario.getText()+"'");
             conecta.rs.first();
             if(conecta.rs.getString("perfil").equals("Master") || conecta.rs.getString("perfil").equals("Administrador") ){
                  if(me_tela == null){
                   en_tela = new Med_FormEnfermeiras();
                   en_tela.setVisible(true);
                   en_tela.setResizable(false);
               }else{
                   en_tela.setVisible(true);
                   en_tela.setResizable(false);
               }
                 
             }else {
                 JOptionPane.showMessageDialog(rootPane, "Você não tem permissão de acesso! ");
             }
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(rootPane, "erro ao carregar usuario!");
         }
    }//GEN-LAST:event_menu_enfermeirasActionPerformed

    private void menu_agendamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_agendamentosActionPerformed
          try {
             conecta.executaSQL("select * from usuarios where us_nome='"+nome_usuario.getText()+"'");
             conecta.rs.first();
             if(conecta.rs.getString("perfil").equals("Master") || conecta.rs.getString("perfil").equals("Administrador") ){
                  if(me_tela == null){
                   ag_tela = new Med_Agendamento();
                   ag_tela.setVisible(true);
                   ag_tela.setResizable(false);
               }else{
                   ag_tela.setVisible(true);
                   ag_tela.setResizable(false);
               }
                 
             }else {
                 JOptionPane.showMessageDialog(rootPane, "Você não tem permissão de acesso! ");
             }
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(rootPane, "erro ao carregar usuario!");
         }
    }//GEN-LAST:event_menu_agendamentosActionPerformed

    private void menu_agenda_diaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_agenda_diaActionPerformed
              Med_FormAgenda age_tela =new Med_FormAgenda();
             try {
             conecta.executaSQL("select * from usuarios where us_nome='"+nome_usuario.getText()+"'");
             conecta.rs.first();
             if(conecta.rs.getString("perfil").equals("Administrador")||conecta.rs.getString("perfil").equals("Master")){
                if(age_tela == null){
                   age_tela = new Med_FormAgenda();
                   age_tela.setVisible(true);
                   age_tela.setResizable(false);
                   
               }else{
                   lbl_agenda.setVisible(true); 
                   age_tela.setVisible(true);
                   age_tela.setResizable(false);
               }
                 
             }else {
                 JOptionPane.showMessageDialog(rootPane, "Você não tem permissão de acesso! ");
             }
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(rootPane, "erro ao carregar usuario!");
         }    
            
    }//GEN-LAST:event_menu_agenda_diaActionPerformed

    private void btn_fechar_internalframeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_fechar_internalframeActionPerformed
        bem_vindo.dispose();

    }//GEN-LAST:event_btn_fechar_internalframeActionPerformed

    private void btn_cad_agendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cad_agendaActionPerformed
           
            try {
            conecta.executaSQL("select * from usuarios where us_nome='"+nome_usuario.getText()+"'");
            conecta.rs.first();
            if(conecta.rs.getString("perfil").equals("Master") || conecta.rs.getString("perfil").equals("Administrador") ){
                if(me_tela == null){
                    ag_tela = new Med_Agendamento();
                    ag_tela.setVisible(true);
                    ag_tela.setResizable(false);
                }else{
                    ag_tela.setVisible(true);
                    ag_tela.setResizable(false);
                }

            }else {
                JOptionPane.showMessageDialog(rootPane, "Você não tem permissão de acesso! ");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "erro ao carregar usuario!");
        }
    }//GEN-LAST:event_btn_cad_agendaActionPerformed

    private void btn_cad_pacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cad_pacientesActionPerformed
        try {
            conecta.executaSQL("select * from usuarios where us_nome='"+nome_usuario.getText()+"'");
            conecta.rs.first();
            if(conecta.rs.getString("perfil").equals("Master") || conecta.rs.getString("perfil").equals("Administrador") ){
                if(me_tela == null){
                    pc_tela = new Med_FormPacientes();
                    pc_tela.setVisible(true);
                    pc_tela.setResizable(false);
                }else{
                    pc_tela.setVisible(true);
                    pc_tela.setResizable(false);
                }

            }else {
                JOptionPane.showMessageDialog(rootPane, "Você não tem permissão de acesso! ");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "erro ao carregar usuario!");
        };
    }//GEN-LAST:event_btn_cad_pacientesActionPerformed

    private void btn_cad_enfermeirasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cad_enfermeirasActionPerformed
        try {
            conecta.executaSQL("select * from usuarios where us_nome='"+nome_usuario.getText()+"'");
            conecta.rs.first();
            if(conecta.rs.getString("perfil").equals("Master") || conecta.rs.getString("perfil").equals("Administrador") ){
                if(me_tela == null){
                    en_tela = new Med_FormEnfermeiras();
                    en_tela.setVisible(true);
                    en_tela.setResizable(false);
                }else{
                    en_tela.setVisible(true);
                    en_tela.setResizable(false);
                }

            }else {
                JOptionPane.showMessageDialog(rootPane, "Você não tem permissão de acesso! ");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "erro ao carregar usuario!");
        }
    }//GEN-LAST:event_btn_cad_enfermeirasActionPerformed

    private void btn_cad_medicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cad_medicosActionPerformed
        try {
            conecta.executaSQL("select * from usuarios where us_nome='"+nome_usuario.getText()+"'");
            conecta.rs.first();
            if(conecta.rs.getString("perfil").equals("Administrador") || conecta.rs.getString("perfil").equals("Master")){
                if(me_tela == null){
                    me_tela = new Med_FormMedicos();
                    me_tela.setVisible(true);
                    me_tela.setResizable(false);
                }else{
                    me_tela.setVisible(true);
                    me_tela.setResizable(false);
                }

            }else {
                JOptionPane.showMessageDialog(rootPane, "Você não tem permissão de acesso! ");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "erro ao carregar usuario!");
        }
    }//GEN-LAST:event_btn_cad_medicosActionPerformed

    private void lbl_agendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_agendaMouseClicked
             Med_FormAgenda age_tela =new Med_FormAgenda();
             try {
             conecta.executaSQL("select * from usuarios where us_nome='"+nome_usuario.getText()+"'");
             conecta.rs.first();
             if(conecta.rs.getString("perfil").equals("Administrador")||conecta.rs.getString("perfil").equals("Master")){
                if(age_tela == null){
                   age_tela = new Med_FormAgenda();
                   age_tela.setVisible(true);
                   age_tela.setResizable(false);
                   
               }else{
                   lbl_agenda.setVisible(true); 
                   age_tela.setVisible(true);
                   age_tela.setResizable(false);
               }
                 
             }else {
                 JOptionPane.showMessageDialog(rootPane, "Você não tem permissão de acesso! ");
             }
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(rootPane, "erro ao carregar usuario!");
         }  
    }//GEN-LAST:event_lbl_agendaMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
             Med_FormAgenda age_tela =new Med_FormAgenda();
             try {
             conecta.executaSQL("select * from usuarios where us_nome='"+nome_usuario.getText()+"'");
             conecta.rs.first();
             if(conecta.rs.getString("perfil").equals("Administrador")||conecta.rs.getString("perfil").equals("Master")){
                if(age_tela == null){
                   age_tela = new Med_FormAgenda();
                   age_tela.setVisible(true);
                   age_tela.setResizable(false);
                   
               }else{
                   lbl_agenda.setVisible(true); 
                   age_tela.setVisible(true);
                   age_tela.setResizable(false);
               }
                 
             }else {
                 JOptionPane.showMessageDialog(rootPane, "Você não tem permissão de acesso! ");
             }
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(rootPane, "erro ao carregar usuario!");
         } 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void menu_agenda_medicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_agenda_medicosActionPerformed
        Med_FormAgendaMedicos tela = new Med_FormAgendaMedicos();
        tela.setVisible(true);
    }//GEN-LAST:event_menu_agenda_medicosActionPerformed

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
            java.util.logging.Logger.getLogger(Med_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Med_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Med_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Med_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Med_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame bem_vindo;
    private javax.swing.JButton btn_cad_agenda;
    private javax.swing.JButton btn_cad_enfermeiras;
    private javax.swing.JButton btn_cad_medicos;
    private javax.swing.JButton btn_cad_pacientes;
    private javax.swing.JButton btn_fechar_internalframe;
    private javax.swing.JLabel internalframe;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jpane_bemvindo;
    private javax.swing.JLabel lbl_agenda;
    private javax.swing.JMenu menu_Config;
    private javax.swing.JMenuItem menu_agenda_dia;
    private javax.swing.JMenuItem menu_agenda_medicos;
    private javax.swing.JMenuItem menu_agendamentos;
    private javax.swing.JMenu menu_cadastros;
    private javax.swing.JMenuItem menu_enfermeiras;
    private javax.swing.JMenuItem menu_exit;
    private javax.swing.JMenu menu_ferramentas;
    private javax.swing.JMenuItem menu_logout;
    private javax.swing.JMenuItem menu_medicos;
    private javax.swing.JMenuItem menu_pacientes;
    private javax.swing.JMenu menu_relatorios;
    private javax.swing.JMenuItem menu_telaBemVindo;
    private javax.swing.JMenuItem menu_usuarios;
    private javax.swing.JLabel nome_usuario;
    private javax.swing.JPanel panel_abas;
    // End of variables declaration//GEN-END:variables
}
