package lista4.exercicio8;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CursoTest {
    @Test
    void deveRetornarZeroAlunos() {
        Curso curso = new Curso();
        assertEquals(0, curso.calcularNumeroAlunos());
    }

    @Test
    void deveRetornarUmAluno() {
        Curso curso = new Curso();
        Aluno aluno = new AlunoMensalista(curso);
        curso.alocarAluno(aluno);
        assertEquals(1, curso.calcularNumeroAlunos());
    }

    @Test
    void deveRetornarMaisDeUmAluno() {
        Curso curso = new Curso();
        Aluno aluno1 = new AlunoMensalista(curso);
        Aluno aluno2 = new AlunoMensalista(curso);
        curso.alocarAluno(aluno1);
        curso.alocarAluno(aluno2);
        assertEquals(2, curso.calcularNumeroAlunos());
    }

    @Test
    void deveRetornarListaAlunos() {
        Curso curso = new Curso();
        Aluno aluno = new AlunoMensalista(curso);
        aluno.setNome("Pedro");
        Aluno aluno2 = new AlunoBolsistaParcial(curso);
        aluno2.setNome("Guilherme");
        Aluno aluno3 = new AlunoBolsistaIntegral(curso);
        aluno3.setNome("Marco");
        curso.alocarAluno(aluno);
        curso.alocarAluno(aluno2);
        curso.alocarAluno(aluno3);

        ArrayList<String> resultadoEsperado = new ArrayList<String>();
        resultadoEsperado.add("Pedro");
        resultadoEsperado.add("Guilherme");
        resultadoEsperado.add("Marco");

        assertEquals(resultadoEsperado, curso.listaAlunos());
    }

    @Test
    void deveRetornarListaAlunosCurso() {
        Curso curso1 = new Curso();
        curso1.setCodigo(1);
        Curso curso2 = new Curso();
        curso2.setCodigo(2);
        Aluno aluno = new AlunoMensalista(curso1);
        aluno.setNome("Pedro");
        Aluno aluno2 = new AlunoBolsistaParcial(curso1);
        aluno2.setNome("Guilherme");
        Aluno aluno3 = new AlunoBolsistaIntegral(curso2);
        aluno3.setNome("Marco");
        curso1.alocarAluno(aluno);
        curso1.alocarAluno(aluno2);
        curso2.alocarAluno(aluno3);

        ArrayList<String> resultadoEsperado = new ArrayList<String>();
        resultadoEsperado.add("Pedro");
        resultadoEsperado.add("Guilherme");

        assertEquals(resultadoEsperado, curso1.listaAlunosCurso(1));
    }

}