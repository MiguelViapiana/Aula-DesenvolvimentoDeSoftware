public class Cliente {
    private String nome;
    private String telefone;
    private String email;

    public Cliente(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Cliente [nome=" + nome + ", telefone=" + telefone + ", email=" + email + "]";
    }

    public String toCSV(){
        return nome + ";" + telefone + ";" + email;
    }
    

    
}
