package br.edu.up.modelos;

public abstract class Cliente {

    protected String nome;
    protected String telefone;
    protected String email;
    protected double vlrMaximoCredito;
    protected double vlrEmprestado;

    public Cliente(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public Cliente(String nome, String telefone, String email, double vlrMaximoCredito, double vlrEmprestado) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.vlrMaximoCredito = vlrMaximoCredito;
        this.vlrEmprestado = vlrEmprestado;
    }

    public abstract String toCSV();

}
