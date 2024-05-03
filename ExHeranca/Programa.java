package ExHeranca;

public class Programa {
    public static void main(String[] args){

        //Bike bikePrincipal = new Bike("Vermelha");

        BikeDeCorrida bikeCorrida = new BikeDeCorrida("Azul", 100);

        BikeDePasseio bikePasseio = new BikeDePasseio("Verde", 40);


        BikeDeTrilha bikeTrilha = new BikeDeTrilha("Amarela", 60);


        //System.out.println(bikePrincipal);
        System.out.println(bikeCorrida);
        System.out.println(bikePasseio);
        System.out.println(bikeTrilha);
    }
}
