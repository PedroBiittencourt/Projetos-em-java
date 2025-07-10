package exercicioRelampagoSurpresaNumeroPi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CursoTest {

    @Test
    void deveVerificarEscolaridadeCoordenador(){
        Curso curso = new Curso();
        Professor professor = new Professor();
        Escolaridade escolaridade = new Escolaridade();
        escolaridade.setNome("Doutorado");
        professor.setEscolaridade(escolaridade);
        curso.setCoordenacao(professor);
        assertEquals("Doutorado", curso.getEscolaridadeCoordenador());
    }


}