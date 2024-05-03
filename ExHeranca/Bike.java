package ExHeranca;

public  abstract class Bike  implements Transporte{
    private String cor;
    protected int velocidade;
    protected int velocidadeMax;

    // public Bike(String cor){
    //     this.cor = cor;
    // }

    // public Bike(){

    // }
    public Bike(String cor, int velocidadeMax) {
        this.cor = cor;
        this.velocidadeMax = velocidadeMax;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    @Override
    public String toString() {
        return "Bike [cor=" + cor + ", velocidade=" + velocidade + ", velocidadeMax=" + velocidadeMax + "]";
    }

    

    
    
}
