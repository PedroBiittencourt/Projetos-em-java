package lista4.exercicio8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    @Test
    void deveVerificarMatriculaZeradaNegativa(){
        try {
            Aluno aluno = new AlunoMensalista(new Curso());
            aluno.setMatricula(0);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Matricula invalida", e.getMessage());
        }
    }

    @Test
    void deveVerificarNomeInvalido(){
        try {
            Aluno aluno = new AlunoMensalista(new Curso());
            aluno.setNome(" ");
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Nome invalido", e.getMessage());
        }
    }

    @Test
    void deveVerificarEnderecoInvalido(){
        try {
            Aluno aluno = new AlunoMensalista(new Curso());
            aluno.setEndereco(" ");
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Endereco invalido", e.getMessage());
        }
    }

    @Test
    void deveRetornarCodigoCurso() {
        Curso curso = new Curso();
        curso.setCodigo(1);
        Aluno aluno = new AlunoBolsistaIntegral(curso);
        assertEquals(1, aluno.getCodigoCurso());
    }

}