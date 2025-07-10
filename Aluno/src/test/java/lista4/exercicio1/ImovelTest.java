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

}