package lista4.exercicio2;

import lista4.exercicio1.Contribuinte;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaTest {

    @Test
    void deveVerificarSaldoInvalido(){
        try{
            Conta conta = new ContaCorrenteNormal();
            conta.setSaldoDisponivel(-1f);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Saldo invalido", e.getMessage());
        }
    }

}