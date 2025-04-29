package lista2.exercicio1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarroTest {
    Carro carro;

    @BeforeEach
    void setUp(){
        carro = new Carro();
    }

    @Test
    void deveAcelerar(){
        carro.setVelocidade_atual(0);
        assertEquals(30, carro.acelerar(30));
    }

    @Test
    void deveVerificarVelocidadeAtualNegativa(){
        try{
            carro.setVelocidade_atual(-0.1f);
            fail();
        }
        catch(IllegalArgumentException e){
            assertEquals(e.getMessage(), "Velocidade atual invalida");
        }
    }

    @Test
    void deveFrear(){
        carro.setVelocidade_atual(10);
        carro.frear(9);
        assertEquals(1, carro.getVelocidade_atual());
    }

    @Test
    void deveVerificarVelocidadeNegativaAoFrear(){
        carro.setVelocidade_atual(10);
        carro.frear(11);
        assertEquals(0, carro.getVelocidade_atual());
    }

    @Test
    void deveLigar(){
        carro.setEstado("Desligado");
        carro.ligar();
        assertEquals("Ligado", carro.getEstado());
    }

    @Test
    void deveDesligar(){
        carro.setEstado("Ligado");
        carro.desligar();
        assertEquals("Desligado", carro.getEstado());
    }

    @Test
    void deveVerificarVelocidadeCarroDesligado(){
        carro.setVelocidade_atual(10);
        carro.desligar();
        assertEquals(0, carro.getVelocidade_atual());
    }

}