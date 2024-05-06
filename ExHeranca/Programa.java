package ExHeranca;

import java.util.ArrayList;
import java.util.List;

public class Programa {
    public static void main(String[] args){

        //Listas Dinâmicas
        //List<BikeDeCorrida> listaBikesDeCorrida = new ArrayList<>();
        List<Bike> listaDeBikeGenericas = new ArrayList<>();

        //Bike bikePrincipal = new Bike("Vermelha");

        BikeDeCorrida bikeCorrida = new BikeDeCorrida("Azul", 100);   
        listaDeBikeGenericas.add(bikeCorrida);
        //listaBikesDeCorrida.add(bikeCorrida);

        BikeDePasseio bikePasseio = new BikeDePasseio("Verde", 40);
        listaDeBikeGenericas.add(bikePasseio);

        BikeDeTrilha bikeTrilha = new BikeDeTrilha("Amarela", 60);
        listaDeBikeGenericas.add(bikeTrilha);

        //System.out.println(bikePrincipal);
        // System.out.println(bikeCorrida);
        // System.out.println(bikePasseio);
        // System.out.println(bikeTrilha);
        for(Bike bike: listaDeBikeGenericas){
            System.out.println(bike);
        }
    }
}
