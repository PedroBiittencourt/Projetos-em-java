package lista3.exercicio6;

import lista3.exercicio5.Produto;
import lista3.exercicio5.ProdutoEletronico;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaBancariaTest {

    @Test
    void deveVerificarSaldoNegativo(){
        try{
            ContaBancaria conta = new ContaCorrente("Pedro", 1, -0.1f);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Saldo invalido", e.getMessage());
        }
    }

    @Test
    void deveVerificarNomeTitularInvalido(){
        try{
            ContaBancaria conta = new ContaCorrente("", 1, 1);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Nome de titular invalido", e.getMessage());
        }
    }

    @Test
    void deveVerificarNumeroContaZeradoNegativo(){
        try{
            ContaBancaria conta = new ContaCorrente("Pedro", 0, 1);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Numero da conta invalido", e.getMessage());
        }
    }


}