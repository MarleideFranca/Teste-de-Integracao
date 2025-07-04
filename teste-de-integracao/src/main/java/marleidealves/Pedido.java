package marleidealves;

import java.util.HashMap;
import java.util.Map;

public class Pedido {
    private Map<Produto, Integer> itens;

    // Construtor
    public Pedido() {
        this.itens = new HashMap<>();
    }

    // Adiciona 1 unidade do produto
    public void adicionarProduto(Produto produto) {
        itens.put(produto, itens.getOrDefault(produto, 0) + 1);
    }

    // Remove 1 unidade do produto (ou o remove completamente se for a última)
    public void removerProduto(Produto produto) {
        if (itens.containsKey(produto)) {
            int quantidade = itens.get(produto);
            if (quantidade > 1) {
                itens.put(produto, quantidade - 1);
            } else {
                itens.remove(produto);
            }
        }
    }

    // Retorna o total de unidades de produtos no pedido
    public int getQuantidadeTotalProdutos() {
        return itens.values().stream().mapToInt(Integer::intValue).sum();
    }

    // Retorna o número de tipos diferentes de produtos no pedido
    public int getQuantidadeDeTiposDeProdutos() {
        return itens.size();
    }

    // Retorna o mapa de produtos com suas quantidades
    public Map<Produto, Integer> getItens() {
        return itens;
    }
}
