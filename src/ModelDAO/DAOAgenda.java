package ModelDAO;

import ModelBeans.BeansAgenda;
import ModelConnection.connectionDB;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;


public class DAOAgenda {
   
   BeansAgenda agenda =  new BeansAgenda();
   connectionDB conex_agenda = new connectionDB();
   connectionDB conC = new connectionDB();
   connectionDB conexPaciente = new  connectionDB();
   connectionDB conexMedico = new connectionDB();
   
   int codPac;
   int codMed;
   int agendandamento;
   
   public void Salvar(BeansAgenda agenda){
        BuscaMedico(agenda.getNomeMed());
        BuscaPaciente(agenda.getNomePac());
        conex_agenda.conexao();
       try {
           PreparedStatement pst = conex_agenda.con.prepareStatement("insert into agenda (ag_id_paciente, ag_id_medico, agenda_motivo, agenda_hora, agenda_data, agenda_status) values (?,?,?,?,?,?)");
           pst.setInt(1, codPac);
           pst.setInt(2, codMed);
           pst.setString(3, agenda.getMotivo());
           pst.setString(4, agenda.getHora());
           pst.setDate(5, new java.sql.Date(agenda.getData().getTime()));
           pst.setString(6, agenda.getStatus());
           pst.execute();
           JOptionPane.showMessageDialog(null,"Agendado com sucesso!");
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Erro ao inserir Agenda! ");
       }        
        
        conex_agenda.desconecta();
   }                                                
   public void BuscaPaciente(String nomePaciente){
       conexPaciente.conexao();
       conexPaciente.executaSQL("select * from pacientes where pc_nome ='"+nomePaciente+"'");
       try {
           conexPaciente.rs.first();
           codPac = conexPaciente.rs.getInt("id_paciente");
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Paciente não encontrato!");
       }
   }
   
   public void BuscaMedico(String nomeMedico){
       conexMedico.conexao();
       conexMedico.executaSQL("select * from medicos where nome ='"+nomeMedico+"'");
       try {
           conexMedico.rs.first();
           codMed = conexMedico.rs.getInt("id_medico");
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Medico não encontrato!");
       }
   }
   
      public int BuscaCodMedico(String nomeMedico){
       conexMedico.conexao();
       conexMedico.executaSQL("select * from medicos where nome ='"+nomeMedico+"'");
       try {
           conexMedico.rs.first();
           codMed = conexMedico.rs.getInt("id_medico");
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Medico não encontrato!");
       }
       return codMed;
   }
   
   public void Alterar(BeansAgenda agenda){
       conex_agenda.conexao();
       
       try {
            PreparedStatement pst = conex_agenda.con.prepareStatement("update agenda set agenda_status=? where id_agenda=?");
            pst.setString(1, agenda.getStatus());    
            pst.setInt(2, agenda.getIdAgenda());   
            pst.execute();
            JOptionPane.showMessageDialog(null, "Agendamento em atendimento!");
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Erro ao chamar atendimento!");
        }
       conex_agenda.desconecta();
   }
   
   public BeansAgenda BuscaAgendaCod(int cod){
       BeansAgenda agen = new BeansAgenda();
       conex_agenda.conexao();
       conex_agenda.executaSQL("select * from agenda inner join pacientes on ag_id_paciente = id_paciente inner join medicos on ag_id_medico = id_medico where id_agenda ='"+cod+"'");
       try {
          conex_agenda.rs.first();
          agen.setNomePac(conex_agenda.rs.getString("pc_nome"));
          agen.setNomeMed(conex_agenda.rs.getString("nome"));
          agen.setMotivo(conex_agenda.rs.getString("agenda_motivo"));
          agen.setPacNasc(conex_agenda.rs.getString("pc_data_nascimento"));
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Erro ao buscar agendamento por codigo"+ex);
       }
       return agen;
   }
   
   public void Consulta(BeansAgenda agenda){
        
        conC.conexao();
       try {
           PreparedStatement pst = conC.con.prepareStatement("insert into agenda (id_agenda, consulta_diagnostico, receita_consulta) values (?,?,?)");
           pst.setInt(1, agenda.getIdAgenda());
           pst.setString(2, agenda.getDiag());
           pst.setString(3, agenda.getReceita());
           pst.execute();
           JOptionPane.showMessageDialog(null,"Consulta Finalizada!");
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Erro ao Finalizar consulta ");
       }        
        
        conC.desconecta();
   }
   
}

