package lista4.exercicio6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VagaSemanalTest {

    @Test
    void deveVerificarQuantidadeSemanasZeradoNegativo(){
        try {
            VagaSemanal vaga = new VagaSemanal();
            vaga.setQuantidadeSemanas(0);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Quantidade de semanas invalida", e.getMessage());
        }
    }

    @Test
    void deveVerificarQuantidadeSemanasValido(){
            VagaSemanal vaga = new VagaSemanal();
            vaga.setQuantidadeSemanas(1);
            assertEquals(1, vaga.getQuantidadeSemanas());
    }

    @Test
    void deveCalcularAluguel(){
        VagaSemanal vaga = new VagaSemanal();
        vaga.setQuantidadeSemanas(1);
        assertEquals(40, vaga.calcularAluguel());
    }

    @Test
    void deveRetornarTipoVaga(){
        VagaSemanal vaga = new VagaSemanal();
        assertEquals("Vaga semanal", vaga.getTipoVaga());
    }

}