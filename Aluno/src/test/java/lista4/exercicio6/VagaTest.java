package lista4.exercicio6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VagaTest {

    @Test
    void deveVerificarPlacaInvalido(){
        try {
            Vaga vaga = new VagaMensal();
            vaga.setPlacaVeiculo(" ");
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Placa invalida", e.getMessage());
        }
    }

    @Test
    void deveVerificarNumeroZeradoNegativo(){
        try {
            Vaga vaga = new VagaMensal();
            vaga.setNumero(0);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Numero invalido", e.getMessage());
        }
    }

}