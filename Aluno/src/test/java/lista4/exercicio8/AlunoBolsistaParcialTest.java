package lista4.exercicio8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoBolsistaParcialTest {


    @Test
    void deveVerificarValorMensalidadeZeradoNegativo() {
        Curso curso = new Curso();
        AlunoBolsistaParcial aluno = new AlunoBolsistaParcial(curso);
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
        AlunoBolsistaParcial aluno = new AlunoBolsistaParcial(curso);
        aluno.setValorMensalidade(0.01f);
        assertEquals(0.01f, aluno.getValorMensalidade(), 0.001f);
    }

    @Test
    void deveVerificarQuantidadeParcelasZeradoNegativo() {
        Curso curso = new Curso();
        AlunoBolsistaParcial aluno = new AlunoBolsistaParcial(curso);
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
        AlunoBolsistaParcial aluno = new AlunoBolsistaParcial(curso);
        aluno.setQuantidadeParcelas(1);
        assertEquals(1, aluno.getQuantidadeParcelas());
    }

    @Test
    void deveVerificarPercentualDescontoZeradoNegativo() {
        Curso curso = new Curso();
        AlunoBolsistaParcial aluno = new AlunoBolsistaParcial(curso);
        try {
            aluno.setPercentualDesconto(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Desconto invalido", e.getMessage());
        }
    }


    @Test
    void deveVerificarDescontoMaiorCinquentaPorCento() {
        Curso curso = new Curso();
        AlunoBolsistaParcial aluno = new AlunoBolsistaParcial(curso);
        try {
            aluno.setPercentualDesconto(50.01f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("O desconto nao pode ser maior que 50%", e.getMessage());
        }
    }

    @Test
    void deveVerificarPercentualDescontoValido() {
        Curso curso = new Curso();
        AlunoBolsistaParcial aluno = new AlunoBolsistaParcial(curso);
        aluno.setPercentualDesconto(0.01f);
        assertEquals(0.01f, aluno.getPercentualDesconto(), 0.001f);
    }

}