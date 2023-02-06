package auxHorario;

import BarbeariaBD.Conexao;
import Classes.Horário;
import cadastroUsuario.CadastroCliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CriarHorario {
    //METODO DE INSERIR NOVO HORARIO NO BANCO   
    public void saveDataBanco(Horário m) {
        //savando os dados do agendamento do cliente no banco de dados.
        String SQL1 = "INSERT INTO barbearia_amanda.horario "
                + "(dataEscolhido, horaEscolhido, servEscolhido, profEscolhido, cpf_cliente) "
                + " Values (?, ?, ?, ?, ?); ";

        try {

            Conexao c = new Conexao();
            Connection conexao = c.obterConexao();
            PreparedStatement stmt = conexao.prepareStatement(SQL1);

            stmt.setDate(1, m.getDataBanco());
            stmt.setString(2, m.getHoraEscolhido());
            stmt.setString(3, m.getServicoEscolhido());
            stmt.setInt(4, m.getProfEscolhido());
            stmt.setString(5, m.getCliente().getCpf());

            stmt.executeUpdate();
            stmt.close();

        } catch (SQLException ex) {
            Logger.getLogger(CadastroCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
