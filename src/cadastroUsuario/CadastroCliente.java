package cadastroUsuario;

import BarbeariaBD.Conexao;
import Classes.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CadastroCliente {

    public void save(Cliente m) {
        //INSERIR UMA NOVA CONTA NO BANCO
        String SQL1 = "INSERT INTO barbearia_amanda.cliente "
                + "(nome, email, senha, cpf) "
                + " Values ( ?, ?, ?, ?); ";

        //CONECTANDO COM O BANCO A FIM DE ARMEZENAR OS DADOS FORNECIDO PELO CLIENTE AO DESEJAR SE CADASTRAR 
        try {

            Conexao c = new Conexao();
            Connection conexao = c.obterConexao();
            PreparedStatement stmt = conexao.prepareStatement(SQL1);

            stmt.setString(1, m.getNome());
            stmt.setString(2, m.getEmail());
            stmt.setString(3, m.getSenha());
            stmt.setString(4, m.getCpf());

            stmt.executeUpdate();
            stmt.close();

        } catch (SQLException ex) {
            Logger.getLogger(CadastroCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void update(Cliente m) {

        //NA INSERÇÃO NO DE UM CLIENTE NO BANCO
        String sql = "UPDATE barbearia_amanda.cliente SET nome = ?, email = ?, senha = ?, cpf = ?"
                + " WHERE cpf = '" + m.getCpf() + "'";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            //Cria uma conexão com o banco
            Conexao c = new Conexao();
            Connection conexao = c.obterConexao();

            //Cria um PreparedStatment, classe usada para executar a query
            pstm = conexao.prepareStatement(sql);
            pstm.setString(1, m.getNome());
            pstm.setString(2, m.getEmail());
            pstm.setString(3, m.getSenha());
            pstm.setString(4, m.getCpf());

            //Executa a sql para inserção dos dados
            pstm.execute();

        } catch (Exception e) {

            e.printStackTrace();
        } finally {

            //Fecha as conexões
            try {
                if (pstm != null) {

                    pstm.close();
                }

                if (conn != null) {
                    conn.close();
                }

            } catch (Exception e) {

                e.printStackTrace();
            }
        }
    }

}
