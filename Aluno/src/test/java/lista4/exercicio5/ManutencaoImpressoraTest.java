package lista4.exercicio5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManutencaoImpressoraTest {

    @Test
    void deveCalcularValor(){
        ManutencaoImpressora manutencao = new ManutencaoImpressora();
        manutencao.setValorMaoDeObra(1);
        manutencao.setValorPecasTrocadas(1);
        assertEquals(2, manutencao.calcularValor());
    }

    @Test
    void deveRetornarTipoManutencao(){
        ManutencaoImpressora manutencao = new ManutencaoImpressora();
        assertEquals("Manutenção de Impressora", manutencao.getTipoManutencao());
    }

}