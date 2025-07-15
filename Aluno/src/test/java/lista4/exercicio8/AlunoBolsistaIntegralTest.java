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

    @Test
    void deveRetornarTipoAluno(){
        AlunoBolsistaIntegral aluno = new AlunoBolsistaIntegral(new Curso());
        assertEquals("Bolsista integral", aluno.getTipoAluno());
    }

    @Test
    void deveRetornarDadosAluno(){
        AlunoBolsistaIntegral aluno3 = new AlunoBolsistaIntegral(new Curso());
        aluno3.setNome("Marco");
        aluno3.setMatricula(777);
        aluno3.setEndereco("Rua X");
        aluno3.setQuantidadeParcelasIsentas(10);
        assertEquals("Aluno: Marco. Matricula: 777. Endereco: Rua X" +
                ". Tipo: Bolsista integral. Parcelas isentas: 10.", aluno3.getDadosAluno());
    }

}