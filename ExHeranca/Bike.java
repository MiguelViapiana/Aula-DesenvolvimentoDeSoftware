package ExHeranca;
//https://shopee.com.br/Munhequeira-Faixa-de-Pulso-Academia-Muscula%C3%A7%C3%A3o-Fitness-Max-Force-i.596198533.12653694206?sp_atk=62968579-1a3b-4df1-a61d-ab3d263c1967&xptdk=62968579-1a3b-4df1-a61d-ab3d263c1967

public  abstract class Bike  implements Transporte{
    private String cor;
    protected int velocidade;
    protected int velocidadeMax;

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
