

public class Calculadora {
    public static void imprimir(String texto){
        System.out.println(texto);
      }
      public static int somar (int a, int b){
        int r = a + b;
        return r;
      }
      public static int sub (int a, int b) {
        int sub = a - b;
        return sub;
      }
      public static int mult(int a, int b){
        int mult = a * b;
        return mult;
      }
      public static float div(float a, float b){
        float div = a / b;
        return div;
      }
      public static int res(int a, int b){
        int res = a % b;
        return res;
      }
      public static int conta(int a, int b, int c){
        int conta = a + b * c;
        return conta;
      }
      public static int conta2(int a, int b, int c){
        int conta2 = (a + b) * c;
        return conta2;
      }
}
