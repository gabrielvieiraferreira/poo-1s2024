package aulas.aula3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Livraria {

    List<Livro> livros = new ArrayList<>();

    public Livraria(){

    }

    public Livraria(List<Livro> livros) {
        this.livros = livros;
    }

    public void cadastrarLivro(Livro livro){
        livros.add(livro);
    }
    public void removerLivro(int idRemove){
        Livro livroRemove = null;
        for (Livro livro : this.livros){
            if (Objects.equals(livro.getId(), idRemove)){
                livroRemove = livro;
                break;
            }
        }
        if (livroRemove != null){
            livros.remove(livroRemove);
            System.out.println("Livro removido com sucesso!");
        } else {
            System.out.println("Livro com ID "+idRemove+ "não encontrada na biblioteca");
        }
    }
    public String listarLivros(){
        StringBuilder sb = new StringBuilder();
        for (Livro l : this.livros){
            sb.append(l.getId()).append(" - ").append(l.getTitulo()).append("\n");
        }
        return sb.toString();
    }
    public String detalharLivro(int idDetalhe){
        StringBuilder sb = new StringBuilder();
        Livro livroDetalhado = null;
        for (Livro l : this.livros){
            if (Objects.equals(l.getId(), idDetalhe)){
                livroDetalhado = l;
                break;
            }
        }
        if (livroDetalhado != null){
            sb.append(livroDetalhado.getId())
                    .append(" - TITULO: ")
                    .append(livroDetalhado.getTitulo())
                    .append(" ")
                    .append(livroDetalhado.getNomeEAutor())
                    .append(" Publicado em: ")
                    .append(livroDetalhado.getAnoPublicacao())
                    .append(" pela Editora: ")
                    .append(livroDetalhado.getEditora());
            return sb.toString();
        }
        return sb.toString();
    }

}
