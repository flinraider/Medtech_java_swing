
package ModelDAO;

import ModelConnection.connectionDB;
import ModelBeans.BeansMedicos;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



public class DAOMedicos {
    
    connectionDB conex = new connectionDB();
    BeansMedicos mod = new BeansMedicos();
    
    public void salvar(BeansMedicos mod){
         conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into medicos (nome, especialidade, crm) values (?,?,?);");
            pst.setString(1,mod.getNome());
            pst.setString(2,mod.getEspecialidade());
            pst.setInt(3, mod.getCrm());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar medico!: \n"+ex.getMessage());
        }
         
         conex.desconecta();
    }
    public BeansMedicos buscaMedico (BeansMedicos mod){
        conex.conexao();
        conex.executaSQL("select * from medicos where nome like'%"+mod.getPesquisa()+"%'");
        try {
            conex.rs.first();
            mod.setCodigo(conex.rs.getInt("id_medico"));
            mod.setNome(conex.rs.getString("nome"));
            mod.setEspecialidade(conex.rs.getString("especialidade"));
            mod.setCrm(conex.rs.getInt("crm"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Cadastro não encontrato");
        }
        
        
        conex.desconecta();
        return mod;
    }
    
    public void Editar(BeansMedicos mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update medicos set nome=?, especialidade=?, crm=? where id_medico=?;");
            pst.setString(1, mod.getNome());     // aqui os paramentros são passados na ordem do sql// 
            pst.setString(2, mod.getEspecialidade());   // exemplo primeiro campo e nome primeiro mod e nome //
            pst.setInt(3, mod.getCrm());
            pst.setInt(4, mod.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Cadastro alterado!");
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Erro ao Alterar Cadastro!");
        }
        
        
        conex.desconecta();
        
    }
    
    public void Excluir(BeansMedicos mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from medicos where id_medico=?;");
            pst.setInt(1, mod.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Cadastro Excluido!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Exlcuir Cadastro");
        }
        
        
        conex.desconecta();
        
    }
    
}
