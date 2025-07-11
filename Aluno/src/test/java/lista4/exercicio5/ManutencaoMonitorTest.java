package lista4.exercicio5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManutencaoMonitorTest {

    @Test
    void deveCalcularValor(){
        ManutencaoMonitor manutencao = new ManutencaoMonitor();
        manutencao.setValorMaoDeObra(1);
        assertEquals(1, manutencao.calcularValor());
    }

}