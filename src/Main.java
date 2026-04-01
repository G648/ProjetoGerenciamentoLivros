import java.lang.management.ManagementFactory;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        ArrayList<String> teste = new ArrayList<>();
//        Scanner sc = new Scanner(System.in);
//
//        String nomeUsuario = sc.next();
//
//        teste.add(nomeUsuario);
//        teste.add(0, "nomeTeste");
//        teste.add("Fernanda");
//        teste.add("Diego");
//        teste.add("Romulo");
//        teste.add("Neymar");
//
//        System.out.println(teste.size());
//
//        teste.remove("Neymar");
//        teste.remove(0);
//
//        System.out.println(teste.size());
//
//        for (String nomes : teste){
//            System.out.println(nomes);
//        }
//
//        if (teste.contains("Fernanda")){
//            System.out.println("O nome está presente na lista!");
//
//            teste.remove("Fernanda");
//        } else {
//            System.out.println("o nome não está presente na lista! ");
//        }
//
//        for (String nomes : teste){
//            System.out.println(nomes);
//        }
//
//        System.out.println("você quer remover todos os valores da lista ?");
//        String opcaoUsuario = sc.next();
//
//        if (opcaoUsuario.equals("sim")){
//            teste.clear();
//
//            System.out.println("Lista resetada com sucesso: " + teste.size());
//
//            for (String nomes : teste){
//                System.out.println(nomes);
//            }
//        }

        Scanner sc = new Scanner(System.in);
        GerenciadorLivros gLivros = new GerenciadorLivros();
        boolean continuarRodando = true;

        do {
            System.out.println("Bem vindo ao sistema de gerenciamento de livros");
            System.out.println("[1] - Cadastrar Livro");
            System.out.println("[2] - Listar Livro");
            System.out.println("[3] - Atualizar Livro");
            System.out.println("[4] - Deletar Livro");
            System.out.println("[0] - Sair do programa");

            System.out.println("informe uma opção do menu:");
            int opcaoUsuario = sc.nextInt();

            switch (opcaoUsuario) {
                case 1:
                    sc.nextLine();
                    System.out.println("Bem vindo ao cadastro de livros: ");
                    System.out.print("Informe o nome do livro: ");
                    String nomeLivro = sc.nextLine();
                    gLivros.CadastrarLivro(nomeLivro);
                    break;

                case 2:
                    gLivros.ListarLivros();
                    break;

                case 3:
                    //1. etapa -> exibir livros
                    gLivros.ListarLivros(); // mostra os livros com índice
                    sc.nextLine();

                    //2. declarar o livro a ser atualizado
                    System.out.print("Informe o número do livro que deseja atualizar: ");
                    int indice = sc.nextInt();
                    sc.nextLine();

                    //3. informar o nome do novo livro
                    System.out.print("Informe o novo nome do livro: ");
                    String novoNome = sc.nextLine();

                    //4. chamada do método para atualizar o livro (índice, novo nome do livro)
                    gLivros.AtualizarLivro(indice - 1, novoNome); // -1 porque a lista começa em 0
                    break;

                case 4:
                    gLivros.ListarLivros();
                    sc.nextLine();
                    System.out.print("Informe o número do livro que deseja deletar: ");
                    int indiceDeletar = sc.nextInt();
                    gLivros.DeletarLivro(indiceDeletar - 1);
                    break;

                case 0:
                    continuarRodando = false;
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        } while (continuarRodando);
    }
}