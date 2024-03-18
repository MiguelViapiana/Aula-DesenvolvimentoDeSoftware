package Aula06;

public class Pessoa {
    
    public String nome;
    public int idade;

    @Override
    public String toString() {
        return "Nome: "+ nome+ " Idade :"+ idade;
    }

    public Pessoa(String nomeParam){
        nome = nomeParam;
    }
    public Pessoa(String nomeParam, int idadeParam){
        nome = nomeParam;
        idade = idadeParam;
    }
    public Pessoa(){

    }

}
