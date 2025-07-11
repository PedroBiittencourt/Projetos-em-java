package lista4.exercicio5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManutencaoTest {

    @Test
    void deveVerificarNumeroManutencaoZeradoNegativo(){
        try {
            Manutencao manutencao = new ManutencaoCPU();
            manutencao.setNumeroManutencao(0);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Numero invalido", e.getMessage());
        }
    }

    @Test
    void deveVerificarValorMaoObraZeradoNegativo() {
        Manutencao manutencao = new ManutencaoCPU();
        try {
            manutencao.setValorMaoDeObra(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Valor invalido", e.getMessage());
        }
    }

    @Test
    void deveVerificarValorPecasTrocadasZeradoNegativo() {
        Manutencao manutencao = new ManutencaoCPU();
        try {
            manutencao.setValorPecasTrocadas(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Valor invalido", e.getMessage());
        }
    }


}