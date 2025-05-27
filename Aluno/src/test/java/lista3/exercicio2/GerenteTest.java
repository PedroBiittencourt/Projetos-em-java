package lista3.exercicio2;

import lista3.exercicio4.VooInternacional;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GerenteTest {

    @Test
    void deveCalcularPagamento(){
        Gerente gerente = new Gerente(1f);
        gerente.setBonus(0.1f);
        assertEquals(1.1f, gerente.calcularPagamento());
    }

    @Test
    void deveVerificarBonusZeradoCalcularPreco(){
        try{
            Gerente gerente = new Gerente(1f);
            gerente.calcularPagamento();
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Bonus invalido", e.getMessage());
        }
    }

    @Test
    void deveVerificarBonusZeradoNegativo(){
        try{
            Gerente gerente = new Gerente(1f);
            gerente.setBonus(0);
            fail();
        }
        catch(IllegalArgumentException e){
            assertEquals("Bonus invalido", e.getMessage());
        }
    }

}