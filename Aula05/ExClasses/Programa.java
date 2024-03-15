package Aula05.ExClasses;

import java.util.Scanner;

public class Programa {

    public static void main(String[] args){
        // Ponto inicial do programa
        exibirMenuInicial();
    }

    public static void exibirMenuInicial(){

        Scanner sc = new Scanner(System.in);
        // Mostra o menu inical

        //String matricula;
        //String nome;
        //double nota1;
        //double nota2;

        //Dados de 5 alunos :D
        //String[] matriculas = new String[5];
        //String[] nomes = new String[5];
        //double[] notas1 = new double[5];
        //double[] notas2 = new double[5];

        // Matriz com 5 alunos
        //String[][] dadosAlunos = new String[4][5];

        // Structs ou classes/objetos

        Aluno a1 = new Aluno();
        a1.matricula = sc.nextLine();
        a1.nome = sc.nextLine();
        a1.nota1 = sc.nextInt();
        a1.nota2 = sc.nextInt();
        //Aluno a2 = new Aluno();
        //Aluno a3 = new Aluno();
        //Aluno a4 = new Aluno();
        //Aluno a5 = new Aluno();
        sc.close();
    }

}
