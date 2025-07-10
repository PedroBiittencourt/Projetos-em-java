package exercicioRelampagoSurpresaNumeroPi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EscolaTest {

    @Test
    void deveVerificarEscolaridadeDiretor(){
        Escola escola = new Escola(new Cidade(new Estado()));
        Professor professor = new Professor();
        Escolaridade escolaridade = new Escolaridade();
        escolaridade.setNome("Doutorado");
        professor.setEscolaridade(escolaridade);
        escola.setDirecao(professor);
        assertEquals("Doutorado",escola.getEscolaridadeDiretor());
    }

}