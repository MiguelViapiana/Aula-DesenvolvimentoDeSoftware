package ex003;
import java.util.Scanner;

public class MaiorMenor {
    static public void main(String[] args){
        System.out.println("--- Verificador de número ---");
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite dois números: ");
        double num1 = leitor.nextDouble();
        double num2 = leitor.nextDouble();
        double maior_num = num1;
        double menor_num = num2;
        if(num1 < num2){
            maior_num = num2;
            menor_num = num1;
        }
        System.out.println("O maior número é o: "+maior_num);
        System.out.println("O menor número é o: "+ menor_num);
    leitor.close();
    }
}
