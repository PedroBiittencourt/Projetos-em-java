package lista4.exercicio2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaPoupancaTest {

    @Test
    void deveCalcularSaldo(){
        ContaPoupanca conta = new ContaPoupanca();
        conta.setSaldoDisponivel(1);
        assertEquals(1, conta.calcularSaldo());
    }

    @Test
    void deveRetornarTipoConta(){
        ContaPoupanca conta = new ContaPoupanca();
        assertEquals("Poupança", conta.getTipoConta());
    }

}