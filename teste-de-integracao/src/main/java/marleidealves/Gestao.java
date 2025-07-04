package marleidealves;

import java.util.Map;

public class Gestao {
    private Pedido pedido;

    // Construtor
    public Gestao(Pedido pedido) {
        this.pedido = pedido;
    }

    // Calcula o valor total da venda (preço × quantidade)
    public double valorTotalVenda() {
        double total = 0.0;

        for (Map.Entry<Produto, Integer> entry : pedido.getItens().entrySet()) {
            Produto produto = entry.getKey();
            int quantidade = entry.getValue();
            total += produto.getPreco() * quantidade;
        }

        return total;
    }
}
