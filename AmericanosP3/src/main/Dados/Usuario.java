package Dados;

import java.sql.Date;

public class Usuario {
    private int id;
    private String nome;
    private String tipodoc;
    private Long  doc;
    private String email;
    private String senha;
    private String endereco;
    private boolean ativo;
    private Tipos tipos;
    private Date data_nascimento;

    public Usuario(int id, String nome, Date data_nascimento, String endereco, String email, String senha, Tipos tipos, Boolean ativo){}
    public Usuario(int id, String nome, String email, String senha, Date data_nascimento, Tipos tipos){
        this.id=id;
        this.nome=nome;
        this.email=email;
        this.senha=senha;
        this.data_nascimento=data_nascimento;
        this.tipos=tipos;
        this.ativo=ativo;
    }

    public Usuario(int id, String nome, String email, String senha, Boolean ativo){
        this.id=id;
        this.nome=nome;
        this.email=email;
        this.senha=senha;
        this.ativo=ativo;
    }

    public Usuario(String nome, String email, String senha, String tipodoc, Long doc, Date data_nascimento, String endereco) {
    }

    public Usuario(Usuario usuario) {
    }

    public Usuario() {
    }

    public Usuario(int id, String nome, Date data_nascimento, String endereco, String email, String senha) {
    }


    public String getTipodoc() {
        return tipodoc;
    }

    public void setTipodoc(String tipodoc) {
        this.tipodoc = tipodoc;
    }

    public Long getDoc() {
        return doc;
    }

    public void setDoc(Long doc) {
        this.doc = doc;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }


    public Tipos getTipos() {
        return tipos;
    }

    public void setTipos(Tipos tipos) {
        this.tipos = tipos;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Date getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(Date data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
