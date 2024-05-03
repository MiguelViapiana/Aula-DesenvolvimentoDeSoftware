package ExHeranca;

public class BikeDeCorrida extends Bike{
    public BikeDeCorrida(String cor, int velMax){
        //Chamada do construtor da classe mãe
        super(cor, velMax);
    }
    @Override
    public String toString() {
        super.getCor();
        return "BikeDeCorrida [cor="+ super.getCor() 
        + ", velocidade=" + velocidade 
        + ", velocidadeMax=" + velocidadeMax + "]";
    }
}
