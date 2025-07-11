package lista4.exercicio8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoBolsistaParcialTest {


    @Test
    void deveLancarExcecaoValorMensalidadeZeradoNegativo() {
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

}