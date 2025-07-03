package marleidealves;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Produto> produtos;

    // Construtor
    public Pedido() {
        this.produtos = new ArrayList<>();
    }

    // Método para adicionar produto
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    // Método para remover produto
    public void removerProduto(Produto produto) {
        produtos.remove(produto);
    }

    // Método para retornar a quantidade de produtos
    public int getQuantidadeProdutos() {
        return produtos.size();
    }

    // (Opcional) Método para exibir os produtos
    public List<Produto> getProdutos() {
        return produtos;
    }
}
