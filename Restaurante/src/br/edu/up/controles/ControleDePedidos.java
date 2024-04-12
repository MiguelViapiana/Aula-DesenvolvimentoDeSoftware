
package br.edu.up.controles;

import br.edu.up.modelos.Pedido;

public class ControleDePedidos {

    private Pedido[] pedidos = new Pedido[2];

    public ControleDePedidos(){
        this.pedidos = new Pedido[2];

        Pedido p1 = new Pedido();
        p1.setNumero(1);
        p1.setData("12/04/2024");

        Pedido p2 = new Pedido();
        p2.setNumero(2);
        p2.setData("15/06/2024");

        this.pedidos[0] = p1;
        this.pedidos[1] = p2;

        
    }

    public Pedido[] getPedidos() {
        return pedidos;
    }

    public void setPedidos(Pedido[] pedidos) {
        this.pedidos = pedidos;
    }
}
