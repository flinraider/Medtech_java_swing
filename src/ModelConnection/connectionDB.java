package ModelConnection;
/**
 * @author Leonardo
 * Consoletech 03/03/2021.
 */

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import javax.swing.JOptionPane;
/*import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;*/

public class connectionDB {
    
    public  Statement stm;
    //Statement serve para fazer a pesquisa no banco de dados//
    public ResultSet rs;
    // ResultSet serve para trazer o resultado da pesquisa sql//
    private String driver = "org.postgresql.Driver";
    // driver e a bibloteca externa que fará conexão coom o banco de dados postgres//
    private String caminho = "jdbc:postgresql://192.168.15.100:5432/medtech";
    // caminho aonde o banco de dados esta fisicamente alocado obs: no caso do postgres o ip da maquina ou localhost//
    private String usuario = "console";
    // usuario do sgbd do banco de dados//
    private String senha = "040358";
    // senha do sgbd do banco de dados//
    public Connection con;
    // Connection e responsvel por fazer a conexao com o banco de dados//
    
    public void conexao(){  // metodo resposavel por conectar com a base de dados//
      try {  //se ele conseguir fazer a conexão o jpane ira aparecer conectado//
        System.setProperty("jdbc.Drivers", driver);
        con = DriverManager.getConnection(caminho, usuario, senha);
       // JOptionPane.showMessageDialog(null, "Conectado");
      } catch (SQLException ex){ // se ele não conseguir se conectar ele vai para o catch o exception mostra qual o tipo de erro//
            JOptionPane.showMessageDialog(null, "Erro de conexão com Banco de dados!: \n"+ex.getMessage()); // o ex mostra o erro que o exception pegou//
        }
    }
    
    public void desconecta(){ // metodo de desconectar da base de dados//
        try {
            con.close();
         //  JOptionPane.showMessageDialog(null, "Desconectado"); 
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao desconectar do banco de dados!: \n"+ex.getMessage());
        }
    }
    public void executaSQL(String sql){
        try {
            stm = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_READ_ONLY); //type_scroll_insensitive ira direfenciar entre caixa alta e baixa e concur read only ira buscar do começo ao fim//
            rs = stm.executeQuery(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao fazer a busca!"+ex.getMessage());
        }
    }
}
