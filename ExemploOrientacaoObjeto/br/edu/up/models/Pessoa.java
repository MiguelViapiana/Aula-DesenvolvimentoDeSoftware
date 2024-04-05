package br.edu.up.models;

public class Pessoa {

    private String nome;
    private int altura;
    private int peso;

    public Pessoa(String nome) {
        this.nome = nome;
    }
    public Pessoa(String nome, int altura, int peso) {
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        if (altura > 15 && altura < 250) {
            this.altura = altura;
        }else{
             
        }
    }
    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
    public Pessoa() {
    }
 
}
