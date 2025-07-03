package marleidealves;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GestaoTest {

    @Test
    public void testValorTotalVendaComDoisProdutos() {
        Pedido pedido = new Pedido();
        pedido.adicionarProduto(new Produto("Livro", 50.0));
        pedido.adicionarProduto(new Produto("Caneta", 5.0));

        Gestao gestao = new Gestao(pedido);
        double total = gestao.valorTotalVenda();

        assertEquals(55.0, total, 0.01);
    }

    @Test
    public void testValorTotalVendaSemProdutos() {
        Pedido pedido = new Pedido();
        Gestao gestao = new Gestao(pedido);
        double total = gestao.valorTotalVenda();

        assertEquals(0.0, total, 0.01);
    }

    @Test
    public void testValorTotalVendaComProdutoGratuito() {
        Pedido pedido = new Pedido();
        pedido.adicionarProduto(new Produto("Brinde", 0.0));
        Gestao gestao = new Gestao(pedido);
        double total = gestao.valorTotalVenda();

        assertEquals(0.0, total, 0.01);
    }
}
