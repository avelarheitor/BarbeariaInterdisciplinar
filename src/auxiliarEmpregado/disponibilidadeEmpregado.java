package auxiliarEmpregado;

import BarbeariaBD.Conexao;
import cadastroUsuario.UsuarioLogin;
import Classes.Horário;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class disponibilidadeEmpregado {

    //VERIFICAR DISPONIBILIDADE
    public Horário disponibilidade(java.sql.Date data, String hora, Integer prof) {
         //obtendo conexão com o banco de dados
        Conexao c = new Conexao();

        Connection conexao = c.obterConexao();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
           // pegando os valores escolhidos pelo cliente e os comparando com os que já estão no banco de dados, ou seja, os horários que já estão marcados, assim, vendo quais horários estão disponíveis.
            stmt = conexao.prepareStatement("SELECT * FROM barbearia_amanda.horario WHERE dataescolhido = ? and horaescolhido = ? and profescolhido = ? ");
            stmt.setDate(1, data);
            stmt.setString(2, hora);
            stmt.setInt(3, prof);

            rs = stmt.executeQuery();

            Horário horario = new Horário();

            if (rs.next()) {
                horario.setDiaEscolhido(rs.getDate("dataescolhido"));
                horario.setHoraEscolhido(rs.getString("horaescolhido"));
                horario.setProfEscolhido(rs.getInt("profescolhido"));
                System.out.println(rs.next());
                System.out.println(horario.getProfEscolhido());
                return (horario);

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
