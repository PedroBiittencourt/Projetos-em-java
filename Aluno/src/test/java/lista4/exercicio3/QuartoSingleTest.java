package lista4.exercicio3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuartoSingleTest {

    @Test
    void deveCalcularPreco(){
        QuartoSingle q1 = new QuartoSingle();
        q1.setNumeroDias(1);
        assertEquals(50, q1.calcularPreco());
    }

}