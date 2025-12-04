package mercado.composite;

public class Carrinho {

    private ItemMercado listaItens;

    public void setListaItens(ItemMercado listaItens) {
        this.listaItens = listaItens;
    }

    public String getListaItens() {
        if (this.listaItens == null) {
            throw new NullPointerException("Carrinho sem itens");
        }
        return this.listaItens.getConteudo();
    }
}
