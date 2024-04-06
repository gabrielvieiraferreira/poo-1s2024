package aulas.aula3;

import java.util.ArrayList;

public class Livraria {
    ArrayList<Livro> livros;

    public Livraria(){

    }
    public Livraria(ArrayList<Livro> livros) {
        this.livros = livros;
    }
    public void cadastrarLivro(Livro livro){
        livros.add(livro);
    }
    public void removerLivro(Livro livro){
        livros.remove(livro);
    }
    public String listarLivros(){
        StringBuilder listaLivros = new StringBuilder();
        for (Livro l : this.livros){
            listaLivros.append(l.getId()).append(" - ").append(l.getTitulo()).append("\n");
        }
        return listaLivros.toString();
    }

}
