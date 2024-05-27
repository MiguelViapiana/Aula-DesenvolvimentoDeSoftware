package br.edu.up.controles;

import java.util.List;
import java.util.ArrayList;

import br.edu.up.daos.GerenciadorDeArquivos;
import br.edu.up.modelos.Cliente;
import br.edu.up.modelos.ClientePessoa;

public class ControleDeClientes {

    private GerenciadorDeArquivos gArquivos = new GerenciadorDeArquivos();

    private List<Cliente> clientes;

    public ControleDeClientes() {
        this.clientes = gArquivos.getClientes();
    }

    public void incluir(Cliente cliente) {
        this.clientes.add(cliente);
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public ClientePessoa getPessoa(String cpf) {

        List<ClientePessoa> pessoas = getClientesPessoa();
        for (ClientePessoa clientePessoa : pessoas) {
            if (clientePessoa.getCpf().equals(cpf)) {
                return clientePessoa;
            }
        }
        return null;
    }

    public List<ClientePessoa> getClientesPessoa() {
        List<ClientePessoa> lista = new ArrayList<>();
        for (Cliente cliente : clientes) {
            if (cliente instanceof ClientePessoa) {
                ClientePessoa cp = (ClientePessoa) cliente;
                lista.add(cp);
            }
        }
        return lista;
    }

    public boolean gravarDados() {
        // boolean retorno = gArquivos.gravar(clientes);
        // return retorno;
        return gArquivos.gravar(clientes);
    }

}
