package Aula02.ex004;
import java.util.Scanner;

public class VerificadorIdade {
    public static void main(String[] args){
        System.out.println("--- Verificador de idade ---");
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a sua idade: ");
        int idade = leitor.nextInt();
        if (idade <= 13) {
            System.out.println("Criança!");
        }else if(idade <= 18){
            System.out.println("Adolescente!");
        }else if(idade <= 60){
            System.out.println("Adulto!");
        }else{
            System.out.println("Idoso!");
        }
        leitor.close();
    }
}
