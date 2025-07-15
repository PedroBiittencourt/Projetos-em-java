package lista4.exercicio1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApartamentoTest {

    @Test
    void deveCalcularPrecoComAndarMenorQue10(){
        Apartamento apt1 = new Apartamento();
        apt1.setPrecoMetroQuadrado(40);
        apt1.setQuantidadeMetroQuadrado(1);
        apt1.setQuantidadeAndar(2);
        assertEquals(36, apt1.calcularValor());
    }

    @Test
    void deveCalcularPrecoComAndarMaiorIgualQue10(){
        Apartamento apt1 = new Apartamento();
        apt1.setPrecoMetroQuadrado(40);
        apt1.setQuantidadeMetroQuadrado(1);
        apt1.setQuantidadeAndar(10);
        assertEquals(0, apt1.calcularValor());
    }

    @Test
    void deveVerificarQuantidadeAndarZeradoNegativo(){
        try{
            Apartamento apt = new Apartamento();
            apt.setQuantidadeAndar(0);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Quantidade de andar invalido", e.getMessage());
        }
    }

    @Test
    void deveRetornarTipoImovel(){
        Apartamento apt = new Apartamento();
        assertEquals("Apartamento", apt.getTipoImovel());
    }

}