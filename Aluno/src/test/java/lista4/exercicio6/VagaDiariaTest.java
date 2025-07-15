package lista4.exercicio6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VagaDiariaTest {

    @Test
    void deveVerificarQuantidadeDiasZeradoNegativo(){
        try {
            VagaDiaria vaga = new VagaDiaria();
            vaga.setQuantidadeDias(0);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Quantidade de dias invalida", e.getMessage());
        }
    }

    @Test
    void deveVerificarQuantidadeDiasValido(){
            VagaDiaria vaga = new VagaDiaria();
            vaga.setQuantidadeDias(1);
            assertEquals(1, vaga.getQuantidadeDias());
    }

    @Test
    void deveCalcularAluguel(){
        VagaDiaria vaga = new VagaDiaria();
        vaga.setQuantidadeDias(1);
        assertEquals(10, vaga.calcularAluguel());
    }

    @Test
    void deveRetornarTipoVaga(){
        VagaDiaria vaga = new VagaDiaria();
        assertEquals("Vaga diária", vaga.getTipoVaga());
    }

}