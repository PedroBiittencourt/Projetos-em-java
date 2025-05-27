package lista3.exercicio3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoEletronicoTest {

    @Test
    void deveCalcularPreco(){
        ProdutoEletronico produto = new ProdutoEletronico(10, "Celular");
        assertEquals(9, produto.calcularPreco());
    }


}