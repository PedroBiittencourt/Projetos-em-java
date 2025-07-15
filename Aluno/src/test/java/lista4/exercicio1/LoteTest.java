package lista4.exercicio1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoteTest {

    @Test
    void deveCalcularPreco(){
        Lote lote1 = new Lote();
        lote1.setPrecoMetroQuadrado(30);
        lote1.setQuantidadeMetroQuadrado(1);
        assertEquals(30, lote1.calcularValor());
    }

    @Test
    void deveRetornarTipoImovel(){
        Lote lote1 = new Lote();
        assertEquals("Lote", lote1.getTipoImovel());
    }

}