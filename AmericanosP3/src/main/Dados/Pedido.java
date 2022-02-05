package Dados;

import java.util.Date;

public class Pedido {
    private int id;
    private int quantidade;
    private Date data_entrega;
    private Usuario usuario;
    private Produto produto;


    public Pedido(Usuario usuario,Produto produto, int id, int quantidade, String preco){
        this.setId(id);
        this.setQuantidade(quantidade);
        this.setData_entrega(data_entrega);
        this.setUsuario(usuario);
        this.setProduto(produto);
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Date getData_entrega() {
        return data_entrega;
    }

    public void setData_entrega(Date data_entrega) {
        this.data_entrega = data_entrega;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
