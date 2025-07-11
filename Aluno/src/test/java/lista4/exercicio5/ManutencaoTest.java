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
    void deveVerificarNumeroManutencaoValido(){
            Manutencao manutencao = new ManutencaoCPU();
            manutencao.setNumeroManutencao(1);
            assertEquals(1, manutencao.getNumeroManutencao());
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
    void deveVerificarValorMaoObraValido(){
        Manutencao manutencao = new ManutencaoCPU();
        manutencao.setValorMaoDeObra(1);
        assertEquals(1, manutencao.getValorMaoDeObra());
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

    @Test
    void deveVerificarValorPecasTrocadasValido(){
        Manutencao manutencao = new ManutencaoCPU();
        manutencao.setValorPecasTrocadas(0.01f);
        assertEquals(0.01, manutencao.getValorPecasTrocadas(),0.001f);
    }


}