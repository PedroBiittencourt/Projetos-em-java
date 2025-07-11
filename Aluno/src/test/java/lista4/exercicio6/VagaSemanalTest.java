package lista4.exercicio6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VagaSemanalTest {

    @Test
    void deveVerificarQuantidadeMesesZeradoNegativo(){
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
    void deveCalcularAluguel(){
        VagaSemanal vaga = new VagaSemanal();
        vaga.setQuantidadeSemanas(1);
        assertEquals(40, vaga.calcularAluguel());
    }

}