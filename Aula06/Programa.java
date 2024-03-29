package Aula06;

public class Programa {

    public static void main(String[] args){

        Pessoa pessoa1 = new Pessoa("Ricardo", 25);
        Pessoa pessoa2 = new Pessoa("Ana", 21);
        Pessoa pessoa3 = new Pessoa();

        System.out.println("Pessoa 1 (nome): "+pessoa1.nome);
        System.out.println("Pessoa 1 (nome): "+pessoa2.nome);
        System.out.println("Pessoa 1 (nome): "+pessoa3.nome);
        System.out.println();
        System.out.println("Pessoa 1 (nome): "+pessoa1);
        System.out.println("Pessoa 1 (nome): "+pessoa2);
        System.out.println("Pessoa 1 (nome): "+pessoa3);
    }

    public static void mainAntigo(String[] args){

        String texto1 = "100";
        String texto2 = "50";

        //Concatenação
        String txtFinal =texto1 + texto2;
        System.out.println("Texto: "+txtFinal);

        //Parsear(converter)
        Integer numero1 = Integer.parseInt(texto1);
        int numero2 = Integer.parseInt(texto2);
        int resultado = Calculadora.Somar(numero1, numero2);
        System.out.println("Resultado: " +resultado);


        //double variavel = 10.60;
        //Double objeto = 10.50;

        //Objetos do tipo bike
        //Classe sempre com letra Maiúcula, e Objeto sempre com letra minúscula;
        Bike objetominhaBike = new Bike();
        objetominhaBike.marca = "Caloi";
        objetominhaBike.alterarMarcha(3);

        Bike objetosuaBike = new Bike();
        objetosuaBike.marca = "Oggi";
        objetosuaBike.alterarMarcha(5);

        System.out.println("Minha bike: "+ objetominhaBike.marca);
        System.out.println("Minha bike marcha: "+ objetominhaBike.marchaAtual);

        System.out.println();
        System.out.println("Sua bike: "+ objetosuaBike.marca);
        System.out.println("Sua bike marcha: "+ objetosuaBike.marchaAtual);
         
    }
}
