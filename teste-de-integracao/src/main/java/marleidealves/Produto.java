package marleidealves;

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

}
