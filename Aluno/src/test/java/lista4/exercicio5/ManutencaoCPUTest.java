package lista4.exercicio5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManutencaoCPUTest {

    @Test
    void deveCalcularValor(){
        ManutencaoCPU manutencao = new ManutencaoCPU();
        manutencao.setValorMaoDeObra(1);
        manutencao.setValorPecasTrocadas(1);
        assertEquals(2, manutencao.calcularValor());
    }

    @Test
    void deveRetornarTipoManutencao(){
        ManutencaoCPU manutencao = new ManutencaoCPU();
        assertEquals("Manutenção de CPU", manutencao.getTipoManutencao());
    }

}