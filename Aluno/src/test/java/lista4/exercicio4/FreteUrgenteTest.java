package lista4.exercicio4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FreteUrgenteTest {

    @Test
    void deveVerificarQuantidadeItensZeradoNegativo() {
        FreteUrgente frete = new FreteUrgente();
        try {
            frete.setQuantidadeItens(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Quantidade de itens invalido", e.getMessage());
        }
    }

    @Test
    void deveVerificarQuantidadeItensValido() {
        FreteUrgente frete = new FreteUrgente();
        frete.setQuantidadeItens(1);
        assertEquals(1, frete.getQuantidadeItens());
    }

    @Test
    void deveCalcularFrete(){
        FreteUrgente frete = new FreteUrgente();
        frete.setTaxaEntrega(1f);
        frete.setValorFrete(1f);
        frete.setQuantidadeItens(1);
        assertEquals(12, frete.calcularFrete());
    }

}