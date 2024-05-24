package view;

import java.util.ArrayList;
import java.util.List;

import controller.ControllerCliente;
import models.*;

public class TelaPrincipal {

    private ControllerCliente controleCliente = new ControllerCliente();


    public void mostarMenu(){

        Prompt.separador();
        Prompt.imprimir("MENU PRINCIPAL");
        Prompt.separador();

        Prompt.imprimir("1. Incluir cliente pessoa");
        Prompt.imprimir("2. Incluir cliente empresa");
        Prompt.imprimir("3. Mostrar dados cliente pessoa");
        Prompt.imprimir("4. Mostrar dados cliente empresa");
        Prompt.imprimir("5. Emprestar para cliente pessoa");
        Prompt.imprimir("6. Emprestar para cliente empresa");
        Prompt.imprimir("7. Devolução de cliente pessoa");
        Prompt.imprimir("8. Devolução de cliente empresa");
        Prompt.imprimir("9. Sair");

        int op = Prompt.lerInteiro();
        if (op ==1) {
            
        }

        if (op ==3) {
            List<ClientePessoa> cPessoa = controleCliente.getClientePessoas();
            Prompt.imprimir("\nLISTA DE CLIENTE PESSOA");
            for (ClientePessoa clientePessoa : cPessoa) {
                Prompt.imprimir(clientePessoa);
            }
        }
    }
}
