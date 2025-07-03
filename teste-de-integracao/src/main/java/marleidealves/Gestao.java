package marleidealves;

public class Gestao {
    private Pedido pedido;

    // Construtor
    public Gestao(Pedido pedido) {
        this.pedido = pedido;
    }

    // Método para calcular o valor total da venda
    public double valorTotalVenda() {
        double total = 0.0;
        for (Produto produto : pedido.getProdutos()) {
            total += produto.getPreco();
        }
        return total;
    }
}

