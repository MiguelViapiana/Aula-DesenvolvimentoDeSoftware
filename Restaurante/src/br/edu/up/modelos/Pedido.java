package br.edu.up.modelos;

public class Pedido extends Cliente{

    private double numero;
    private String data;

    // O pedido tem um
    Cliente cliente;
    Garcom garcom;
    Item[] itens;
    
    public double getNumero() {
        return numero;
    }
    public void setNumero(double numero) {
        this.numero = numero;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }



}
