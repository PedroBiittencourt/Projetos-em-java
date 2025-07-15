package lista4.exercicio1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CasaTest {
    @Test
    void deveCalcularPreco(){
        Casa casa1 = new Casa();
        casa1.setPrecoMetroQuadrado(30);
        casa1.setQuantidadeMetroQuadrado(1);
        assertEquals(80, casa1.calcularValor());
    }

    @Test
    void deveRetornarTipoImovel(){
        Casa casa1 = new Casa();
        assertEquals("Casa", casa1.getTipoImovel());
    }

}