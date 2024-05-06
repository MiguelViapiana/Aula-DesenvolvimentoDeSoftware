package ExHeranca;

public class BikeDePasseio extends Bike{

    private final int CAPACIDADE_DE_CARGA =70;

    public BikeDePasseio(String cor, int velMax){
        //Chamada do construtor da classe mãe
        super(cor, velMax);
    }

    //Implemntação da interface de transporte
    public int getCapacidadeDeCarga(){
        return CAPACIDADE_DE_CARGA;
    }

    @Override
    public String toString() {
        super.getCor();
        return "BikeDePasseio [cor="+ super.getCor() 
        + ", velocidade=" + velocidade 
        + ", velocidadeMax=" + velocidadeMax + "]";
    }

}
