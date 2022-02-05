package Dados;

public class Equipe extends Usuario{
    private String salario;
    private String funcao;

    public Equipe(Usuario usuario){
        super(usuario.getId(), usuario.getNome(),usuario.getData_nascimento(), usuario.getEndereco(), usuario.getEmail(), usuario.getSenha());
        this.salario=salario;
        this.funcao=funcao;
    }
    public String getSalario() {
        return salario;
    }
    public void setSalario(String salario) {
        this.salario = salario;
    }
    public String getFuncao() {
        return funcao;
    }
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
}
