package BarbeariaBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexao {
//Código para se conetar com o banco de dados através do link do sql e seu respectivo host.
    String linkDeCasa = "jdbc:postgresql://200.18.128.54/aula";
    String link = "jdbc:postgresql://10.90.24.54/aula";
    String usuario = "aula";
    String senha = "aula";
    private Connection con = null;
    private String jdbcDriver = null;

    //Conexão SQL
    public Connection obterConexao() {
        try {

            jdbcDriver = "org.postgresql.Driver";
            if (con == null) {
                con = DriverManager.getConnection(linkDeCasa, usuario, senha);
            } else if (con.isClosed()) {
                con = null;
                return obterConexao();
            }
        } catch (SQLException e) {

            //TODO: use um sistema de log apropriado.
            e.printStackTrace();
        }
        //TODO: use um sistema de log apropriado.
        return con;
    }
}
