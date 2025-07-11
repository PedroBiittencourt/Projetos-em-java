package lista4.exercicio2;

import lista4.exercicio1.Contribuinte;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaCorrenteEspecialTest {

    @Test
    void deveVerificarCodigoInvalido(){
        try{
            ContaCorrenteEspecial conta = new ContaCorrenteEspecial();
            conta.setLimiteCredito(0);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Limite de credito invalido", e.getMessage());
        }
    }

    @Test
    void deveCalcularSaldo(){
        ContaCorrenteEspecial conta = new ContaCorrenteEspecial();
        conta.setLimiteCredito(1);
        conta.setSaldoDisponivel(1);
        assertEquals(2, conta.calcularSaldo());
    }

}