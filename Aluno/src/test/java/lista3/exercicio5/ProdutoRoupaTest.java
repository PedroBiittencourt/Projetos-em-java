package lista3.exercicio5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoRoupaTest {

    @Test
    void deveCalcularPrecoSemDesconto(){
        ProdutoRoupa produto = new ProdutoRoupa(10, "Blusa", 5, 2);
        produto.setDesconto(20);
        assertEquals(20, produto.calcularPreco());
    }

    @Test
    void deveCalcularPrecoComDesconto(){
        ProdutoRoupa produto = new ProdutoRoupa(10, "Blusa", 5, 3);
        produto.setDesconto(20);
        assertEquals(24, produto.calcularPreco());
    }


    @Test
    void deveVerificarDescontoInvalido(){
        try{
            ProdutoRoupa produto = new ProdutoRoupa(1000, "Celular", 1, 1);
            produto.setDesconto(0);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Desconto invalido", e.getMessage());
        }
    }

}