package ExHeranca;

public class BikeDeTrilha extends Bike{

    public BikeDeTrilha(String cor, int velMax){
        //Chamada do construtor da classe mãe
        super(cor, velMax);
    }

    @Override
    public String toString() {
        super.getCor();
        return "BikeDeTrilha  [cor="+ super.getCor() 
        + ", velocidade=" + velocidade 
        + ", velocidadeMax=" + velocidadeMax + "]";
    }

    

}
