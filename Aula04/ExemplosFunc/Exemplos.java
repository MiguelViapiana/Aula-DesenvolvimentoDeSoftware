
/************************************************************************************
 * AULA: Programação Básica Java
 * 
 * 1. Tipos de variáveis var, int, short, long, float, double, bool e String;
 * 2. Operadores de atribuição, aritméticos, relacionais, lógicos e unários;
 * 3. Estruturas de decisão if/else, ternárias e switch;
 * 4. Estruturas de repetição while, do/while, for, for avançado;
 * 5. Arrays.
 * 
 ***********************************************************************************/
public class Exemplos {
  public static void imprimir(String texto){
    System.out.println(texto);
  }
  public static void main(String[] args) {

    // 1. Tipos de variáveis var, int, short, long, float, double, bool e string;
    // 2. Operadores de atribuição, aritméticos, relacionais, lógicos e unários;

    int a = 15;
    var b = 10; // inferência de tipo dinâmico (fracamente tipado)
    short c = 5;
    var d = 10;
    //float e = 10.5f;
   // double f = 10.5;
    //boolean g = true;
    //String h = "Olá, mundo!";

    // System.out.println("O valor da variável a é: " + a);
    System.out.printf("O valor da variável a é: %d%n", a);

    System.out.printf("O valor da variável b é: %d%n", b);

    System.out.printf("O valor mínimo de int é %d e o valor máximo é %d %n", Integer.MIN_VALUE, Integer.MAX_VALUE);
    System.out.printf("O valor mínimo de short é %d e o valor máximo é %d%n", Short.MIN_VALUE, Short.MAX_VALUE);
    System.out.printf("O valor mínimo de long é %d e o valor máximo é %d%n", Long.MIN_VALUE, Long.MAX_VALUE);
    System.out.printf("O valor mínimo de float é %f e o valor máximo é %f%n", Float.MIN_VALUE, Float.MAX_VALUE);
    System.out.printf("O valor mínimo de double é %f e o valor máximo é %f%n", Double.MIN_VALUE, Double.MAX_VALUE);

    //String texto = "------> A + B: " + (a + b);

    //inr r = a + b;
    //int r = somar(a, b);


    imprimir("------> A + B: " + Calculadora.somar(a, b));
    imprimir("------> A - B: " + Calculadora.sub(a, b));
    imprimir("------>A * B: " + Calculadora.mult(a, b));
    imprimir("------>A / B: " + Calculadora.div(a, b));
    imprimir("------>A % B: " + Calculadora.res(a, b));
    imprimir("------>A + B x C: " + Calculadora.conta(a, b, c));
    imprimir("------>(A + B) x C: " + Calculadora.conta2(a, b,c));

    // Operadores aritméticos de atribuição (=, *=, /=, +=, -=)
    System.out.println("d += a: " + (d += a));
    System.out.println("d -= a: " + (d -= a));
    System.out.println("d *= a: " + (d *= a));
    System.out.println("d /= a: " + (d /= a));

    // Operadores relacionais (==, !=, <, >, <=, >=) e lógicos (!, &&, ||) e unários
    // (++, --):
    System.out.println("A == B: " + (a == b));
    System.out.println("A != B: " + (a != b));
    System.out.println("A < B: " + (a < b));
    System.out.println("A > B: " + (a > b));
    System.out.println("A <= B: " + (a <= b));
    System.out.println("A >= B: " + (a >= b));

    System.out.println("A é igual a B e C é maior do A: " + (a == b && c > a));
    // b = 15;
    // c = 25;
    System.out.println("A é igual a B ou A é maior do C: " + (a == b || c > a));

    // 3. Estruturas de decisão if/else, ternárias e switch/array;
    System.out.printf("Valores A = %d, B = %d, C = %d %n", a, b, c);

    if (a == b) {
      System.out.println("A == B");
    } else {
      System.out.println("A != B");
    }

    var msg = a == b ? "A == B" : "A != B";
    System.out.println(msg);

    int[] dias = new int[] { 2, 3, 4, 5, 6 };
    try {
      switch (dias[6]) {
        case 2:
          System.out.println("Segunda-feira");
          break;
        case 3:
          System.out.println("Terça-feira");
          break;
        case 4:
          System.out.println("Quarta-feira");
          break;
        case 5:
          System.out.println("Quinta-feira");
          break;
        case 6:
          System.out.println("Sexta-feira");
          break;
        default:
          System.out.println("É final de semana!");
          break;
      }
    } catch (Exception ex) {
      System.out.println("Deu algum erro...");
    }

    // 4. Estruturas de repetição while, do/while, for, for avançado;
    // 5. Arrays.

    boolean executar = true;
    int contador = 0;
    String[] nomes = new String[] { "João", "Pedro", "Paulo", "Tiago", "Ana", "Maria" };

    System.out.println("------while--------");
    while (executar && contador < nomes.length) {
      var nome = nomes[contador];
      System.out.println(nome);
      contador++;
    }

    contador = 0;
    System.out.println("-----do/while--------");
    do {
      var nome = nomes[contador];
      System.out.println(nome);
      contador++;
    } while (executar && contador < nomes.length);

    System.out.println("-------for--------");
    for (int i = 0; i < nomes.length; i++) {
      var nome = nomes[i];
      System.out.println(nome);
    }

    System.out.println("-------for avançado--------");
    for (var nome : nomes) {
      System.out.println(nome);
    }

  }

}
