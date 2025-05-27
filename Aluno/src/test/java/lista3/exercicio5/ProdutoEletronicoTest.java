package lista3.exercicio5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoEletronicoTest {

    @Test
    void deveCalcularPreco(){
        ProdutoEletronico produto = new ProdutoEletronico(1000, "Celular", 1, 1);
        assertEquals(1000, produto.calcularPreco());
    }


}