package br.edu.up.daos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.edu.up.modelos.Cliente;
import br.edu.up.modelos.ClienteEmpresa;
import br.edu.up.modelos.ClientePessoa;

public class GerenciadorDeArquivos {

    private String header = "";
    private String nomeDoArquivo = "C:\\Users\\autologon\\Documents\\Aula-DesenvolvimentoDeSoftware\\ExArquivo\\clientes.csv";

    public List<Cliente> getClientes() {

        List<Cliente> listaDeClientes = new ArrayList<>();

        try {
            // LER UM ARQUIVO DE TEXTO
            File arquivoLeitura = new File(nomeDoArquivo);
            // Scanner leitor = new Scanner(System.in); //Teclado
            Scanner leitor = new Scanner(arquivoLeitura);

            // Armazeno cabeçalho
            header = leitor.nextLine();

            // Enquanto tiver linha no arquivo
            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine();
                String[] dados = linha.split(";");

                String nome = dados[0];
                String telefone = dados[1];
                String email = dados[2];

                double credito = Double.parseDouble(dados[3]);
                double emprestado = Double.parseDouble(dados[4]);

                String cpf = dados[5];
                if (cpf != null && !cpf.equals("")) {
                    // pessoa
                    double peso = Double.parseDouble(dados[6]);
                    double altura = Double.parseDouble(dados[7]);

                    Cliente cliente = new ClientePessoa(nome, telefone, email,
                            credito, emprestado, cpf, peso, altura);
                    listaDeClientes.add(cliente);

                } else {
                    // empresa
                    String cnpj = dados[8];
                    String inscricao = dados[9];
                    int ano = Integer.parseInt(dados[10]);

                    Cliente cliente = new ClienteEmpresa(nome, telefone, email, cnpj, inscricao, ano);
                    listaDeClientes.add(cliente);
                }
            }

            leitor.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado! " + e.getMessage());
        }

        return listaDeClientes;
    }

    public boolean gravar(List<Cliente> clientes) {

        try {
            // GRAVAR UM ARQUIVO DE TEXTO
            FileWriter arquivoGravar = new FileWriter(nomeDoArquivo);
            PrintWriter gravador = new PrintWriter(arquivoGravar);

            gravador.println(header);

            for (Cliente cliente : clientes) {
                gravador.println(cliente.toCSV());
            }
            gravador.close();

            return true;

        } catch (IOException e) {
            System.out.println("Não foi possível gravar o arquivo!");
        }

        return false;
    }

    // public static void main(String[] args) {// throws FileNotFoundException {

    // List<Cliente> listaDeClientes = new ArrayList<>();

    // try {
    // // LER UM ARQUIVO DE TEXTO
    // File arquivoLeitura = new
    // File("C:\\_ws\\dev_n\\ExArquivos\\clientesTab.txt");
    // // Scanner leitor = new Scanner(System.in); //Teclado
    // Scanner leitor = new Scanner(arquivoLeitura);

    // // Descartar cabeçalho
    // leitor.nextLine();

    // // Enquanto tiver linha no arquivo
    // while (leitor.hasNextLine()) {
    // String linha = leitor.nextLine();
    // String[] dados = linha.split("\t");

    // String nome = dados[0];
    // String telefone = dados[1];
    // String email = dados[2];

    // Cliente cliente = new Cliente(nome, telefone, email);
    // listaDeClientes.add(cliente);
    // }
    // } catch (FileNotFoundException e) {
    // System.out.println("Arquivo não encontrado! " + e.getMessage());
    // }

    // // PROCESSAMENTO
    // for (Cliente cliente : listaDeClientes) {
    // System.out.println(cliente);
    // }

    // // GRAVAR UM ARQUIVO DE TEXTO

    // }

    // public static void main(String[] args) {// throws FileNotFoundException {

    // try {
    // // LER UM ARQUIVO DE TEXTO
    // File arquivoLeitura = new File("C:\\_ws\\dev_n\\ExArquivos\\arquivo.txt");
    // // Scanner leitor = new Scanner(System.in); //Teclado
    // Scanner leitor = new Scanner(arquivoLeitura);

    // // Enquanto tiver linha no arquivo
    // while (leitor.hasNextLine()) {
    // String linha = leitor.nextLine();
    // System.out.println(linha);
    // }
    // } catch (FileNotFoundException e) {
    // System.out.println("Arquivo não encontrado! " + e.getMessage());
    // }

    // // PROCESSAMENTO

    // // GRAVAR UM ARQUIVO DE TEXTO

    // }

}
