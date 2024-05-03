package ExHeranca;

public class BikeDePasseio extends Bike{
    public BikeDePasseio(String cor, int velMax){
        //Chamada do construtor da classe mãe
        super(cor, velMax);
    }
    @Override
    public String toString() {
        super.getCor();
        return "BikeDePasseio [cor="+ super.getCor() 
        + ", velocidade=" + velocidade 
        + ", velocidadeMax=" + velocidadeMax + "]";
    }

}
