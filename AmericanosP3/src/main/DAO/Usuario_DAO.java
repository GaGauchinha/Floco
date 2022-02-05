package DAO;

import BancoDeDados.Conexao;
import Dados.Tipos;
import Dados.Usuario;

import java.sql.*;
import java.util.ArrayList;

public class Usuario_DAO {

    private String sql;
    private Statement statement;
    private ResultSet resultSet;
    private PreparedStatement preparedStatement;
    private String status;

    public ArrayList<Usuario> getUsuario(){
        ArrayList<Usuario> Usuarios = new ArrayList<Usuario>();
        try (Connection connection = new Conexao().getConexao()){

            this.sql = "select * from Usuario us, Tipos ti, Usuariostipos ut" + "where us.id_usuario=ut.id_usuario and ti.id_usuario=ut.id_usuario";
            this.statement = connection.createStatement();
            this.resultSet = this.statement.executeQuery(sql);
            while(this.resultSet.next()){
                Usuario usuario = new Usuario();
                usuario.setId(this.resultSet.getInt("id_usuario"));
                usuario.setNome(this.resultSet.getString("nome_usuario"));
                usuario.setEmail(this.resultSet.getString("email"));
                usuario.setAtivo(this.resultSet.getBoolean("ativo"));

                Tipos tipos = new Tipos();
                tipos.setId(this.resultSet.getInt("id_tipo"));
                tipos.setNome(this.resultSet.getString("nome_tipo"));

                usuario.setTipos(tipos);
                Usuarios.add(usuario);
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return Usuarios;
    }

    public Usuario getUsuario(int id){
       Usuario u = null;
       try(Connection connection = new Conexao().getConexao()){
           this.sql="select * from Usuario where id_usuario=?";
           this.preparedStatement=connection.prepareStatement(this.sql);
           this.preparedStatement.setInt(1,id);
           this.resultSet = this.preparedStatement.executeQuery();
           while(this.resultSet.next()){
               Usuario_DAO usdao= new Usuario_DAO();
               usdao.getUsuario(id);
               u= new Usuario(new Usuario_DAO().getUsuario(id));
           }
       } catch (SQLException e) {
           e.printStackTrace();
           this.status="erro";
       }
       return u;
    }
    public String CadastrarUsuario (Usuario usuario){

        try(Connection connection = new Conexao().getConexao()){
            connection.setAutoCommit(false);

            this.sql = "insert into Usuario(nome_usuario, email, tipodoc, doc,senha, data_nascimento, endereco,ativo)" +
                    "Values(?, ?, ?,?,?, date,?,?";
            this.preparedStatement = connection.prepareStatement((this.sql), PreparedStatement.RETURN_GENERATED_KEYS);
            this.preparedStatement.setString(1, usuario.getNome());
            this.preparedStatement.setString(2, usuario.getEmail());
            this.preparedStatement.setString(3,usuario.getTipodoc());
            this.preparedStatement.setLong(4,usuario.getDoc());
            this.preparedStatement.setString(5, usuario.getSenha());
            this.preparedStatement.setDate(6, usuario.getData_nascimento());
            this.preparedStatement.setString(7, usuario.getEndereco());
            this.preparedStatement.setBoolean(8,usuario.isAtivo());

            this.preparedStatement.execute();
            this.resultSet = this.preparedStatement.getGeneratedKeys();
            this.resultSet.next();
            if(this.resultSet.getInt(1)>0){
                usuario.setId(this.resultSet.getInt(1));
                connection.commit();
                this.status = "OK";
                System.out.println("Dentro do if insert usuário");
            }

            if(this.status.equals("OK")){
                this.sql="insert into Usuariotipos (id_usuario,id_tipo)" + "Values(?,?)";
                this.preparedStatement = connection.prepareStatement((this.sql), PreparedStatement.RETURN_GENERATED_KEYS);
                this.preparedStatement.setInt(1,usuario.getId());
                this.preparedStatement.setInt(2, usuario.getTipos().getId());
                this.preparedStatement.execute();
                this.resultSet = this.preparedStatement.getGeneratedKeys();
                this.resultSet.next();
                if(this.resultSet.getInt(1)>0){
                    connection.commit();
                    this.status ="OK";
                    System.out.println("Dentro do if insert usuariotipos");
                }
            }
        }catch (SQLException e){
            e.printStackTrace();
            this.status="Problema!";
        }
        return this.status;
    }

    public Usuario getUsuario (String email){
        return null;
    }
    public String editar (Usuario usuario, Connection connection) throws SQLException{
        this.sql="update Usuario set nome_usuario=?, email=?, tipodoc=?, doc=?,senha=?, data_nascimento=?, endereco=? where id_usuario=?";
        this.preparedStatement=connection.prepareStatement(this.sql);
        this.preparedStatement.setString(1, usuario.getNome());
        this.preparedStatement.setString(2, usuario.getEmail());
        this.preparedStatement.setString(3, usuario.getTipodoc());
        this.preparedStatement.setLong(4,usuario.getDoc());
        this.preparedStatement.setString(5, usuario.getSenha());
        this.preparedStatement.setDate(6,usuario.getData_nascimento());
        this.preparedStatement.setString(7, usuario.getEndereco());

        if(this.preparedStatement.getUpdateCount()>0){
            this.status="ok";
        }
        return this.status;
    }

    public String deletar(Usuario usuario){
        return null;
    }
}
