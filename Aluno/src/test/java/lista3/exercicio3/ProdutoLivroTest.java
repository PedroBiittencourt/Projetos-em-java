package lista3.exercicio3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoLivroTest {

    @Test
    void deveCalcularPreco(){
        ProdutoLivro produto = new ProdutoLivro(10, "Diario de um banana");
        assertEquals(9.5, produto.calcularPreco());
    }

}