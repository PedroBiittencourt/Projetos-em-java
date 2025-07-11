package lista4.exercicio2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaCorrenteNormalTest {

    @Test
    void deveCalcularSaldo(){
        ContaCorrenteNormal conta = new ContaCorrenteNormal();
        conta.setSaldoDisponivel(1);
        assertEquals(1, conta.calcularSaldo());
    }

}