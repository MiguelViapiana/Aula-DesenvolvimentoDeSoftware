import java.util.Scanner;

public class OlaMundo {

    public static void main(String[] args){
        System.out.println("FAAAAALAAA PAPIIITOOOOO");
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = leitor.nextLine();
        System.out.println("Digite a sua matrícula: ");
        int matricula = leitor.nextInt();
        if(matricula < 0 || matricula > 99999){
            System.out.println("[ERRO], número de matricula incorreta(*****)");
        }else{
            System.out.println("Digite as suas duas notas: ");
            int nota1 = leitor.nextInt();
            int nota2 = leitor.nextInt();
            if(nota1 < 0 || nota1 > 10 || nota2 < 0 || nota2 > 10){
                System.out.println("[ERRO], notas inseridas inválidas");
            }else{
                int notafinal = (nota1 + nota2)/2;
                System.out.println("Nome: "+ nome);
                System.out.println("Matrícula: "+ matricula);
                if (notafinal > 6){
                    System.out.println("Aprovado: (X)Sim ( )Não");
                }else{
                    System.out.println("Aprovado: ( )Sim (X)Não");
                }
                System.out.println("Nota Final: "+ notafinal);
            }
            
        }
        leitor.close();
        

    }

}
