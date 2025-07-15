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
    void deveVerificarMatriculaValida(){
            Aluno aluno = new AlunoMensalista(new Curso());
            aluno.setMatricula(1);
            assertEquals(1, aluno.getMatricula());
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
    void deveVerificarNomeValido(){
        Aluno aluno = new AlunoMensalista(new Curso());
        aluno.setNome("Pedro");
        assertEquals("Pedro", aluno.getNome());
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
    void deveVerificarEnderecoValido(){
        Aluno aluno = new AlunoMensalista(new Curso());
        aluno.setEndereco("Rua A");
        assertEquals("Rua A", aluno.getEndereco());
    }

    @Test
    void deveVerificarValorMensalidadeZeradoNegativo() {
        Curso curso = new Curso();
        Aluno aluno = new AlunoBolsistaParcial(curso);
        try {
            aluno.setValorMensalidade(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Valor de mensalidade invalido", e.getMessage());
        }
    }

    @Test
    void deveVerificarValorMensalidadeValido() {
        Curso curso = new Curso();
        Aluno aluno = new AlunoBolsistaParcial(curso);
        aluno.setValorMensalidade(0.01f);
        assertEquals(0.01f, aluno.getValorMensalidade(), 0.001f);
    }

    @Test
    void deveVerificarQuantidadeParcelasZeradoNegativo() {
        Curso curso = new Curso();
        Aluno aluno = new AlunoMensalista(curso);
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
        Aluno aluno = new AlunoMensalista(curso);
        aluno.setQuantidadeParcelas(1);
        assertEquals(1, aluno.getQuantidadeParcelas());
    }

    @Test
    void deveRetornarCodigoCurso() {
        Curso curso = new Curso();
        curso.setCodigo(1);
        Aluno aluno = new AlunoBolsistaIntegral(curso);
        assertEquals(1, aluno.getCodigoCurso());
    }

}