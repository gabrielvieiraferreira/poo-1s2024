import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Sistemalivro {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        Biblioteca biblioteca = new Biblioteca();
        int opcao = 0;

        while (opcao != 5) {
            System.out.println("1 - Adicionar livro");
            System.out.println("2 - Listar livros");
            System.out.println("3 - Detalhar livro");
            System.out.println("4 - Remover livro (ID)");
            System.out.println("5 - Sair");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Adicionando livro");
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Titulo ");
                    String titulo = sc.nextLine();
                    System.out.print("Autor: ");
                    String nomeEAutor = sc.nextLine();
                    System.out.print("Ano de Publicação: ");
                    String data = sc.nextLine();
                    Date date = sdf.parse(data);
                    System.out.print("Editora: ");
                    String editora = sc.nextLine();
                    Livro livro = new Livro(id, titulo, nomeEAutor, date, editora);
                    biblioteca.cadastrarLivro(livro);
                    break;
                case 2:
                    System.out.println("Listando livros");
                    System.out.println(biblioteca.listarLivros());
                    break;
                case 3:
                    System.out.println("Detalhando livro (ID)");
                    System.out.print("Detalhar Livro (ID): ");
                    int idDetalhar = sc.nextInt();
                    System.out.println(biblioteca.detalharLivro(idDetalhar));
                    break;
                case 4:
                    System.out.println("Removendo livro");
                    System.out.print("Remover Livro (ID): ");
                    int idRemove = sc.nextInt();
                    biblioteca.removerLivro(idRemove);
                    break;
                case 5:
                    System.out.println("Êxito em sair");
                    break;
                default:
                    System.out.println("Opção Inválida");
                    break;
            }
        }

        sc.close();
    }
}

