package lista3.exercicio6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaPoupancaTest {

    @Test
    void deveVerificarTaxaJurosZeradaNegativa(){
        try{
            ContaPoupanca conta = new ContaPoupanca("Pedro gostoso",1, 1);
            conta.setTaxaJuros(0);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Taxa de juros invalida", e.getMessage());
        }
    }

    @Test
    void deveCalcularJuros(){
        ContaPoupanca conta = new ContaPoupanca("Pedro gostoso",1, 1);
        conta.setTaxaJuros(1);
        conta.calcularJuros();
        assertEquals(0.99, conta.getSaldo(), 0.01f);
    }

    @Test
    void deveVerificarCalculoJurosSaldoZerado(){
        try{
            ContaPoupanca conta = new ContaPoupanca("Pedro gostoso",1, 0);
            conta.setTaxaJuros(1);
            conta.calcularJuros();
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Nao e possivel aplicar juros para essa quantia de saldo", e.getMessage());
        }
    }

    @Test
    void deveVerificarCalculoJurosTaxaJurosZerada(){
        try{
            ContaPoupanca conta = new ContaPoupanca("Pedro gostoso",1, 1);
            conta.calcularJuros();
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Taxa de juros invalida", e.getMessage());
        }
    }

    @Test
    void deveVerificarQuantiaDepositoZeradaNegativa(){
        try{
            ContaPoupanca conta = new ContaPoupanca("Pedro gostoso",1, 1);
            conta.depositar(0);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Quantia invalida", e.getMessage());
        }
    }


    @Test
    void deveDepositar(){
        ContaPoupanca conta = new ContaPoupanca("Pedro gostoso",1, 1);
        conta.depositar(0.1f);
        assertEquals(1.1f, conta.getSaldo(), 0.01f);
    }

    @Test
    void deveVerificarQuantiaSaqueZeradaNegativa(){
        try{
            ContaPoupanca conta = new ContaPoupanca("Pedro gostoso",1, 1);
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
            ContaPoupanca conta = new ContaPoupanca("Pedro gostoso",1, 0);
            conta.sacar(0.1f);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Quantia invalida", e.getMessage());
        }
    }

    @Test
    void deveSacar(){
        ContaPoupanca conta = new ContaPoupanca("Pedro gostoso",1, 1);
        conta.sacar(0.9f);
        assertEquals(0.1f, conta.getSaldo(), 0.001f);
    }


}