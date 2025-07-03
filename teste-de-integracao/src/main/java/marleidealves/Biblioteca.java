package marleidealves;

public class Biblioteca {

    // Atributos
    private String nome;
    private String cnpj; 
    private int anoFundacao;

    // Construtor
    public Biblioteca(String nome, String cnpj, int anoFundacao) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.anoFundacao = anoFundacao;
    }

    // Métodos Get e Set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public int getAnoFundacao() {
        return anoFundacao;
    }

    public void setAnoFundacao(int anoFundacao) {
        this.anoFundacao = anoFundacao;
    }

    // Método que indica se é patrimônio histórico
    public boolean patrimonioHistorico() {
        return anoFundacao < 1980;
    }
}
