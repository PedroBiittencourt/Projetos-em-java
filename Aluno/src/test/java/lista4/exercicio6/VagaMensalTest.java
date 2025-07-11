package lista4.exercicio6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VagaMensalTest {

    @Test
    void deveVerificarQuantidadeMesesZeradoNegativo(){
        try {
            VagaMensal vaga = new VagaMensal();
            vaga.setQuantidadeMeses(0);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Quantidade de meses invalida", e.getMessage());
        }
    }

    @Test
    void deveVerificarQuantidadeMesesValido(){
            VagaMensal vaga = new VagaMensal();
            vaga.setQuantidadeMeses(1);
            assertEquals(1, vaga.getQuantidadeMeses());
    }

    @Test
    void deveCalcularAluguel(){
        VagaMensal vaga = new VagaMensal();
        vaga.setQuantidadeMeses(1);
        assertEquals(150, vaga.calcularAluguel());
    }

}