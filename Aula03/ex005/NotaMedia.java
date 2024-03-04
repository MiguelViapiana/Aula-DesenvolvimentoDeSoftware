package Aula03.ex005;

import java.util.Scanner;

public class NotaMedia {
    public static void main(String[ ] args){
        //Arrays para os dados do aluno
        Scanner leitor = new Scanner(System.in);
        System.out.println("--- Formularia Acadêmico ---");
        String[] aluno = new String[5];
        int[] matriculas = new int[5];
        boolean[] aprovado = new boolean[5];
        double[] nota1 = new double[5];
        double[] nota2 = new double[5];
        double[] notaFinal = new double[5];

        //inserção dos dados nas arrays
        for(int i = 0; i < 5; i++){
            System.out.println("informe o nome do aluno " + (i + 1) + ":");
            System.out.println("Nome: ");
            aluno[i] = leitor.nextLine();
            System.out.println("Matrícula: ");
            
            matriculas[i] = leitor.nextInt();     
            System.out.println("Nota 1:");
            nota1[i] = leitor.nextDouble();
            System.out.println("Nota 2:");
            nota2[i] = leitor.nextDouble();
            notaFinal[i] =(nota1[i] + nota2[i])/2;
            leitor.nextLine();

            //Verificação se foi aprovado ou não
            aprovado[i] = notaFinal[i] >=6;
        }

        for(int i =0; i < 5; i++){
            System.out.println("Nome: "+ aluno[i]);
            System.out.println("Mattrícula: "+ matriculas[i]);
            if(aprovado[i] == true){
                System.out.println("Aprovado: (X)Sim ( )Não");
            }else{
                System.out.println("Aprovado: ( )Sim (X)Não");
            }
            System.out.println("Nota final: "+ notaFinal[i]);
            System.out.println("\n");
        }

        leitor.close();


    }
}
