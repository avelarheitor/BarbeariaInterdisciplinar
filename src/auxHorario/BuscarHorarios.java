package auxHorario;

import BarbeariaBD.Conexao;
import Classes.Horário;
import cadastroUsuario.CadastroCliente;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BuscarHorarios {
    //METODO DE INSERIR NOVO HORARIO NO BANCO   
    public Vector<Horário> buscarHorarios(String cpf) {
        //savando os dados do agendamento do cliente no banco de dados.
        String SQL1 = "SELECT * FROM barbearia_amanda.horario WHERE cpf_cliente = ?";

        Vector<Horário> vetorHorarios = new Vector<>();

        try {
            
            Conexao c = new Conexao();
            Connection conexao = c.obterConexao();
            PreparedStatement stmt = conexao.prepareStatement(SQL1);

            stmt.setString(1, cpf);
            ResultSet resultados = stmt.executeQuery();
            
            
            while(resultados.next()){
                Horário horario = new Horário();
                horario.setHoraEscolhido(resultados.getString("horaescolhido"));
                horario.setServicoEscolhido(resultados.getString("servescolhido"));
                horario.setProfEscolhido(Integer.parseInt(resultados.getString("profescolhido")));
                horario.setDataBanco(resultados.getDate("dataescolhido"));
                
                vetorHorarios.add(horario);
            }
            
            stmt.close();
            return vetorHorarios;
           

        } catch (SQLException ex) {
            Logger.getLogger(CadastroCliente.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
