package exercicioRelampagoSurpresaNumeroPi;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CidadeTest {

    @Test
    void deveRetornarNomeEstado() {
        Estado estado = new Estado();
        estado.setNome("MG");
        Cidade cidade = new Cidade(estado);
        assertEquals("MG", cidade.getNomeEstado());
    }

    @Test
    void deveRetornarExcecaoEstadoNuloConstrutor() {
        try {
            Cidade cidade = new Cidade(null);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Estado invalido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoEstadoNulo() {
        try {
            Cidade cidade = new Cidade(new Estado());
            cidade.setEstado(null);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Estado invalido", e.getMessage());
        }
    }

    @Test
    void deveVerificarNomeCidadeInvalido() {
        try {
            Cidade cidade = new Cidade(new Estado());
            cidade.setNome(" ");
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Cidade invalida", e.getMessage());
        }
    }

}