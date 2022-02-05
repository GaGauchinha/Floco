package DAO;

import BancoDeDados.Conexao;
import Dados.Produto;
import Dados.Usuario;

import java.sql.*;
import java.util.ArrayList;

public class Produto_DAO {
    private String sql;
    private Statement statement;
    private ResultSet resultSet;
    private PreparedStatement preparedStatement;
    private String status;
    public ArrayList<Produto> getProdutos(){
        ArrayList<Produto> produtos= new ArrayList<>();
        try(Connection connection = new Conexao().getConexao()){
            this.sql="select * from Produto pr, Usuario us, Usuariotipo ut"+
                    "where pr.id_usuario=us.id_usuario and us.id_usuario=ut.id_usuario";
            this.statement= connection.createStatement();
            this.resultSet=this.statement.executeQuery(this.sql);
            while(this.resultSet.next()){
                Produto produto = new Produto();
                produto.setId(this.resultSet.getInt("id_usuario"));
                produto.setId(this.resultSet.getInt("id_produto"));
                produto.setNome(this.resultSet.getString("nome"));
                produto.setPreco(this.resultSet.getString("preco"));
                produto.setMarca(this.resultSet.getString("marca"));
                Produto e =new Produto();
                produtos.add(e);

            }

        }catch(SQLException e){
            e.printStackTrace();
            this.status="error";
        }
        return produtos;
    }


    public String CadastrarProduto (Produto produto){

        try(Connection connection = new Conexao().getConexao()){
            connection.setAutoCommit(false);

            this.sql = "insert into Produto(nome, marca, preco,id_produto)" +
                    "Values(?, ?, ?,?)";
            this.preparedStatement = connection.prepareStatement((this.sql), PreparedStatement.RETURN_GENERATED_KEYS);
            this.preparedStatement.setString(1, produto.getNome());
            this.preparedStatement.setString(2, produto.getMarca());
            this.preparedStatement.setString(3, produto.getPreco());
            this.preparedStatement.setInt(4,produto.getId());

            this.preparedStatement.execute();
            this.resultSet = this.preparedStatement.getGeneratedKeys();
            this.resultSet.next();
            if(this.resultSet.getInt(1)>0){
                produto.setId(this.resultSet.getInt(1));
                this.status = "OK";
                System.out.println("Dentro do if insert produto");
            }
            if(this.status.equals("OK")){
                this.preparedStatement = connection.prepareStatement((this.sql), PreparedStatement.RETURN_GENERATED_KEYS);
                this.preparedStatement.setInt(1,produto.getId());
                this.preparedStatement.execute();
                this.resultSet = this.preparedStatement.getGeneratedKeys();
                this.resultSet.next();
                if(this.resultSet.getInt(1)>0){
                    connection.commit();
                    this.status ="OK";
                    System.out.println("Dentro do if insert produto");
                }
            }
        }catch (SQLException e){
            e.printStackTrace();
            this.status="Problema!";
        }
        return this.status;
    }
}
