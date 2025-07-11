package lista4.exercicio8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoMensalistaTest {

    @Test
    void deveVerificarValorMensalidadeZeradoNegativo() {
        Curso curso = new Curso();
        AlunoMensalista aluno = new AlunoMensalista(curso);
        try {
            aluno.setValorMensalidade(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Valor de mensalidade invalida", e.getMessage());
        }
    }

    @Test
    void deveVerificarValorMensalidadeValido() {
        Curso curso = new Curso();
        AlunoMensalista aluno = new AlunoMensalista(curso);
        aluno.setValorMensalidade(0.01f);
        assertEquals(0.01f, aluno.getValorMensalidade(), 0.001f);
    }


    @Test
    void deveVerificarQuantidadeParcelasZeradoNegativo() {
        Curso curso = new Curso();
        AlunoMensalista aluno = new AlunoMensalista(curso);
        try {
            aluno.setQuantidadeParcelas(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Quantidade de parcelas invalida", e.getMessage());
        }
    }

    @Test
    void deveVerificarQuantidadeParcelasValido() {
        Curso curso = new Curso();
        AlunoMensalista aluno = new AlunoMensalista(curso);
        aluno.setQuantidadeParcelas(1);
        assertEquals(1, aluno.getQuantidadeParcelas());
    }

}