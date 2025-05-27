package lista3.exercicio5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoAlimentoTest {

    @Test
    void deveCalcularPreco(){
        ProdutoAlimento produto = new ProdutoAlimento(100, "Picanha", 1, 1);
        assertEquals(100, produto.calcularPreco());
    }

}