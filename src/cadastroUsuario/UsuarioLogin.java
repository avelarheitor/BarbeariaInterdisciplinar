package cadastroUsuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import BarbeariaBD.Conexao;
import Classes.Cliente;

public class UsuarioLogin {

    //VERIFICA O LOGIN COM OS DADOS QUE JÁ ESTÃO NO BANCO DE DADOS 
    public Cliente checkLogin(String email, String senha) {

        Conexao c = new Conexao();

        Connection conexao = c.obterConexao();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        //CONECTA COM O BANCO DE DADOS A FIM DE CAPTAR OS DADOS DO SEU ATRIBUTO CORRESPONDENTE 
        try {

            stmt = conexao.prepareStatement("SELECT * FROM barbearia_amanda.cliente WHERE email = ? and senha = ?");
            stmt.setString(1, email);
            stmt.setString(2, senha);

            rs = stmt.executeQuery();
            
            Cliente cliente = new Cliente();
            
            while(rs.next()){
                cliente.setNome(rs.getString("nome"));
                cliente.setEmail(rs.getString("email"));
                cliente.setSenha(rs.getString("senha"));
                cliente.setCpf(rs.getString("cpf"));
            }
            
            return (cliente);

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioLogin.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

        }

        return null;

    }

}
