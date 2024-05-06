package ExHeranca;

public class BikeDeTrilha extends Bike{

    private final int CAPACIDADE_DE_CARGA =80;

    public BikeDeTrilha(String cor, int velMax){
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
        return "BikeDeTrilha  [cor="+ super.getCor() 
        + ", velocidade=" + velocidade 
        + ", velocidadeMax=" + velocidadeMax + "]";
    }

    

}
