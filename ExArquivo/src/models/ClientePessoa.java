package models;

public class ClientePessoa extends Cliente{
    private String cpf;
    private double peso;
    private double altura;

    public ClientePessoa(String nome, String telefone, String email, String cpf, double peso, double altura) {
        super(nome, telefone, email);
        this.cpf = cpf;
        this.peso = peso;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "ClientePessoa [cpf=" + cpf + ", peso=" + peso + ", altura=" + altura + ", toString()="
                + super.toString() + "]";
    }

    
    
  
}
