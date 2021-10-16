
package ModelDAO;

import ModelBeans.BeansUsuarios;
import ModelConnection.connectionDB;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class DAOUsuarios {
    
    connectionDB conex = new connectionDB();
    BeansUsuarios mod = new BeansUsuarios();
    
    public void salvar(BeansUsuarios mod){
         conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into usuarios (us_nome, us_senha, perfil) values (?,?,?);");
            pst.setString(1, mod.getUsNome());
            pst.setString(2, mod.getUsSenha());
            pst.setString(3, mod.getUsPerfil());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar Usuário!: \n"+ex.getMessage());
        }
         
         conex.desconecta();
    }
    public BeansUsuarios buscaUsuario (BeansUsuarios mod){
        conex.conexao();
        conex.executaSQL("select * from usuarios where us_nome like'%"+mod.getBusca()+"%'");
        try {
            conex.rs.first();
            mod.setUsID(conex.rs.getInt("id_usuario"));
            mod.setUsNome(conex.rs.getString("us_nome"));
            mod.setUsSenha(conex.rs.getString("us_senha"));
            mod.setUsPerfil(conex.rs.getString("perfil"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Cadastro não encontrato");
        }
        
        
        conex.desconecta();
        return mod;
    }
    
    public void Editar(BeansUsuarios mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update usuarios set us_nome=?, us_senha=?, perfil=? where id_usuario=?;");
            pst.setString(1, mod.getUsNome());    
            pst.setString(2, mod.getUsSenha());   
            pst.setString(3, mod.getUsPerfil());
            pst.setInt(4, mod.getUsID());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Usuário alterado!");
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Erro ao Alterar Usuário!");
        }
        
        
        conex.desconecta();
        
    }
    
    public void Excluir(BeansUsuarios mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from usuarios where id_usuario=?;");
            pst.setInt(1, mod.getUsID());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Usuário Excluido!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Exlcuir Usuário");
        }
        
        
        conex.desconecta();
        
    }
    
}
