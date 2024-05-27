package br.edu.up.modelos;

public class ClienteEmpresa extends Cliente {

    private String cnpj;
    private String inscricaoEstadual;
    private int anoFundacao;

    public ClienteEmpresa(String nome, String telefone, String email, String cnpj, String inscricaoEstadual,
            int anoFundacao) {
        super(nome, telefone, email);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
        this.anoFundacao = anoFundacao;
    }

    @Override
    public String toString() {
        return "ClienteEmpresa [nome=" + nome + ", cnpj=" + cnpj + ", telefone=" + telefone + ", inscricaoEstadual="
                + inscricaoEstadual + ", email=" + email + ", anoFundacao=" + anoFundacao + "]";
    }

    @Override
    public String toCSV() {
        return nome + ";" + telefone + ";" + email + ";;;;" + cnpj + ";" + inscricaoEstadual + ";" + anoFundacao;
    }

}
