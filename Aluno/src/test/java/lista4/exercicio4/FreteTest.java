package lista4.exercicio4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FreteTest {

    @Test
    void deveVerificarNumeroZeradoNegativo() {
        Frete frete = new FreteNormal();
        try {
            frete.setNumero(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Numero de frete invalido", e.getMessage());
        }
    }

    @Test
    void deveVerificarNumeroValido() {
        Frete frete = new FreteNormal();
        frete.setNumero(1);
        assertEquals(1, frete.getNumero());
    }

    @Test
    void deveVerificarValorFreteZeradoNegativo() {
        Frete frete = new FreteNormal();
        try {
            frete.setValorFrete(-0.01f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Valor de frete invalido", e.getMessage());
        }
    }

    @Test
    void deveVerificarValorFreteValido() {
        Frete frete = new FreteNormal();
        frete.setValorFrete(0.01f);
        assertEquals(0.01f, frete.getValorFrete(), 0.001f);
    }

    @Test
    void deveVerificarTaxaEntregaNegativa() {
        try {
            Frete frete = new FreteEspecial();
            frete.setTaxaEntrega(-0.01f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Valor de taxa de entrega invalido", e.getMessage());
        }
    }

    @Test
    void deveVerificarTaxaEntregaValida() {
        Frete frete = new FreteNormal();
        frete.setTaxaEntrega(0.01f);
        assertEquals(0.01f, frete.getTaxaEntrega(), 0.001f);
    }

}