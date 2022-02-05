package FLOCO2.spring_rest.Dados;

public class Cliente {
  private int id;
  private String nome;
  private String data_nascimento;
  private String cep;
  private String estado;
  private String cidade;
  private String numero;
  private String endereco;

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

  public String getData_nascimento() {
    return data_nascimento;
  }

  public void setData_nascimento(String data_nascimento) {
    this.data_nascimento = data_nascimento;
  }

  public String getCep() {
    return cep;
  }

  public void setCep(String cep) {
    this.cep = cep;
  }

  public String getEstado() {
    return estado;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }

  public String getCidade() {
    return cidade;
  }

  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  public String getNumero() {
    return numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public String getEndereco() {
    return endereco;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  public Cliente(int id, String nome, String data_nascimento, String cep, String estado, String cidade, String numero, String endereco) {
    this.id = id;
    this.nome = nome;
    this.data_nascimento = data_nascimento;
    this.cep = cep;
    this.estado = estado;
    this.cidade = cidade;
    this.numero = numero;
    this.endereco = endereco;
  }







}
