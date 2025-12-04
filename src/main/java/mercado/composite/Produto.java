package mercado.composite;

public class Produto extends ItemMercado {

    private double preco;

    public Produto(String descricao, double preco) {
        super(descricao);
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String getConteudo() {
        return "Produto: " + this.getDescricao() + " - preço: " + this.preco + "\n";
    }
}
