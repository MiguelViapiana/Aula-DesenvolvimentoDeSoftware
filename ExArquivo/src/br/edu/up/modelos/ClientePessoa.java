package br.edu.up.modelos;

public class ClientePessoa extends Cliente {

    private String cpf;
    private double peso;
    private double altura;

    public String getCpf() {
        return this.cpf;
    }

    public double getCredito() {
        return vlrMaximoCredito - vlrEmprestado;
    }

    public void adicionarEmprestimo(double vlr) {
        this.vlrEmprestado += vlr;
    }

    public ClientePessoa(String nome, String telefone, String email,
            String cpf, double peso, double altura) {
        super(nome, telefone, email);
        this.cpf = cpf;
        this.peso = peso;
        this.altura = altura;
    }

    public ClientePessoa(String nome, String telefone, String email, double vlrMaximoCredito, double vlrEmprestado,
            String cpf, double peso, double altura) {
        super(nome, telefone, email, vlrMaximoCredito, vlrEmprestado);
        this.cpf = cpf;
        this.peso = peso;
        this.altura = altura;
    }

    public String toCSV() {
        return nome + ";" + telefone + ";" + email + ";" + vlrMaximoCredito + ";" + vlrEmprestado + ";" + cpf
                + ";" + peso + ";" + altura + ";;;";
    }

    @Override
    public String toString() {
        return "ClientePessoa [nome=" + nome + ", emprestado=" + vlrEmprestado + "]";
    }

}
