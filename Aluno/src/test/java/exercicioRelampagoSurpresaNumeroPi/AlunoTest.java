package exercicioRelampagoSurpresaNumeroPi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    @Test
    void deveVerificarCidadeNaturalidade(){
        Aluno aluno = new Aluno();
        Cidade cidade = new Cidade(new Estado());
        cidade.setNome("Juiz de Fora");
        aluno.setNaturalidade(cidade);
        assertEquals("Juiz de Fora", aluno.getNomeCidadeNaturalidade());
    }

    @Test
    void deveVerificarCidadeNaturalidadeInvalida(){
        try {
            Aluno aluno = new Aluno();
            aluno.getNomeCidadeNaturalidade();
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("A pessoa nao possui cidade de naturalidade cadastrada", e.getMessage());
        }
    }

    @Test
    void deveVerificarCidadeEstadoNaturalidade(){
        Aluno aluno = new Aluno();
        Estado estado = new Estado();
        estado.setNome("MG");
        Cidade cidade = new Cidade(estado);
        cidade.setNome("Juiz de Fora");
        aluno.setNaturalidade(cidade);
        assertEquals("Juiz de Fora - MG", aluno.getCidadeEstadoNaturalidade());
    }

    @Test
    void deveVerificarEstadoNaturalidade(){
        Estado estado = new Estado();
        estado.setNome("MG");
        Cidade cidade = new Cidade(estado);
        Aluno aluno = new Aluno();
        aluno.setNaturalidade(cidade);
        assertEquals("MG", aluno.getNomeEstadoNaturalidade());
    }

    @Test
    void deveVerificarEstadoEscola(){
        Estado estado = new Estado();
        estado.setNome("MG");
        Cidade cidade = new Cidade(estado);
        Escola escola = new Escola(cidade);
        Curso curso = new Curso();
        curso.setEscola(escola);
        Aluno aluno = new Aluno();
        aluno.setCurso(curso);
        assertEquals("MG", aluno.getNomeEstadoCurso());
    }

    @Test
    void deveVerificarCoordenadorCurso(){
        Professor professor = new Professor();
        professor.setNome("Marco");
        Curso curso = new Curso();
        curso.setCoordenacao(professor);
        Aluno aluno = new Aluno();
        aluno.setCurso(curso);
        assertEquals("Marco", aluno.getNomeCoordenadorCurso());
    }



}