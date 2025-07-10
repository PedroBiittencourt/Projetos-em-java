package lista4.exercicio1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApartamentoTest {

    @Test
    void deveCalcularPrecoComUmAndarMenorQue10(){
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


}