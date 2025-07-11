package lista4.exercicio8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoBolsistaIntegralTest {

    @Test
    void deveVerificarNumeroParcelarIsentasValida() {
        Curso curso = new Curso();
        AlunoBolsistaIntegral aluno = new AlunoBolsistaIntegral(curso);
        aluno.setQuantidadeParcelasIsentas(0);
        assertEquals(0, aluno.getQuantidadeParcelasIsentas());
    }

    @Test
    void deveVerificarNumeroParcelasIsentasNegativas() {
        Curso curso = new Curso();
        AlunoBolsistaIntegral aluno = new AlunoBolsistaIntegral(curso);
        try {
            aluno.setQuantidadeParcelasIsentas(-1);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Parcelas invalidas", e.getMessage());
        }
    }

}