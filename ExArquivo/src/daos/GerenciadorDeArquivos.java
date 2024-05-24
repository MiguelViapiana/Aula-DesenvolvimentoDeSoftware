package daos;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import models.Cliente;
import models.ClienteEmpresa;
import models.ClientePessoa;

public class GerenciadorDeArquivos {

    public List<Cliente> getClientes() {
        List<Cliente> listaDeClientes = new ArrayList<>();

        return listaDeClientes;
    }

    public static void outroNome(String[] args) {

        String nomeArquivo = "C:\\Users\\autologon\\Documents\\Aula-DesenvolvimentoDeSoftware\\ExArquivo\\src\\clientes.csv";

        List<Cliente> listaDeClientes = new ArrayList<>();

        // LEITURA DE ARQUIVO DE TEXTO
        // C:\_ws\dev_m\ExArquivos\src\arquivo.txt
        File arquivo = new File(nomeArquivo);

        try {
            // Tentar fazer
            // new Scanner(System.in); Leia as informações do teclado.
            Scanner leitor = new Scanner(arquivo); // Leia as informações do arquivo.

            // Descartar a linha do cabeçalho
            leitor.nextLine();

            // Enquanto tiver linha no arquivo
            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine();
                // Quebrar os dados da linha pela tabulação.
                String[] dados = linha.split(";");

                String nome = dados[0];
                String telefone = dados[1];
                String email = dados[2];

                //Cliente Pessoa: 
                String cpf = dados[3];
                if (cpf != null && !cpf.equals("")) {
                    double peso = Double.parseDouble(dados[4]);
                    double altura = Double.parseDouble(dados[5]);;
                    Cliente cliente = new ClientePessoa(nome, telefone, email, cpf, peso, altura);
                    listaDeClientes.add(cliente);
                }else{
                    //Cliente Empresa: 
                    String cnpj = dados[6];
                    String inscricao = dados[7];
                    int ano = Integer.parseInt(dados[8]);
                    Cliente cliente = new ClienteEmpresa(nome, telefone, email, cnpj, inscricao, ano);
                    listaDeClientes.add(cliente);
                }
                

                

                // Cliente cliente = new Cliente(nome, telefone, email);
                // listaDeClientes.add(cliente);
            }

        } catch (FileNotFoundException e) {
            // Tratar o erro
            System.out.println("O arquivo " + e.getMessage() + " não encontrado!");
        }

        // Cliente novoCliente = new Cliente("Maria", "45 5454-4554",
        // "maria@email.com");
        // listaDeClientes.add(novoCliente);

        // Imprimir dados dos clientes
        for (Cliente cliente : listaDeClientes) {
            System.out.println(cliente);
        }

        // GRAVAÇÃO DE ARQUIVO DE TEXTO
        try {
            FileWriter arquivoGravar = new FileWriter(nomeArquivo);
            PrintWriter gravador = new PrintWriter(arquivoGravar);

            gravador.println("nome;telefone;email");

            for (Cliente cliente : listaDeClientes) {
                gravador.println(cliente.toCSV());
            }
            gravador.close();

        } catch (IOException e) {
            System.out.println("Falha na gravação do arquivo!");
        }

    }
}

