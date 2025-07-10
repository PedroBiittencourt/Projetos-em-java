package lista4.exercicio3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuartoDuploTest {

    @Test
    void deveCalcularPreco(){
        QuartoDuplo q1 = new QuartoDuplo();
        q1.setNumeroDias(1);
        q1.setNumeroRefeicoes(1);
        assertEquals(90, q1.calcularPreco());
    }

}