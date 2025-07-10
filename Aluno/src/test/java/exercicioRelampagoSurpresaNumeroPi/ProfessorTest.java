package exercicioRelampagoSurpresaNumeroPi;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ProfessorTest {
    @Test
    void deveRetornarNomeEscolaridade() {
        Escolaridade escolaridade = new Escolaridade();
        escolaridade.setNome("Doutorado");
        Professor professor = new Professor();
        professor.setEscolaridade(escolaridade);
        assertEquals("Doutorado", professor.getNomeEscolaridade());
    }

    @Test
    void deveRetornarPessoaSemEscolaridade() {
        Professor professor = new Professor();
        assertEquals("Pessoa sem escolaridade", professor.getNomeEscolaridade());
    }

    @Test
    void deveRetornarCidadeNaturalidade() {
        Cidade cidade = new Cidade(new Estado());
        cidade.setNome("Juiz de Fora");
        Professor professor = new Professor();
        professor.setNaturalidade(cidade);
        assertEquals("Juiz de Fora", professor.getNomeCidadeNaturalidade());
    }

    @Test
    void deveVerificarNomeInvalido() {
        try{
            Professor professor = new Professor();
            professor.setNome(" ");
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Nome invalido", e.getMessage());
        }
    }

    @Test
    void deveVerificarDiretor() {
        Professor diretor = new Professor();
        diretor.setNome("Emerson");
        Escola escola = new Escola(new Cidade(new Estado()));
        escola.setDirecao(diretor);
        Curso curso = new Curso();
        curso.setEscola(escola);
        Professor professor = new Professor();
        professor.setContratacao(curso);
        assertEquals("Emerson", professor.getNomeDiretorEscola());
    }

    @Test
    void deveVerificarCoordenador() {
        Professor coordenador = new Professor();
        coordenador.setNome("Ricardo");
        Curso curso = new Curso();
        curso.setCoordenacao(coordenador);
        Professor professor = new Professor();
        professor.setContratacao(curso);
        assertEquals("Ricardo", professor.getNomeCoordenadorCurso());
    }

    @Test
    void deveVerificarTipoEnsino() {
        TipoEnsino tipoEnsino = new TipoEnsino();
        tipoEnsino.setNome("Superior");
        Curso curso = new Curso();
        curso.setTipoEnsino(tipoEnsino);
        Professor professor = new Professor();
        professor.setContratacao(curso);
        assertEquals("Superior", professor.getNomeTipoEnsinoCurso());
    }

}