
package ModelDAO;

import ModelBeans.BeansPacientes;
import ModelConnection.connectionDB;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class DAOPacientes {
    connectionDB conex = new connectionDB();
    BeansPacientes mod = new BeansPacientes();
    
    public void salvar(BeansPacientes mod){
         conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into pacientes (pc_nome, pc_sobrenome, pc_data_nascimento, pc_rg, pc_contato, pc_endereco, pc_complemento, pc_cidade, pc_estado, pc_cep) values (?,?,?,?,?,?,?,?,?,?);");
            pst.setString(1, mod.getPcNome());
            pst.setString(2, mod.getPcSobrenome());
            pst.setString(3, mod.getPcData());
            pst.setString(4, mod.getPcRg());
            pst.setString(5, mod.getPcContato());
            pst.setString(6, mod.getPcEndereco());
            pst.setString(7, mod.getPcComp());
            pst.setString(8, mod.getPcCid());
            pst.setString(9, mod.getPcUF());
            pst.setString(10, mod.getPcCep());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar Paciente!: \n"+ex.getMessage());
        }
         
         conex.desconecta();
    }
    public BeansPacientes buscaPaciente (BeansPacientes mod){
        conex.conexao();
        conex.executaSQL("select * from pacientes where pc_nome like'%"+mod.getBusca()+"%'");
        try {
            conex.rs.first();
            mod.setPcID(conex.rs.getInt("id_paciente"));
            mod.setPcNome(conex.rs.getString("pc_nome"));
            mod.setPcSobrenome(conex.rs.getString("pc_sobrenome"));
            mod.setPcData(conex.rs.getString("pc_data_nascimento"));
            mod.setPcRg(conex.rs.getString("pc_rg"));
            mod.setPcContato(conex.rs.getString("pc_contato"));
            mod.setPcEndereco(conex.rs.getString("pc_endereco"));
            mod.setPcComp(conex.rs.getString("pc_complemento"));
            mod.setPcCid(conex.rs.getString("pc_cidade"));
            mod.setPcUF(conex.rs.getString("pc_estado"));
            mod.setPcCep(conex.rs.getString("pc_cep"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Cadastro não encontrato");
        }
        
        
        conex.desconecta();
        return mod;
    }
    
    public void Editar(BeansPacientes mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update pacientes set pc_nome=?, pc_sobrenome=?, pc_data_nascimento=?, pc_rg=?, pc_contato=?, pc_endereco=?, pc_complemento=?, pc_estado=?, pc_cep=? where id_paciente=?;");
            pst.setString(1, mod.getPcNome());    
            pst.setString(2, mod.getPcSobrenome());   
            pst.setString(3, mod.getPcData());
            pst.setString(4, mod.getPcRg());
            pst.setString(5, mod.getPcContato());
            pst.setString(6, mod.getPcEndereco());
            pst.setString(7, mod.getPcComp());
            pst.setString(8, mod.getPcUF());
            pst.setString(9, mod.getPcCep());
            pst.setInt(10, mod.getPcID());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Cadastro de Paciente alterado!");
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Erro ao Alterar Cadastro de Paciente!");
        }
        
        
        conex.desconecta();
        
    }
    
    public void Excluir(BeansPacientes mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from pacientes where id_paciente=?;");
            pst.setInt(1, mod.getPcID());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Paciente Excluido!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Exlcuir Paciente");
        }
        
        
        conex.desconecta();
        
    }
}
