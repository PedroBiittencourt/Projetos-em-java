package lp4.calculoFrete;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EncomendaTest {

    @Test
    void deveVerificarPesoZeradoNegativo(){
        try {
            Encomenda encomenda = new Encomenda(0f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Peso invalido", e.getMessage());
        }
    }

}