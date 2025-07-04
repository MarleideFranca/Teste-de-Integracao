package marleidealves;

import java.util.Objects;

public class Produto {

    private String nome;
    private double preco;

    // Construtor
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // Getter para nome
    public String getNome() {
        return nome;
    }

    // Setter para nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter para preco
    public double getPreco() {
        return preco;
    }

    // Setter para preco
    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Método toString (opcional)
    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", preco=" + preco + "]";
    }


// Implementação da classe Produto
//sobrescrever equals() e hashCode() para o Map funcione corretamente com produtos iguais:
@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produto)) return false;
        Produto produto = (Produto) o;
        return Double.compare(produto.preco, preco) == 0 &&
               Objects.equals(nome, produto.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, preco);
    }
}

