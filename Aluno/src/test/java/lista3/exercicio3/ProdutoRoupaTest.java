package lista3.exercicio3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoRoupaTest {

    @Test
    void deveCalcularPreco(){
        ProdutoRoupa produto = new ProdutoRoupa(10, "Blusa");
        assertEquals(8, produto.calcularPreco());
    }

}