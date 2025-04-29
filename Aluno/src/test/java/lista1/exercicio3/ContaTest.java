package lista1.exercicio3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaTest {
    Conta conta;

    @BeforeEach
    void setUp (){
        conta = new Conta();
    }

    @Test
    void deveCalcularValorASerPagoEnergiaEletrica(){
        conta.setQuilowatts(1);
        conta.setValorIcms(18);
        assertEquals(0.1416f,conta.calcularValorASerPagoEnergiaEletrica());
    }

}