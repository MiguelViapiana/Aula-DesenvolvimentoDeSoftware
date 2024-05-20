import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws FileNotFoundException {

        String nomeArquivo = "C:\\Users\\autologon\\Documents\\Aula-DesenvolvimentoDeSoftware\\ExArquivo\\src\\clientes.csv";

        List<Cliente> ListaDeCliente = new ArrayList<>();
        
        File arquivo = new File(nomeArquivo);
        //Tenta fazer
        try {
            Scanner leitor = new Scanner(arquivo); //Leia as informações do arquivo

            leitor.nextLine();

            while (leitor.hasNextLine()){
                String linha = leitor.nextLine();

                String[] dados = linha.split(";");

                String nome = dados[0];
                String telefone = dados[1];
                String email = dados[2];

                Cliente cliente = new Cliente(nome, telefone, email);
                ListaDeCliente.add(cliente);
            }
            leitor.close();
        } catch (FileNotFoundException e) {
            //Tratar o erro
            System.out.println("O arquivo: "+ e.getMessage() + " não foi encontrado");
        }
        
        
        Cliente novoCliente = new Cliente("Maria", "45 5454-7878", "maria@gmail.com");
        ListaDeCliente.add(novoCliente);

        //Imprimir dados dos clientes
        for (Cliente cliente : ListaDeCliente) {
            System.out.println(cliente);
        }

        //GRAVAÇÂO DE ARQUIVO DE TEXTO
        try {
            FileWriter arquivoGravar = new FileWriter(nomeArquivo);
            PrintWriter gravador = new PrintWriter(arquivoGravar);

            gravador.println("nome;telefone;email");

            for (Cliente cliente : ListaDeCliente) {
                gravador.println(cliente.toCSV());
            }
            gravador.close();
        } catch (IOException e) {
            
        }
        
    }
}

