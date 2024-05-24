package models;

public class ClienteEmpresa  extends Cliente{

    private String cnpj;
    private String iscricaoEstadual;
    private int anoFundacao;

    public ClienteEmpresa(String nome, String telefone, String email, String cnpj, String iscricaoEstadual,
            int anoFundacao) {
        super(nome, telefone, email);
        this.cnpj = cnpj;
        this.iscricaoEstadual = iscricaoEstadual;
        this.anoFundacao = anoFundacao;
    }
    @Override
    public String toString() {
        return "ClienteEmpresa [cnpj=" + cnpj + ", iscricaoEstadual=" + iscricaoEstadual + ", anoFundacao="
                + anoFundacao + ", toString()=" + super.toString() + "]";
    }

}
