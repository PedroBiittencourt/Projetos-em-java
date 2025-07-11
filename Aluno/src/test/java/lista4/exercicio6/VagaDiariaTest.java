package lista4.exercicio6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VagaDiariaTest {

    @Test
    void deveVerificarQuantidadeMesesZeradoNegativo(){
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
    void deveCalcularAluguel(){
        VagaDiaria vaga = new VagaDiaria();
        vaga.setQuantidadeDias(1);
        assertEquals(10, vaga.calcularAluguel());
    }

}