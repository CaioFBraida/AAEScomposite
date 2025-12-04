package mercado.composite;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CarrinhoTest {

    @Test
    void deveRetornarListaItens() {
        Categoria frutas = new Categoria("Frutas");
        Produto maca = new Produto("Maçã", 3.50);
        Produto banana = new Produto("Banana", 2.20);
        frutas.addItem(maca);
        frutas.addItem(banana);

        Categoria bebidas = new Categoria("Bebidas");
        Produto suco = new Produto("Suco de Laranja", 6.00);
        bebidas.addItem(suco);

        Categoria limpeza = new Categoria("Limpeza");
        Produto detergente = new Produto("Detergente", 2.80);
        Produto esponja = new Produto("Esponja", 1.50);
        limpeza.addItem(detergente);
        limpeza.addItem(esponja);

        Categoria compras = new Categoria("Compras do Mês");
        compras.addItem(frutas);
        compras.addItem(bebidas);
        compras.addItem(limpeza);

        Carrinho carrinho = new Carrinho();
        carrinho.setListaItens(compras);

        assertEquals(
                "Categoria: Compras do Mês\n" +
                        "Categoria: Frutas\n" +
                        "Produto: Maçã - preço: 3.5\n" +
                        "Produto: Banana - preço: 2.2\n" +
                        "Categoria: Bebidas\n" +
                        "Produto: Suco de Laranja - preço: 6.0\n" +
                        "Categoria: Limpeza\n" +
                        "Produto: Detergente - preço: 2.8\n" +
                        "Produto: Esponja - preço: 1.5\n",
                carrinho.getListaItens()
        );
    }

    @Test
    void deveRetornarExcecaoCarrinhoSemItens() {
        try {
            Carrinho carrinho = new Carrinho();
            carrinho.getListaItens();
            fail();
        } catch (NullPointerException e) {
            assertEquals("Carrinho sem itens", e.getMessage());
        }
    }
}
