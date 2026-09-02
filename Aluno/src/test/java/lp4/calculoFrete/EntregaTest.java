package lp4.calculoFrete;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EntregaTest {

    @Test
    void deveVerificarDistanciaZeradoNegativo(){
        Encomenda encomenda = new Encomenda(1f);
        try {
            Entrega entrega = new Entrega(0f, encomenda);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Distancia invalida", e.getMessage());
        }
    }

    @Test
    void deveVerificarEncomendaNula(){
        try {
            Entrega entrega = new Entrega(1f, null);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Encomenda invalida", e.getMessage());
        }
    }

    @Test
    void deveVerificar10km

}