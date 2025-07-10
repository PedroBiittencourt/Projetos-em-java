package lista4.exercicio3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuartoTriploTest {

    @Test
    void deveCalcularPreco(){
        QuartoTriplo q1 = new QuartoTriplo();
        q1.setNumeroDias(1);
        q1.setNumeroRefeicoes(1);
        assertEquals(110, q1.calcularPreco());
    }

}