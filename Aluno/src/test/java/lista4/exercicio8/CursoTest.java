package lista4.exercicio8;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CursoTest {

    @Test
    void deveVerificarCodigoZeradoNegativo(){
        try {
            Curso curso = new Curso();
            curso.setCodigo(0);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Codigo invalido", e.getMessage());
        }
    }

    @Test
    void deveVerificarCodigoValido(){
        Curso curso = new Curso();
        curso.setCodigo(1);
        assertEquals(1, curso.getCodigo());
    }

    @Test
    void deveVerificarCargaHorariaZeradaNegativa(){
        try {
            Curso curso = new Curso();
            curso.setCargaHoraria(0);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Carga horaria invalida", e.getMessage());
        }
    }

    @Test
    void deveVerificarCargaHorariaValida(){
        Curso curso = new Curso();
        curso.setCargaHoraria(1);
        assertEquals(1, curso.getCargaHoraria());
    }

    @Test
    void deveAlocarUmAluno() {
        Curso curso = new Curso();
        Aluno aluno = new AlunoMensalista(curso);
        curso.alocarAluno(aluno);
        assertEquals(1, curso.getQuantidadeAlunos());
    }

    @Test
    void deveNaoAlocarAlunoRepetido(){
        Curso curso = new Curso();
        Aluno aluno = new AlunoMensalista(curso);
        curso.alocarAluno(aluno);
        curso.alocarAluno(aluno);
        assertEquals(1, curso.getQuantidadeAlunos());
    }

    @Test
    void deveAlocarZeroAlunos() {
        Curso curso = new Curso();
        assertEquals(0, curso.getQuantidadeAlunos());
    }

    @Test
    void deveAlocarMaisDeUmAluno() {
        Curso curso = new Curso();
        Aluno aluno1 = new AlunoMensalista(curso);
        Aluno aluno2 = new AlunoMensalista(curso);
        curso.alocarAluno(aluno1);
        curso.alocarAluno(aluno2);
        assertEquals(2, curso.getQuantidadeAlunos());
    }

    @Test
    void deveRetornarListaAlunos() {
        Curso curso = new Curso();

        AlunoMensalista aluno1 = new AlunoMensalista(curso);
        aluno1.setNome("Guilherme");
        aluno1.setMatricula(123);
        aluno1.setEndereco("Rua A");
        aluno1.setValorMensalidade(100);
        aluno1.setQuantidadeParcelas(10);

        AlunoBolsistaParcial aluno2 = new AlunoBolsistaParcial(curso);
        aluno2.setNome("Pedro");
        aluno2.setMatricula(321);
        aluno2.setEndereco("Rua B");
        aluno2.setValorMensalidade(100);
        aluno2.setPercentualDesconto(10);
        aluno2.setQuantidadeParcelas(10);


        AlunoBolsistaIntegral aluno3 = new AlunoBolsistaIntegral(curso);
        aluno3.setNome("Marco");
        aluno3.setMatricula(777);
        aluno3.setEndereco("Rua X");
        aluno3.setQuantidadeParcelasIsentas(10);

        curso.alocarAluno(aluno1);
        curso.alocarAluno(aluno2);
        curso.alocarAluno(aluno3);

        ArrayList<String> resultadoEsperado = new ArrayList<String>();
        resultadoEsperado.add("O aluno Guilherme, de matrícula 123 e " +
                "endereço Rua A, é mensalista e tem valor de mensalidade " +
                "a ser pago de 100.0, em 10 parcelas.");
        resultadoEsperado.add("O aluno Pedro, de matrícula 321 e " +
                "endereço Rua B, é bolsista parcial e tem valor de mensalidade " +
                "a ser pago de 90.0, em 10 parcelas.");
        resultadoEsperado.add("O aluno Marco, de matrícula 777 e " +
                "endereço Rua X, é bolsista integral e não paga mensalidade, " +
                "tendo 10 parcelas isentas.");

        assertEquals(resultadoEsperado, curso.listaAlunos());
    }

    @Test
    void deveRetornarListaAlunosCurso() {
        Curso curso1 = new Curso();
        curso1.setCodigo(1);
        Curso curso2 = new Curso();
        curso2.setCodigo(2);

        AlunoMensalista aluno1 = new AlunoMensalista(curso1);
        aluno1.setNome("Guilherme");
        aluno1.setMatricula(123);
        aluno1.setEndereco("Rua A");
        aluno1.setValorMensalidade(100);
        aluno1.setQuantidadeParcelas(10);

        AlunoBolsistaParcial aluno2 = new AlunoBolsistaParcial(curso2);
        aluno2.setNome("Pedro");
        aluno2.setMatricula(321);
        aluno2.setEndereco("Rua B");
        aluno2.setValorMensalidade(100);
        aluno2.setPercentualDesconto(10);
        aluno2.setQuantidadeParcelas(10);

        curso1.alocarAluno(aluno1);
        curso1.alocarAluno(aluno2);

        ArrayList<String> resultadoEsperado = new ArrayList<String>();
        resultadoEsperado.add("O aluno Guilherme, de matrícula 123 e endereço " +
                "Rua A, é mensalista e tem valor de mensalidade a ser pago de " +
                "100.0, em 10 parcelas.");

        assertEquals(resultadoEsperado, curso1.listaAlunosCurso(1));
    }

}