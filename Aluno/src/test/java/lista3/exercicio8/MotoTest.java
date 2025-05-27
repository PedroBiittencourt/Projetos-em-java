package lista3.exercicio8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MotoTest {

    @Test
    void deveVerificarFatorFixoZeradoCalcularPreco(){
        try{
            Moto moto = new Moto("Yamaha", "que faz vrum", 1);
            moto.calcularCusto();
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Fator fixo invalido", e.getMessage());
        }
    }

    @Test
    void deveCalcularPreco(){
        Moto moto = new Moto("Yamaha", "que faz vrum", 1);
        moto.setFatorFixoMoto(0.1f);
        assertEquals(0.1f, moto.calcularCusto(), 0.1f);
    }

}