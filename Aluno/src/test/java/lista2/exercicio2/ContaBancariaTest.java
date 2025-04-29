package lista2.exercicio2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaBancariaTest {
    ContaBancaria contaBancaria;

    @BeforeEach
    void setUp() {
        contaBancaria = new ContaBancaria();
    }

    @Test
    void deveDepositar() {
        contaBancaria.setSaldo(0);
        contaBancaria.depositar(1);
        assertEquals(1, contaBancaria.getSaldo());
    }

    @Test
    void deveSacar() {
        contaBancaria.setSaldo(1.0f);
        contaBancaria.sacar(0.9f);
        assertEquals(0.1f, contaBancaria.getSaldo(), 0.01f);
    }

    @Test
    void deveNaoDepositarValoresNegativos() {
        try {
            contaBancaria.setSaldo(1.0f);
            contaBancaria.depositar(-1.0f);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Valor invalido", e.getMessage());
        }

    }

    @Test
    void deveNaoSacarValoresMaioresQueSaldo() {
        try {
            contaBancaria.setSaldo(1.0f);
            contaBancaria.sacar(2.0f);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Valor invalido", e.getMessage());
        }
    }

    @Test
    void deveNaoSacarValoresNegativos() {
        try {
            contaBancaria.setSaldo(1.0f);
            contaBancaria.sacar(-1.0f);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Valor invalido", e.getMessage());
        }

    }

}