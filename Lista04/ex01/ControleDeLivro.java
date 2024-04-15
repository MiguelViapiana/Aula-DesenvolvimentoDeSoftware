

public class ControleDeLivro {
    private Livro[] livros = new Livro[2];

    public ControleDeLivro(){
        this.livros = new Livro[2];

        Livro l1 = new Livro();
        l1.setCodigo("1588FHK");
        l1.setTitulo("Core Java 2"); 
        l1.setAutores("Cay S. Horstmann, Gary Cornell");
        l1.setAno(2005);
        l1.setIsbn("0130819336");

        Livro l2 = new Livro();
        l2.setCodigo("9865PLO");
        l2.setTitulo("Java, How to Program"); 
        l2.setAutores("Harvey Deitel");
        l2.setAno(2015);
        l2.setIsbn("0130341517");

        this.livros[0] = l1;
        this.livros[1] = l2;

    }

    public Livro[] getLivros() {
        return livros;
    }

    public void setLivros(Livro[] livros) {
        this.livros = livros;
    }
    
}
