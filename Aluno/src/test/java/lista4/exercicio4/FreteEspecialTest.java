package lista4.exercicio4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FreteEspecialTest {

    @Test
    void deveCalcularFrete(){
        FreteEspecial frete = new FreteEspecial();
        frete.setTaxaEntrega(1f);
        frete.setValorFrete(1f);
        assertEquals(2, frete.calcularFrete());
    }

}