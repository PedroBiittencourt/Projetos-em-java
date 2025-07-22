package exercicioRelampagoSurpresaHalloween;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TurmaTest {

    @Test
    void deveAlocarUmAluno() {
        Aluno aluno = new Aluno("Pedro");
        Turma turma = new Turma();
        turma.alocarAluno(aluno);
        assertEquals(1,turma.numeroAlunos());
    }

    @Test
    void deveNaoAlocarContaRepetida(){
        Aluno aluno = new Aluno("Pedro");
        Turma turma = new Turma();
        turma.alocarAluno(aluno);
        turma.alocarAluno(aluno);
        assertEquals(1,turma.numeroAlunos());
    }

    @Test
    void deveAlocarZeroAlunos() {
        Turma turma = new Turma();
        assertEquals(0,turma.numeroAlunos());
    }

    @Test
    void deveAlocarMaisDeUmAluno() {
        Aluno aluno = new Aluno("Pedro");
        Aluno aluno2 = new Aluno("Guilherme");
        Turma turma = new Turma();
        turma.alocarAluno(aluno);
        turma.alocarAluno(aluno2);
        assertEquals(2,turma.numeroAlunos());
    }

    @Test
    void deveRetornarNomeProfessor(){
        Professor professor = new Professor("Marco");
        Turma turma = new Turma();
        turma.setProfessor(professor);
        assertEquals("Marco", turma.getNomeProfessor());
    }

    @Test
    void deveEncontrarAluno() {
        Aluno aluno = new Aluno("Pedro");
        Aluno aluno2 = new Aluno("Guilherme");
        Turma turma = new Turma();
        turma.alocarAluno(aluno);
        assertTrue(turma.verificarAluno(aluno));
    }

    @Test
    void deveNaoEncontrarAluno() {
        Aluno aluno = new Aluno("Pedro");
        Aluno aluno2 = new Aluno("Guilherme");
        Turma turma = new Turma();
        turma.alocarAluno(aluno);
        assertFalse(turma.verificarAluno(aluno2));
    }

    @Test
    void deveDesalocarAluno() {
        Aluno aluno = new Aluno("Pedro");
        Aluno aluno2 = new Aluno("Guilherme");
        Turma turma = new Turma();
        turma.alocarAluno(aluno);
        turma.alocarAluno(aluno2);
        turma.desalocarAluno(aluno2);
        assertFalse(turma.verificarAluno(aluno2));
    }


}