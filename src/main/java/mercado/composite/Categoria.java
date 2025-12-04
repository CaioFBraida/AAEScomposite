package mercado.composite;

import java.util.ArrayList;
import java.util.List;

public class Categoria extends ItemMercado {

    private List<ItemMercado> itens;

    public Categoria(String descricao) {
        super(descricao);
        this.itens = new ArrayList<>();
    }

    public void addItem(ItemMercado item) {
        this.itens.add(item);
    }

    @Override
    public String getConteudo() {
        String saida = "";
        saida += "Categoria: " + this.getDescricao() + "\n";
        for (ItemMercado item : itens) {
            saida += item.getConteudo();
        }
        return saida;
    }
}
