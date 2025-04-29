package lista2.exercicio4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {
    Pessoa pessoa;

    @BeforeEach
    void setUp() {
        pessoa = new Pessoa();
    }

    @Test
    void deveEnvelhecer() {
        pessoa.setIdade(12);
        pessoa.envelhecer();
        assertEquals(13, pessoa.getIdade());
    }

    @Test
    void deveCrescer() {
        pessoa.setAltura(1.75f);
        pessoa.crescer(0.05f);
        assertEquals(1.80f, pessoa.getAltura());
    }

    @Test
    void deveGanharPeso() {
        pessoa.setPeso(0);
        pessoa.ganhar_Peso(0.1f);
        assertEquals(0.1f, pessoa.getPeso());
    }

    @Test
    void devePerderPeso() {
        pessoa.setPeso(1);
        pessoa.perder_Peso(0.9f);
        assertEquals(0.1f,  pessoa.getPeso(), 0.01f);
    }

    @Test
    void verificaIdadeNegativa() {
        try{
            pessoa.setIdade(-0.1f);
            fail();
        }
        catch(IllegalArgumentException e){
            assertEquals("Idade invalida", e.getMessage());
        }
    }

    @Test
    void verificaAlturaNegativa() {
        try{
            pessoa.setAltura(-0.1f);
            fail();
        }
        catch(IllegalArgumentException e){
            assertEquals("Altura invalida", e.getMessage());
        }
    }

    @Test
    void verificaPesoNegativo() {
        try{
            pessoa.setPeso(-0.1f);
            fail();
        }
        catch(IllegalArgumentException e){
            assertEquals("Peso invalido", e.getMessage());
        }
    }

    @Test
    void verificaCentimetroNegativo() {
        try{
            pessoa.crescer(-0.1f);
            fail();
        }
        catch(IllegalArgumentException e){
            assertEquals("Centimetros invalidos", e.getMessage());
        }
    }

    @Test
    void verificaQuilosNegativoGanharPeso() {
        try{
            pessoa.ganhar_Peso(-0.1f);
            fail();
        }
        catch(IllegalArgumentException e){
            assertEquals("Quilos invalidos", e.getMessage());
        }
    }

    @Test
    void verificaQuilosNegativoPerderPeso() {
        try{
            pessoa.perder_Peso(-0.1f);
            fail();
        }
        catch(IllegalArgumentException e){
            assertEquals("Quilos invalidos", e.getMessage());
        }
    }

    @Test
    void verificaQuilosMaioresQuePesoPerderPeso() {
        try{
            pessoa.setPeso(0.1f);
            pessoa.perder_Peso(0.2f);
            fail();
        }
        catch(IllegalArgumentException e){
            assertEquals("Quilos invalidos", e.getMessage());
        }
    }

}