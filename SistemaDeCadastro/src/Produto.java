public class Produto {
    int codigo;
    String nome;
    double preco;

    public Produto(int codigo, String nome, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Informações do produto:\n" + "Código: " + codigo + "\n" + "Produto: " + nome + "\n" + "Preço: R$" + preco;
    }
}
