package lista4.exercicio8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoBolsistaParcialTest {

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

    @Test
    void deveRetornarTipoAluno(){
        AlunoBolsistaParcial aluno = new AlunoBolsistaParcial(new Curso());
        assertEquals("Bolsista parcial", aluno.getTipoAluno());
    }

    @Test
    void deveRetornarDadosAluno(){
        AlunoBolsistaParcial aluno2 = new AlunoBolsistaParcial(new Curso());
        aluno2.setNome("Pedro");
        aluno2.setMatricula(321);
        aluno2.setEndereco("Rua B");
        aluno2.setValorMensalidade(100);
        aluno2.setPercentualDesconto(10);
        aluno2.setQuantidadeParcelas(10);
        assertEquals("Aluno: Pedro. Matricula: 321. Endereco: Rua B" +
                ". Tipo: Bolsista parcial. Valor mensalidade: R$90.0" +
                ". Percentual de desconto: 10.0%. Quantidade parcelas: 10.", aluno2.getDadosAluno());
    }

}