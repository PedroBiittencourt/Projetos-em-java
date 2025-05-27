package lista3.exercicio2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiretorTest {

    @Test
    void deveCalcularPagamento(){
        Diretor diretor = new Diretor(1);
        diretor.setParticipacaoLucros(0.1f);
        assertEquals(1.1f, diretor.calcularPagamento());
    }

    @Test
    void deveVerificarBonusZeradoCalcularPreco(){
        try{
            Diretor diretor = new Diretor(1);
            diretor.calcularPagamento();
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Participacao de lucros invalido", e.getMessage());
        }
    }

    @Test
    void deveVerificarBonusZeradoNegativo(){
        try{
            Diretor diretor = new Diretor(1);
            diretor.setParticipacaoLucros(0);
            fail();
        }
        catch(IllegalArgumentException e){
            assertEquals("Participacao de lucros invalida", e.getMessage());
        }
    }

}