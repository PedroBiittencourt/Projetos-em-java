package lista3.exercicio8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BicicletaTest {

    @Test
    void deveVerificarFatorFixoZeradoCalcularPreco(){
        try{
            Bicicleta bicicleta = new Bicicleta("Yamaha", "que anda", 1);
            bicicleta.calcularCusto();
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Fator fixo invalido", e.getMessage());
        }
    }

    @Test
    void deveCalcularPreco(){
        Bicicleta bicicleta = new Bicicleta("Yamaha", "que anda", 1);
        bicicleta.setFatorFixoBicicleta(0.1f);
        assertEquals(0.1f, bicicleta.calcularCusto(), 0.1f);
    }

}