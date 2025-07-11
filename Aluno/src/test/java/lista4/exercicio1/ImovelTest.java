package lista4.exercicio1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImovelTest {

    @Test
    void deveVerificarPrecoMetroQuadradoZeradoNegativo(){
        try{
            Imovel casa = new Casa();
            casa.setPrecoMetroQuadrado(0);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Preco por metro quadradado invalido", e.getMessage());
        }
    }

    @Test
    void deveVerificarPrecoMetroQuadradoValido(){
        Imovel casa = new Casa();
        casa.setPrecoMetroQuadrado(0.1f);
        assertEquals(0.1, casa.getPrecoMetroQuadrado(), 0.001f);
    }

    @Test
    void deveVerificarQuantidadeMetroQuadradoZeradoNegativo(){
        try{
            Imovel casa = new Casa();
            casa.setQuantidadeMetroQuadrado(0);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Quantidade de metro quadradado invalido", e.getMessage());
        }
    }

    @Test
    void deveQuantidadeMetroQuadradoValido(){
        Imovel casa = new Casa();
        casa.setQuantidadeMetroQuadrado(0.1f);
        assertEquals(0.1, casa.getQuantidadeMetroQuadrado(), 0.001f);
    }

}