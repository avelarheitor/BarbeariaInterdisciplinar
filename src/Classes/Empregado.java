package Classes;
 //construtor da classe empregado com alguns atributos derivados da classe usuário. Esses atributos serão utlizados na c 
public class Empregado extends Usuario{
    private int codEmpregado;

    public Empregado(String nome, String email, String senha) {
        super(nome, email, senha);
    }

    public Empregado(String nome, String email, String senha, int codEmpregado) {
        super(nome, email, senha);
        this.codEmpregado = codEmpregado;
    }

    public Empregado() {
        
    }
    
    public int getCodEmpregado() {
        return codEmpregado;
    }

    public void setCodEmpregado(int codEmpregado) {
        this.codEmpregado = codEmpregado;
    }
       
}
