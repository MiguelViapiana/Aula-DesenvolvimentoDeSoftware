package Aula03;

import java.util.Scanner;

public class Vetores {
    public static void main(String[] args){
        int[] vet1 = new int[3];

        vet1[1] = 450;

        //System.out.println("Vet1 posição 1 "+ vlrPos1);
        //System.out.println("Vet posição 2 "+ vet1[1]);

        Scanner leitor = new Scanner(System.in);

        //Preeencehr os valores de vet1
        for(int i =0; i < 3; i++){
            System.out.println("Digite o valor da posição " + (i + 1));
            vet1[i] = leitor.nextInt();
        }

        //Imprimir os valores de vet1
        boolean executar =  true;
        int contador =0;
        while(executar && contador < 3){
            if (vet1[contador] > 100) {
                executar = false;
            }else{
                System.out.println("Valor na posição "+ (contador + 1) + ": "+ vet1[contador]);
            contador++;
            }
        }

        //Zerar o vet1
        do {
            //Vetor zerado
            if (vet1[0] == 0) {
                break;
            }
            vet1[contador] = 0;
            contador++;
        } while (contador < 3);

        leitor.close();
    }
}
