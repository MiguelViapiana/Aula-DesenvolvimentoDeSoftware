package br.edu.up.models;

public class Carro extends Veiculo {

    //public static enum Tipo {
    //    UNO,
    //    BMW
    //}
    
    //Atributo
    //private Tipo tipo;
    private String marca;
    private String modelo;
    private int velocidade = 0;
    private int velociadeMax;

    public Carro(int velociadeMax){
        this.velociadeMax = velociadeMax;
    }

    // Getter (pegar)
    public String getMarca() {
        return this.marca;
    }

    // Setter(Atribuir)
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidade() {
        return velocidade;
    }
    public int getVelocidadeMax(){
        return this.velociadeMax;
    }

    public void acelerar() {
        if (this.velocidade < this.velociadeMax) {
            this.velocidade += 10;
        }
    }

    public void freiar() {
        if (velocidade > 0) {
            velocidade -= 10;
        }
    }
}
