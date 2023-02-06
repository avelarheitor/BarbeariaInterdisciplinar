package auxiliarEmpregado;

import BarbeariaBD.Conexao;
import Classes.Horário;
import cadastroUsuario.UsuarioLogin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GetNomePeloId {
    //VERIFICAR DISPONIBILIDADE
    public String getNomeFuncionarioPeloId(int id) {
         //obtendo conexão com o banco de dados
        Conexao c = new Conexao();

        Connection conexao = c.obterConexao();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
           // pegando os valores escolhidos pelo cliente e os comparando com os que já estão no banco de dados, ou seja, os horários que já estão marcados, assim, vendo quais horários estão disponíveis.
            stmt = conexao.prepareStatement("SELECT * FROM barbearia_amanda.empregado WHERE id = ?");
            stmt.setInt(1, id);

            rs = stmt.executeQuery();

            if (rs.next()) {
                return rs.getString("nome");

            }else{
                return null;
            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioLogin.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

        }

        return null;

    }
}
