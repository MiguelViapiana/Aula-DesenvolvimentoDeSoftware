import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n--- Biblioteca ---");
        System.out.println("1. Listar Livros");
        System.out.println("2. Sair");
        int op = sc.nextInt();
        ControleDeLivro controle = new ControleDeLivro();
        while (op != 2) {
            switch (op) {

                case 1:
                    Livro[] livros = controle.getLivros();
                    System.out.println("--- LIVROS ---");
                    for (int i = 0; i < livros.length; i++) {
                        Livro livro = livros[i];
                        String str = "\nLivro " + (i + 1) + "\nCódigo: " + livro.getCodigo() + "\nTítulo: "
                                + livro.getTitulo() + "\nAutores: " + livro.getAutores() + "\nISBN: " + livro.getIsbn()
                                + "\nAno: " + livro.getAno();
                        System.out.println(str);
                    }
                    break;
            }
            System.out.println("\n--- Biblioteca ---");
            System.out.println("1. Listar Livros");
            System.out.println("2. Sair");
            op = sc.nextInt();
        }

    }
}
