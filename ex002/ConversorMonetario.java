package ex002;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ConversorMonetario {
    public static void main(String[] args){
        System.out.println("--- Conversor de Moedas");
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um valor em reais(R$): ");
        double reais = leitor.nextDouble();
        double euro = reais / 6.14;
        double dolar = reais / 5.17;
        double peso = reais / 0.05;

        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Dolar: "+ df.format(dolar));
        System.out.println("Euro: "+ df.format(euro));
        System.out.println("Peso Argentino: "+ df.format(peso));

        leitor.close();
    }
}
