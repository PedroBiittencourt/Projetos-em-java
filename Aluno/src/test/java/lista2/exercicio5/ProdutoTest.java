package lista2.exercicio5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {
    Produto produto;

    @BeforeEach
    void setUp() {
        produto = new Produto();
    }

    @Test
    void deveAdicionarEstoque() {
        produto.setQuantidade_estoque(0);
        produto.adicionar_estoque(1);
        assertEquals(1, produto.getQuantidade_estoque());
    }

    @Test
    void deveRemoverEstoque() {
        produto.setQuantidade_estoque(1);
        produto.remover_estoque(1);
        assertEquals(0, produto.getQuantidade_estoque());
    }

    @Test
    void deveAplicarDesconto() {
        produto.setPreco(1);
        produto.aplicar_desconto(90);
        assertEquals(0.1f, produto.getPreco(), 0.001f);
    }

    @Test
    void verificaPrecoInvalido() {
        try {
            produto.setPreco(-0.1f);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals(e.getMessage(), "Preco invalido");
        }
    }

    @Test
    void verificaQuantidadeEstoqueInvalido() {
        try {
            produto.setQuantidade_estoque(-1);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals(e.getMessage(), "Quantidade de estoque invalido");
        }
    }

    @Test
    void verificaQuantidadeInvalidoAdicionarEstoque() {
        try {
            produto.adicionar_estoque(-1);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals(e.getMessage(), "Quantidade invalida");
        }
    }

    @Test
    void verificaQuantidadeNegativaRemoverEstoque() {
        try {
            produto.remover_estoque(-1);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals(e.getMessage(), "Quantidade invalida");
        }
    }

    @Test
    void verificaQuantidadeMaiorQueEstoqueRemoverEstoque() {
        try {
            produto.setQuantidade_estoque(1);
            produto.remover_estoque(2);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals(e.getMessage(), "Quantidade invalida");
        }
    }

    @Test
    void verificaPercentualNegativoAplicarDesconto() {
        try {
            produto.aplicar_desconto(-0.1f);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals(e.getMessage(), "Percentual invalido");
        }
    }

    @Test
    void verificaPercentualMaiorQue100AplicarDesconto() {
        try {
            produto.aplicar_desconto(100.1f);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals(e.getMessage(), "Percentual invalido");
        }
    }

}