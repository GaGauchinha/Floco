package Dados;

public class Produto {
    private int id;
    private String nome;
    private String marca;
    private String preco;
    private Usuario usuario;

    public Produto(Usuario usuario, int id, String nome, String marca, String preco){
        this.setId(id);
        this.setMarca(marca);
        this.setPreco(preco);
        this.setNome(nome);
        this.setUsuario(usuario);

    }

    public Produto() {
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }
}
