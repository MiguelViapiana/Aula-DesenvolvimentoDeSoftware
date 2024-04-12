package Aula07;

public class Pagamento {
    //Dados do objeto
    public double valorSalario = 5000;
    
    //Método que altera os dados
    public void alterarSalario(double novovalor){
        valorSalario = novovalor;
    }
    //Função estática para somar
    public static double somar(double a, double b){
        return a + b;
    }
}
