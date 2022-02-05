package DAO;

import BancoDeDados.Conexao;
import Dados.Equipe;
import Dados.Usuario;

import java.sql.*;
import java.util.ArrayList;

public class Equipe_DAO {
        private String sql;
        private Statement statement;
        private ResultSet resultSet;
        private PreparedStatement preparedStatement;
        private String status;
        public ArrayList<Equipe> getEquipes(){
            ArrayList<Equipe> equipes= new ArrayList<>();
            try(Connection connection = new Conexao().getConexao()){
                this.sql="select * from Equipe eq, Usuario us" + "where eq.id_usuario=us.id_usuario and us.id_usuario=up.id_usuario";
                this.statement= connection.createStatement();
                this.resultSet=this.statement.executeQuery(this.sql);
                while(this.resultSet.next()){
                    Usuario usuario = new Usuario();
                    usuario.setId(this.resultSet.getInt("id_usuario"));
                    usuario.setNome(this.resultSet.getString("nome"));
                    usuario.setEmail(this.resultSet.getString("email"));;
                    Equipe e =new Equipe(usuario);
                    equipes.add(e);
                }

            }catch(SQLException e){
                e.printStackTrace();
                this.status="error";
            }
            return equipes;
        }


        public String CadastrarEquipe (Equipe equipe){

            try(Connection connection = new Conexao().getConexao()){
                connection.setAutoCommit(false);

                this.sql = "insert into Equipe(nome_equipe, email, senha, data_nascimento, salario,funcao)" +
                        "Values(?, ?, ?,DATE , ?,?)";
                this.preparedStatement = connection.prepareStatement((this.sql), PreparedStatement.RETURN_GENERATED_KEYS);
                this.preparedStatement.setString(1, equipe.getNome());
                this.preparedStatement.setString(2, equipe.getEmail());
                this.preparedStatement.setString(3, equipe.getSenha());

                this.preparedStatement.execute();
                this.resultSet = this.preparedStatement.getGeneratedKeys();
                this.resultSet.next();
                if(this.resultSet.getInt(1)>0){
                    equipe.setId(this.resultSet.getInt(1));
                    this.status = "OK";
                    System.out.println("Dentro do if insert equipe");
                }
                if(this.status.equals("OK")){
                    this.preparedStatement = connection.prepareStatement((this.sql), PreparedStatement.RETURN_GENERATED_KEYS);
                    this.preparedStatement.setInt(1,equipe.getId());
                    this.preparedStatement.execute();
                    this.resultSet = this.preparedStatement.getGeneratedKeys();
                    this.resultSet.next();
                    if(this.resultSet.getInt(1)>0){
                        connection.commit();
                        this.status ="OK";
                        System.out.println("Dentro do if insert equipe");
                    }
                }
            }catch (SQLException e){
                e.printStackTrace();
                this.status="Problema!";
            }
            return this.status;
        }
    }
