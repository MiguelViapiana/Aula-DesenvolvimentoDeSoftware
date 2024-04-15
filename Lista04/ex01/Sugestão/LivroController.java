package Sugestão;

public class LivroController {
    private Livro2 model;
    private LivroView view;

    public LivroController(Livro2 model, LivroView view){
        this.model = model;
        this.view = view;
    }

    public void atualizarView(){
        view.exebirLivro(model.obterDadosFormatados(),"Livro");
    }
}
