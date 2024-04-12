package br.edu.up.telas;

import java.util.Scanner;

import br.edu.up.controles.ControleDePedidos;
import br.edu.up.modelos.Pedido;

public class MenuInicial {

    Scanner sc = new Scanner(System.in);

    public void mostar() {
        System.out.println();
        System.out.println("------------");
        System.out.println("MENU INICIAL");
        System.out.println("------------");
        System.out.println();
        System.out.println("Digite a opção desejada: ");
        System.out.println();

        System.err.println("\n1. Cadastar Cliente");
        System.err.println("2. Cadastar Funcionrio");
        System.err.println("...");
        System.err.println("5. Controle de pedidos");

        int opcao = sc.nextInt();
        switch (opcao) {
            case 1:

                break;
            case 5: {
                mostrarMenuPedidos();

                break;
            }

        }
    }

    public void mostrarMenuPedidos() {
        System.out.println();
        System.out.println("------------");
        System.out.println("MENU PEDIDOS");
        System.out.println("------------");
        System.out.println();
        System.out.println("Digite a opção desejada: ");
        System.out.println();

        System.err.println("\n1. Incluir Pedido");
        System.err.println("2. Editar Pedido");
        System.err.println("3. Listar Pedido");
        System.err.println("4. Excluir Pedido");
        System.out.println("5. Voltar");

        int opcao = sc.nextInt();

        ControleDePedidos controle = new ControleDePedidos();

        switch (opcao) {
            case 1:

                break;
            case 3: {
                // listar pedido
                Pedido[] pedidos = controle.getPedidos();
                System.out.println("--- PEDIDOS ---");
                for (int i = 0; i < pedidos.length; i++) {
                    Pedido pedido = pedidos[i];
                    String str = "Numero: " + pedido.getNumero() + " Data: " + pedido.getData();
                    System.out.println(str);
                }

                break;
            }
            case 5:
                // Voltar para menu inicial
                break;
        }
    }

}
