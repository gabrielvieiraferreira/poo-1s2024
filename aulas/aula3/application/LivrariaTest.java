package aulas.aula3.application;

import aulas.aula3.Livraria;
import aulas.aula3.Livro;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class LivrariaTest {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        Livraria livraria = new Livraria();
        int opcao = 0;

        while (opcao != 4){
            System.out.println("1 - Adicionar livro");
            System.out.println("2 - Listar livros");
            System.out.println("3 - Detalhar livro");
            System.out.println("4 - Sair");
            opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Adicionando livro");
                    System.out.print("ID:");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Titulo");
                    String titulo = sc.nextLine();
                    System.out.print("Autor:");
                    String nomeEAutor = sc.nextLine();
                    System.out.print("Ano de Publicação");
                    String data = sc.nextLine();
                    Date date = sdf.parse(data);
                    System.out.println("Editora:");
                    String editora = sc.nextLine();
                    Livro l = new Livro(id, titulo, nomeEAutor, date, editora);
                    livraria.cadastrarLivro(l);
                    break;
                case 2:
                    System.out.println("Listando livros");
                    System.out.println(livraria.listarLivros());
                    break;
                case 3:
                    System.out.println("Detalhando livros");
                    break;
                case 4:
                    System.out.println("Êxito em sair");
                default:
                    System.out.println("Opção Inválida");
                    break;
            }
        }



        sc.close();
    }

}
