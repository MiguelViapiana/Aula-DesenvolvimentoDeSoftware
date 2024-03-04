package Aula03.ex006;

import java.util.Scanner;

public class NotaMedia02 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("--- Formulário Acadêmico --- \n");
        String[] nome = new String[5];
        int[] matriculas = new int[5];
        double[][] nota = new double[5][5];

        for(int i =0; i <5 ; i++){
            System.out.println("informe o nome do aluno " + (i + 1) + ":");
            System.out.println("Nome: ");
            nome[i] = leitor.nextLine();
            System.out.println("Matrícula: ");
            matriculas[i] = leitor.nextInt();  
            System.out.println("Notas entre 1-10");   
            for(int p=0; p < 5; p++){
                System.out.println("Nota "+ (p+1) +":");
                nota[i][p] = leitor.nextDouble();
            }
            leitor.nextLine(); 
            
        }
        for(int i = 0; i< 5; i++){
            for(int p=0; p < 5; p++){
                if(nota[i][p] >= 1 && nota[i][p] <= 10){
                        
                }else{
                    System.out.println("[ERRO] Dado inválido!!");
                    break; 
                }
            }
        }
        for(int i =0; i < 5; i++){
            System.out.println("Nome: "+ nome[i]);
            System.out.println("Mattrícula: "+ matriculas[i]);
            for(int p =0; p< 5; p++){
                System.out.println("Nota("+(p+1)+"): "+ nota[i][p]);
            }
            System.out.println("\n");
        }
        leitor.close();
    }
}


