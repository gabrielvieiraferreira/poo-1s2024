package aulas.aula3;

import java.util.Date;

public class Livro {
    private Integer id;
    private String titulo;
    private String nomeEAutor;
    private Date anoPublicacao;
    private String editora;

    public Livro(){

    }
    public Livro (Integer id){
        this.id = id;
    }

    public Livro(Integer id, String titulo, String nomeEAutor, Date anoPublicacao, String editora) {
        this.id = id;
        this.titulo = titulo;
        this.nomeEAutor = nomeEAutor;
        this.anoPublicacao = anoPublicacao;
        this.editora = editora;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNomeEAutor() {
        return nomeEAutor;
    }

    public void setNomeEAutor(String nomeEAutor) {
        this.nomeEAutor = nomeEAutor;
    }

    public Date getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(Date anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }
}
