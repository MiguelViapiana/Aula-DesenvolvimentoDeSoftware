package br.edu.up.models;

public class Programa {
    public static void main (String[] args){
         
        //Pessoa p = new Pessoa("João");
        Pessoa p = new Pessoa();
        p.setNome("João");

        System.out.println("Nome: "+ p.getNome());
        
        
        System.out.println("\n");
        Carro uno = new Carro(130);

         uno.setMarca("Fiat");
         uno.setModelo("Uno Mille");
         uno.getMarca();
         uno.getModelo();
         uno.acelerar();
         uno.acelerar();
         uno.acelerar();
         uno.freiar();
         uno.freiar();

         System.out.println("Marca: "+ uno.getMarca());
         System.out.println("Modelo: "+ uno.getModelo());
         System.out.println("Valocidade: "+ uno.getVelocidade()+" KM/H");
         System.out.println("Velocidade máxima: "+ uno.getVelocidadeMax());

         Carro bmw = new Carro(290);

         bmw.setMarca("BMW");
         bmw.setModelo("M3 Competition");
         System.out.println("\nMarca: "+ bmw.getMarca());
         System.out.println("Modelo: "+ bmw.getModelo());
         System.out.println("Valocidade: "+ bmw.getVelocidade()+" KM/H");
         System.out.println("Velocidade máxima: "+ bmw.getVelocidadeMax());

         
        
         

    }
}
