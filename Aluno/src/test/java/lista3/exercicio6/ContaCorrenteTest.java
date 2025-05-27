package lista3.exercicio6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaCorrenteTest {

    @Test
    void deveVerificarTaxaManutencaoZeradaNegativa(){
        try{
            ContaCorrente conta = new ContaCorrente("Pedro gostoso",1, 1);
            conta.setTaxaManutencao(0);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Taxa de manutencao invalida", e.getMessage());
        }
    }

    @Test
        void deveVerificarQuantiaDepositoZeradaNegativa(){
        try{
            ContaCorrente conta = new ContaCorrente("Pedro gostoso",1, 1);
            conta.depositar(0);
            fail();
        }
        catch (IllegalArgumentException e){
                assertEquals("Quantia invalida", e.getMessage());
        }
    }

    @Test
    void deveVerificarTaxaManutencaoZeradaDeposito(){
        try{
            ContaCorrente conta = new ContaCorrente("Pedro gostoso",1, 1);
            conta.depositar(1);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Taxa de manutencao invalida", e.getMessage());
        }
    }

    @Test
    void deveDepositar(){
        ContaCorrente conta = new ContaCorrente("Pedro gostoso",1, 1);
        conta.setTaxaManutencao(0.1f);
        conta.depositar(1);
        assertEquals(1.99f, conta.getSaldo(), 0.01f);
    }

    @Test
    void deveVerificarQuantiaSaqueZeradaNegativa(){
        try{
            ContaCorrente conta = new ContaCorrente("Pedro gostoso",1, 1);
            conta.sacar(0);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Quantia invalida", e.getMessage());
        }
    }

    @Test
    void deveVerificarQuantiaSaqueMaiorSaldo(){
        try{
            ContaCorrente conta = new ContaCorrente("Pedro gostoso",1, 0);
            conta.sacar(0.1f);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Quantia invalida", e.getMessage());
        }
    }

    @Test
    void deveSacar(){
        ContaCorrente conta = new ContaCorrente("Pedro gostoso",1, 1);
        conta.sacar(0.9f);
        assertEquals(0.1f, conta.getSaldo(), 0.001f);
    }

}