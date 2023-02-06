package Classes;

//construtor do cliente com atributos extendidos do usuário, no caso, o único atributo novo é o de cpf. Esses atributos serão utilizados no login do usuário.
public class Cliente extends Usuario{
    private String cpf;

    public Cliente(String nome, String email, String senha, String cpf) {
        super(nome, email, senha);
        this.cpf = cpf;
        
    }  

    public Cliente() {
        super();
    }
   
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
}
