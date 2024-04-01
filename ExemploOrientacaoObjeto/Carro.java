package ExemploOrientacaoObjeto;

public class Carro extends Veiculo{
    private String marca;
    private int velocidade = 0;

    public void acelerar(){
        if (velocidade < 200) {
            velocidade+=10;
        }
    }
}
