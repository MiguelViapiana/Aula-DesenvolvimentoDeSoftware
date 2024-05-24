package controller;

import java.util.ArrayList;
import java.util.List;

import daos.GerenciadorDeArquivos;
import models.Cliente;
import models.ClientePessoa;

public class ControllerCliente {

    private List<Cliente> clientes = new ArrayList<>();

    public ControllerCliente(){
        GerenciadorDeArquivos gArquivos = new GerenciadorDeArquivos();
        this.clientes = gArquivos.getClientes();
    }

    public List<ClientePessoa> getClientePessoas(){
        List<ClientePessoa> lista = new ArrayList<>();

        for (Cliente cliente : clientes) {
            if (cliente instanceof ClientePessoa) {
                ClientePessoa cp = (ClientePessoa) cliente;
                lista.add(cp);
            }
        }
        return lista;
    }
}
