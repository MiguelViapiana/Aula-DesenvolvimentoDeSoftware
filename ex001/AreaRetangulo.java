package ex001;
import java.util.Scanner;

public class AreaRetangulo {
    public static void main(String[] args){
        System.out.println("--- Area de retângulo ---");
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a altura: ");
        int altura = leitor.nextInt();
        System.out.println("Digite a largura: ");
        int largura = leitor.nextInt();
        System.out.println("A area do retângulo é de: "+ (largura * altura));
    leitor.close();
    }

}
