import java.util.ArrayList;

public class GerenciadorLivros {

    ArrayList<String> listaLivros = new ArrayList<>();

    public void CadastrarLivro(String nomeLivro){
        try {

            listaLivros.add(nomeLivro);

            System.out.printf("O livro: %s foi cadastrado com sucesso!\n", nomeLivro);

        } catch (Exception error) {
            System.out.println("Erro ao cadastrar livro: " + error);
        }
    }

    public void ListarLivros() {
        if (listaLivros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
            return;
        }
        for (int i = 0; i < listaLivros.size(); i++) {
            System.out.printf("%d - %s%n", i + 1, listaLivros.get(i));
        }
    }

    public void AtualizarLivro(int indice, String novoNome) {
        if (indice < 0 || indice >= listaLivros.size()) {
            System.out.println("Índice inválido.");
            return;
        }
        String antigo = listaLivros.get(indice);
        listaLivros.set(indice, novoNome);
        System.out.printf("Livro '%s' atualizado para '%s'.%n", antigo, novoNome);
    }

    public void DeletarLivro(int indice) {
        if (indice < 0 || indice >= listaLivros.size()) {
            System.out.println("Índice inválido.");
            return;
        }
        String removido = listaLivros.remove(indice);
        System.out.printf("Livro '%s' removido.%n", removido);
    }

}
