package exercicioRelampagoSurpresaNumeroPi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EstadoTest {

    @Test
    void deveVerificarNomeEstadoInvalido(){
        try{
            Estado estado = new Estado();
            estado.setNome(" ");
            fail();
        }
        catch(IllegalArgumentException e){
            assertEquals("Estado invalido", e.getMessage());
        }
    }

}