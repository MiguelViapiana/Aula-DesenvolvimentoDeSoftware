package br.edu.up.telas;

import java.util.List;

import br.edu.up.controles.ControleDeClientes;
import br.edu.up.util.Prompt;
import br.edu.up.modelos.Cliente;
import br.edu.up.modelos.ClientePessoa;

public class TelaPrincipal {

    private ControleDeClientes controle = new ControleDeClientes();

    public void mostrarMenuPrincipal() {

        int op = 0;

        do {

            Prompt.limparConsole();
            Prompt.separador();
            Prompt.imprimir("MENU PRINCIPAL");
            Prompt.separador();

            Prompt.imprimir("1. Incluir cliente pessoa");
            Prompt.imprimir("2. Incluir cliente empresa");
            Prompt.imprimir("3. Mostrar dados cliente pessoa");
            Prompt.imprimir("4. Mostrar dados cliente empresa");
            Prompt.imprimir("5. Mostrar todos os clientes");
            Prompt.imprimir("6. Emprestar");
            Prompt.imprimir("7. Devolver");
            Prompt.imprimir("8. Sair");

            op = Prompt.lerInteiro();

            switch (op) {
                case 1:
                    // 1. Incluir cliente pessoa
                    mostrarMenuIncluirPessoas();
                    break;
                case 3:
                    // 3. Mostrar dados cliente pessoa
                    Prompt.separador();
                    Prompt.imprimir("LISTA DE CLIENTES PESSOA");
                    List<ClientePessoa> listaPessoas = controle.getClientesPessoa();
                    for (ClientePessoa clientePessoa : listaPessoas) {
                        Prompt.imprimir(clientePessoa);
                    }
                    Prompt.pressionarEnter();
                    break;
                case 5:
                    // 5. Mostrar todos os clientes
                    Prompt.separador();
                    Prompt.imprimir("LISTA DE CLIENTES");
                    List<Cliente> clientes = controle.getClientes();
                    for (Cliente cliente : clientes) {
                        Prompt.imprimir(cliente);
                    }
                    Prompt.pressionarEnter();
                    break;
                case 6:
                    // 6. Emprestar
                    menuEmprestar();
                    break;
            }

        } while (op != 8);

        if (controle.gravarDados()) {
            Prompt.imprimir("Dados gravados com sucesso!");
        } else {
            Prompt.imprimir("Erro na gravação do arquivo!");
        }
        Prompt.imprimir("Programa encerrado!");

    }

    private void menuEmprestar() {
        Prompt.separador();
        Prompt.imprimir("MENU EMPRESTAR");
        Prompt.separador();
        Prompt.imprimir("Digite (1) pessoa ou (2) empresa:");
        int vlr = Prompt.lerInteiro();
        if (vlr == 1) {
            Prompt.imprimir("Digite o CPF:");
            String cpf = Prompt.lerLinha();
            ClientePessoa pessoa = controle.getPessoa(cpf);
            if (pessoa != null) {
                double credito = pessoa.getCredito();
                Prompt.imprimir("Digite o valor desejado (Máximo = " + credito + " ): ");
                double vlrEmprestar = Prompt.lerDecimal();
                pessoa.adicionarEmprestimo(vlrEmprestar);

                Prompt.imprimir("Empréstimo realizado com sucesso!");
                Prompt.pressionarEnter();
            } else {
                Prompt.imprimir("Pessoa não encontrada!");
                Prompt.pressionarEnter();
            }
        } else {

        }

    }

    private void mostrarMenuIncluirPessoas() {

        Prompt.separador();
        Prompt.imprimir("MENU INCLUIR PESSOA");
        Prompt.separador();

        Prompt.imprimir("Digite o nome;");
        String nome = Prompt.lerLinha();

        Prompt.imprimir("Digite o telefone:");
        String telefone = Prompt.lerLinha();

        Prompt.imprimir("Digite o email:");
        String email = Prompt.lerLinha();

        Prompt.imprimir("Digite o cpf:");
        String cpf = Prompt.lerLinha();

        Prompt.imprimir("Digite o peso:");
        double peso = Prompt.lerDecimal();

        Prompt.imprimir("Digite o altura:");
        double altura = Prompt.lerDecimal();

        ClientePessoa clientePessoa = new ClientePessoa(nome, telefone, email, cpf, peso, altura);
        controle.incluir(clientePessoa);
    }

}
