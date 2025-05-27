package lista3.exercicio8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarroTest {

    @Test
    void deveVerificarFatorFixoZeradoCalcularPreco(){
        try{
            Carro carro = new Carro("McLaren", "P1", 1);
            carro.calcularCusto();
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Fator fixo invalido", e.getMessage());
        }
    }

    @Test
    void deveCalcularPreco(){
        Carro carro = new Carro("McLaren", "P1", 1);
        carro.setFatorFixoCarro(0.1f);
        assertEquals(0.1f, carro.calcularCusto(), 0.1f);
    }

}