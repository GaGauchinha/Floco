package FLOCO2.spring_rest.DAO;

import FLOCO2.spring_rest.Dados.Cliente;

import java.sql.Connection;
import java.util.ArrayList;

public class Cliente_DAO {
  public ArrayList<Cliente> getCliente(){
    ArrayList<Cliente> Clientes = new ArrayList<Cliente>();
    try(Connection connection = new Conexao().getConexao()){
      this.sql = "select * from cliente";
      this.statement = connection.createStatement();
      this.resultSet = this.statement.executeQuery(sql);
    }
  }




}
