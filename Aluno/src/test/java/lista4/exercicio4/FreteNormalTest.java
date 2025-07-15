package lista4.exercicio4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FreteNormalTest {

    @Test
    void deveCalcularFrete(){
        FreteNormal frete = new FreteNormal();
        frete.setValorFrete(1f);
        assertEquals(1, frete.calcularFrete());
    }

    @Test
    void deveRetornarTipoFrete(){
        FreteNormal frete = new FreteNormal();
        assertEquals("Frete normal", frete.getTipoFrete());
    }

}